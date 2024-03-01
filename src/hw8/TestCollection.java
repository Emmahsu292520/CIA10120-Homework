package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {
	public static void main(String []args) {
		List<Object> list = new ArrayList<>();
		Object obj = new Object();
		
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(new Short("100"));
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(obj);
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		
		// 使用Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========for==========");
		//傳統for
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========foreach===========");	
		
		for(Object xxx : list) {
			System.out.println(xxx);
		}
		
		//移除不是java.lang.Number相關的物件
		Iterator notNumber = list.iterator();
		while(notNumber.hasNext()) {
			Object q = notNumber.next();
			if(!(q instanceof Number)) {
				notNumber.remove();	
				//Iterator遍歷集合並需要刪除元素時，應該使用Iterator的remove()方法，而不是直接調用集合的remove()方法。這樣可以避免並發修改的問題
				//針對取出不是number的物件 從集合中刪除掉，Java提供了Iterator的remove()方法，可以在迭代期間從集合中刪除元素。
			}   //remove()在遍歷集合時用來刪除當前迭代的元素，而不是直接從集合中刪除元素。
		}
		System.out.println("===========移除非Number相關物件後=============");
		for(Object a : list) {
			System.out.println(a);
		}
		
	}

}
