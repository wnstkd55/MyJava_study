package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

/*
  System.in : Consol에서 인풋을 받는 자바에서 제공해주는 객체
  		Window : 콘솔에서 Enter : \n \r
  		Mac		: 콘솔에서 Enter : \r
  System.out : Consol로 출력을하는 객체 OutputStream
 */

public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {
		
		//스트림은 한번 사용하면 재사용이 불가
		
		//1. Consol에서 인풋 받기 위한 객체 생성
		InputStream is1 = System.in; 		//is1은 콘솔에서 인풋받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요 >>>");
		
		int data;
		
		while((data = is1.read()) != '\r') { 		//1byte 읽어서 int data변수에 할당.
			System.out.println("읽은데이터 : "+(char)data + " 남은 바이트수: "+ is1.available());
		}
		
		System.out.println(data);		//13 <--- /r
		System.out.println(is1.read());//10 <--- \n
		
		System.out.println("======================================");
		
		while((data = is1.read()) != '\r') { 		//1byte 읽어서 int data변수에 할당.
			System.out.print((char)data);
		}
		
	}

}
