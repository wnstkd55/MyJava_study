package chap05;
public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		//1. �⺻ ������ Ÿ���� ���� ����(Stack���� ����)
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);		//3
		System.out.println(value2);		//7
		System.out.println();
		
		
		//2. ���� �ڷ����� ���� ����(Stack�� �������� �ּҸ� ����, )
		int[] array1 = new int[] {3,4,5,7};
		int[] array2 = array1;				//array2�� ���ÿ������� array1�� �������� �ּҸ� ����
		array2[0] = 7;
		System.out.println(array1[0]);		//7
		System.out.println(array2[0]);		//7
		System.out.println(array1);
		System.out.println(array2);
		System.out.println();
		
		
		
	}

}
