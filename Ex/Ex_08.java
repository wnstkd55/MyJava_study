package Ex;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	//unit�迭�� �����Ǵ���(��) �Ҵ� 
        Scanner sc = new Scanner(System.in);
        System.out.println("�ݾ��� �Է��Ͻÿ� >> ");
        int money = sc.nextInt(); //�Է°� money�� ��������
        
        for(int i = 0; i<unit.length; i++) { 
            int c = money/unit[i];		// �Է��� ���� ȭ������� ������ ȭ���� ������ Ȯ���Ҽ� �ֱ⶧���� ȭ���� ������ c�� ���� ����
            System.out.println(unit[i]+" �� ¥��"+ c + "��");
            money = money - (c*unit[i]);	 //������ ���� ���� �ٽ� money�� �־ unit.length(8)�� ���������� �ݺ�
        } 
	}
}


