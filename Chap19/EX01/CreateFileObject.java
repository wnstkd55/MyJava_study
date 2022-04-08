package Chap19.EX01;

import java.io.File; 		//파일과 폴더를 다루는 객체
import java.io.IOException;

//주의 : 이클립스에서 파일을 생성시 C:\에 생성할때 권한 문제로 인한 오류가 발생

//File 객체 내의 폴더 식별자를 적용할 경우

	//1. window인경우 : String path = "C:\\abc\\abc.txt" 	""내의 특수문자를 처리하기 위한 기호\ 
	//2. MAC인 경우

public class CreateFileObject {

	public static void main(String[] args) throws IOException{
		
		//1. File객체를 사용해서 폴더 생성. 해당 파일이나 폴더가 존재하지 않는 경우
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) { 		//해당 경로에 파일이나 폴더가 존재하면 true,false
			tempDir.mkdir();		//폴더 생성 명령어
		}
		System.out.println(tempDir.exists()); 		//파일이 경로에 존재하면 true 아니면 false
		
		//2. File객체를 사용해서 파일 생성
		File newFile = new File("C:/temp001/newFile.txt"); 		//c:\ 파일을 생성할 경우 권한 문제로 파일생성 예외 <==이클립스를 관리자 권한으로 실행 
		if(!newFile.exists()) {
			newFile.createNewFile();
		}
		System.out.println(newFile.exists());
		System.out.println();
		
		//3.파일 구분자
		File newFile2 = new File("C:\\temp001\\newfile01.txt"); //Window 10 하위버전
		File newFile3 = new File("C:/temp001/newfile02.txt");	//Window10 ,MAC
		
		if(!newFile2.exists()) {
			newFile2.createNewFile();
		}
		if(!newFile3.exists()) {
			newFile3.createNewFile();
		}
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		File newFile4 = new File("C:"+File.separator+"temp001"+File.separator+"newfile03.txt");
		if(!newFile4.exists()) {
			newFile4.createNewFile();
		}
		System.out.println(newFile4.exists());
		
		//4. 절대 경로로 처리 : 다른 시스템으로 이동된 경우 그 시스템 환경에 맞도록 세팅이필요.
		File newFile5 = new File("C:/temp001/newfile05.txt"); 	//절대 경로로 처리
		System.out.println(newFile5.getAbsolutePath());		//file객체에 저장된 파일의 절대경로를 출력
		
		
		//5. 상대 경로로 처리 <==권장
		//현재 나의 작업 폴더의 위치를 알아야 한다.
		System.out.println(System.getProperty("user.dir")); //현재 작업 폴더의 위치
				//이클립스 실행 폴더 위치
		File newFile6 = new File("newFile06.txt");
		if(!newFile4.exists()) {newFile4.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
	}

}
