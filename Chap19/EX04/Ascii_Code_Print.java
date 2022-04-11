package Chap19.EX04;

/*
  ASCII �ڵ� �� ��� : 1byte = 8bit, ���� ó�� ��Ʈ�� ��ȣ��Ʈ
  	1 ~ 32��Ʈ ������ : ����� �� �� ���� Ư���� �ڵ�, ��) null, ����� ����, ����(7) ���� 10, (LF)...
  	127 : delete.
  	
  	���� ��� ������ 33�� ��Ʈ ~ 126�� ��Ʈ
  	����, ����, Ư������
  	
  	���
  	===========================
  	ASCII	����		ASCII	����
  	===========================
  	33		!		34		&
  	35		#		36		
  
  
  
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("ASCII	����		ASCII	����");
		System.out.println("====================================");
		
		char[] AS = new char[94];
		int num;
		
		for (int i =0; i < AS.length; i++) {
			AS[i] = (char)('!'+i);
			num = (int)(AS[i]);
			
			
			if((i+1) % 2 == 1) {
				System.out.print(num+"\t"+AS[i]);
			}
			else if(num == 33) {
				System.out.println(num+"\t"+AS[i]+"\t \t");
			}
			else {
				System.out.println("\t \t"+num+"\t"+AS[i]);
			}
			
		}
		
		
	}

}
