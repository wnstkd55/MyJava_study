package ExT;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ� >> ");
		
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		int money;
		int c;
		money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			
			c = money/unit[i];
			money = money-(unit[i]*c);
			System.out.println(unit[i]+"�� ¥��: "+c+" ��");
		}
	}

}
