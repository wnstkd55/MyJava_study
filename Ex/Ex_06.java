package Ex;

public class Ex_06 {

	public static void main(String[] args) {
		int max = 0;				// max�� �ʱ�ȭ
		int[] array= {4,5,1,2,3};	//array�� �迭�� �Ҵ�
		
		for (int i = 1; i < array.length; i++) {
			if(max<array[i]) {		
				max=array[i];		//�������� ���ؼ� ((ex)array[1]�� ���� max������ ũ�� max�� array[1]���� �ֵ�����))
			}
		}
		System.out.println("max: "+max);
	}

}
