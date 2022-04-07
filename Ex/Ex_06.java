package Ex;

public class Ex_06 {

	public static void main(String[] args) {
		int max = 0;				// max값 초기화
		int[] array= {4,5,1,2,3};	//array에 배열값 할당
		
		for (int i = 1; i < array.length; i++) {
			if(max<array[i]) {		
				max=array[i];		//조건절을 통해서 ((ex)array[1]의 값이 max값보다 크면 max에 array[1]값을 넣도록함))
			}
		}
		System.out.println("max: "+max);
	}

}
