package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_1_1 {
	public static void main(String[] args) throws IOException {
			
			//��Ʈ���� �ѹ� ����ϸ� ������ �Ұ�
			
			//1. Consol���� ��ǲ �ޱ� ���� ��ü ����
			InputStream is1 = System.in; 		//is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
			
			System.out.println("������ �Է��ϼ��� >>>");
			
			int data;
			
			while((data = is1.read()) != '\n') { 		//1byte �о int data������ �Ҵ�.
				System.out.print((char)data);
			}
			
			System.out.println(data);		//10 <--- \n
			System.out.println(is1.read());//���̻� read�� ����.
			
			
	}

}
