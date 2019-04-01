package array;

public class TestHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		hanoi(4, 'A', 'B', 'C');
		
		
	}
	
	
	/**
	 * @param n 共有n个盘子
	 * @param from  开始的柱子
	 * @param in    中间的柱子
	 * @param to     目标的柱子
	 */
	public static void hanoi(int n,char from,char in,char to){
		if(n==1){
			System.out.println("第1个盘子从"+from+"移到"+to);
		}else{
			hanoi(n-1, from, to, in);
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
			
			hanoi(n-1, in, from, to);
		}
		
		
	}
	
	

}
