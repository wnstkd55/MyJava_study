package chap05;

public class NonRectangleArray_Ex08 {

	public static void main(String[] args) {
		//1. ��������(NonRectangle) ����� �� ���� ���
			//���������̶� ? �࿡ ���� ���� ������ ���� �ٸ���.
		int[][]array1 = new int[2][];	//���� ������ �����ؼ� ���� ũ�⸦ �����.
		array1[0] = new int[2];			//index 0 ���� ���� �� 2�� ����	
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[1] = new int[3];
		array1[1][0]=3;
		array1[1][1]=4;
		array1[1][2]=5;
		
		System.out.println(array1[0][0] + " " +array1[0][1]);
		System.out.println(array1[1][0] + " " +array1[1][1] +" "+ array1[1][2]);
		System.out.println();
		System.out.println("==================");
		
		int[][]array2 = new int[2][];
		array2[0] = new int[] {1,2};
		array2[1] = new int[] {3,4,5};
		System.out.println(array2[0][0] + " " +array2[0][1]);
		System.out.println(array2[1][0] + " " +array2[1][1] +" "+ array2[1][2]);
		System.out.println();
		System.out.println("==================");
		
		//2. ��������(NonRectangle)����� �� ���� ���2		//�ʱⰪ�� �˼� �ִ� ���
		int[][]array3 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array3[0][0] + " " +array3[0][1]);
		System.out.println(array3[1][0] + " " +array3[1][1] +" "+ array3[1][2]);	//������������ ���� �ٷ� ����
		System.out.println();
		System.out.println("==================");
		
		int[][] array4;
		array4 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array4[0][0] + " " +array4[0][1]);
		System.out.println(array4[1][0] + " " +array4[1][1] +" "+ array4[1][2]);
		System.out.println();
		System.out.println("==================");
		
		int[][] array5 = {{1,2},{3,4,5}};
		System.out.println(array5[0][0] + " " +array5[0][1]);
		System.out.println(array5[1][0] + " " +array5[1][1] +" "+ array5[1][2]);
		System.out.println();
		System.out.println("==================");
		
//		int[][] array6;
//		array6= {{1,2},{3,4,5}}; //�迭�� ����� ��ü ���� �и� �Ұ���(! ����)
		
	}

}
