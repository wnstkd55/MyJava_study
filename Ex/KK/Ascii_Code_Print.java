package Ex.KK;

/*
 * ASCII �ڵ� �� ��� : 1byte = 8bit  / ����ù ��ȣ��Ʈ 1bit + 7bit
 * 		1~32��Ʈ������ : ����� �� �� ���� Ư���� �ڵ�, ��) null, ����ǽ���, �����(7) ����(10) : LF
 * 		127 : delete.
 * 		
 * 		���� ��°����� 33����Ʈ ~ 126��Ʈ
 * 		���� ���� Ư������
 * 
 * 		���
 * 		===========================================
 * 		ASCII		����			ASCII		����
 * 		===========================================
 * 		33			!			34			&
 * 		35			#			36			$
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {

		System.out.println("=======================================");
		System.out.println("ASCII   ����             ASCII   ����");
		System.out.println("=======================================");
		for(int i = 33 ; i<127 ; i++) {
			if(i%2 == 1) {
				System.out.println(i + "\t" + (char)i + "\t\t" + (i+1) + "\t" + ((char)(i+1)));
			}
			
		}
	}

}
