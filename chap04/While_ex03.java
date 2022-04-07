package chap04;

public class While_ex03 {

	public static void main(String[] args) {
		// 1. while의 기본 문법
		int a = 0;		//초기값
		while (a<10) {			//조건식
			System.out.print(a+" ");	//실행식
			
			a++;	//증감식
		}
		
			//0,1,2,3,....9 : 10번 출력
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//while 문의 10부터 시작해서 1씩 감소(for문 변환)
		int b=10;
		while(b>0) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		
		for(int i =10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//while의 무한루프
		
		/*while(true) {
			System.out.println("while의 무한 루프 발생");
		}*/
		
		//while의 무한 루프 중지
		int c = 0;
		while(true) {
			if(c>100) {
				break;
			}
			
			System.out.println(c+" ");
			c++;
		}
	}

}
