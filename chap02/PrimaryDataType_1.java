package chap02;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		//boolean: true / false ���� �Ҵ� ����
		boolean bool1 = true;
		boolean bool2 = false;
		//boolean bool3 = 10;		// �����߻�
	
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("========����: ���ǰ�, ���========");
		
		byte value1 = -128;		//byte : 1byte, (-128 ~ +127)
		//byte value11 = -129;	// byte�� ���� ���̹Ƿ� �����߻�
		byte value111 = (byte) -129;	//-129�� byteŸ������ ��ȯ�ؼ� ����
		byte value1111 = (byte) 129;
		
		System.out.println(value1);
		System.out.println(value111);	//127 ��µ�
		System.out.println(value1111);	//-128 ��µ�
		System.out.println("========");
		short value2 = -10;		//short : 2byte(-32768 ~ +32767)
		//value2 = -32769;	�����߻�
		value2 =(short) -32769;
		System.out.println(value2);
		System.out.println("========");
		
		int value3 = 100;
		long value4 = 200L;
		
		//�Ǽ� : float, double
		float value5 = 1.2F;
		double value6 = -1.5;
		
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		
		
		
	}

}
