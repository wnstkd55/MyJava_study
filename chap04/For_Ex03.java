package chap04;

public class For_Ex03 {

	public static void main(String[] args) {
		
		//For �⺻ �۵�
		
		int a;		//for��(���) �ۿ��� ����� ����(!!��������), ����(0), �ʱⰪ(X)
		for(a = 0; a<5 ;a++) {
			System.out.print(a+" �� ����.");	//
		}
		System.out.println();
		System.out.println("��� �ۿ��� ���: "+a);
		
		System.out.println("==================");
		
		for(int b= 0; b <= 10; b++ ) {
			System.out.println(b+" �� ����.");
		}
		// System.out.println(b); ����! (for�� ������ ���� ������ �߱⶧���� '��������' �̴�.) 
		System.out.println("====================");
		
		int c;
		for( c=10; c>0; c--) {
			System.out.println(c);
		}
		/*2�� ����� ���*/
		for(int i = 0; i<100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("==================");
		/* for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ��� �� �ִ�.*/
		for(int i=0, j=0; i<10; i++,j++) {
			System.out.println(i+"*"+ j+"="+(i*j));
		}
		System.out.println("========================");
		
		// * for���� ����ؼ� 1���� 100���� ���Ѱ�
		int sum1 = 0;		//������ �ʱ�ȭ ���� 0
		for(int i = 1; i<101; i++) {
			sum1+=i;			// sum = sum + i
		}
		System.out.println("1���� 100���� ���Ѱ��� : "+sum1);
		
		
		// * for���� ����ؼ� 1���� 10���� ���Ѱ��� ���ϼ���
		int mul = 1;		//������ �ʱ�ȭ ���� 1
		for(int i = 1; i<=10; i++) {
			mul*=i;			//mul = mul * i
		}
		System.out.println("1���� 10���� ���Ѱ���: "+mul);
		System.out.println("=======������ ���=========");
		/*
		 * ���� for�� : ex) 1��~9��
		 */
		
		for(int i =0; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			if(i <9) {
				System.out.println("====="+(i+1)+"��=====");
			}
			else {
				System.out.println("");
			}
		}
		
		/*
		 * For ������ ���� ���� �߻�, ������ ���� ���
		 *
		 *
		for(int i = 0; ; i++) {
			System.out.print(i+" ");	i�� : 1,2,3......
		}
		
		*
		for(; ;){
			System.out.println("���ѷ����߻�");
		}
		*
		*/
		System.out.println("=====================");
		
		//���� ���� Ż��
		
		for(int i = 0; ; i++ ) {
			
			if(i > 100) {
				break;				//���� ������ �߷�
			}
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		/* FOR ���� ����ؼ� 1���� 1000���� 4�� ����� ���� ��: , ��հ� ��� */
		
		int sum = 0;	//4�ǹ���� ���Ѱ��� ����
		int j = 0;	//4�� ��� ī��Ʈ
		
		for(int i = 1; i<=1000; i++) {
			
			if(i%4==0) {
				sum+=i;
				j=i/4;
				//j++; //for���� ī��Ʈ Ƚ��
			}
			
		}
		
		System.out.println("����: " + sum);
		System.out.println("�����:" + (sum/j));
		
		
	}

}
