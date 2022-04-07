package Ex;

public class Ex_10 {

	public static void main(String[] args) {
		int arr[]=new int[99];		//(0~98까지의 방) int타입의 arr배열에 99개방 지정
		int num;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;		//구하고자하는것은 1~99이기 때문에 값에 +1을 해줬음
			num=arr[i];		//각방의 값을 num변수로 지정
			int x = num/10;		//x는 십의 자리쪽의 숫자가 3,6,9일때를 확인하기위한 변수로 지정
			int y = num%10;		//y는 일의 자리쪽의 숫자가 3,6,9일때를 확인하기위한 변수로 지정
			
			if((x==3 || x==6 || x==9) && (y==3 || y==6 || y==9)) {
				System.out.println(arr[i]+"박수 짝짝");		//십의자리 숫자와 일의자리 숫자모두 3,6,9를 만족하면 박수 두번(조건절사용)
			}
			else if((x==3 || x==6 || x==9)&&(y!=3 || y!=6 || y!=9)) {
				System.out.println(arr[i]+"박수 짝");			//십의자리숫자 3,6,9를 만족하면 박수 한번(조건절사용)
			}
			else if((x!=3 || x!=6 || x!=9)&&(y==3 || y==6 || y==9)) {
				System.out.println(arr[i]+"박수 짝");			//또는 일의자리숫자 둘중 하나가 3,6,9를 만족하면 박수 한번(조건절사용)
			}
			
		}	
		
	}

}	// || => or , && => and
