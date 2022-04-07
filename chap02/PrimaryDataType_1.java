package chap02;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		//boolean: true / false 값만 할당 가능
		boolean bool1 = true;
		boolean bool2 = false;
		//boolean bool3 = 10;		// 오류발생
	
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("========정수: 음의값, 양수========");
		
		byte value1 = -128;		//byte : 1byte, (-128 ~ +127)
		//byte value11 = -129;	// byte의 범위 밖이므로 오류발생
		byte value111 = (byte) -129;	//-129를 byte타입으로 변환해서 저장
		byte value1111 = (byte) 129;
		
		System.out.println(value1);
		System.out.println(value111);	//127 출력됨
		System.out.println(value1111);	//-128 출력됨
		System.out.println("========");
		short value2 = -10;		//short : 2byte(-32768 ~ +32767)
		//value2 = -32769;	오류발생
		value2 =(short) -32769;
		System.out.println(value2);
		System.out.println("========");
		
		int value3 = 100;
		long value4 = 200L;
		
		//실수 : float, double
		float value5 = 1.2F;
		double value6 = -1.5;
		
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		
		
		
	}

}
