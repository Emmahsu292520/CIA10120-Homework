package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RandomTest {
	public static void main(String []args) {
		
		try {
			File data = new File("C:\\CIA101_Workspace\\CIA10120-Homework\\Data.txt");
			FileOutputStream out = new FileOutputStream(data, true);
			BufferedOutputStream outt = new BufferedOutputStream(out);
			PrintStream x = new  PrintStream(outt);
			
			for(int i = 1; i <= 10; i++ ) {
				x.println((int)(Math.random()*1000+1));				
			}	
			x.close();
			outt.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
