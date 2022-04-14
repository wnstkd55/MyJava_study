package Chap19.EX08;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 	Reader / Writer : 추상클래스, char를 처리, 문자(0), 이미지(x) mp3(x)...
 	FileReader / FileWriter : 오버로딩한 클래스, Default charset만 사용.
 	InputStreamReader / OutputStreamWriter : 읽을때 인코딩(MS949, UTF-8) 지정해서 읽기/ 인코딩(MS949,UTF-8)을 지정해서 쓰기
 	
 	주의!  System.in :콘솔입력, System.out : 콘솔출력		< == Applicaation에서 한번 close()되면 재사용이 안됨
 		System.in / System.out	<== byte단위 읽기 / 쓰기.
 	
 	
 */

public class OutputStreamWriter_2 {

	public static void main(String[] args) {
		
		//1. 콘솔출력( Default : MS949 ==> MS949 )
		System.out.println("============ 1.콘솔출력( Default : MS949 ==> MS949 )============ ");
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"MS949");
			osw.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray()); 		//String을 char배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다. "); //String
			osw.write('\n'); 		//char 저장
			osw.write("Good Bye !!! \n\n");		// 버퍼(메모리)에만 쓰기
			osw.flush();	// flush() 버퍼(메모리)에 있는 내용을 콘솔에 출력함
			

		} catch (Exception e) {}
		
		System.out.println("============ 2. 콘솔출력(Application  default : MS949 ============");
		
		//2. 콘솔출력(Application  default : MS949
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"utf-8");
			osw.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray()); 		//String을 char배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다. "); //String
			osw.write('\n'); 		//char 저장
			osw.write("Good Bye !!! \n\n");		// 버퍼(메모리)에만 쓰기
			osw.flush();	// flush() 버퍼(메모리)에 있는 내용을 콘솔에 출력함
			osw.close();

		} catch (Exception e) {}
	}

}
