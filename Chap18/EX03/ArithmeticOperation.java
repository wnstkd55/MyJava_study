package Chap18.EX03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ �ޱ�.
//2. ��� 1) ���ٽ��� ����ؼ� ��ǲ���� �� ���� +,-,*,/, ��Ģ������ �����ؼ� ������.
//3. ��� 2) �������̽��� ������ �ڽ� ��ü�� ����ؼ� ��ǲ���� �� ���� +,-,*,/, ��Ģ������ �����ؼ� ������.
//4. ��� 3) �͸� �̳� Ŭ������ �̿��ؼ� ��ǲ���� �� ���� +,-,*,/, ��Ģ������ �����ؼ� ������.
//5. ArithmeticException ó�� : 0���� ������ ���� �߻��� �ǹǷ� ����ó��(double�� ����ó���� �Ǿ��ֱ⶧���� ���ص� �ȴ�.) 

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
		System.out.println("�� ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		System.out.println("A�� �Է��ϼ��� >> ");
		double x = sc.nextDouble();
		System.out.println("B�� �Է��ϼ��� >> ");
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
		System.out.println("==========  ���ٽ� Ȱ��  ============");
		System.out.println("�� ���� ����: "+lam_sum.arithemeticOpr(x, y));
		System.out.println("�� ���� ����: "+lam_sub.arithemeticOpr(x, y));
		System.out.println("�� ���� ����: "+lam_mul.arithemeticOpr(x, y));
		System.out.println("�� ���� ���� ����: "+lam_div.arithemeticOpr(x, y));
		System.out.println();
		Arithemetic inf_sum = new Sum();
		Arithemetic inf_sub = new Sub();
		Arithemetic inf_mul = new Mul();
		Arithemetic inf_div = new Div();
		System.out.println("=========  �������̽� Ȱ��  ===========");
		System.out.println("�� ���� ����: "+ inf_sum.arithemeticOpr(x, y));
		System.out.println("�� ���� ����: "+ inf_sub.arithemeticOpr(x, y));
		System.out.println("�� ���� ����: "+ inf_mul.arithemeticOpr(x, y));
		System.out.println("�� ���� ���� ����: "+ inf_div.arithemeticOpr(x, y));
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
		System.out.println("=========  �̳�Ŭ���� Ȱ��  ===========");
		System.out.println("�μ��� ����: "+inn_sum.arithemeticOpr(x, y));
		System.out.println("�μ��� ����: "+inn_sub.arithemeticOpr(x, y));
		System.out.println("�μ��� ����: "+inn_mul.arithemeticOpr(x, y));
		System.out.println("�μ��� ���� ����: "+inn_div.arithemeticOpr(x, y));
	}
}