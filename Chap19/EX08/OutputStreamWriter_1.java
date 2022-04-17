package Chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamReader : byte ==> char		charset(MS949, UTF-8) 지정해서 파일을 읽어올 수 있다.
//OutputStreamWriter : byte ==> char,  charset(MS949, UTF-8) 지정해서 파일을 저장할 수 있다.

public class OutputStreamWriter_1 {

	public static void main(String[] args) {
		System.out.println("=============FileWriter를 통해서 데이터 쓰기(Default: MS949)==============");
		//1.FileWriter를 통해서 데이터 쓰기(Default: MS949)
		File osw1 = new File("src\\Chap19\\EX08\\osw1.txt");	//MS949
		File osw2 = new File("src\\Chap19\\EX08\\osw2.txt");	//UTF-8
		
		//이클립스 외부에 저장하면 잘 적용
//		File osw1 = new File("C:\\Temp\\osw1.txt");	//MS949
//		File osw2 = new File("C:\\Temp\\osw2.txt");	//UTF-8
		
		try (Writer writer = new FileWriter(osw1);){	// <== default 인코딩 지정 못함
			writer.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray()); 		//String을 char배열에 저장
			writer.write("한글과 영문이 모두 포함되어 있습니다. "); //String
			writer.write('\n'); 		//char 저장
			writer.write("Good Bye !!! \n\n");
			writer.flush();
			writer.close();
		} catch (IOException e) {}
		
		System.out.println("========FileWriter를 사용해서(Default : MS949 ===>UTF-8 파일쓰기)==========");
		//2. FileWriter를 사용해서(Default : MS949 ===>UTF-8 파일쓰기)
		try (OutputStream os = new FileOutputStream(osw2);
			 OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");){	// <== 인코딩(utf-8)로 지정할 수 있음.
				//OutputStreamWriter	:byte ==> char
			
			osw.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray()); 		//String을 char배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다. "); //String
			osw.write('\n'); 		//char 저장
			osw.write("Good Bye !!! \n\n");
			osw.flush();
			osw.close();
		} catch (IOException e) {}
		
	}

}
