package Chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//�ѱ��� �ֿܼ� ���. 1-byte�� ��½� �ѱ� ��� �ȵ� 	n-byte�� ����ؾ� �ѱ� ���

public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		//2. n-byte���(byte[] �迭�� ó�� ���� ������ ������ ����
		byte[]byteArray1 = "�ȳ��ϼ���".getBytes(Charset.defaultCharset());
		os.write(byteArray1);
		os.write('\n');		//���ۿ� ����
		
		os.flush();	//������ ������ �ֿܼ� ���
		
		//3. n-byte���( byte[]�� offset���� length���� byte������ ����)
		byte[] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.defaultCharset());
		
		os.write(byteArray2,6,4); 		//6byte ������ 4byte�� ó��
		
		os.flush();
		os.close();
		
		
		
	}

}
