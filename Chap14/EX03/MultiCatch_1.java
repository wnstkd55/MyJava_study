package Chap14.EX03;

public class MultiCatch_1 {

	public static void main(String[] args) {

		//1. 단일 Exception처리 try catch처리
		//ArithmeticException
		try {
			int num = Integer.parseInt("10A");
		}catch(NumberFormatException e) {
			//catch블락의 아무 내용이 없어도 예외 처리
		}
		
		
		//NumberFormatException
		//int num = Integer.parseInt("10A");
		
		//2. 다중 Exception 처리
		
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}catch(ArithmeticException e) {
			System.out.println("0 ArithemeticException 출력");
		}catch(NumberFormatException k) {
			System.out.println("1 NumberFormatException 출력");
		}
		
		//3.다중 Exception 처리2
		try {
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println("다중예외처리");
		}
		
	
	}

}
