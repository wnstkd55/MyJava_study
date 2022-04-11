package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {
		
		//1. 입력 파일 생성
		File inFile = new File("src\\Chap19\\EX04\\FileInputStream1.txt");
		
		//2. #1 byte단위 읽기 (한바이트씩 읽어서 처리)
		InputStream is1 = null; //객체 선언, finally블락에서 close
		
		try {
			InputStream is11 = new FileInputStream(inFile);//객
			int data;
			while((data = is11.read())!=-1) {		//읽어올 파일이 영문만 있기때문에 read()메소드만 사용,
													//한글일 경우 read(byte[]배열을 해줘야됨.)
				System.out.print((char)data);
			}
			
			
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}finally {
			if(is1 != null) {
				try{
				is1.close();			//null일때 close()를 호출하면 IOException
			}catch(IOException e) {
				
				}
			}
		}
		System.out.println();
		System.out.println("=========try(with resource){}로 구현하기=======");
		
		//2. #2 
		
		try(InputStream is1_1 = new FileInputStream(inFile)){ //객체 선언, finally블락에서 close) {
			//try(with resource : 객체 생성) <=== close()가 자동으로 된다. FileInputStream Closeable인터페이스를 구현
			
			int data;
			while((data = is1_1.read())!=-1) {		//읽어올 파일이 영문만 있기때문에 read()메소드만 사용,
													//한글일 경우 read(byte[]배열을 해줘야됨.)
				System.out.print((char)data);
			}
			
			
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
		System.out.println();
		System.out.println();
		System.out.println("=================================");
		//3. #2 n-byte단위로 읽기(byte[]의 처음위치에서부터 읽은 데이터 저장) : 여러바이트를 동시에 읽어서 처리속도가 빠름.
				//배열의 방의 크기만큼 읽어들여서 배열에 저장
				//한글 처리 가능
		
		InputStream is2 = new FileInputStream(inFile); 		//throws로 처리;
		byte[] byteArray1 = new byte[9];	//배열방 9개, 0~8까지
		
		int count1;
		while((count1 = is2.read(byteArray1)) != -1 ) {		//-1 : 파일의 마지막 까지
					//is2.read() : 1byte 씩 읽는다. 	한글을 처리 못한다.
					//is2.read(byteArray1) : 9byte 씩 읽는다. byteArray1에 저장
					//count1 : 9, 9, 2, -1
			
			
			for(int i = 0; i<count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(" : count1= "+ count1);
			
			
		}
		
		is2.close();
		
		//3. 2_1 n-byte 단위로 읽어서 한글처리[배열 단위로 읽어서 한글 처리]
		
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		int count2;
		
		while((count2=is3.read(byteArray2)) != -1) {	//count2 = 100,
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		is3.close();
		System.out.println("=============================================");
		
		//4. #3 n-byte 단위로 읽어서 저장. 	offset, length 사용
		InputStream is4 = new FileInputStream(inFile);
		byte[] byteArray4 = new byte[9];
		
		int offset = 3;
		int length = 6;
		
		int count4 = is4.read(byteArray4, offset,length);		//앞에서 length만큼 읽어와서 byteArray4[]의 
																// offset위치에서부터 입력
		for(int i=0;i<offset + count4; i++) {
			System.out.print((char)byteArray4[i]);
		}
		
		
		
		is4.close();
		
		
	}
}
