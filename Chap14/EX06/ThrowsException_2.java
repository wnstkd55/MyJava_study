package Chap14.EX06;

//�Ϲ� ����(checked Exception) : ������ �ܰ迡�� ����,
	//1. ���� ó��
	//2. throws ����(�̷��)

	//main �޼ҵ忡 throws�� ���� ��Ű�� ���, ������ ������ְ� �����Ǿ����

public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
	
		//�������� ������ �����մϴ�. ClassNotFoundException �� �߻����� �ʴ´�.
		Class cls = Class.forName("java.lang.Object");
		
		//�������� ������ �������� ����. ClassNotFoundException �� �߻��Ѵ�.
		Class cls2 = Class.forName("java.lang.Object00");
		
	}

}
