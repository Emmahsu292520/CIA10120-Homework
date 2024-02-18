package hw5;

public class OverLoading {
	
	int[][] intArray = {
			{1, 6, 3},
			{9, 5, 2}
			};
	
	static double[][] doubleArray = {
			{1, 2, 3.5, 2.2},
			{7.4, 2.1, 8.2}
			};
	
	public static void main(String []args) {
		OverLoading q = new OverLoading();
		System.out.println("最大數值為" + q.maxElement(q.intArray));//透過產生物件來使用沒有staitc的方法及實體物件
		System.out.println("最大數值為" + q.maxElement(doubleArray));//或是可以在方法上及實體物件上加上static直接叫用
	}

	
	public  int maxElement(int x[][]) {
		int maxValue = x[0][0]; 
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(i == 0 && j == 0) {
					continue;
				}
				else if(maxValue < x[i][j]) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}
	
	
	public double maxElement(double x[][]) {
		double maxValue = x[0][0]; 
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(i == 0 && j == 0) {
					continue;
				}
				else if(maxValue < x[i][j]) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}

}
