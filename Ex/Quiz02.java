package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		boolean run = true;
		int nu = 0; 	//��ĳ�ʷ� ��ȣ�� ��ǲ�޴� ����
		
		do {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("======================");
			System.out.println(" 1. 19�� ��� | 2. Ȧ���ܸ� ��� | 3. 3�ǹ���ܸ� ��� | 4. ����" );
			System.out.println("======================");
			System.out.println("��ȣ�� �Է��ϼ��� >>>");
			nu = sc.nextInt();
			
			if(nu == 1) {	//����for���� ����ؼ� 19�� ���
				for (int i = 1; i <= 19; i++) {
					for (int j = 1; j <=19; j++) {
						System.out.println(i+"*"+j+"="+(i*j));
					}System.out.println("=============");
				}
			}
			else if(nu == 2) {	//Ȧ���ܸ� ���
				for (int i = 1; i <= 19; i++) {
					for (int j = 1; j <=19; j++) {
						if(i % 2 != 0) {
							System.out.println(i+"*"+j+"="+(i*j));
						}
					}System.out.println("=============");
				}
			}
			else if(nu == 3) {
				for (int i = 1; i <= 19; i++) {
					for (int j = 1; j <=19; j++) {
						if(i % 3 == 0) {
							System.out.println(i+"*"+j+"="+(i*j));
						}
					}
			}
			}
			else if(nu == 4) {
				break;
			}
			
		}while (run);
		System.out.println("���α׷��� �����մϴ�...");
	}

}
