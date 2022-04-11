package Ex.KK;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 1. is1 <== InputStream 객체 (절대경로로 접근 : -ms949), 예외처리
 * 2. is2 <== InputStream 객체 (상대경로로 접근 : -utf8), 예외처리(try ~ with resource로 처리)
 * 				close() 자동으로 처리
 */

public class Ex3_Exception1 {

	public static void main(String[] args) {
		File inFile1 = new File("D:\\HJS\\JAVA\\src\\chap19\\Ex04\\exception-ms949.txt");
		InputStream is1 = null;
		try {
			is1 = new FileInputStream(inFile1);
			int data = 0;
			while((data = is1.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
		}finally {
			try {
				is1.close();
			} catch (IOException e) {
				System.out.println("예외가 발생했습니다.");
			}
		}
		System.out.println();
		File inFile2 = new File("src\\chap19\\Ex04\\exception-utf8.txt");
		InputStream is2 = null;
		try {
			is2 = new FileInputStream(inFile2);
			int data = 0;
			while((data = is2.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		
		
		
	}

}
