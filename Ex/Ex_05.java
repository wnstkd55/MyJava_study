package Ex;

public class Ex_05 {

	public static void main(String[] args) {
		int[] scores = {1,2,3,4,5,6,7,8,9,10};	//score �迭�� �� �Ҵ�
		int sum=0;		//sum�� �ʱ�ȭ
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];		//sum = sum + scores[i]
		}
		System.out.println("�迭�� �� ���� ���� : "+sum);
	}

}
