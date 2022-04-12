package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//콘솔 인풋시 한글처리		:1-byte씩 읽으면 한글처리를 하지마소한다.		배열로 읽어야한글처리가 가능
//InputStream System.in

public class ConsoleInputObject_3 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;		//한번만 선언할 수있다. close()제일 마지막에 사용
		
		System.out.println("한글을 입력하세요>>");
		
		//#2. n-byte배열 (byte[] 처음위치에서 읽은 데이터 저장.)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);		// \r \n포함
				//count1 : byteArray1에 저장된 값의 갯수(\r \n 포함)
		
		String str1 = new String(byteArray1, 0,count1,Charset.defaultCharset());
		System.out.println(str1);
		System.out.println("배열의 방의 총 갯수 r과 n을 포함 : "+count1);
		
		//3. n-byte 단위 읽기(length마늠 읽어와서 byte[]배열의 offset[index]위치에 저장해라)
		
		byte[]byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset,length);
		
		String str2 = new String(byteArray2,0,offset+count2, Charset.defaultCharset());
		System.out.println(str2);
		
		
		
		
		
		
	}

}
