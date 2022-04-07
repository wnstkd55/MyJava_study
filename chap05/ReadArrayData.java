package chap05;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[] args) {
		int[]array = new int[] {3,4,5,6,7};
		
		//1. �迭�� ��(index)�� ���� ���ϱ�
		System.out.println(array.length);
		
		//2. ����ϱ� 1-���ȣ�� ���� �� ���: Ư�����ȣ�� ���� ���.
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		//System.out.print(array[5]+" ");//ArrayIndexOutOfBoundsException, ���ȣ�� �ʰ��� ��츦 ��½� ����
		System.out.println("");
		
		//3. ����ϱ� 2- for���� ����ؼ� Ư�������� �����ؼ� ���
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//for���� ����ؼ� Ư�� ������ ����ϱ�
		for(int i=0; i<3; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//4. ����ϱ� 3- �⼧�� for, ó�� ����� ������ ����� ��ȯ�ϸ鼭 ���. (������ �����ؼ� ����� �� ����.)
				//������ for���� ���ؼ� ª��.
		
		for(int k: array) {						//for (����� �ڷ��� ���� : �迭����){ ���๮, k}
			System.out.print(k+" ");
		}
		System.out.println();
		
		//5. ����ϱ� 4- Arrays.toString(�迭������) 
		System.out.println(Arrays.toString(array));		//�迭 ������ ��� ���� ���
		
	}

}
