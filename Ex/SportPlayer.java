package Ex;

import java.util.Scanner;

public class SportPlayer {

	public static void main(String[] args) {
		/*
		������ ��� �̸��� �ְ� �ش� ��� ������(���)�� �־ ����ϴ� ���α׷��� �ۼ���, ��ü �� �� ����� ���ϴ� ���α׷��� �ۼ��ϼ���

		��)
		�Է�>>>
		Ź��2 �߱� 9 �౸11 ��6 ����2

		���>>
		Ź��:2, �߱�:9, �౸:11, ��:6, ����:2
		������� ������ �� �հ� : 
		������� ��� �������� : 

		"�׸�"�̶�� �Է��ϸ� ���α׷� ����
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��̸� ���������� ������ �̿��ؼ� �Է��ϼ���. ");
		System.out.println("��) �Է� >>> Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");
		
		String sport;	// ��ü String���� ��ǲ�޴� ����
		String[] arr;		//������ �������� �߶� �迭�� �����ϴ� ����
		int sum = 0;	// � �������� ����� ���� �����ϴ� ����
		int memberCount=0;	//
		double avg = 0.0;	//����� ���ϴ� ���� : (double�� ����ȯ)��ü�������� �� / �����Ǽ�
		int member = 0;		//�� ������ �������� ��� ����
		
		
		do {
			sport = sc.nextLine();		//sc.next() : ��������� String
										//sc.nextLine() : ����(Enter)���� ��ü�� String
			
			if(sport.equals("�׸�")) {		//str�� ���� �ڷ����̹Ƿ� str.equals()
				break;
			}
			arr = sport.split(" ");		//str�� ������ �������� �߶� arr�迭�� ����
			for (int i = 0; i < arr.length; i++) {	//arr.length : �迭�� index 0 ~ �����������
				if(i % 2 != 0) {	// i :���� ��ȣ�̰� ���ڸ� ������ �´�.
					member = Integer.parseInt(arr[i]);	//������ StringŸ���� ������ ��ȯ
					sum += member;	//sum = sum+member	// ��ü �������� ��
					memberCount++;	// avg = sum/memberCount
					
				}
			}
			avg = (double) sum/memberCount;	//���
			
			System.out.println("���>>>"+sport);
			System.out.println("������� �������� ���հ�: "+sum);
			System.out.println("������� ��� �������� ��: "+avg);
			
		}while(true);
		System.out.println("���α׷��� �����ϰڽ��ϴ�.");
		sc.close();
			
	}
		
}


