package hw9;

class Bank {
	
	private int balance = 0 ;
	
	synchronized public void deposit(int money){
		while(balance > 3000) {
			System.out.println("媽媽看到餘額上有3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		
		balance += money;
		System.out.println("媽媽存了"+money+"，帳戶共有:"+balance);
		notify();
	}
	
	
	synchronized public void withdraw(int money){
		while(balance < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款");
			try {
				wait();
				System.out.println("熊大被老媽告知帳戶有錢了");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance -= money ;
		System.out.println("熊大領了"+money+"，帳戶共有:"+balance);
		
		
		if(balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();		
		}
		
		
	}
}	

class Monther extends Thread{
	Bank balance;
	
	public Monther(Bank balanece) {
		this.balance = balanece;
	}
	
	public void run() {
		for(int i = 1; i <= 10 ; i++ ) {
			balance.deposit(2000);
		}
	}
}	


	
class Son extends Thread{
	Bank balance;
	
	public Son(Bank balance) {
		this.balance = balance;
	}
	
	public void run() {
		for(int i = 1; i <= 10 ; i++ ) {
			balance.withdraw(1000);
		}
	}

	
}


