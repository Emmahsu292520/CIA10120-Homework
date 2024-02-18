package hw5;

public class RandAvg {
	
	public static void main (String []args) {
		System.out.print("十個亂數為");
		randAvg();
	}
	
	
	public static void randAvg() {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			int x = (int)(Math.random()*101); //亂數Math.random()*個數數量+最小數值
			System.out.print(x+" ");
			sum += x;
		}
		System.out.println();
		System.out.print("平均值"+sum/10);
		
		
		
	}
	

}
