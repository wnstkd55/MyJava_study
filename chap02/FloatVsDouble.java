package chap02;

public class FloatVsDouble {

	public static void main(String[] args) {
		//float vs double �� ���е� : float �Ҽ������� 7�ڸ�����, double �Ҽ�������15�ڸ����� ���е� ����.
		float f1 = 1.0000001f;		//float���� ������ ���� ������, f �Ǵ� F�� ����ؼ� ����
		System.out.println(f1);
		
		float f2 = 1.00000001f;
		System.out.println(f2);
		System.out.println("=====================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		
	}

}
