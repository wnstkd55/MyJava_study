package Chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class Test01 {

	public static void main(String[] args) throws IOException {
		InputStream is1 = System.in;
		System.out.println("입력해주세요>> ");
		byte[] arr = new byte[100];
		int count1 = is1.read(arr);
		String ko = new String(arr,Charset.defaultCharset());
		is1.close();
		
		File f1 = new File("src/Chap19/EX06/My_Test.txt");
		OutputStream os1 = new FileOutputStream(f1);
		os1.write(arr);
		os1.flush();
		os1.close();
		
		InputStream is2 = new FileInputStream(f1);
		int data;
		while((data=is2.read(arr))!=-1) {
			System.out.println(ko);
		}
		is2.close();
		
		OutputStream os2 = System.out;
		os2.write(arr);
		os2.flush();
		os2.close();
		
		
		
	}

}
