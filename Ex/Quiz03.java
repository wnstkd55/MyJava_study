package Ex;

class Student{
	//�ڹٴ� ���� ����� �Ұ�, �ڹ��� ��� Ŭ������ ObjectŬ������ �ڽ�Ŭ�����̴�.
		//ObjectŬ�������� ������ �ʵ峪 �޼ҵ带 ������ �� �ִ�.
	String name;		//�л��̸�
	int StudentID;		//�й�
	int kor;			//��������
	int eng;			//��������
	int math;			//��������
	int sum;			//���� ��
	double avg;			//���� ���
	
	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�.");
	}

	@Override
	public String toString() {	//ObjectŬ������ �޼ҵ�, ��ü ��ü�� ����Ҷ�, [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸�: "+name+", �й�: "+StudentID+", ����: "+kor+", ����: "+eng+", ����: "
					+math+", �հ�: "+sum+", ���: "+avg;
		
	}
	
	

}

class S_ö�� extends Student{
	
	S_ö��(String n, int i, int k, int e, int m){			//������ : 1. Ŭ������� ���� 2. returnŸ���� ����ߵȴ�. 
		super.name=n;		//super �θ�Ŭ����, this �ڽ��� ��ü
		super.StudentID=i;
		super.kor=k;
		super.eng=e;
		super.math=m;
		super.sum = k+e+m;
		super.avg = (double)sum/3;			//����� ����Ҷ��� (double)�� ĳ����
				
	}
	
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}
	
}

class S_���� extends Student{

	S_����(String n, int i, int k, int e, int m){
		super.name=n;
		super.StudentID=i;
		super.kor=k;
		super.eng=e;
		super.math=m;
		super.sum=0;
		
		sum = k+e+m;
		avg = (double)sum/3;
		
				
	}
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� �����Դϴ�.");
	}
	
}

class S_���� extends Student{

	S_����(String n, int i, int k, int e, int m){
		super.name=n;
		super.StudentID=i;
		super.kor=k;
		super.eng=e;
		super.math=m;
		sum = k+e+m;
		avg = sum/3.0;
				
	}
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� �౸�Դϴ�.");
	}
	
}
public class Quiz03 {

	public static void main(String[] args) {
		
		Student s1 = new S_ö��("ö��",2232,80,85,95);
		Student s2 = new S_����("����",1100,80,80,75);
		Student s3 = new S_����("����",9235,95,90,80);
		
		Student[] arr = {s1,s2,s3};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
			
		}
		
		System.out.println("============================================================================");
		
		for(Student k : arr) {
			System.out.println(k);
			k.hobby();
		}
		
	}

}
