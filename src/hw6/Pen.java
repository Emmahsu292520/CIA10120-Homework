package hw6;

public abstract class Pen {
	private String brand;
	private double price;
	
	public Pen() {
		super();
	}
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String xxx) {
		this.brand = xxx;
	}
	
	public String getBrand() {
		return brand ;
	}
	
	public void setPrice(double yyy) {
		this.price = yyy;
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract void write();
	
}
