package chap03;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		// ���� ������ : (����) ? �� : ����
		int value1 = (3>5) ? 6 : 9;
		System.out.println(value1);		//������ �����̱� ������ 9�� ��µ�.
		
		int value2 = (5>3)? 10 : 20;
		System.out.println(value2);		//������ ���̱� ������ 10�� ��µ�.
		System.out.println("===========");
		
		
		int value3 = 4;
		System.out.println(	(value3 % 2 == 0) ? "¦��" : "Ȧ��");
		System.out.println("======");
		
		// if ������ ó��
		if(value3 % 2 == 0) {
			System.out.println("¦��");		//������ ���϶� ����Ǵ� ����
		}
		else {
			System.out.println("Ȧ��");		//������ �����϶� ����Ǵ� ����
		}
		
	}

}
