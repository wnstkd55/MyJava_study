package Chap18.EX03;

import java.util.Scanner;

//1. 스캐너를 사용해서 double의 두 수를 인풋 받기.
//2. 방법 1) 람다식을 사용해서 인풋받은 두 값을 +,-,*,/, 사칙연산을 구현해서 출력출력.
//3. 방법 2) 인터페이스를 구현한 자식 객체를 사용해서 인풋받은 두 값을 +,-,*,/, 사칙연산을 구현해서 출력출력.
//4. 방법 3) 익명 이너 클래스를 이용해서 인풋받은 두 값을 +,-,*,/, 사칙연산을 구현해서 출력출력.
//5. ArithmeticException 처리 : 0으로 나누면 예외 발생이 되므로 예외처리(double은 예외처리가 되어있기때문에 안해도 된다.) 

@FunctionalInterface
interface Arithemetic{
	double arithemeticOpr(double a, double b);
}

class Sum implements Arithemetic{
	@Override
	public double arithemeticOpr(double a, double b) {
		return a + b;
	}
}

class Sub implements Arithemetic{
	@Override
	public double arithemeticOpr(double a, double b) {
		return a - b;
	}
}

class Mul implements Arithemetic{
	@Override
	public double arithemeticOpr(double a, double b) {
		return a * b;
	}
}

class Div implements Arithemetic{
	@Override
	public double arithemeticOpr(double a, double b) {
		return a / b;
	}
}

public class ArithmeticOperation {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("A를 입력하세요 >> ");
		double x = sc.nextDouble();
		System.out.println("B를 입력하세요 >> ");
		double y = sc.nextDouble();
//		Arithemetic lam_sum = new Arithemetic() {
//			@Override
//			public double arithemeticOpr(double a, double b) {
//				return a+b;
//				
//			};
//		};
		Arithemetic lam_sum = ( a,  b) -> a+b;
		Arithemetic lam_sub = ( a,  b) -> a-b;
		Arithemetic lam_mul = ( a,  b) -> a*b;
		Arithemetic lam_div = ( a,  b) -> a/b;
		System.out.println("==========  람다식 활용  ============");
		System.out.println("두 수의 합은: "+lam_sum.arithemeticOpr(x, y));
		System.out.println("두 수의 차는: "+lam_sub.arithemeticOpr(x, y));
		System.out.println("두 수의 곱은: "+lam_mul.arithemeticOpr(x, y));
		System.out.println("두 수의 나눈 몫은: "+lam_div.arithemeticOpr(x, y));
		System.out.println();
		Arithemetic inf_sum = new Sum();
		Arithemetic inf_sub = new Sub();
		Arithemetic inf_mul = new Mul();
		Arithemetic inf_div = new Div();
		System.out.println("=========  인터페이스 활용  ===========");
		System.out.println("두 수의 합은: "+ inf_sum.arithemeticOpr(x, y));
		System.out.println("두 수의 차는: "+ inf_sub.arithemeticOpr(x, y));
		System.out.println("두 수의 곱은: "+ inf_mul.arithemeticOpr(x, y));
		System.out.println("두 수의 나눈 몫은: "+ inf_div.arithemeticOpr(x, y));
		Arithemetic inn_sum = new Arithemetic() {
			@Override
			public double arithemeticOpr(double a, double b) {
				return a + b;
			}
		};
		Arithemetic inn_sub = new Arithemetic() {
			@Override
			public double arithemeticOpr(double a, double b) {
				return a - b;
			}
		};
		Arithemetic inn_mul = new Arithemetic() {
			@Override
			public double arithemeticOpr(double a, double b) {
				return a * b;
			}
		};
		Arithemetic inn_div = new Arithemetic() {
			@Override
			public double arithemeticOpr(double a, double b) {
				return a / b;
			}
		};
		System.out.println("=========  이너클래스 활용  ===========");
		System.out.println("두수의 합은: "+inn_sum.arithemeticOpr(x, y));
		System.out.println("두수의 차은: "+inn_sub.arithemeticOpr(x, y));
		System.out.println("두수의 곱은: "+inn_mul.arithemeticOpr(x, y));
		System.out.println("두수의 나눈 몫은: "+inn_div.arithemeticOpr(x, y));
	}
}