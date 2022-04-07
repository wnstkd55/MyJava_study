package chap04;

public class For_Ex03 {

	public static void main(String[] args) {
		
		//For 기본 작동
		
		int a;		//for문(블락) 밖에서 선언된 변수(!!전역변수), 선언(0), 초기값(X)
		for(a = 0; a<5 ;a++) {
			System.out.print(a+" 번 실행.");	//
		}
		System.out.println();
		System.out.println("블락 밖에서 출력: "+a);
		
		System.out.println("==================");
		
		for(int b= 0; b <= 10; b++ ) {
			System.out.println(b+" 번 실행.");
		}
		// System.out.println(b); 오류! (for문 내에서 변수 선언을 했기때문에 '지역변수' 이다.) 
		System.out.println("====================");
		
		int c;
		for( c=10; c>0; c--) {
			System.out.println(c);
		}
		/*2의 배수를 출력*/
		for(int i = 0; i<100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("==================");
		/* for문 내에서 초기값과 증가값은 여러 변수를 할당할 수 있다.*/
		for(int i=0, j=0; i<10; i++,j++) {
			System.out.println(i+"*"+ j+"="+(i*j));
		}
		System.out.println("========================");
		
		// * for문을 사용해서 1부터 100까지 더한값
		int sum1 = 0;		//덧셈의 초기화 값은 0
		for(int i = 1; i<101; i++) {
			sum1+=i;			// sum = sum + i
		}
		System.out.println("1부터 100까지 더한값은 : "+sum1);
		
		
		// * for문을 사용해서 1부터 10까지 곱한값을 구하세요
		int mul = 1;		//곱셈의 초기화 값은 1
		for(int i = 1; i<=10; i++) {
			mul*=i;			//mul = mul * i
		}
		System.out.println("1부터 10까지 곱한값은: "+mul);
		System.out.println("=======구구단 출력=========");
		/*
		 * 이중 for문 : ex) 1단~9단
		 */
		
		for(int i =0; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			if(i <9) {
				System.out.println("====="+(i+1)+"단=====");
			}
			else {
				System.out.println("");
			}
		}
		
		/*
		 * For 문에서 무한 루프 발생, 조건이 없을 경우
		 *
		 *
		for(int i = 0; ; i++) {
			System.out.print(i+" ");	i값 : 1,2,3......
		}
		
		*
		for(; ;){
			System.out.println("무한루프발생");
		}
		*
		*/
		System.out.println("=====================");
		
		//무한 루프 탈출
		
		for(int i = 0; ; i++ ) {
			
			if(i > 100) {
				break;				//무한 루프를 중료
			}
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		/* FOR 문을 사용해서 1부터 1000까지 4의 배수만 더한 값: , 평균값 출력 */
		
		int sum = 0;	//4의배수를 더한값을 저장
		int j = 0;	//4의 배수 카운트
		
		for(int i = 1; i<=1000; i++) {
			
			if(i%4==0) {
				sum+=i;
				j=i/4;
				//j++; //for문의 카운트 횟수
			}
			
		}
		
		System.out.println("합은: " + sum);
		System.out.println("평균은:" + (sum/j));
		
		
	}

}
