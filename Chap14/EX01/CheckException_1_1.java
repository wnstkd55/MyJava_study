package Chap14.EX01;

public class CheckException_1_1 {

	public static void main(String[] args) {
		
		try {
		System.out.println(10 / 0); 	//���α׷��� ������ ����Ǿ����
									//���ܿ� ���� ó��
		} catch(ArithmeticException e) {
			//try{}���� ������ �߻��� ��쿡 �۵�
//			e.printStackTrace();	//������ ���� �ڼ��� ������ ���
			System.out.println("0�� ���� �� �����ϴ�.");
			
			//catch����� ������ ���� �ʾƵ� ����ó���� �Ȱ��̴�.
		} finally {
			// try{} ������ ��� �۵�(O), �������־ (O)
			// try{}�� �۵��Ǹ� �׻� �۵�
			// ��ü�� ��� �� ��ü�� �޸𸮸� �����Ҷ�	,	ex) sc.close();
			System.out.println("finally{}�� �׻� ȣ��˴ϴ�");
		}
		
		System.out.println("���α׷��� ���������մϴ�."); 			//���� ����
		
	}

}
