package ExT;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int num;
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ�>> ");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
			if(arr[i]%3==0) {
				System.out.println("3�� �����"+arr[i]);
			}
		}
	
		sc.close();
	}

}
