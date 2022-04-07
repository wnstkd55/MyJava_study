package chap05;

import java.util.Arrays;

public class Array_Test2 {

	public static void main(String[] args) {
		int[]arr2 = new int[300];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=3*(i+1);
		}
		
		//1. for문을 이용하여 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i+"번째 방의 값: "+arr2[i]+" ");
		}	
		System.out.println();
		
		//2. 향상된 for문을 이용하여 출력
		for(int k : arr2) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//3. Arrays.toString()을 이용한 출력
		
		System.out.print(Arrays.toString(arr2));
		System.out.println();
		
		//ex) 홀수번 방의 값만 출력
		for (int i = 100; i < arr2.length; i++) {
			if(i%2==1) {
				System.out.println(i+"번째의 방의 값: "+arr2[i]);
			}
		}
		
	}

}
