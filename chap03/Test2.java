package chap03;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���: ");
		int num = sc.nextInt();
		
		System.out.println("�Է��Ͻ� ����"+num+"�� 16������ ��ȯ�ϸ�"+Integer.toHexString(num)+"�Դϴ�.");
		System.out.println("�Է��Ͻ� ����"+num+"�� 8������ ��ȯ�ϸ�"+Integer.toOctalString(num)+"�Դϴ�.");
		System.out.println("�Է��Ͻ� ����"+num+"�� 2������ ��ȯ�ϸ�"+Integer.toBinaryString(num)+"�Դϴ�.");
		
		sc.close();
		
	}

}
