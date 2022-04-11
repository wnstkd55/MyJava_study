package Chap19.EX03;

import java.io.UnsupportedEncodingException;

//EUC-KR - �ѱ� ǥ��, �ѱ� ǥ������ ��ü�� ǥ�� �����Ѱ͸� �����Ǿ� ����. �� 11,000 ---> 2200 �� ǥ��, 8000�ڴ� ǥ�� �ȵ�. 
    // ���� : 1byte
	// �ѱ� : 2byte
	//���������� ��� �Ҷ� 

//MS-949  - Microsoft �翡�� ������ �ѱ� ǥ�� ���. 11000��θ� ǥ���� �� �ִ�. Windows OS 
    // ���� : 1byte 
    // �ѱ� ; 2bype

//UTF-8 : ��� ���� (Web, FTP, Mail, DB,  .....) , git, Mac,Linux <���� ����>
    // ���� : 1byte
    // �ѱ� : 3bype

//UTF-16 : <��������> 
    // ����, �ѱ� ��� 2byte�� ó��. 


//���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ��� , �ش� ���ڵ� Ÿ������ ������ �ؾ� �������� �ʴ´�. 

//��Ŭ�������� ���ڵ� Ÿ�� ���� 3����. 
	//1. ���� ���� : 
    //2. ������Ʈ���� ���� : 
    //3. ���Ͽ��� ����. 

	//�켱����     ���� > ������Ʈ > ���� 



public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		
		//1. ������ �� byte�� �������� String���� ��ȯ  : 1byte
		
	   byte[] b1 = "a".getBytes("EUC-KR");   //���ڸ� byte �� ��ȯ , ===> ��Ʈ��ũ�� ���ڸ� byte ��Ʈ������ ��ȯ�ؼ� ����.
		   // ���ܰ� �߻���. (UnsupportedEncodingException) <== ��Ÿ�� �߻��Ұ�� ���ڵ� �Ҽ� ���� ���ܰ� �߻��̵�. 
	   byte[] b2 = "a".getBytes("MS949");   // ���ڿ� ==> byte[]  
	   
	   System.out.println(b1.length);   //1
	   System.out.println(b2.length);   //1
	   
	   System.out.println(new String(b1,"EUC-KR"));  //byte[] ==> ���ڿ��� �ٲ�      
	   System.out.println(new String(b2,"MS949"));
	   
	   System.out.println();
	   
	   //2. �ѱ��� byte�� �������� String ���� �������� 
	   
	   byte[] b3 = "��".getBytes("EUC-KR");
	   byte[] b4 = "��".getBytes("MS949");
	   
	   System.out.println(b3.length);   //2
	   System.out.println(b4.length);   //2
	   
	   System.out.println(new String(b3,"EUC-KR"));  //byte[] ==> ���ڿ��� �ٲ�      
	   System.out.println(new String(b4,"MS949"));
	   
	   
	   //3. EUC-KR�� ���� ��� ������ �͸� ǥ��, �� 2000��. 
	   //   MS949�� 11,000�� ��� ǥ���. 
	   byte[] b5 = "�v".getBytes("EUC-KR");   // 11,000�� �� 2000�� ǥ��, 8000 (x)
	   byte[] b6 = "�v".getBytes("MS949");	  // 11,000�� ��� ó�� 
	   System.out.println(b5.length);   //1  ?
	   System.out.println(b6.length);   //2
	   
	   System.out.println(new String(b5,"EUC-KR"));  //byte[] ==> ���ڿ��� �ٲ�      
	   System.out.println(new String(b6,"MS949"));
	   
	}

}
