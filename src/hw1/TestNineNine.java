package hw1;

public class TestNineNine {
	public static void main(String[] args) {
		//for+while
		int i,j;
		for(i=1;i<=9;i++) {
			j=1;
			while(j<=9) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}
			System.out.println();
		}
//		for+do while
		int q;
		for(q=1;q<=9;q++) {
			int w=1;
			do {
				System.out.print(q+"*"+w+"="+q*w+"\t");
				w++;
			}while(w<=9);
			
		  System.out.println();
		}
		//while+do while
		int a=1;
		int b;
		while(a<=9) {
			b=1;
			do {
			System.out.print(a+"*"+b+"="+a*b+"\t");
			b++;
			}while(b<=9);		
			a++;
			System.out.println();
			System.out.println();
			
		}
	}

}
