package ExT;

import java.util.Scanner;

public class Ex11_J {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		int i;
		while(true) {
			System.out.print("���� �̸� >> ");
			String name = scanner.next();
			if (name.equals("�׸�")) {
				break;
			}
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(course[i]+" �� ������ "+score[i]);
					break;
				}
			}
			if(i==score.length) {
				System.out.println("���� �����Դϴ�.");
			}	
			
		}


	}

}
