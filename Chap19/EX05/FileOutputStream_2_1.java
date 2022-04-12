package Chap19.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2_1 {

	public static void main(String[] args) throws IOException {
		//1. 저장할 파일생성.
		File outFile = new File("src/Chap19/EX05/FileOutput2_1.txt"); 	//기본적으로 이클립스의 default charactorSet으로 저장.
		
		//2. n-byte 단위 스기 처리(byte[]의 처음부터 끝까지 쓰기) <== 한글을 처리
		OutputStream os2 = new FileOutputStream(outFile, true);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("utf-8"));	//String ==>byte[]에 저장: getBytes(),
				//한자 2byte씩처리됨. 총 10byte
		os2.write(byteArray1);
		
		
		os2.flush();
		os2.close();
		
		//3. n-byte쓰기( byte[]의 offset부터 length개의 바이트 데이터쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);		//true -> 이어서쓰기
		//byte[] byteArray2 = "반갑습니다".getBytes(Charset.forName("utf-8"));
		byte[] byteArray2 = "반값습니다".getBytes(Charset.defaultCharset());	//기본(MS949)charset으로 가져오기
		os3.write(byteArray2,2,2);	//2byte띄우고 2byte를 읽는다.
			//write(byte배열, offset, length)
		
		//영어, 숫자, 특수문자 <==ASCII 코드로 1byte
		System.out.println(Charset.defaultCharset());
		
		os3.flush();
		os3.close();
		
	}
}
