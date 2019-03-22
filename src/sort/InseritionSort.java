package sort;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class InseritionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 100000;
		int max=1000000;
		int[] array =new int[length];
		array = initArray(array, length,max);
		
		//Map<String,Integer> resultArrsy = findMaxSubArray(changeArray,0,changeArray.length-1);
		//printArry(array);
		//sortInserition(array);
		//sortMerge(array,0,array.length-1);
		Map<String,Integer> resultArray1=findMaxProfit(array);
		//printArry(array);
		printMap(resultArray1);
		int[] changeArray =  changeToDeviation(array);
//		int[] changeArray = new int[4];
//		changeArray[0]=3;
//		changeArray[1]=-2;
//		changeArray[2]=5;
//		changeArray[3]=1;
		printArry(changeArray);
		Map<String,Integer> resultArrsy2 = findMaxInLine(changeArray,changeArray.length-1);
		printMap(resultArrsy2);
	}
	
	private static void printMap(Map<String,Integer> resultArrsy) {
		// TODO Auto-generated method stub
		for( String key:resultArrsy.keySet()) {
			print(key+"-------"+resultArrsy.get(key));
			//print(resultArrsy.get(key));
		}
		
	}
	
	private static void print(Object o) {
		System.out.println(o);
	}
	
	/**
	 * 暴力破解最大利润
	 * @param array 原始数组
	 * @return
	 */
	private static Map<String,Integer> findMaxProfit(int[] array){
		Map map = new HashMap<String,Integer>();
		
		int Max,profit,low,high;
		Max=Integer.MIN_VALUE;
		low=0;
		high=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				profit=array[j]-array[i];
				if(profit>Max) {
					Max=profit;
					high=j;
					low=i;
				}
			}
		}
		map.put("sum", Max);
		map.put("low", low);
		map.put("high", high);
		return map;
	}

	/**
	 * divide-and-conquer 寻找子数组的和最大即利润最大
	 * @param changeArray Ai+1 - Ai 差值数组
	 * @param low
	 * @param high
	 * @return
	 */
	private static Map<String,Integer> findMaxSubArray(int[] changeArray, int low, int high) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		if(high>low) {
			int mediu = low+(high-low)/2;
			Map<String,Integer> lowSum,highSum,crossSum;
			//0 1 2 3
			lowSum =findMaxSubArray(changeArray, low, mediu);
			highSum = findMaxSubArray(changeArray, mediu+1, high);
			crossSum = findCrossArray(changeArray,low,high);
			
			if(lowSum.get("sum")>highSum.get("sum")) {
				map = lowSum;
				
			}else {
				map=highSum;
			}
			if(crossSum.get("sum")>map.get("sum")) {
				map=crossSum;
			}
		}else {
			map.put("sum", changeArray[low]);
			map.put("low", low);
			map.put("high", high);
		}
		return map;
	}
	
	private static Map<String,Integer> findMaxInLine(int[] A,int n){
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		
		Map<String,Integer> allsum,last,temp= new HashMap<String,Integer>();
		int sum=0;
		int maxSum = Integer.MIN_VALUE;
		temp.put("sum", A[0]);
		temp.put("low", 0);
		temp.put("high", 0);
		for(int i=1;i<=n;i++) {
			allsum = findMaxSubArray(A, i,temp);
			temp=allsum;
			if(allsum.get("sum")>maxSum) {
				map = allsum;
			}
			
		}
//		leftsum=findMaxInLine(A, n-1);
//		allsum = findMaxSubArray(A,n);
//		if(leftsum.get("sum")>maxSum) {
//			map=leftsum;
//		}
		
		return map;
	}
	
	private static Map<String,Integer> findMaxSubArray(int[] A,int n,Map<String,Integer> leftmap){
		Map<String,Integer> map = new HashMap<String,Integer>();
		if(n==0) {
			map.put("sum", A[n]);
			map.put("low", n);
			map.put("high", n);
			return map;
		}
		int maxSum = leftmap.get("sum");
		int sum = 0;
		int low=leftmap.get("low"),high=leftmap.get("high");
		for(int i=n;i>=0;i--) {
			sum+=A[i];
			if(sum>maxSum) {
				maxSum = sum;
				low=i;
				high=n;
			}
		}
		map.put("sum", maxSum);
		map.put("low", low);
		map.put("high", high);
		return map;

//		Map<String,Integer> leftSum,allSum;		
//		leftSum = findMaxSubArray(A, n-1);
//		allSum = findMaxSubArray(A, n);
//		int sum=0,low=0,high=0;
//		int maxSum = Integer.MIN_VALUE;
//		for(int i=0;i<A.length;i++) {
//			sum+=A[i];
//			if(sum>maxSum) {
//				maxSum=sum;
//				high=i;
//			}
//		}
	}
	

	private static Map<String, Integer> findCrossArray(int[] changeArray, int low, int high) {
		// TODO Auto-generated method stub
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		int mediu = low+(high-low)/2;
		int leftMax = Integer.MIN_VALUE;
		int leftSum=0;
		int leftlow,righthigh;
		leftlow=0;
		righthigh=0;
		for(int i=mediu;i>=low;i--) {
			leftSum+=changeArray[i];
			if(leftSum>leftMax) {
				leftMax=leftSum; 
				leftlow = i; //循环时不能改变判断的循环变量 low=i
			}
		}
		int rightMax = Integer.MIN_VALUE;
		int rightSum=0;
		for(int i=mediu+1;i<=high;i++) {
			rightSum+=changeArray[i];
			if(rightSum>rightMax) {
				rightMax=rightSum;
				righthigh = i;
			}
		}
		map.put("sum", leftMax+rightMax);
		map.put("low", leftlow);
		map.put("high", righthigh);
		return map;
	}

	private static int[] changeToDeviation(int[] array) {
		int[] changeArray = new int[array.length-1];
		for(int i=1;i<array.length;i++) {
			changeArray[i-1]=array[i]-array[i-1];
		}
		return changeArray;
	}

	private static void sortMerge(int[] array,int p,int r) {
		// TODO Auto-generated method stub
		if(p<r) {
			int q = p+(r-p)/2;//1没有算好中间值
			sortMerge(array,p,q);
			sortMerge(array,q+1,r);
			merge(array,p,q,r);
		}
	}
									//0         1           3				
	private static void merge(int[] array, int p, int q, int r) {
		// TODO Auto-generated method stub
		int n1=q-p+1;
		int n2=r-q;
		
		int[] array1 = new int[n1+1];
		int[] array2 = new int[n2+1];
		for(int i=0;i<n1;i++) {
			array1[i]=array[p+i];
		}
		for(int i=0;i<n2;i++){
			array2[i]=array[q+1+i];
		}
		array1[n1]=Integer.MAX_VALUE;
		array2[n2]=Integer.MAX_VALUE;
		int j=0,k=0;
		for(int i=p;i<=r;i++) {
			if(array1[j]<array2[k]) {
				array[i]=array1[j];//array的引用拿错了
				j++;
			}else {
				array[i]=array2[k];
				k++;
			}
		}
	}

	private static int[] sortInserition(int[] array) {
		// TODO Auto-generated method stub
		int key;
		int i;
		for(int j=1;j<array.length;j++) {
			key=array[j];
			i=j-1;
			while (i>=0 && array[i]>key) {
				array[i+1]=array[i];
				i--;
//				if(i<0) {
//					break;
//				}
			}
			array[i+1]=key;
		}
		return array;
	}

	public static int[] initArray(int[] array,int length,int max) {
		
		array = new int[length];
		for(int i=0;i<length;i++) {
			array[i]= (int) (1+Math.random()*max)%max;
		}
		return array;
	}
	
	public static void printArry(int[] array) {
		System.out.println("print Array");
		for(int i=0;i<array.length;i++) {
			System.out.println("array 第"+i+"元素="+array[i]);
		}
	}
	
	

}
