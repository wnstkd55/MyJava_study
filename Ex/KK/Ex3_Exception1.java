package Ex.KK;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 1. is1 <== InputStream ��ü (�����η� ���� : -ms949), ����ó��
 * 2. is2 <== InputStream ��ü (����η� ���� : -utf8), ����ó��(try ~ with resource�� ó��)
 * 				close() �ڵ����� ó��
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
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}finally {
			try {
				is1.close();
			} catch (IOException e) {
				System.out.println("���ܰ� �߻��߽��ϴ�.");
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
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		
		
		
		
	}

}
