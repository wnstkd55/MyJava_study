package chap01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름,도시,나이,체중,독신여부를 빈칸으로 분리하여 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("이름은: "+name);
		
		String city = sc.next();
		System.out.println("도시는: "+city);
		
		int age = sc.nextInt();
		System.out.println("나이는: "+age);
		
		double weight = sc.nextDouble();
		System.out.println("몸무게는: "+weight);
		
		boolean solo = sc.nextBoolean();
		System.out.println("독신여부는: "+solo+"입니다.");
		
		sc.close();
	}

}
