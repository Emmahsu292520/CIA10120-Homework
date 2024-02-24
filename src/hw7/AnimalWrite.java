package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AnimalWrite {
	public static void main(String []args) throws IOException{
		File directory = new File("C:\\data");
		
		if(!directory.exists()) {
			directory.mkdir();
		}
		File data = new File(directory, "Object.ser");
		Dog  dog1 = new Dog("lucky1");
		Dog  dog2 = new Dog("lucky2");
		Cat  cat1 = new Cat("mimi1");
		Cat  cat2 = new Cat("mimi2");
		List list = new ArrayList();
		
		list.add(dog1);
		list.add(dog2);
		list.add(cat1);
		list.add(cat2);	
		
		FileOutputStream out = new FileOutputStream(data);
		ObjectOutputStream outt = new ObjectOutputStream(out);
		
		for(int i = 0; i < list.size(); i++) {
			outt.writeObject(list.get(i));
		}
			outt.close();
			out.close();
	}

}
	/*寫入到檔案中的是物件的序列化形式，而不是直接的文本形式。
	這意味著您不能直接打開檔案並查看其內容，因為內容是以二進位格式寫入的，並且經過序列化處理。*/
