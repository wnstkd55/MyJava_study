package chap04;

public class Dowhile_Ex04 {
	public static void main(String[] args) {
		
		// 1. while���� do-while���� �� : ������ 0 �ΰ��
		System.out.println("=====�ݺ�Ƚ����0�ΰ��======");
		int a = 0;
		while( a < 0 ) {
			System.out.print(a+" ");		//������ true �϶��� �����.
			a++;
		}
		System.out.println("=======");
		
		a = 0;
		do {
			System.out.println(a+" ");	//do while���� ������ 1���� �����. 0��µ�.
			a++;
		}while(a<0);		//������ false
		
		System.out.println("====�ݺ�Ƚ����1�� ���======");
		// 2. �ݺ� Ƚ���� 1�� ���
		
		a = 0;
		while(a < 1) {
			System.out.println(a+" ");
			a++;
		}
		
		System.out.println("");
		
		a = 0;
		do {
			System.out.println(a+" ");
			a++;
		}while(a<1);
		
		System.out.println("=====�ݺ�Ƚ����10���ΰ��====");
		
		//�ݺ� Ƚ���� 10���� ���
		a=0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a = 0; 
		do {
			System.out.print(a+" ");
			a++;
		}while(a<10);
		
	}

}
