package ExT;

import java.util.Scanner;

public class Ex12_J {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			int n = (int)(Math.random()*3); 
			String com= str[n]; //��ǻ�Ͱ� �� ��
			System.out.print("���� ���� ��! >> ");
			String name = scanner.next(); //���� ���� ��
			if (name.equals("�׸�")) {
				System.out.println(" ������ �����մϴ�...");
				break;
			}
			System.out.print("����� = "+name+","+"��ǻ�� = "+com);
			if (name.equals("����")) {
				if (com.equals("����")) {
					System.out.println(" �����ϴ�.");
				}else if (com.equals("����")) {
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}else if (com.equals("��")) {
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}
			}
			else if(name.equals("����")) {
				if (com.equals("����")) {
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}else if (com.equals("����")) {
					System.out.println(" �����ϴ�.");
				}else if (com.equals("��")) {
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(name.equals("��")) {
				if (com.equals("����")) {
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}else if (com.equals("����")) {
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}else if (com.equals("��")) {
					System.out.println(" �����ϴ�.");
				}
			}
		}

	}

}
