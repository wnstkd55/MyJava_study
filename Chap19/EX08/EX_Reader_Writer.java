package Chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 	Application Default : MS949
 	Reader / writer�� ���� Ŭ������ ����ϼ���.
 	
 	1. �ֿܼ��� �ѱ��� �о
 		C:\Temp\a\aaa.txt(MS949)
 		C:\Temp\b\bbb.txt(UTF-8)
 		���Ͽ� ������.
 		
 		- a,b������ Application���� �����ϼ���.
 		
 	2. �� ���Ͽ��� ���� ������ �ֿܼ� �������� ����ϼ���.
 */

public class EX_Reader_Writer {

	public static void main(String[] args)  {
		
		File A = new File("C:\\Temp\\a"); 
		if (!A.exists())	{			
			A.mkdir();
		}
		File B = new File("C:\\Temp\\b"); 
		if (!B.exists())	{			
			B.mkdir();
		}
		
		File fileA = new File("C:\\Temp\\a\\aaa.txt");
		File fileB = new File("C:\\Temp\\b\\bbb.txt");
		
		InputStreamReader isr1 = null;
		InputStreamReader isr2 = null;
		
		
		try (OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream(fileA));){
			System.out.println("�ѱ��� �Է����ּ��� >>> ");
			int data1;
			isr1 = new InputStreamReader(System.in);
			while((data1=isr1.read())!= '\r') {
	    		osw1.write((char)data1);
	    	}
		} catch (Exception e) {}
		try {
			isr2 = new InputStreamReader(new FileInputStream(fileA));
			System.out.println("MS949 >>>");
			int data;
			while ((data = isr2.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		System.out.println();
		System.out.println();
		try (OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream(fileB),"utf-8");){
			System.out.println("�ѱ��� �Է����ּ��� >>> ");
			int data1;
			isr1 = new InputStreamReader(System.in);
			while((data1=isr1.read())!= '\r') {
	    		osw1.write((char)data1);
	    	}
		} catch (Exception e) {}
		
		try {
			isr2 = new InputStreamReader(new FileInputStream(fileB),"utf-8");
			
			System.out.println("UTF-8 >>>");
			int data;
			while ((data = isr2.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
    	
       
      
		
	}

}
