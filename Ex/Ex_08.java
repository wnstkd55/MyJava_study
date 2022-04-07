package Ex;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	//unit배열에 지폐의단위(값) 할당 
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하시오 >> ");
        int money = sc.nextInt(); //입력값 money로 변수지정
        
        for(int i = 0; i<unit.length; i++) { 
            int c = money/unit[i];		// 입력한 돈을 화폐단위로 나누면 화폐의 갯수를 확인할수 있기때문에 화폐의 갯수를 c로 변수 지정
            System.out.println(unit[i]+" 원 짜리"+ c + "개");
            money = money - (c*unit[i]);	 //나누고 남은 돈을 다시 money에 넣어서 unit.length(8)이 끝날때까지 반복
        } 
	}
}


