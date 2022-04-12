package Chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// 콘솔에서 배열 100byte이하 한글을 인풋받은값을 input.txt에 저장후, Charset은 default
// input.txt파일에서 값을 읽어서 콘솔(System.out)을 사용해서 콘솔에 출력.
//힌트 : 
	//1. System.in : 콘솔에서 인풋
	//2. FileOutputStream : 인풋받은값을 파일에 저장
	//3. FileInputStream : 저장된 파일의 내용을 읽어오기
	//4. System.out : 콘솔에 출력


//완료시간 : 6:20분까지

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		
		InputStream is_input = System.in;
		System.out.println("한글을 입력하세요>>>");
		byte[] arr = new byte[100];
		int count = is_input.read(arr);
		
		String str = new String(arr,0,count,Charset.defaultCharset());
		is_input.close();
		
		File File = new File("src/Chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(File);
		os.write(str.getBytes());
		os.flush();
		os.close();
		InputStream is = new FileInputStream(File);
		int data;
		while((data=is.read(arr))!= -1){
			System.out.println(str);
		}
		is.close();
		OutputStream os_output = System.out;
		os_output.write(arr);
		os_output.flush();
		os_output.close();
	}

}
