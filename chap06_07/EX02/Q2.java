package chap06_07.EX02;

import java.util.Scanner;

public class Q2 {
	
		static void math(String...values) {
				
				int sum = 0;		//������ ������ ���ϴ� ����
				double avg = 0.0;		//����� �����ϴ� ����
				
				for (int i = 0; i < values.length; i++) {
					//sum = sum+values[i];	//values [i]��° ���� ���� StringŸ���̹Ƿ� ����Ÿ������ ��ȯ�� �ʿ�
					sum += Integer.parseInt(values[i]);
							//Integer.parseInt(String): ������StringŸ���� ���������� ��ȯ
					avg = (double)sum/values.length;
				}
				System.out.println("����: "+sum+", �����: "+avg);
			}

	public static void main(String[] args) {
		//[����] : ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ� ���ϱ�, ��ձ��ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �־ �Է��ϼ��� >> ");
		String num = sc.nextLine();		// ������ ���Ƿ� ��ü �������� String
		
		String[] array1 = num.split(" ");	//split�� �����ڸ� �������� ���ڸ� �߶� �迭�� ����
		System.out.print("����� �Է��� ������: ");
		
				
		for (int i = 0; i < array1.length; i++) {		//�Է°��� ���
					System.out.print(array1[i]);
		}
		System.out.println();
				
		math(array1);		//���� ���� �޼ҵ� math�� ȣ���ϸ鼭 �Ű������� array1�� �־��ָ� �ȴ�.
	
		
		
		
	}
	

}
