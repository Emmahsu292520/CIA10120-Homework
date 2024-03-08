package hw9;

public class BigEater extends Thread{
	
	private int count;
	private String name;
	
	
	public BigEater(String name) {
		this.name = name;
	}

	public void run() {
		while(count <= 10) {
			try {
				Thread.sleep((int)(Math.random()*2501+500));
				System.out.println(name+"吃了第"+count+"碗飯");
				count++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}System.out.println(name+"吃完了!");
	}
	
	
	public static void main(String []args) {
	
		BigEater mantou = new BigEater("饅頭人");
		BigEater james = new BigEater("詹姆士");
		mantou.start();
		james.start();
	}
}


