package chap05;

import java.util.Arrays;

public class Array_Test2 {

	public static void main(String[] args) {
		int[]arr2 = new int[300];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=3*(i+1);
		}
		
		//1. for���� �̿��Ͽ� ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i+"��° ���� ��: "+arr2[i]+" ");
		}	
		System.out.println();
		
		//2. ���� for���� �̿��Ͽ� ���
		for(int k : arr2) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//3. Arrays.toString()�� �̿��� ���
		
		System.out.print(Arrays.toString(arr2));
		System.out.println();
		
		//ex) Ȧ���� ���� ���� ���
		for (int i = 100; i < arr2.length; i++) {
			if(i%2==1) {
				System.out.println(i+"��°�� ���� ��: "+arr2[i]);
			}
		}
		
	}

}
