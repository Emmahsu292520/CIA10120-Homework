package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AnimalRead {
	public static void main(String []args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				while(true) {
				((Animal)ois.readObject()).speak();
				}
				
			}catch(EOFException a) {
				System.out.println("資料讀取完畢！");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
