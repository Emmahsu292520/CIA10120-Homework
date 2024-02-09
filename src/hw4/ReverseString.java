package hw4;

public class ReverseString {
	public static void main (String []args) {
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
		String s1 = "Hello World";
		String []bag = {"H", "e", "l", "l", "o"," ", "W", "o", "r", "l", "d"};

		for(int i = s1.length()-1; i>=0; i--) {
			System.out.print(bag[i]);
		}
	
		
	}

}
