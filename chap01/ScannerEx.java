package chap01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�,����,����,ü��,���ſ��θ� ��ĭ���� �и��Ͽ� �Է��� �ּ���");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("�̸���: "+name);
		
		String city = sc.next();
		System.out.println("���ô�: "+city);
		
		int age = sc.nextInt();
		System.out.println("���̴�: "+age);
		
		double weight = sc.nextDouble();
		System.out.println("�����Դ�: "+weight);
		
		boolean solo = sc.nextBoolean();
		System.out.println("���ſ��δ�: "+solo+"�Դϴ�.");
		
		sc.close();
	}

}
