package Ex;

import java.util.Scanner;

public class Ex_12_Do {
	public static void main(String[] args) {
		//do-while���� �̿��� ��������������
		
		Scanner sc = new Scanner(System.in);		//���� �Է��ϱ� ���� scanner ���
		String[] str = {"����","����","��"};			//str(���ڿ��迭)�� "����","����","��"���� �Ҵ�
		String user;								//����ڰ� �Է��� ���� user��� ������ ����,
		String com;												//��ǻ�Ͱ� �Է��� ���� com�̶�� ������ ����
												
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		do {
			System.out.println("���� ���� ��! >> ");
			user=sc.next();					//�Է°��� user������ �Ҵ�
			
			if(user.equals("�׸�")) {
				break;
			}
			int c = (int)(Math.random()*3);		//��ǻ�Ͱ� 3���� ������ ����
			com = str[c];
			
			if(user.equals("����")) {
				if(com.equals("����")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" (�����)�� �����ϴ�.");
					continue;
				}
				else if(com.equals("����")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" �����ϴ�.");
					continue;
				}
				else if(com.equals("��")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" (�����)�� �̰���ϴ�.");
					continue;
				}
			}
			else if(user.equals("����")) {
				if(com.equals("����")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" �����ϴ�.");
					continue;
				}
				else if(com.equals("����")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" (�����)�� �̰���ϴ�.");
					continue;
				}
				else if(com.equals("��")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" (�����)�� �����ϴ�.");
					continue;
				}
			}
			else if(user.equals("��")) {
				if(com.equals("�ָ�")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" (�����)�� �̰���ϴ�.");
					continue;
				}
				else if(com.equals("����")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" (�����)�� �����ϴ�.");
					continue;
				}
				else if(com.equals("��")) {
					System.out.println("����� = "+user+" , ��ǻ�� = "+com+" �����ϴ�.");
					continue;
				}
			}
			
		}while(true);
		System.out.println("������ �����մϴ�...");		//do-while���� �ѹ��� ������ ����ȴ�.
		sc.close();
	}

}
