package Chap19.EX08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 	Reader / Writer		: char ���� �����. ���ڸ� ó���ϵ��� Ưȭ�� �߻�Ŭ����
		���ڵ��� �Ű��� �� �ᵵ �ȴ�.
 		//byte : 1byte
 		//char : 2byte, UTF-16 (�����ڵ�)�� ó��, ���� 2byte, �ѱ۵� 2byte, ��������, ������ ��� �� ó��
 		
 		FileReader : charset�����ɼ��� ����. default charset���
 		File 
 */

public class File_Reader_Writer {

	public static void main(String[] args) {
		
		//1. ���ϰ�ü ����
		File rwFile = new File("src\\Chap19\\EX08\\rwFile.txt");
		
		try (Writer writer = new FileWriter(rwFile);){	//Writer : �߻�Ŭ����, FileWriter : Writer�� ������ �ڽ� Ŭ����
			//OutputStream 		: byte���� ���, �߻�Ŭ����,	FileOutputStream, ����, ������,mp3,JPG,AVG...��� ó��
			//Writer 			: char ���� ���, �߻� Ŭ����, FileWriter, ���� Ưȭ�ؼ� ó��
			
			writer.write("�ȳ��ϼ���\n".toCharArray());		//String ==>Char�迭�� ����
			writer.write("Hello \n"); 	//String
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("�ݰ����ϴ�",2,3);
			writer.flush();
			
		} catch (IOException e) {}
		
		//2. FileReader�� �̿��� ���� �б� (Default MS949)	<===Charactorset ���� �ɼ��� ����.
		
		try (Reader reader = new FileReader(rwFile);){
			int data;
			while((data=reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			
		}
		
		
	}

}
