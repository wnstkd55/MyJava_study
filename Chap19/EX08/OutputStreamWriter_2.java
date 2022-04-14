package Chap19.EX08;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 	Reader / Writer : �߻�Ŭ����, char�� ó��, ����(0), �̹���(x) mp3(x)...
 	FileReader / FileWriter : �����ε��� Ŭ����, Default charset�� ���.
 	InputStreamReader / OutputStreamWriter : ������ ���ڵ�(MS949, UTF-8) �����ؼ� �б�/ ���ڵ�(MS949,UTF-8)�� �����ؼ� ����
 	
 	����!  System.in :�ܼ��Է�, System.out : �ܼ����		< == Applicaation���� �ѹ� close()�Ǹ� ������ �ȵ�
 		System.in / System.out	<== byte���� �б� / ����.
 	
 	
 */

public class OutputStreamWriter_2 {

	public static void main(String[] args) {
		
		//1. �ܼ����( Default : MS949 ==> MS949 )
		System.out.println("============ 1.�ܼ����( Default : MS949 ==> MS949 )============ ");
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"MS949");
			osw.write("OutputStreamWriter1 ���� ���� �Դϴ�. \n".toCharArray()); 		//String�� char�迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�. "); //String
			osw.write('\n'); 		//char ����
			osw.write("Good Bye !!! \n\n");		// ����(�޸�)���� ����
			osw.flush();	// flush() ����(�޸�)�� �ִ� ������ �ֿܼ� �����
			

		} catch (Exception e) {}
		
		System.out.println("============ 2. �ܼ����(Application  default : MS949 ============");
		
		//2. �ܼ����(Application  default : MS949
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"utf-8");
			osw.write("OutputStreamWriter1 ���� ���� �Դϴ�. \n".toCharArray()); 		//String�� char�迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�. "); //String
			osw.write('\n'); 		//char ����
			osw.write("Good Bye !!! \n\n");		// ����(�޸�)���� ����
			osw.flush();	// flush() ����(�޸�)�� �ִ� ������ �ֿܼ� �����
			osw.close();

		} catch (Exception e) {}
	}

}
