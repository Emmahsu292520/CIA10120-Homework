package hw5;

public class AuthCode {
	public static void main(String []args) {
		AuthCode a = new AuthCode();
		a.genAuthCode();
	}
	
	public  void genAuthCode() {
		/*設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
		與數字的亂數組合*/
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < 8; i++) {
			System.out.print(s1.charAt((int)(Math.random()*s1.length())));
		}
	}
}

