package ExT;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int num;
		
		System.out.println("양의 정수 10개를 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
			if(arr[i]%3==0) {
				System.out.println("3의 배수는"+arr[i]);
			}
		}
	
		sc.close();
	}

}
