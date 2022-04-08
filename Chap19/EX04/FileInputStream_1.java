package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException {
		
		//���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		//1. �Է� ���� ����
			//�����η� ����
		File inFile1 = new File("C:\\UJS\\JAVA\\src\\Chap19\\files\\FileInputStream1.txt");
			//����η� ���� : ���� �۾� ���丮�� �������� ����
		File inFile = new File("src\\Chap19\\files\\FileInputStream1.txt");
		
		//InputStream ��ü�� �����ؾ� ������ ������ ���� �� �ִ�.
		InputStream is = new FileInputStream(inFile);
			//InputStream�� �߻�Ŭ����, ���� ��ü������ �� �� ����.
		//������ ������ ���
		
	
		
		//UTF-8 : ���� : 1byte, �ѱ��� : 3byte
		//MS949 : ���� : 1byte, �ѱ��� : 2byte
		//EUC-KR : ���� : 1byte, �ѱ��� : 2byte
		//UTF-16 : ���� �ѱ� : 2byte, ù��° BOM 2byte <==�ĺ���
		

		
		//�� ����Ʈ �����͸� �о char�� ��ȯ�� ���.
		System.out.println((char)is.read()); 	//read() �� ����Ʈ�� �о����
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println();
		System.out.println();
		
		//int read() : �� ����Ʈ�� �о ���� ������ ��� ����� ����, ���� �����Ͱ� �������� ���� ��� -1
		//while���� ����ؼ� �ѹ��� ���
		
		InputStream is1 = new FileInputStream(inFile);
		
		int data;
		
		
		while((data=is1.read()) != -1) {	//������ ������ ��� ��ȯ
		System.out.print((char)data);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("=============================================");
		
		//available() : ��Ʈ���� ���� ����Ʈ���� ���
		
		InputStream is2 = new FileInputStream(inFile);
		
		
		while((data=is2.read()) != -1) {	//������ ������ ��� ��ȯ
		System.out.println("���� ������:" + (char)data+ "���� ����Ʈ ��: "+is2.available());
		}
		is.close();
		is1.close();
		is2.close();
	}

}
