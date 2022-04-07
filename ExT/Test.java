package ExT;

public class Test {

	public static void main(String[] args) {
		//삼각형 만들기
		//1. 직각삼각형(오른쪽)
		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		//2. 역직각삼각형
		for(int i = 1; i<8; i++) {
			for(int j=7; j>i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		//3. 직각삼각형2
		for (int i = 1; i < 8; i++) {
			for (int j = 7; j >= 0 ; j--) {
				
				if(j<i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
