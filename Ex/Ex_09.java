package Ex;


public class Ex_09 {

	public static void main(String[] args) {
		int arr[]= new int[10];		//arr�� int�ڷ����� ��ũ�⸦ 10���� ����
		System.out.println("������ ������ : ");
		int sum = 0;			//sum(��)�� �ʱ�ȭ
		double avg = 0.0;		//avg(���)�� �ʱ�ȭ(?: ��հ��� �����⶧���� double�� �߽��ϴ�.)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);	//����(����)���� arr[i]������ ���� ( 0~9�����̱� ������ +1�� ����ߵȴ�.)
			System.out.print(arr[i]+" ");
			sum +=arr[i];		//�������� �� 
			avg = (double)sum/arr.length;		//�������� ���
		}
		System.out.println();
		System.out.println("����� "+avg);	
	}

}
