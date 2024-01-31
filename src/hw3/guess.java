package hw3;

import java.util.Scanner;

public class guess {
	public static void main (String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("輸入數字猜猜看");
		int guess=sc.nextInt();
	
		
		for(int i=1;i>0;i++) {
			int random1=(int)(Math.random()*10);//記得要讓亂數再回圈內才會重新抽
			if(random1==guess) {
				System.out.println("答對了!答案就是"+random1);
				break;
				
			}
			else if(random1!=guess) {
				System.out.println("猜錯囉");
				
			}
		}
//       進階題目
//		
//		Scanner sc= new Scanner(System.in);
//		int random2=(int)(Math.random()*101);
//		
//		while(true) {
//			System.out.println("輸入數字猜猜看");
//			int guess2=sc.nextInt();
//			if(guess2==random2) {
//				System.out.println("答對了!答案就是"+random2);
//				break;
//			}
//			else if(guess2<random2) {
//				System.out.println("小於正確答案");
//			}
//			else if(guess2>random2) {
//				System.out.println("大於正確答案");
//			}
//		}
		
	}

}
