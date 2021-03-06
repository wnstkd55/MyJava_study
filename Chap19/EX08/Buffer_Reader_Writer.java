package Chap19.EX08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		
		//1. 파일 객체 생성
		File rwfile = new File("src\\Chap19\\EX08\\Bufferedfile.txt");
		
		//2. FileWriter를 이용한 파일 쓰기(MS949 모드)
		try (Writer writer = new FileWriter(rwfile);
			 BufferedWriter bw = new BufferedWriter(writer);){
			
			bw.write("안녕하세요.\n");
			bw.write("hello\n");
			bw.write("반갑습니다.",2,2);
			
		} catch (IOException e1) {}
		
		
		//3. FileReader를 이용한 파일읽기(MS-949 모드)
		try (Reader reader = new FileReader(rwfile);
			 BufferedReader br = new BufferedReader(reader)){
			String data;
			while((data=br.readLine())!= null) {
				System.out.println(data);
			}
			
		} catch (Exception e) {	}
		
		
	}

}
