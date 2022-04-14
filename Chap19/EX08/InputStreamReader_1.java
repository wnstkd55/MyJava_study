package Chap19.EX08;
/*
 * 
	InputStreamReader : byte데이터를 char포맷으로 변환하는 객체		<<==인코딩을 지정할 수 있다.
		byte포맷은 인코딩을 잘 지정해줘야된다.	<<== encoding 
		char포맷으로 바꾸면 인코딩타입을 신경쓸 필요가 없다.
		사용목적 1. FileReader : default charset만 사용 가능해서, 현재 Default charet MS949이지만 외부 파일이 UTF-8을 읽어올 경우
		사용목적 2. 네트워크에서 전송되는 스트림이 UTF-8, MS949 byte ==> char 로 변환처리
		
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_1 {

	public static void main(String[] args) {
		System.out.println("===================== Reader =======================");
		//1. 파일 객체 생성
		File isr = new File("src\\Chap19\\EX08\\isr.txt");		//isr.txt은 utf-8로 저장되어있음
		
		try (Reader reader = new FileReader(isr);){		//FileReader는 인코딩 설정이 안됨. default Encoding만 사용
			int data;
			while((data=reader.read())!=-1) {	//MS949
				System.out.print((char)data);
			}
			
		} catch (Exception e) {}
		System.out.println();
		System.out.println("================= InputStreamReader ==================");
		System.out.println();
		//2. FileInputStream + InputStreamReader를 이용한 파일 읽기
		//InputStreamReader(is, "UTF-8") :  	byte ==> Char로 변환
		
		try (InputStream is = new FileInputStream(isr);
			 InputStreamReader isr1 = new InputStreamReader(is,"utf-8");){	//isr1 : char변환된것
			int data;
			while((data=isr1.read()) != -1) {	//utf-8
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr1.getEncoding());
			
		} catch (Exception e) {}
		
		
	}

}
