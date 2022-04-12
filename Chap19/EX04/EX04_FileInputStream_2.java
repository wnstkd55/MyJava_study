package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//is1 : MS949 한글로 읽기 처리, try(with resource), 예외 처리.
//is2 : UTF-8 

public class EX04_FileInputStream_2 {

	public static void main(String[] args) {
		File inFile1 = new File("src\\Chap19\\EX04\\files\\file-ms949.txt");
		InputStream is1 = null;
		byte[] arr1 = new byte[500];
		try {
			is1 = new FileInputStream(inFile1);
			while((is1.read(arr1)) != -1) {
				String str1 = new String(arr1, Charset.forName("MS949"));
				System.out.println(str1);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽어오지못하는 오류가 발생했습니다.");
		}finally {
			try {
				is1.close();
			} catch (IOException e) {
				System.out.println("파일을 읽어오지못하는 오류가 발생했습니다.");
			}
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("======================================");
		
		File inFile2 = new File("src\\Chap19\\EX04\\files\\file-utf-8.txt");
		byte[] arr2 = new byte[500];
		InputStream is2 = null;
		try {
			is2 = new FileInputStream(inFile2);
			while((is2.read(arr2)) != -1 ) {
				String str2 = new String (arr2, Charset.forName("utf-8"));
				System.out.println(str2);
			}
		} catch (IOException e) {
			
			System.out.println("오류가 발생했습니다.");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
