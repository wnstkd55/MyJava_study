package Chap19.EX01;

import java.io.File; 		//���ϰ� ������ �ٷ�� ��ü
import java.io.IOException;

//���� : ��Ŭ�������� ������ ������ C:\�� �����Ҷ� ���� ������ ���� ������ �߻�

//File ��ü ���� ���� �ĺ��ڸ� ������ ���

	//1. window�ΰ�� : String path = "C:\\abc\\abc.txt" 	""���� Ư�����ڸ� ó���ϱ� ���� ��ȣ\ 
	//2. MAC�� ���

public class CreateFileObject {

	public static void main(String[] args) throws IOException{
		
		//1. File��ü�� ����ؼ� ���� ����. �ش� �����̳� ������ �������� �ʴ� ���
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) { 		//�ش� ��ο� �����̳� ������ �����ϸ� true,false
			tempDir.mkdir();		//���� ���� ��ɾ�
		}
		System.out.println(tempDir.exists()); 		//������ ��ο� �����ϸ� true �ƴϸ� false
		
		//2. File��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp001/newFile.txt"); 		//c:\ ������ ������ ��� ���� ������ ���ϻ��� ���� <==��Ŭ������ ������ �������� ���� 
		if(!newFile.exists()) {
			newFile.createNewFile();
		}
		System.out.println(newFile.exists());
		System.out.println();
		
		//3.���� ������
		File newFile2 = new File("C:\\temp001\\newfile01.txt"); //Window 10 ��������
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
		
		//4. ���� ��η� ó�� : �ٸ� �ý������� �̵��� ��� �� �ý��� ȯ�濡 �µ��� �������ʿ�.
		File newFile5 = new File("C:/temp001/newfile05.txt"); 	//���� ��η� ó��
		System.out.println(newFile5.getAbsolutePath());		//file��ü�� ����� ������ �����θ� ���
		
		
		//5. ��� ��η� ó�� <==����
		//���� ���� �۾� ������ ��ġ�� �˾ƾ� �Ѵ�.
		System.out.println(System.getProperty("user.dir")); //���� �۾� ������ ��ġ
				//��Ŭ���� ���� ���� ��ġ
		File newFile6 = new File("newFile06.txt");
		if(!newFile4.exists()) {newFile4.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
	}

}
