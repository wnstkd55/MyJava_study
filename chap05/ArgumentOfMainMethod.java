package chap05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) {		//���θ޼ҵ�[�Լ�]
		//�޼ҵ��� �⺻����
		/*
		 
		 	void main(String[] args){	//void : ���ϰ��� ������ ����.
		 		�޼ҵ带 ȣ��� ������ �ڵ�;		//main : �޼ҵ��
		 	}								// (��ǲ �Ű�����) 
		 */
		
		String a = ar[0];	// "�ȳ��ϼ���" : ���ڿ� ����
		String b = ar[1];	// 3 : ����
		String c = ar[2];	// 3.8 : �Ǽ�
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		//main �޼ҵ忡 ���ڰ����� ������ �Ǽ��� �Ѱ��ٶ� String���� ��ȯ�� ��.
		System.out.println(b + 1);		// ? 31�� ���� ���� : b�� String�̶�� ���ڿ��� �Ҵ��߱⶧���� +1�� ���ڿ��� ��ġ�°ɷ� ��.
		System.out.println(c + 1);		// 3.81
		System.out.println();
		
		//String�� ������ ���������� ��ȯ�ؼ� ���������ߵȴ�.
		int d = Integer.parseInt(b);	// b(String) ==> IntegerŸ������ ��ȯ
		double e = Double.parseDouble(c);	//c(String) ==> DoubleŸ������ ��ȯ
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
	}
	
}
