package chap04;

public class For_Test {

	public static void main(String[] args) {
		//별로 모양만들기 (무조건 시험문제)
		
		//1. 직각삼각형1
		for(int i =1; i <5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("=====================");
		//2. 역 직각삼각형
		for(int i =0; i <5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("=====================");
		
		//3. 직각삼각형2
		for(int i=1; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(i>j) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		System.out.println("====================");
		//4. 피라미드
		for(int s = 0; s<5; s++) {
			for(int t = 0; t<4-s; t++) {
				System.out.print(" ");
			}
			for(int t = 0; t<2*s+1; t++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
