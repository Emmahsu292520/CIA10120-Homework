package hw5;

public class MyRectangleMain {
	public static void main(String []args) {
		//利用無參數建構子建立物件
		MyRectangle w = new MyRectangle();
		w.setWidth(10);
		w.setDepth(20);
		System.out.println("長方形的面積為"+w.getArea());
		
		//利用有參數建構子建立物件
		MyRectangle q = new MyRectangle(10, 20);
		System.out.println("長方形的面積為"+q.getArea());
	}

}
