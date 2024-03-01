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
				/*當在 ObjectInputStream 中，當呼叫 readObject() 方法讀取序列化檔案時，如果已經到達檔案的結尾，它將拋出一個 EOFException。
				 因此，我們在 while (true) 迴圈中使用 try-catch 塊來捕捉這個例外。當捕捉到 EOFException 時，表示已經讀取完整個檔案，迴圈結束，程式退出。
				 */
			}catch(EOFException a) {
				System.out.println("資料讀取完畢！"); 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
