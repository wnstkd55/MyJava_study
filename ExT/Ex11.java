package ExT;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		String name = null;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϱ����ؼ� \"�׸�\"�� �Է����ּ��� ");
		
		while(true) {		//Ư�� ������ �����Ҷ� ���� ��� ���� ���ư�.
			System.out.println("������ �Է����ּ��� >>> ");
			name = sc.next();
			
			if(name.equals("�׸�")) {
				break;
			}	
			// course�� ������ ���鼭 ��ĳ�ʷ� ���� name������ ���� ������
			for (i = 0; i < course.length; i++) {
				if(course[i].equals(name)) {		// �����϶� ���� ���๮�� ������� �ʴ´�.
					System.out.println(course[i]+"�� ������ "+score[i]+" �Դϴ�.");		
					break;		 
				}
				//������ ����� �������� �˻��� �ȵȰ��
				if(i==course.length-1) {			//i�� 4�� �ɶ�����(����������) ���� ���������ʾұ� ������ �˻����� �ʴ´�.
					System.out.println("���� ���� �Դϴ�.");
				}
			}
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�...");
	}
}



