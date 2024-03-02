package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
		
	}
	
	public void setTrain(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
		
	}
	
	public String getType() {
		return type;
		
	}
	
	public String getStart() {
		return start;
		
	}
	
	public String getDest() {
		return dest;
		
	}
	
	public double price() {
		return price;
		
	}
	
	public String  toString() {
		return number + " " + type + " " + start + " " + dest + " " + price;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	
	public int compareTo(Train aaa) {
		if(this.number > aaa.number) {
			return -1;
		}
		else if(this.number == aaa.number){
			return 0;
		}
		else {
			return 1;
		}
	}
	
	
	
	public static void main(String []args) {
		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		Set<Train> set = new HashSet<Train>();
		set.add(train1);
		set.add(train2);
		set.add(train3);
		set.add(train4);
		set.add(train5);
		set.add(train6);
		set.add(train7);
		
		System.out.println("========用Iterator印出不重複的Train物件=========");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("===========================我是分隔線================================");
		
		
		List<Train> list = new ArrayList<Train>();
		list.add(train1);
		list.add(train2);
		list.add(train3);
		list.add(train4);
		list.add(train5);
		list.add(train6);
		list.add(train7);
		
		Collections.sort(list);
		
		System.out.println("========用Iterator讓Train物件印出時，能以班次編號由大到小印出=========");
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("========用for圈讓Train物件印出時，能以班次編號由大到小印出=========");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("========用foreach讓Train物件印出時，能以班次編號由大到小印出=========");
		for(Train xxx :list) {
			System.out.println(xxx);
		}
		
		
		System.out.println("===========================我是分隔線================================");
		System.out.println("========用Iterator讓Train物件印出時，能以班次編號由大到小印出=========");
		Set<Train> withoutDuplicate = new TreeSet<Train>();
		withoutDuplicate.add(train1);
		withoutDuplicate.add(train2);
		withoutDuplicate.add(train3);
		withoutDuplicate.add(train4);
		withoutDuplicate.add(train5);
		withoutDuplicate.add(train6);
		withoutDuplicate.add(train7);
		
		Iterator it3 = withoutDuplicate.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
	}

}
