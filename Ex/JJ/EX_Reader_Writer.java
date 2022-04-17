package Ex.JJ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * 	Reader / Writer 하위클래스사용
 * 	1. 콘솔에서 한글을 읽어서
 * 	C:/Temp/a/aaa.txt (MS949)
 * 	C:/Temp/b/bbb.txt (UTF-8)
 * 	파일에 저장
 * 
 * 	2. 파일에서 읽은 내용을 콘솔에 깨짐 없이 출력
 * 
 */

public class EX_Reader_Writer {

	public static void main(String[] args) {
		File aaa = new File("C:/Temp/a");
		File bbb = new File("C:/Temp/b");
		if(!aaa.exists()) {
			aaa.mkdirs();
		}
		if(!bbb.exists()) {
			bbb.mkdirs();
		}
		File a = new File("C:/Temp/a/aaa.txt");
		File b = new File("C:/Temp/b/bbb.txt");
		
		try {
			InputStreamReader isr1 = new InputStreamReader(System.in);
			OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream(a));
			int data1 = 0;
			while((data1 = isr1.read()) != '\r') {
				osw1.write(data1);
			}
			osw1.flush();
			osw1.close();
			
			}
		catch(Exception e) {}
		System.out.println();
		System.out.println("===============");
		try {
			InputStream is1 = new FileInputStream(a);
			InputStreamReader isr1 = new InputStreamReader(is1,"MS949");
			int data1;
			while((data1 = isr1.read()) != -1) {
				System.out.print((char)data1);
			}
			isr1.close();
		} catch (Exception e) {}	
			
		try {
			InputStreamReader isr2 = new InputStreamReader(System.in,"UTF-8");
			OutputStream os2 = new FileOutputStream(b);
			OutputStreamWriter osw2 = new OutputStreamWriter(os2,"UTF-8");
			int data2 = 0;
			while((data2 = isr2.read()) != '\r') {
				osw2.write(data2);
			}
			osw2.flush();
			osw2.close();
			
		
		} catch (Exception e) {	}
		
		
		try {
			InputStream is2 = new FileInputStream(b);
			InputStreamReader isr2 = new InputStreamReader(is2,"utf-8");
			int data2;
			while((data2 = isr2.read()) != -1) {
				System.out.print((char)data2);
			}
			
			isr2.close();
		} catch (Exception e) {}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

		
	}

}
