package chap05;

import java.util.Arrays;

public class Array_Test1 {

	public static void main(String[] args) {
		int[] arr1 = new int[100];
		for (int i = 0; i < arr1.length; i++) {		//for문을 사용해서 배열방에 값을 할당.
			arr1[i]= i+1;			// arr1[0~99] = i+1; 배열 변수에 값을 넣어준다.
		}
		
		//출력구문 for
		for(int i =0; i<arr1.length; i++) {
			System.out.println(i+"번째방의 값: "+arr1[i]+" ");
		}
		System.out.println("========================");
		
		//2. 향상된 for문을 통한 출력
		for(int k : arr1) {
			System.out.print(k+" ");
		}
	
		System.out.println();
		
		//3. Arrays.toString()을 통한 출력
		System.out.print(Arrays.toString(arr1));
	}

}
