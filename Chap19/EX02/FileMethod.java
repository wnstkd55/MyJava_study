package Chap19.EX02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		//1. C:\�� �۾� ���� ���� (temp)
		File tempDir = new File("C:/temp"); 
		if(!tempDir.exists()) {tempDir.mkdir();} 
		
		//2. ���� ��ü ���� (C:\Windws) 
		File file = new File("C:/windows"); 
		
		//3. ���� ��ü�� ���� �޼ҵ� ��� 
		System.out.println("���� ��� ��� : " + file.getAbsolutePath());  
		System.out.println("������ �������� (?) : " +  file.isDirectory());
		System.out.println("������ ���� ����(?) : " + file.isFile()); 
		System.out.println("����/���� �̸� ��� : " + file.getName());   //����, ���� �̸� ���. 
		System.out.println("�θ� ������ ��� : " + file.getParent());    //�θ� ������ ���
		
		File newFile1 = new File("C:/temp/abc"); 
		System.out.println(newFile1.mkdir()); //������ �� ������ ���: ture  , ������ �����ؼ� �������� ���� ��� false 
			//���������� ���ؼ� false : ������ ���ߴ�. ( �ش������� �����ϴ� ���, ���� ������ ����� ���� ���, ��������,  )
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:/temp/bcd/cde");   //������ ������ �Ѳ����� ���� �ϱ� 
		System.out.println(newFile2.mkdir());          //false , ���� �������� �Ѳ����� ������ �ȵȴ�. 
		System.out.println(newFile2.mkdirs());         //true , ���� �������� �Ѳ����� ������. 
		
		File newFile3 = new File ("C:/temp/def/hij/klm"); 
		System.out.println(newFile3.mkdirs());        //�����ϸ� true, �������� ���ϸ� false 

		//4. File ��ü�� ����ؼ� ���� ������ ���� ���� 
		
		File[] fname = file.listFiles();   //file : "C:\Windows" ������ ��� ������, ������ �̸��� File �迭�� ����     
		
		//
		for (File k : fname) {
			System.out.println((k.isDirectory() ? "���� : " : "���� :") + k.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
