package Chap14.EX05;
// �ڵ����ҽ�(��ü) ����

import java.io.Closeable;

//�ʵ��� �� �Ҵ�. ������ ȣ��� �ʵ��� ���� �ο�

class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;		//��� ���
	
	Abc(String name, int studentID, int kor, int eng, int math){
		this.name=name;
		this.studentID=studentID;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.avg = (double)(kor+eng+math)/3;
	}
	
	@Override
	public void close() throws Exception{
		//�ʱ�ȭ ���� �޸��� ���� ���
		if((name != null) || (studentID != 0) || (kor != 0) || (eng != 0) || (math != 0) || (avg != 0.0) ){
			this.name = null;
			this.studentID = 0;
			this.kor = 0;
			this.eng = 0;
			this.math = 0;
			this.avg = 0.0;
			
			System.out.println("�̸���: "+name + " �й���: "+ studentID+ " ��������: "+kor+ " ��������: "+eng+" ��������: "+math+" ���: "+avg);
		}
	}
}

public class EX_TryWithRecourse_3 {

	public static void main(String[] args) {
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ� close(); ȣ��
		try(Abc s2 = new Abc("ȫ�浿",2022,80,95,75);){
			
		}catch(Exception e) {
			System.out.println("�����߻�");
		}
		
		System.out.println("====================================================================");
		//2. ����close, finally ������� close()ȣ��
		Abc s3 = null;
		try {
			s3 = new Abc("������",0323,80,55,100);
		}catch(Exception e){
			
		}finally {
			if((s3.name != null) || (s3.studentID != 0) || (s3.kor != 0) || (s3.eng != 0) || (s3.math != 0) || (s3.avg != 0.0) ) {
				try {
					s3.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}

