package chap02;

public class TypeCasting_2 {

	public static void main(String[] args) {
		/*
		 * Ÿ�� ĳ���� :	byte < short < char < int < long < float < double
		 * 		- ��ĳ���� : ���� �ڷ������� ū�ڷ������� ��ȯ
		 * 		- �ٿ�ĳ���� : ū�ڷ������� ���� �ڷ������� ��ȯ
		 * 
		 * 		�������� �⺻������ int�� ����
		 * 		�Ǽ����� �⺻������ double�� ����
		 */
		//�ڵ����� Ÿ�� ��ȯ
		float value1 = 3;	//int ---> float ������ Ÿ������ �ڵ����� ��ĳ���� (3.0)
		long value2 = 5;	//int ---> long ������ Ÿ������ �ڵ����� ��ĳ����	 (5)
		double value3 = 7;	//int ---> double������ Ÿ������ �ڵ����� ��ĳ���� (7.0)
		byte value4 = 9;	//int ---> byte ������ Ÿ������ �ڵ����� �ٿ�ĳ���� (9)
		short value5 = 11;	//int ---> short ������ Ÿ������ �ڵ����� �ٿ�ĳ����(11)
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("================");
		
		//�������� Ÿ�� ��ȯ
		byte value6 = (byte)128;	//int ---> byte Ÿ������ �������� Ÿ�� ��ȯ (�ٿ� ĳ����)
		int value7 = (int) 3.5;		//double ---> int Ÿ������ �������� Ÿ�� ��ȯ (�ٿ� ĳ����)
		float value8 = (float) 7.5; //double ---> float Ÿ������ �������� Ÿ�� ��ȯ(�ٿ� ĳ����)
		float value9 = 7.7F;		//double ---> float Ÿ������ �������� Ÿ�� ��ȯ(�ٿ� ĳ����)
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
	}

}
