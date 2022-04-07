package Ex;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		int[] array = new int[10];		//array배열에 int자료형의 배열의 방의 크기를 10으로 지정
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 10개를 입력하세요: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();		//입력한 값(sc.nextInt)을 array[i]에 넣음
		}
		for(int i=0; i<10; i++) {
			if(array[i]%3==0) {
				System.out.println("3의 배수는: "+array[i]);		//3의 배수를 찾기위한 조건절
			}
			else {
				continue;		//3의 배수가 아닐시 continue를 통해서 for문으로 되돌아가기
			}
			
		}
		sc.close();		//스캐너 종료
	}

}
