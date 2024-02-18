package hw6;

public class Pencil extends Pen{
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	/*在父類別 Pen 中確實將 price 的類型定義為 double，因此在 getPrice 方法中返回的確實是一個 double 型值。這一點是沒有問題的。
然而，在子類別 Pencil 中，當你嘗試重寫 getPrice 方法時，如果你直接使用 return price * 0.8; 的方式，就會遇到編譯錯誤。這是因為 price 是私有屬性，它無法在子類別中直接訪問。
解決這個問題的一種方法是使用 super.getPrice() 方法來獲取父類別中的價格，然後在子類別中對其進行修改。這樣就可以正確地重寫父類別中的方法，並將價格減少 20%。這種方法已經在之前的解答中提到了。*/
	
	public double getPrice() {
		return super.getPrice() * 0.8;
	}

	
}
