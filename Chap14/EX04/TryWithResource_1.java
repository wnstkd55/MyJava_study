package Chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {
	public static void main(String[] args) {
		//1. 수동 리소스 해제(기존 프로그래머 사용)	-- 코드가 길고 지저분하다.
		
		System.out.println("문자를 입력하세요");
		InputStreamReader isr2 = null;			//사용후 반드시 메모리에서 객체를 삭제, isr2.close();
		//System.in : 콜솔에서 입력을 받도록 처리 . 1번만 인풋을 받을 수 있다.
		
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();			//일반예외(checked 예외) : IOException : 입력출시
			System.out.println("입력글자 = " + input);
		}catch (IOException e) {
			e.printStackTrace();//try{}블락에서 예외가 발생될 경우 자세한 정보를 출력
		}finally {	//객체를 사용후에 메모리영역에서 삭제
			//리소스 해제 : isr2.close()
			if(isr2 != null) {
//				isr2.close();
//			}catch(IOException e)
		}
		}
		
		
	
		//2. 자동 리소스 해제(Java 1.7 자동으로 리소스를 해제)  --코드가 간결하다.(필요조건이 있다.)
				//1. 사용하는 객체가 AutoCloseable인터페이스를 구현한 객체여야한다.
				//2. 반드시 객체에 close()가 반드시 존재해야한다.
				//위의 2가지 조건을 만족할때 자동 리소스 해제
				//try(자동으로 객체를 리소스를 해제할 객체 선언){} catch{} finally{}
		
		//InputStreamReader는 AutoCloseable 인터페이스를 구현하고있다. close() 가지고있다.
		//Try with Resource : try(with resource : 객체 메모리 로드){}
		try(InputStreamReader isr1 = new InputStreamReader(System.in)){
			char input = (char) isr1.read();
			System.out.println("입력글자= "+input);
		}catch(IOException e){
			e.printStackTrace();
		}	//finally 블락을 생략하더라도 객체를 자동으로 close한다.
	}
}
