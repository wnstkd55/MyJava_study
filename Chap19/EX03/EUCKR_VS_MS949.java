package Chap19.EX03;

import java.io.UnsupportedEncodingException;

//EUCKR - �ѱ�ǥ��, �ѱ� ǥ�� ���� ��ü�� ǥ�� �����Ѱ͸� �����Ǿ� ����. �� 11,000 --> 2200�� ǥ��, 8000�ڴ� ǥ�� �ȵ�.
	//���� : 1byte
	//�ѱ� : 2byte
//MS-949 - Microsoft�翡�� ������ �ѱ� ǥ�� ���. 11000��θ� ǥ���� �� �ִ�.
	// ���� : 1byte
	// �ѱ� : 2byte

//UTF-8: ��缭�� (Web, FTP...),git Mac <��������>
	//���� : 1byte
	//�ѱ� : 3byte
//UTF-16 : 
	//����,�ѱ� ��� 2byte�� ó��.

//���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ���, �ش� ���ڵ� Ÿ������ ������ �ؾ� �������� �ʴ´�.

//��Ŭ�������� ���ڵ� Ÿ�� ����3����.
	//1.�������� ����
	//2. ������Ʈ���� ���� : 
	//3. ���Ͽ��� ����
		//�켱���� ����>������Ʈ>����


public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		
		//EUCKR vs MS949
		
		byte[]b1 = "a".getBytes("EUC-KR"); //���ڸ� byte�� ��ȯ
		//���ܰ� �߻���.(Unsupported EncodingException) <==��Ÿ�� �߻��� ��� ���ڵ� �� �� ���� ���ܰ� �߻��̵�.
		byte[]b2 = "a".getBytes("MS949");
		
		System.out.println(b1.length); //1
		System.out.println(b2.length);//1
		
		System.out.println(new String(b1,"EUC-KR"));	
		System.out.println(new String(b2,"MS949"));
		
		System.out.println();
		
		//2. �ѱ��� byte�� �������� String���� ��������
		
		byte[]b3 = "��".getBytes("EUC-KR"); 		//11,000wk wnd 2000�� ǥ��
		byte[]b4 = "��".getBytes("MS949");
		
		System.out.println(b3.length); //2
		System.out.println(b4.length);//2
		
		System.out.println(new String(b3,"EUC-KR"));	
		System.out.println(new String(b4,"MS949"));
	}

}
