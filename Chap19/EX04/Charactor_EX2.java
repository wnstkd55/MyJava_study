package Chap19.EX04;
/*
 A ~ Z 까지의 아스키 코드값 출력
 
 출력결과
 ==========================
 A , 65
 B , 66
 ...
 Z, 90
 
 
 
 a ~ z 까지의 아스키 코드 값 출력
 
 출력결과
 ============================
 a, 97
 b, 98
 
...
 z, 97
 
 
 */


public class Charactor_EX2 {

	public static void main(String[] args) {
		char[] Al_L = new char[26];
		int As1;
		char[] Al_S = new char[26];
		int As2;
		
		System.out.println("======대문자 알파벳, 아스키코드 출력=====");
		for(int i =0; i<Al_L.length; i++) {
			Al_L[i]=(char)('A'+i);
			As1 = (int)Al_L[i];
			System.out.println(Al_L[i]+", "+As1);
		}
		System.out.println("=======소문자 알파벳, 아스키코드 출력=====");
		for(int i =0; i<Al_L.length; i++) {
			Al_S[i]=(char)('a'+i);
			As2 = (int)Al_S[i];
			System.out.println(Al_S[i]+", "+As2);
		}
		
	}

}
