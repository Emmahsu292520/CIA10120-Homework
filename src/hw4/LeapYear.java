package hw4;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入西元yyyy年");
		int yyyy = sc.nextInt();
		System.out.println("輸入mm月");
		int mm = sc.nextInt();
		System.out.println("輸入dd日");
		int dd = sc.nextInt();
//		閏年可以被4整除且同時也可以被100和400整除，閏年多一天
		int[][] holeYear = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
		int sum = 0;
		int day = 0;
		
		
	    if(yyyy % 4 == 0 && yyyy % 100 == 0 && yyyy % 400 == 0) {
	    	holeYear[1][1] = 29;
	    }
		
	    	
	    
	    if(mm > 12 || mm < 1 || dd < 1 || day > 31 ||dd>holeYear[1][mm-1]) {
	    	System.out.println("日期輸入錯誤，請重新輸入");
	    }
	    else {
			for (int i = 1; i < holeYear.length; i++) {
					for (int j = mm - 2; j >= 0; j--) {
						sum += holeYear[i][j];	
					}
			}
			int wholeday = sum + dd;
			System.out.println("輸入的日期為該年的第" + wholeday + "天");
	    }
		
		
		
		
		

	}

}
