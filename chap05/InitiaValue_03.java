package chap05;

import java.util.Iterator;

public class InitiaValue_03 {

	public static void main(String[] args) {
		//1. �޸��� �ʱⰪ	
		int value1;			//�⺻ �ڷ����� �ʱⰪ�� �Ҵ����� ������
//		System.out.println(value1); �����߻� 
		int[] value2;		//�迭(���� �ڷ���)�� �ʱⰪ�� �Ҵ����� ������
//		System.out.println(value2);	�����߻�
		
		int value3 = 0;						//�⺻ �ڷ����� 0������ �ʱⰪ�� �Ҵ�
		System.out.println(value3);
		
		int[] value4 = null;				//���� �ڷ����� �⺻ �ʱⰪ���� null �Ҵ�; null : �˼����°�, ����ִ»���
		System.out.println(value4);
		
		//2. Heap�޸��� �ʱⰪ(���� �ʱ�ȭ), Heap���� ���� �ڷ����� ���� �Ҵ�.
		//�⺻ �ڷ��� �迭�� ���?
			//boolean : false / int, long, byte...������Ÿ�� : 0 / float, double : 0.0
		boolean[] array1 = new boolean[3];			//false�� �ʱ�ȭ��
		System.out.print(array1[0]+ " "+array1[1]+" "+array1[2]);
		System.out.println();
		System.out.println("=================");
		for(int i =0; i <3; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		System.out.println("��ü�� �޸� �ּ�: "+array1);
		System.out.println("��ü�� ���� ������ ���: "+array1.length);
		System.out.println("========for�� : array1.length");
		
		for(int i =0; i<array1.length; i++) {
			System.out.print("array["+i+"]"+"��° ���� ����"+array1[i]+"�Դϴ�. ");
		}
		System.out.println();
		System.out.println("===================");
		
		int[] array2 = new int[3]; // 0�� �⺻������ �Ҵ�
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		System.out.println("===================");
		
		double[] array3 = new double[3];
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		System.out.println("===================");
		
		//������ �ڷ��� �迭�� ���� �⺻������? null
		
		String[] array4 = new String[3];
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i]+" ");
		}
		
	}

}
