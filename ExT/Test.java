package ExT;

public class Test {

	public static void main(String[] args) {
		//�ﰢ�� �����
		//1. �����ﰢ��(������)
		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		//2. �������ﰢ��
		for(int i = 1; i<8; i++) {
			for(int j=7; j>i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		//3. �����ﰢ��2
		for (int i = 1; i < 8; i++) {
			for (int j = 7; j >= 0 ; j--) {
				
				if(j<i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
