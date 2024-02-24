package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String []args)  {
		
		try {
			
			File sample = new File("Sample.txt");
			System.out.println("Sample.txt檔案共有"+" "+sample.length()+" "+"的位元組");
			
			FileReader in = new FileReader(sample);
			BufferedReader inn = new BufferedReader(in);
			
			int sum = 0;
			int characterCount = 0;
			char[] c = new char[4096];
			while((characterCount = inn.read(c)) != -1) {
				sum += characterCount;
			}System.out.println("Sample.txt檔案共有"+" "+sum+" "+"個字元");
			inn.close();
			in.close();
			
			String str;
			int strLine = 0;
			
			File sample2 = new File("Sample.txt");
			FileReader in2 = new FileReader(sample2);
			BufferedReader inn2 = new BufferedReader(in2);
			
			while((str = inn2.readLine()) != null) {
				strLine += 1;
			}System.out.println("Sample.txt檔案共有"+" "+strLine+" "+"列資料");
			
			inn2.close();
			in2.close();
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}

}
