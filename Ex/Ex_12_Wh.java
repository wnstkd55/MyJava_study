package Ex;

import java.util.Scanner;

public class Ex_12_Wh {

	public static void main(String[] args) {
		//while���� �̿��� �������������� (for�� ������ ���ϰڽ��ϴ�...)
		
		Scanner sc = new Scanner(System.in);		//���� �Է��ϱ� ���� scanner ���
		String[] str = {"����","����","��"};			//str(���ڿ��迭)�� "����","����","��"���� �Ҵ�
		String user;								//����ڰ� �Է��� ���� user��� ������ ����
		String com;									//��ǻ�Ͱ� �Է��� ���� com�̶�� ������ ����
												
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.println("���� ���� ��! >> ");
			user=sc.next();					//�Է°��� user������ �Ҵ�
			
			int c = (int)(Math.random()*3);		//
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
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
		}
		sc.close();
	}

}