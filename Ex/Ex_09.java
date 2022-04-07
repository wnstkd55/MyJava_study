package Ex;


public class Ex_09 {

	public static void main(String[] args) {
		int arr[]= new int[10];		//arr에 int자료형의 방크기를 10으로 지정
		System.out.println("랜덤한 정수들 : ");
		int sum = 0;			//sum(합)값 초기화
		double avg = 0.0;		//avg(평균)값 초기화(?: 평균값은 나누기때문에 double로 했습니다.)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);	//랜덤(난수)값을 arr[i]각마다 지정 ( 0~9까지이기 때문에 +1을 해줘야된다.)
			System.out.print(arr[i]+" ");
			sum +=arr[i];		//난수들의 합 
			avg = (double)sum/arr.length;		//난수들의 평균
		}
		System.out.println();
		System.out.println("평균은 "+avg);	
	}

}
