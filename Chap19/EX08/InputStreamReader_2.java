package Chap19.EX08;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		System.out.println("===================== �ܼ��Է��� MS949�� �ޱ� ==========================");
		//1. �ܼ� �Է�(MS949) : default charset, byte ��Ʈ��.
		try {	//�ֿܼ��� �Է¹޴°� : byte
			//InputStreamReader : byte ==> char�� ��ȯ
			//System.in : �ܼ� �Է�, byte
			
			//isr�� ��ȯ�� char
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ��� >>> ");
			int data;
			while((data=isr.read())!= '\r') { 		//Console ������ '\r'�� ���̴�(���ͷ� �Է��ϱ� ������)
													//�ݼ� �Է� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		System.out.println("===================== �ܼ��Է��� utf-8�� �ޱ� ==========================");
		//2. �ܼ��Է��� utf-8�� �ޱ�
		try {	//�ֿܼ��� �Է¹޴°� : byte
			//InputStreamReader : byte ==> char�� ��ȯ
			//System.in : �ܼ� �Է�, byte
			
			//isr�� ��ȯ�� char
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ��� >>> ");
			int data;
			while((data=isr.read())!= '\r') { 		//Console ������ '\r'�� ���̴�(���ͷ� �Է��ϱ� ������)
													//�ݼ� �Է� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		
	}

}
