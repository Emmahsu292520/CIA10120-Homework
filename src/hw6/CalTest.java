package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("請輸入x數值");
			int xx = sc.nextInt();
			System.out.println("請輸入y數值");
			int yy = sc.nextInt();
			Calculator a = new Calculator();
			System.out.println("x的y次方回傳結果是"+a.powerXy(xx, yy));
		}catch(CalException zero) {
			zero.printStackTrace();
		}catch(InputMismatchException wrong) {//如果輸入的 x 或 y 不是整數，程式將拋出 InputMismatchException
			System.out.println("格式不正確");
		}finally {
			sc.close();
		}
	}

}
