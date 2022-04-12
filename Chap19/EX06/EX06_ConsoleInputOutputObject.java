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
		
		InputStream is_input = System.in;
		System.out.println("�ѱ��� �Է��ϼ���>>>");
		byte[] arr = new byte[100];
		int count = is_input.read(arr);
		
		String str = new String(arr,0,count,Charset.defaultCharset());
		is_input.close();
		
		File File = new File("src/Chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(File);
		os.write(str.getBytes());
		os.flush();
		os.close();
		InputStream is = new FileInputStream(File);
		int data;
		while((data=is.read(arr))!= -1){
			System.out.println(str);
		}
		is.close();
		OutputStream os_output = System.out;
		os_output.write(arr);
		os_output.flush();
		os_output.close();
	}

}
