package chap03;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		/*
		 * ���� ������ ( = , +=, -=, *=, /=, >>=, <<=, >>>=) , ���Ŀ��� �켱������ ���� ����.
		 *	a = b;		<== b������ ���� a�� �Ҵ��ض� ��� �ǹ� , ==(����)
		 * 	a += b;		<== a = a + b
		 *	a -= b;		<== a = a - b
		 *	a *= b; 	<== a = a * b
		 *	a /= b;		<== a = a / b
		 *	a &= b;		<== a = a & b
		 *  a |= b;		<== a = a | b
		 *	a <<= b;	<== a = a << b
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		//��� ǥ��
		int value2;		//�⺻�� �ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ 0�� �Ҵ�.
						//�����ڷ� ���� ��� ������ ���� �Ҵ� ���� ���� ��� �⺻������ NULL
		value2 = 5;
		System.out.println(value2 += 2);	// value2 = value2 + 2		// 5+2 = 7
		System.out.println(value2 -= 2);	// value2 = value2 - 2		// 7-2 = 5
		System.out.println(value2 /= 2); 	// value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2 );
		value2 = 5; System.out.println(value2 |= 2); 	// 5|2 => 7
		value2 = 5; System.out.println(value2 &= 2 );	// 5&2 => 0
		System.out.println("======����Ʈ������=======");
		value2 = 5; System.out.println(value2 <<= 2); 	// value2 = value2 << 2
		value2 = 5; System.out.println(value2 >>= 2); 	// value2 = value2 >> 2
		
		value2 = 5; System.out.println(value2 >>>=2); 	// value2 = value2 >>> 2
		byte value3 = -128;
		System.out.println(value3 >>>= 2);
		
	}

}
