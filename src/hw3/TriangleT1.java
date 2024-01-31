package hw3;

import java.util.Scanner;

public class TriangleT1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入 :三角形第一個邊的邊長");
//		int side1=sc.nextInt();
//		System.out.println("請輸入 :三角形第二個邊的邊長");
//		int side2=sc.nextInt();
//		System.out.println("請輸入 :三角形第三個邊的邊長");
//		int side3=sc.nextInt();
		
		int []side = new int[3];
		for(int i =0;i<side.length;i++) {
			System.out.println("請輸入 :三角形的邊長");
			side[i]=sc.nextInt();//sc.nextInt()會將我輸入的數字回傳
		}
		
		if(side[0]!=0&&side[1]!=0&&side[2]!=0) {
			if(side[0]==side[1]&&side[1]==side[2]) {
				System.out.println("正三角形");
			}
			else if(side[0]==side[1]&&side[1]!=side[2]) {
				System.out.println("等腰三角形");
			}
			else if(Math.pow(side[0], 2)+Math.pow(side[1], 2)==Math.pow(side[2], 2)
					||Math.pow(side[1], 2)+Math.pow(side[2], 2)==Math.pow(side[0], 2)
					||Math.pow(side[0], 2)+Math.pow(side[2], 2)==Math.pow(side[1], 2)){
						System.out.println("直角三角形");
				}
			else if ( side[0]!=side[1]&&side[1]!=side[2]&&side[2]!=side[0]) {
				System.out.println("其他三角形");
			}
	
		}
		else {System.out.println("不是三角形");
		
		}
	}


}
