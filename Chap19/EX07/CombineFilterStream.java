package Chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//�ϳ��� ��� ��Ʈ���� Filter��Ʈ���� ������ ȥ���ؼ� ����� �����ϴ�.
	//���� �������� ó���ϴ� ��Ʈ���� �޼ҵ��� ���ο� ���� ������ ���� �� �ִ�.

//��ݽ�Ʈ�� 1    : FileOutputStream				: ��� ��Ʈ��. ���Ͽ� ����, 
//FilterStream : BufferedOutputStream			: ���۸� ����ؼ� ������ ó��.
//FilterStream : DataOutputStream				: �پ��� ���� ������� ó��.


public class CombineFilterStream {

	public static void main(String[] args) {
		//1. ���� ����
		File dataFile = new File("src\\Chap19\\EX07\\file2.data");
		
		try (OutputStream os = new FileOutputStream(dataFile);
			 BufferedOutputStream bos = new BufferedOutputStream(os);
			 DataOutputStream dos = new DataOutputStream(bos);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
		} catch (Exception e) {}
			
		try( InputStream is = new FileInputStream(dataFile);
			 BufferedInputStream bis = new BufferedInputStream(is);
			 DataInputStream dis = new DataInputStream(bis);) {
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {}
	
	}

}
