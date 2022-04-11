package Chap19.EX03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//1. String getBytes() :  String ---> Byte[] ����      ���� ---> byte ��ȯ �ؼ� �迭�� ����. 
		
		byte[] array1 = "�ȳ�".getBytes();    //charset�� ���� ����. 
		byte[] array2 = "��ť".getBytes(Charset.defaultCharset());   // ��ť ---> byte ��ȯ �ؼ� �迭�� ����. 
		byte[] array3 = "����".getBytes(Charset.forName("MS949")); //���ܹ߻� : ����� ���� 
		byte[] array4 = "��ť".getBytes("UTF-8");   //<<����ó�� �ʿ�: �Ϲݿ��� (�����Ͻ� ���� �߻�) >>
		
		//2. �� ���ڵ��� ����Ʈ �� ��� 
		System.out.println(array1.length);   //MS949 : �ѱ� 1�� 2byte ,  //4 
		System.out.println(array2.length);	//MS949 : �ѱ� 1�� 2byte ,  //4 
		System.out.println(array3.length);   //MS949 : �ѱ� 1�� 2byte ,  //4 
		System.out.println(array4.length);   //UTF-8 : �ѱ� 1�� 3byte	, 	//6
		System.out.println("================");
		
		//2. new String()   : byte[] => String���� ��ȯ      byte --> ���ڷ� ��ȯ 
		
		String str1 = new String(array1); 
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));   //�����ö� ���ڵ� Ÿ���� ��ġ �ؾ� �Ѵ�. 
		String str4 = new String(array4, Charset.forName("UTF-8"));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("====================");
			
		//3.�ѱ��� �������� ��� : �������� ���ڵ� Ÿ�԰� �������� ���ڵ� Ÿ���� ����ġ �� ��� 
			
		String str5 = new String(array1, Charset.forName("UTF-8"));
		String str6 = new String(array1, Charset.forName("MS949"));
		String str7 = new String(array3, Charset.forName("UTF-8"));
			
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
	}

}
