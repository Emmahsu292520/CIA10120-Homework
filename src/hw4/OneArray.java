package hw4;

public class OneArray {
	public static void main (String []args) {
		
	//有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}，
	//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] w = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0;i<w.length;i++) {
			sum += w[i];
		}System.out.println("平均值"+sum/w.length);
		
		
		double average = sum/w.length;
		System.out.print("大於平均值的元素");
		for(int i =0;i<w.length;i++) {
			if(average<w[i]) {
				System.out.print(w[i]+" ");
			}
		}
	
		
		
	}

}
