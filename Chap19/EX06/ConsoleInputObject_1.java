package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

/*
  System.in : Consol���� ��ǲ�� �޴� �ڹٿ��� �������ִ� ��ü
  		Window : �ֿܼ��� Enter : \n \r
  		Mac		: �ֿܼ��� Enter : \r
  System.out : Consol�� ������ϴ� ��ü OutputStream
 */

public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {
		
		//��Ʈ���� �ѹ� ����ϸ� ������ �Ұ�
		
		//1. Consol���� ��ǲ �ޱ� ���� ��ü ����
		InputStream is1 = System.in; 		//is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ��� >>>");
		
		int data;
		
		while((data = is1.read()) != '\r') { 		//1byte �о int data������ �Ҵ�.
			System.out.println("���������� : "+(char)data + " ���� ����Ʈ��: "+ is1.available());
		}
		
		System.out.println(data);		//13 <--- /r
		System.out.println(is1.read());//10 <--- \n
		
		System.out.println("======================================");
		
		while((data = is1.read()) != '\r') { 		//1byte �о int data������ �Ҵ�.
			System.out.print((char)data);
		}
		
	}

}
