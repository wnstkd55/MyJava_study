package Ex;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		int[] array = new int[10];		//array�迭�� int�ڷ����� �迭�� ���� ũ�⸦ 10���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 10���� �Է��ϼ���: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();		//�Է��� ��(sc.nextInt)�� array[i]�� ����
		}
		for(int i=0; i<10; i++) {
			if(array[i]%3==0) {
				System.out.println("3�� �����: "+array[i]);		//3�� ����� ã������ ������
			}
			else {
				continue;		//3�� ����� �ƴҽ� continue�� ���ؼ� for������ �ǵ��ư���
			}
			
		}
		sc.close();		//��ĳ�� ����
	}

}
