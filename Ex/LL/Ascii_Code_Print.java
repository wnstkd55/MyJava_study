package Ex.LL;
/*
 	ASCII 코드값 출력 : 1byte(= 8bit) , 제일 처음 비트는 부호비트, 7bit
 		 1 ~ 32bit 까지 : 특수하게 출력을 할 수 없는 특수한 코드 , 예 ) null, 헤더의 시작, 경고음(7번), 개행 LF(10번)....
 		 127 : delete.
 		 
 		 실제 출력 가능은 33번비트 ~ 126비트
 		 영문, 숫자, 특수문자 
 		 
 		 출력 
 		 ========================================
 		 ASCII(\t) 문자(\t)(\t) ASCII(\t) 문자
 		 ========================================
 		 33			!		  34		 &
 		 35 		#		  36         $
 		 .
 		 .
 		 .
 		 126
  */
public class Ascii_Code_Print {
	public static void main(String[] args) {
		
		System.out.println( "출력" + "\n" + "====================" + "\n" + "ASCII    문자            ASCII     문자" + "\n" + "====================" );
		char[] ch = new char[126];//방의 갯수는 선언과 동시에 지정하는게 좋습니다
		for (int i = 33; i <ch.length; i++) {
			//for(int i = 33; i <= 126; i++) 
			//ch = new char[126-33];  	=> 방의크기가 93이지만 i가 126까지 나올수 있어서 방크기보다 많죠?! 오류 발생합니다!
			
			
			ch[i] = (char) (i);
//			System.out.println(i + "\t" + ch[i] + "\t \t"+ (i+1) + "\t" + ch[(i+1)]);
			//ch[i+1]이 안되는 이유 : 최대방의 크기만큼이지만 마지막 i번째에서 +1해버리면 지정한 방 크기보다
			//더 크기때문에 오류가 발생합니다!
			
			if(i == 33) {
				System.out.print(i+"\t"+ch[i]);
			}
			else if(i%2==1) {
				System.out.print(i+"\t"+ch[i]);
			}else {
				System.out.println("\t \t"+i+"\t"+ch[i]);
			}
			
			
		}
	}

}
