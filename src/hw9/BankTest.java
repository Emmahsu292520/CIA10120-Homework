package hw9;

public class BankTest {
	public static void main(String []args) {
		Bank bank = new Bank(); 
		Monther mom = new Monther(bank);
		Son son = new Son(bank);
		
		mom.start();
		son.start();
	}

}
