package hw1;

public class Homework2 {
	public static void main(String[] args) {
		int b = 0;
		for (int a = 0; a <= 1000; a += 2) {
			b += a;
		}
		System.out.println("偶數總和=" + b);
		
		//第二題用for迴圈
		int d = 1;
		for (int c = 2; c <= 10; c++) {
			d *= c;
		}
		System.out.println("For連乘積=" + d);

		// 第三題用while迴圈
		int e = 2;
		int f = 1;
		while (e <= 10) {
			f *= e;
			e++;
		}
		System.out.println("While連乘績=" + f);

		// 第四題
		for (int num1 = 1; num1 <= 10; num1++) {
			System.out.print(num1 * num1 + " ");

		}
		System.out.println();
	
		// 第五題
		int numbertotall=0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == 4||i/10==4) {
				continue;
			} else {
				System.out.print(i + " ");
				numbertotall+=1;
			}
		
		}System.out.println();
		 System.out.println("可以選擇的數量共"+numbertotall);
		 //第六題
		
		for(int triangle=10;triangle>=1;triangle--) {
			for(int num2=1;num2<=triangle;num2++) {
				System.out.print(num2+" ");
			}System.out.println();
		}System.out.println("===============我是分隔線=====================");
		//第七題
		for(int n=1;n<=6;n++) {

			switch(n) {
			case 1:
				System.out.println("A");
				break;
				
			case 2:
				int t=2;
				while(t>0) {
					t--;
					System.out.print("B");
				}
				System.out.println();
				break;
				
			case 3:
				int g=3;
				while(g>0) {
					g--;
					System.out.print("C");
				}
				System.out.println();
				break;
				
			case 4:	
				int h=4;
				while(h>0) {
					h--;
					System.out.print("D");
				}
				System.out.println();
				break;
				
			case 5:
				int u=5;
				while(u>0) {
					u--;
					System.out.print("E");
				}
				System.out.println();
				break;
				
			case 6:
				int k=6;
				while(k>0) {
					k--;
					System.out.print("F");
				}
				
				System.out.println();
//				break;
				
			}	
			


		}
		 
			
			
		
			
		 
		
	}

}
