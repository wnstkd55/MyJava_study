package chap02;

public class TypeCasting_1 {

	public static void main(String[] args) {
		
		// ĳ���� ��� 1 : �ڷ����� ����
		
		//int value1 = 5.3;	//(�����߻�)
		int value1 = (int)5.3;	//ĳ���� : �ڷ������� ��ȯ�ؼ� ������ ���� �Ҵ�
		long value2 = (long)10.333;
		float value3 = (float)5.8;
		double value4 = (double)5;	//����5�� double(�Ǽ�)�������� ��ȯ
		double value5 = 10;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("==================");
		
		//ĳ���� ��� 2 : L,F ��� �����ؼ� ĳ����, long: l,L / float: f,F
		
		long value6 = 10L;
		long value7 = 10l;
		float value8 = 5.8F;
		float value9 = 5.8f;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
	}

}
