package array;

public class TestFebonacce {
	public static void main(String[] args) {
		System.out.println(febonacci(1));
		
		System.out.println(febonacci(2));
		System.out.println(febonacci(3));
		System.out.println(febonacci(4));
		System.out.println(febonacci(5));
		System.out.println(febonacci(6));
		System.out.println(febonacci(7));
		System.out.println(febonacci(8));
		System.out.println(febonacci(9));
		System.out.println(febonacci(10));
		
		System.out.println(febonacci(1000));
		
	}
	
	public static int febonacci(int i){
		
		if(i==1||i==2){
			return 1;
		}else{
			
			return febonacci(i-1)+febonacci(i-2);
			
		}
		
		
	}
	
	
}
