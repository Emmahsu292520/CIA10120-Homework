package hw3;

import java.util.Scanner;

public class Lottery {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);//ctrl+shift+o
		System.out.println("請輸入1~9討厭的數字");
		int hatenumber = sc.nextInt();
		int count =0;
		
		for(int number = 1;number<=49;number++) {
			if(number / 10 == hatenumber ||number % 10 == hatenumber) {
				continue;
			}
			else if(hatenumber!=number) {
				System.out.println(number);
				count=count+1;			
			}				
		 }System.out.println("總共有"+count+"數字可選");
		
	}

}
