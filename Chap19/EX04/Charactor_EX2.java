package Chap19.EX04;
/*
 A ~ Z ������ �ƽ�Ű �ڵ尪 ���
 
 ��°��
 ==========================
 A , 65
 B , 66
 ...
 Z, 90
 
 
 
 a ~ z ������ �ƽ�Ű �ڵ� �� ���
 
 ��°��
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
		
		System.out.println("======�빮�� ���ĺ�, �ƽ�Ű�ڵ� ���=====");
		for(int i =0; i<Al_L.length; i++) {
			Al_L[i]=(char)('A'+i);
			As1 = (int)Al_L[i];
			System.out.println(Al_L[i]+", "+As1);
		}
		System.out.println("=======�ҹ��� ���ĺ�, �ƽ�Ű�ڵ� ���=====");
		for(int i =0; i<Al_L.length; i++) {
			Al_S[i]=(char)('a'+i);
			As2 = (int)Al_S[i];
			System.out.println(Al_S[i]+", "+As2);
		}
		
	}

}
