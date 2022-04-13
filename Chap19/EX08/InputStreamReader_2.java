package Chap19.EX08;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		System.out.println("===================== 콘솔입력을 MS949로 받기 ==========================");
		//1. 콘솔 입력(MS949) : default charset, byte 스트림.
		try {	//콘솔에서 입력받는값 : byte
			//InputStreamReader : byte ==> char로 변환
			//System.in : 콘솔 입력, byte
			
			//isr은 변환된 char
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			System.out.println("한글을 원하는 대로 입력하세요 >>> ");
			int data;
			while((data=isr.read())!= '\r') { 		//Console 에서는 '\r'이 끝이다(엔터로 입력하기 때문에)
													//콜솔 입력 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		System.out.println("===================== 콘솔입력을 utf-8로 받기 ==========================");
		//2. 콘솔입력을 utf-8로 받기
		try {	//콘솔에서 입력받는값 : byte
			//InputStreamReader : byte ==> char로 변환
			//System.in : 콘솔 입력, byte
			
			//isr은 변환된 char
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			System.out.println("한글을 원하는 대로 입력하세요 >>> ");
			int data;
			while((data=isr.read())!= '\r') { 		//Console 에서는 '\r'이 끝이다(엔터로 입력하기 때문에)
													//콜솔 입력 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		
	}

}
