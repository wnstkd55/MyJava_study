package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : �߻�Ŭ����		<==FileInputStream ������ Ŭ����	<==�о����
//OutputStream : �߻�Ŭ����		<==FileOutputStream ������ Ŭ����	<==����
//FileInputStream : byte() ���� ������ �б�.
//FileOutputStream : byte() ���� ������ ����.

//Windows �ܼ�,�޸��� Enter�� ������ : \r \n ����
//Mac		:\n

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
		//1. �Է� ���� ����(�������� ����)
		File outFile = new File("src/Chap19/EX05/FileOutput1.txt");
		
		//2. 1byte����
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutStream�� �������� �ʴ� ������ ������ ����� ������.
			//FileInputStream ��ο� ������ �����ؾߵ�. ���ܹ߻�
		
		os1.write('J');				//write : IOException
		os1.write('A');	
		os1.write('V');	
		os1.write('A');	
		os1.write('\r');	//13(byte)	����
		os1.write('\n');	//10(byte)	����
		
			//�߿� : write() �޼���� ����(RAM)�� ����, ���۰� ������ ���Ͽ� ����
			//		flush() : ���ۿ� ����� ������ ���Ͽ� ������ ���� �Ҷ� ���
		os1.flush();	//���۰� ������ �ʴ��� ������ ���Ͽ� ���⸦ �Ѵ�.		<== ��������	,write()�� ����ϸ� flush() ����Ұ��� ����
		os1.close();	//close() ȣ��� flush()���� �۵���.
		
		//2. n-Byte ó��(byte[]�� offset���� length���� byte�����;���
		OutputStream os2 = new FileOutputStream(outFile, true);		//����Ⱑ��.
							//FileOutputStream(File o, Boolean append) append=true : �̾��, append=false : �����
		
		byte[] byteArray1 = "Hello!".getBytes();		//String---->byte�� ��ȯ : getBytes()
		
		os2.write(byteArray1);
		os2.write('\n');		//\r�� ��������, \n�� �־ window���� enteró���� ��
		
		os2.flush();
		os2.close();		//
		
		//3. n-byte���� ����(byte[]�� offset���� length��ü�� byte������ ����.
		
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2, 7, 8);		//write�϶��� 7byte�ڿ��� 8byte�о ����
											//read�϶��� �ݴ�� ó��.
		
		os3.flush();
		os3.close();
		
		
	}

}
