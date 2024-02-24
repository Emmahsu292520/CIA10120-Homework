package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void main(String []args) {
		
		/*請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
		代表的檔案會複製到第二個參數代表的檔案*/
		try {
			File pimple = new File("C:\\CIA101_Workspace\\CIA10120-Homework\\Pimple.txt");
			File xx = new File("C:\\CIA101_Workspace\\CIA10120-Homework\\CopyPimple.txt");
			copyFile(pimple, xx);
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void copyFile(File pimple, File xx) throws IOException {
		FileReader in = new FileReader(pimple);
		BufferedReader inn = new BufferedReader(in);
		FileWriter out = new FileWriter(xx);
		BufferedWriter outt = new BufferedWriter(out);
		
		int length;
		while((length  = inn.read()) != -1) {
			outt.write(length);
			System.out.print((char)length);
			System.out.flush();
			/*System.out.print((char) c); 用於將讀取的每個字元輸出到控制台，而 System.out.flush() 確保這些字元被立即顯示
			 * ，而不會被保留在緩衝區中。這樣做是為了確保當程式執行時，可以即時看到輸出的字元，而不必等待程式執行結束才看到結果。*/
		}
		
		outt.close();
		out.close();
		
		inn.close();
		in.close();
		
	}

}
