package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_1_1 {
	public static void main(String[] args) throws IOException {
			
			//스트림은 한번 사용하면 재사용이 불가
			
			//1. Consol에서 인풋 받기 위한 객체 생성
			InputStream is1 = System.in; 		//is1은 콘솔에서 인풋받아서 처리하는 객체
			
			System.out.println("영문을 입력하세요 >>>");
			
			int data;
			
			while((data = is1.read()) != '\n') { 		//1byte 읽어서 int data변수에 할당.
				System.out.print((char)data);
			}
			
			System.out.println(data);		//10 <--- \n
			System.out.println(is1.read());//더이상 read가 없다.
			
			
	}

}
