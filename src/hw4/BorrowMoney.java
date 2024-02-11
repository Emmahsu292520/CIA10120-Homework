package hw4;

import java.util.Scanner;

public class BorrowMoney {
	public static void main(String []args) {
		
		int [][]employee = {{25, 32, 8, 19, 27} , {2500, 800, 500, 1000, 1200}};
		System.out.println("輸入要借的金額");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();//sc.nextInt()會將我輸入的數字回傳
		int count = 0;
		
		
		for(int i =1 ; i<employee.length ; i++) {
			System.out.print("可借錢的員工編號");
			for(int j = 0 ; j<employee[i].length;j++ ) {
				if(employee[i][j]>money) {
					count+=1;			
					System.out.print(employee[0][j]+" ");
				}
				
			}
		}
		System.out.println();
		System.out.println("共"+count+"人");
		
		
	}

}
