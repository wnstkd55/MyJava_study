package Chap14.EX02;

public class ArrayException_1 {

	public static void main(String[] args) {
		int [] arr = new int[5];		//arr�迭�� �迭�� 5���� ����,index : 0,1,2,3,4
				
				try {
					for(int i = 0; i <=5; i++) {
						arr[i] = i;
						System.out.println(arr[i]);
					}
					
				}catch(ArrayIndexOutOfBoundsException e) {
					//e.printStackTrace();
					System.out.println("�迭�� �ε��� ���ȣ�� �Ѱ���ϴ�.");
				}finally {
					System.out.println("���(finally)");
				}
					
				System.out.println("���α׷� ����");
				

	}

}
