package Chap17.EX16;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


//Account 객체를 TreeSet에 저장. ano[계좌번호], owner[이름], balance[예금금액]
//TreeSet에 일반 객체를 넣을때 어떤 컬럼을 정렬할지를 지정. Comparable<E>, Comparator<E>
//Account객체를 수정하지 않고, balance값이 큰것부터 출력되도록 구성<내림차순>

public class BankAccountUsingTreeSet {
	//컬렉션( ArrayList<E>)을 사용해서 Account 객체 등록 (배역은 방의 크기가 고정, 컬렉션은 방의 크기가 동적, 무한정 저장)
	
	private static TreeSet<Account> tSet = new TreeSet<Account>(new Comparator<Account>(){
		public int compare(Account o1, Account o2) {
			if(o1.getBalance()<o2.getBalance()) {		//내림차순 정렬처리
				return 1;
			}else if(o1.getBalance() == o2.getBalance()) {
				return 0;
			}else {
				return -1;
			}
		};
		
	});
	//.add() : 제일 마지막방에 값을 추가할 경우, .size(), .remove() : 각 방의 값을 삭제 시
	
	
	
	private static Scanner scanner = new Scanner(System.in); 
	
	private static void createAccount() {
		//코드 작성 : 1. 계좌 생성.  스캐너로 1.계좌번호, 2. 이름, 3. 초기통장 금액
		//배열 객체에 저장. 
		//코드 작성 : 1. 계좌생성 스캐너로 1. 계좌번호 2. 계좌주 이름 3. 초기 통장금액
	      //배열 객체에 저장
	
		
		
	      System.out.println("계좌번호를 입력하세요 >> ");
	      String ano = scanner.next();
	      System.out.println("계좌주의 이름을 입력해주세요 >> ");
	      String owner = scanner.next();
	      System.out.println("초기 통장 금액을 입력해 주세요 >> ");
	      int balance = scanner.nextInt();
	      tSet.add(new Account(ano, owner, balance));
	      
	      System.out.println("계좌가 생성되었습니다.");
	      
	      
	      
	   }
	   private static void accountList() {
	      //코드 작성 : 배열에 저장된 객체를 가져와서 계좌번호, 계좌주, 현재금액을 출력
	     Iterator<Account> ia = tSet.iterator();
	     while(ia.hasNext()) {
	    	 System.out.println(ia.next());
	     }
	     System.out.println();
	   }
	   
	      
	   private static void deposit() {
	      //코드 작성 3. 예금 <==계좌번호를 받아서 객체에서 해당 계좌를 찾아서 입금금액 : 인풋받아서 해당계좌에 저장
	      System.out.println("계좌번호를 입력해주세요 >> ");
	      String ano = scanner.next();
	      System.out.println("입금할 돈을 입력해주세요 >> ");
	      int depoMoney = scanner.nextInt();
	     
	    	 if(findAccount(ano)==null) {
	    		 System.out.println("해당 계좌번호가 없습니다.");
	    		 return;
	    	 }
	    	 findAccount(ano).setBalance(findAccount(ano).getBalance()+depoMoney);
	    	 System.out.println("입금이 완료되었습니다. 현재 잔액은"+findAccount(ano).getBalance());
	    	
	    	 
	   }
	   private static void withdraw() {
	      //코드 작성 4. 출금 <== 계좌번호를 인풋받아 해당 계좌를 객체에서 찾아서 출금
	      System.out.println("계좌번호를 입력해주세요 >> ");
	      String ano = scanner.next();
	      System.out.println("출금할 돈을 입력해주세요 >> ");
	      int widMoney = scanner.nextInt();
	      
	      if(findAccount(ano)==null) {
	 		 System.out.println("해당 계좌번호가 없습니다.");
	 		 return;
	 	 }
	 	 findAccount(ano).setBalance(findAccount(ano).getBalance()-widMoney);
	 	 System.out.println("출금이 완료되었습니다. 현재 잔액은"+findAccount(ano).getBalance());
	   }
	   //배열에서 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
	   private static Account findAccount(String ano) {
	      Account account = null;      //초기값 설정
	      //코드 작성
	     Iterator<Account> ia = tSet.iterator();
	     while(ia.hasNext()) {
	    	 Account a1 = ia.next();
	    	 String dbAno = a1.getAno(); 	//배열의 각 방에 저장된 객체의 ano를 dbAno변수에 할당.
	    	 if(dbAno.equals(ano)) {
	    		 account = a1;
	    		 return account;
	    		
	    	 }
	     }
	      
	      return account;
	}
	  

	public static void main(String[] args) {
		boolean run = true;
		
		
	      while(run) {
	         System.out.println("-----------------------------------------------");
	         System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
	         System.out.println("-----------------------------------------------");
	         System.out.println("선택>>");
	         int selectNO = scanner.nextInt();
	         
	         if(selectNO == 1) {
	            createAccount();   //메소드 호출
	         }else if(selectNO == 2) {
	            accountList();
	         }else if(selectNO==3) {
	            deposit();
	         }else if(selectNO==4) {
	            withdraw();
	         }else if(selectNO==5) {
	            break;
		            //run = false;
	         }
	         
	      }
	      scanner.close();
	      System.out.println("프로그램 종료");
	   }


}
