package chap03;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���: ");
		
		int n1 = sc.nextInt();
		
		System.out.println((n1 % 3 == 0)? "3�ǹ���Դϴ�." : "3�ǹ���� �ƴմϴ�.");
		
		if(n1 % 3 == 0) {
			System.out.println("3�ǹ���Դϴ�.");
		}
		else {
			System.out.println("3�ǹ���� �ƴմϴ�. ");
		}
	}

}
