package chap02;

public class RangeOfVariableUse {

	public static void main(String[] args) {
		//	
		
		int value1 = 3;		// ���� ���� : ��� �ۿ��� ����� ����, ��� ��, ����������� ��밡��
		{
			int  value2 = 5;	//���� ���� : ��� �ȿ��� ����� ����, ��� �������� ���
			System.out.println(value1);
			System.out.println(value2);
		}
		
		System.out.println(value1);
		// System.out.println(value2); 	//(�����߻�) ? ���������� ��� �������� ����.
		
	}

}
