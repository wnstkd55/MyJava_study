package Chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ֿܼ��� �迭 100byte���� �ѱ��� ��ǲ�������� input.txt�� ������, Charset�� default
// input.txt���Ͽ��� ���� �о �ܼ�(System.out)�� ����ؼ� �ֿܼ� ���.
//��Ʈ : 
	//1. System.in : �ֿܼ��� ��ǲ
	//2. FileOutputStream : ��ǲ�������� ���Ͽ� ����
	//3. FileInputStream : ����� ������ ������ �о����
	//4. System.out : �ֿܼ� ���


//�Ϸ�ð� : 6:20�б���

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		
		//1. �ֿܼ��� �ѱ��� ��ǲ �޴´�(System.in) <== byte[]�迭�� �����Ͽ� ó�� : �ѱ��� ó��
		InputStream is_input = System.in;			//new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ���� �޴´�.
		System.out.println("�ѱ��� �Է��ϼ���>>>");
		byte[] arr = new byte[100];
		int count = is_input.read(arr);		//arr�� byte������ \r \n ���ԵǾ�����, count�� �迭�� ���� ���� ���� ����
		//int data = is_input.read();  ==> �ѱ��� ó������ ���Ѵ�. data���� 1byte read�� ���� ������ ��.
		
		String str = new String(arr,0,count,Charset.defaultCharset());
		is_input.close();
		
		//2. ��ǲ ���� �ѱ��� ���Ͽ� �����Ѵ�.(FileOutputStream)
		File File = new File("src/Chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(File);		//FileOutputStream(���Ϻ���, affend) affend=>true �����
		os.write(str.getBytes());		//����(RAM)���� ������.
		os.flush();		//���ۿ� ���� ������ ���Ͽ� ����
		os.close();
		
		//3. ����� ���Ͽ��� ���� �о�´�.(FileInputStream)
		InputStream is = new FileInputStream(File);	//read() : �ѱ�ó������(1byte�� ó���Ǳ� ����), read(byte[]) : �ѱ�ó��
		/*
			byte[] byteArray2 = new byte[100];
			int count2 = is.read(byteArray2);  //read(byte[]) : �ѱ�ó��
			//int data2 = is.read(); 	//read() : 1byte�� �о�´�.
		 	
		*/
		int data;
		while((data=is.read(arr))!= -1){
			System.out.println("���Ͽ��� �о�ɴϴ� >>> "+str);
		}
		is.close();
		
		//4. �о�� �迭�� �ֿܼ��� ����Ѵ�.(System.out)
		OutputStream os_output = System.out;	//�ֿܼ� ��� : byte[]
		os_output.write(arr);
		
		os_output.flush();
		os_output.close();
	}

}
