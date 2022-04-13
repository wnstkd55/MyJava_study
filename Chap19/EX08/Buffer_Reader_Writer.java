package Chap19.EX08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		
		//1. ���� ��ü ����
		File rwfile = new File("src\\Chap19\\EX08\\Bufferedfile.txt");
		
		//2. FileWriter�� �̿��� ���� ����(MS949 ���)
		try (Writer writer = new FileWriter(rwfile);
			BufferedWriter bw = new BufferedWriter(writer);){
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("�ݰ����ϴ�.",2,3);
			bw.flush();
			
		} catch (IOException e) {}
		
		//3. FileReader�� �̿��� �����б�(MS-949 ���)
		try (Reader reader = new FileReader(rwfile);
			 BufferedReader br = new BufferedReader(reader);){
			
			//BufferedReader�� �߰��� �޼��� : String readLine() : ������ ��, null �Ѷ��ξ� �д´�.
			//int read()	: ������ ��, -1
			
			String data;
			while((data=br.readLine())!= null) {
				System.out.println(data);
			}
		} catch (Exception e) {}
		
	}

}
