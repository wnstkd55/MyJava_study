package Chap19.EX08;
/*
 * 
	InputStreamReader : byte�����͸� char�������� ��ȯ�ϴ� ��ü		<<==���ڵ��� ������ �� �ִ�.
		byte������ ���ڵ��� �� ��������ߵȴ�.	<<== encoding 
		char�������� �ٲٸ� ���ڵ�Ÿ���� �Ű澵 �ʿ䰡 ����.
		������ 1. FileReader : default charset�� ��� �����ؼ�, ���� Default charet MS949������ �ܺ� ������ UTF-8�� �о�� ���
		������ 2. ��Ʈ��ũ���� ���۵Ǵ� ��Ʈ���� UTF-8, MS949 byte ==> char �� ��ȯó��
		
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_1 {

	public static void main(String[] args) {
		System.out.println("===================== Reader =======================");
		//1. ���� ��ü ����
		File isr = new File("src\\Chap19\\EX08\\isr.txt");		//isr.txt�� utf-8�� ����Ǿ�����
		
		try (Reader reader = new FileReader(isr);){		//FileReader�� ���ڵ� ������ �ȵ�. default Encoding�� ���
			int data;
			while((data=reader.read())!=-1) {	//MS949
				System.out.print((char)data);
			}
			
		} catch (Exception e) {}
		System.out.println();
		System.out.println("================= InputStreamReader ==================");
		System.out.println();
		//2. FileInputStream + InputStreamReader�� �̿��� ���� �б�
		//InputStreamReader(is, "UTF-8") :  	byte ==> Char�� ��ȯ
		
		try (InputStream is = new FileInputStream(isr);
			 InputStreamReader isr1 = new InputStreamReader(is,"utf-8");){	//isr1 : char��ȯ�Ȱ�
			int data;
			while((data=isr1.read()) != -1) {	//utf-8
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr1.getEncoding());
			
		} catch (Exception e) {}
		
		
	}

}
