package Ex;

public class Ex_04 {

	public static void main(String[] args) {
		for(int i=1; i<5; i++) {		//밑변의 길이 및 층의수 설정
			for(int j=0; j<i; j++) {
				System.out.print("*");	// * 의 출력
			}
			System.out.println(" ");	// " " 공백의 출력
		}
	}

}
