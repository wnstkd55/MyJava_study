package chap04;

public class Switch_Calc {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		
		switch(operator) {
		case '+':
			result = num1+num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		case '-':
			result = num1-num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		case '*':
			result = num1*num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		case '/':
			result = num1/num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		default:
			System.out.println("������ �����Դϴ�.");
			return;
			
			
		}
	}

}
