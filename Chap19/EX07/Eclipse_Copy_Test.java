package Chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		//두 파일을 복사, Buffered를 사용하지 않고 처리하는 경우, Buffered를 사용하는 경우 속도 차이
		
		File orgfile = new File("C:\\Temp\\copy_test\\eclipse_orgin.exe");		//원본 파일 
		File copyfile1 = new File("C:\\Temp\\copy_test\\eclipse_copy1.exe");		//복사본 파일1(Buffered X) 
		File copyfile2 = new File("C:\\Temp\\copy_test\\eclipse_copy2.exe");		//복사본 파일2(Buffered O)
		
		//성능 측정을 하기위한 변수 선언.
		long start, end, time1, time2 ;	//time1 : Buffered를 사용하지 않는 경우, time2 : Buffered를 사용한 경우
		
		//1. Buffered를 사용하지 않고 처리하는 경우(InputStream, OutputStream)
		start = System.nanoTime();		//시작 시간
		
		try (InputStream is = new FileInputStream(orgfile);			//Auto close()
			OutputStream os = new FileOutputStream(copyfile1);){	//Auto close()
			//데이터 복사 코드
			int data;
			while((data=is.read())!= -1) { 		//is 에서 1byte읽어서, 	-1 => 마지막까지
												   //os에 1byte 쓰기
				os.write(data);
			}
		} catch (IOException e){}
		end = System.nanoTime();
		time1 = end-start;
		System.out.println("Without BufferedXXXStream : "+time1);	//버퍼를 사용하지 않고 복사 copy1.jpg
		
		//2. Buffered를 사용하면서 처리하는 경우(BufferedInputStream, BufferedOutputStream)
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(orgfile);						//기반 스트림.
			BufferedInputStream bis = new BufferedInputStream(is);			//추가 기능을 제공하는 스트림. 성능을 빠르게 처리(Buffer사용함)
			OutputStream os = new FileOutputStream(copyfile2);				//기반 스트림	
			BufferedOutputStream bos = new BufferedOutputStream(os);) {		//추가 기능을 제공(필터)
			//복사할 코드 생성
			int data;
			while((data=bis.read())!= -1) {		//버퍼를 사용해서 읽기
				bos.write(data);
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time2 = end-start;
		System.out.println("With BufferedXXXStream : "+time2);
		//Buffered를 사용했을때(time2)와 사용하지 않았을때(time1) 비교
		System.out.println("Ratio of with and without(속도차이): "+ time1/time2 +"배 빠르다");
		
	}

}
