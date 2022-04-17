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
		
<<<<<<< HEAD
		InputStream is_input = System.in;
		System.out.println("한글을 입력해주세요 >>>");
=======
		//1. 콘솔에서 한글을 인풋 받는다(System.in) <== byte[]배열을 생성하여 처리 : 한글을 처리
		InputStream is_input = System.in;			//new로 생성하지 않고 연결만 설정, 콘솔에서 인풋값을 받는다.
		System.out.println("한글을 입력하세요>>>");
		byte[] arr = new byte[100];
		int count = is_input.read(arr);		//arr에 byte단위로 \r \n 포함되어있음, count는 배열의 방의 값이 들어온 갯수
		//int data = is_input.read();  ==> 한글을 처리하지 못한다. data에는 1byte read한 값이 저장이 됨.
>>>>>>> c036617bcdc9f46c27a40b5b6dc7ae4c71c5e071
		
		byte[] arr = new byte[100];
		int count1 = is_input.read(arr);
		String str = new String(arr,0,count1,Charset.defaultCharset());
		System.out.println(str);
		is_input.close();
		
<<<<<<< HEAD
		File file = new File("src/Chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(file);
		os.write(str.getBytes());
		os.flush();
		os.close();
		
		InputStream is = new FileInputStream(file);
		int data;
		while((data=is.read(arr))!= -1) {
			System.out.println(str);
		}
		is.close();
		
		OutputStream os_output = System.out;
=======
		//2. 인풋 받은 한글을 파일에 저장한다.(FileOutputStream)
		File File = new File("src/Chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(File);		//FileOutputStream(파일변수, affend) affend=>true 덮어쓰기
		os.write(str.getBytes());		//버퍼(RAM)에만 쓰여짐.
		os.flush();		//버퍼에 쓰인 내용을 파일에 쓰기
		os.close();
		
		//3. 저장된 파일에서 값을 읽어온다.(FileInputStream)
		InputStream is = new FileInputStream(File);	//read() : 한글처리못함(1byte만 처리되기 때문), read(byte[]) : 한글처리
		/*
			byte[] byteArray2 = new byte[100];
			int count2 = is.read(byteArray2);  //read(byte[]) : 한글처리
			//int data2 = is.read(); 	//read() : 1byte씩 읽어온다.
		 	
		*/
		int data;
		while((data=is.read(arr))!= -1){
			System.out.println("파일에서 읽어옵니다 >>> "+str);
		}
		is.close();
		
		//4. 읽어온 배열을 콘솔에서 출력한다.(System.out)
		OutputStream os_output = System.out;	//콘솔에 출력 : byte[]
>>>>>>> c036617bcdc9f46c27a40b5b6dc7ae4c71c5e071
		os_output.write(arr);
		
		os_output.flush();
		os_output.close();
		
		
		
		
	}

}
