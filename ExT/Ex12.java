package ExT;

import java.util.Scanner;

public class Ex12 {
		public static void main(String[] args) {
			String str[] = {"����","����","��"};
			Scanner sc = new Scanner(System.in);
			String user;
			String com;
			int c;
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			
			do {
				System.out.println("���� ���� ��! >> ");
				user = sc.next();
				
				if(user.equals("�׸�")) {
					break;
				}
				c = (int)(Math.random()*3);
				com = str[c];
				
				if(user.equals("����")) {
					if(com.equals("����")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" �����ϴ�.");
						continue;
					}
					else if(com.equals("����")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" ����ڰ� �̰���ϴ�.");
						continue;
					}
					else if(com.equals("��")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" ����ڰ� �����ϴ�.");
						continue;
					}
				}
				if(user.equals("����")) {
					if(com.equals("����")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" ����ڰ� �����ϴ�.");
						continue;
					}
					else if(com.equals("����")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" �����ϴ�.");
						continue;
					}
					else if(com.equals("��")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" ����ڰ� �̰���ϴ�.");
						continue;
					}
				}
				if(user.equals("��")) {
					if(com.equals("����")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" ����ڰ� �̰���ϴ�.");
						continue;
					}
					else if(com.equals("����")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" ����ڰ� �����ϴ�.");
						continue;
					}
					else if(com.equals("��")) {
						System.out.println("�����= "+user+", ��ǻ��= "+com+" �����ϴ�.");
						continue;
					}
				}
			}while(true);
			System.out.println("������ �����մϴ�.");
			sc.close();
		}

}
