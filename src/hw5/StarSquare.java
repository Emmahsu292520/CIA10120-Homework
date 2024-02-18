package hw5;

import java.util.Scanner;

public class StarSquare {
	public static void main (String []args) {
		
		/*請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
		圖:*/
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字，此數字代表縱向的星星數");
		int width = sc.nextInt();
		System.out.println("請輸入數字，此數字代表橫向的星星數");
		int height = sc.nextInt();//sc.nextInt()會將我輸入的數字回傳
		starSquare(width, height);

		
	}
	
	public static void starSquare(int width, int height) {
		if(width > 0 && height>0) {
			for(int i = 0; i < width; i++ ) {
				for(int j = 0; j < height; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}	
		}
		else {
			System.out.println("請輸入大於零的整數數字");
		}
		
	}

}
