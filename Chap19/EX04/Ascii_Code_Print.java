package Chap19.EX04;

/*
  ASCII 코드 값 출력 : 1byte = 8bit, 제일 처음 비트는 부호비트
  	1 ~ 32비트 까지는 : 출력을 할 수 없는 특수한 코드, 예) null, 헤더의 시작, 경고용(7) 개행 10, (LF)...
  	127 : delete.
  	
  	실제 출력 가능은 33번 비트 ~ 126번 비트
  	영문, 숫자, 특수문자
  	
  	출력
  	===========================
  	ASCII	문자		ASCII	문자
  	===========================
  	33		!		34		&
  	35		#		36		
  
  
  
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("ASCII	문자		ASCII	문자");
		System.out.println("====================================");
		
		char[] AS = new char[94];
		int num;
		
		for (int i =0; i < AS.length; i++) {
			AS[i] = (char)('!'+i);
			num = (int)(AS[i]);
			
			
			if((i+1) % 2 == 1) {
				System.out.print(num+"\t"+AS[i]);
			}
			else if(num == 33) {
				System.out.println(num+"\t"+AS[i]+"\t \t");
			}
			else {
				System.out.println("\t \t"+num+"\t"+AS[i]);
			}
			
		}
		
		
	}

}
