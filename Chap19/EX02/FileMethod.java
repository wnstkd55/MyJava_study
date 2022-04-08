package Chap19.EX02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {tempDir.mkdir();}
		
		File file =  new File("C:/windows");
		
		System.out.println("절대 경로 출력");
	}

}
