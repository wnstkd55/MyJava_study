package chap05;

import java.util.Arrays;

public class Array_Test1 {

	public static void main(String[] args) {
		int[] arr1 = new int[100];
		for (int i = 0; i < arr1.length; i++) {		//for���� ����ؼ� �迭�濡 ���� �Ҵ�.
			arr1[i]= i+1;			// arr1[0~99] = i+1; �迭 ������ ���� �־��ش�.
		}
		
		//��±��� for
		for(int i =0; i<arr1.length; i++) {
			System.out.println(i+"��°���� ��: "+arr1[i]+" ");
		}
		System.out.println("========================");
		
		//2. ���� for���� ���� ���
		for(int k : arr1) {
			System.out.print(k+" ");
		}
	
		System.out.println();
		
		//3. Arrays.toString()�� ���� ���
		System.out.print(Arrays.toString(arr1));
	}

}
