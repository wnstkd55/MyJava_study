package Chap17.EX15;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
//배열로 구현된 내용을 ArrayList로 변환해서 사용
import java.util.Scanner;
import java.util.Set;

 class Account{
   private String ano;  //계좌 번호
   private String owner;   //계좌주 이름
   private int balance;   //통장 금액

   public Account() {}
   
   public Account(String ano, String owner, int balance) {
	   this.ano=ano;
	   this.owner=owner;
	   this.balance = balance;
   }

public String getAno() {
	return ano;
}

public void setAno(String ano) {
	this.ano = ano;
}

public String getOwner() {
	return owner;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
   @Override
	public String toString() {
		
		return "계좌번호는 "+ano+" 계좌주의 이름은 "+owner+" 초기 통장 금액은 "+balance;
	}
@Override
	public int hashCode() {
		return Objects.hashCode(ano);
	}

@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			if(this.ano.equals(((Account)obj).ano)) {
				return true;
			}
		}
		return false;
	}
//@Override	
//	public boolean equals(Object obj) {
//		if(obj instanceof Account) {
//			Account account = (Account)obj;
//			if(this.ano == ((Account)obj).ano) {
//				return false;
//			}
//		}
//		return true;
//}

}

public class BankAccountUsingHashSet {
  
	//동일한 계좌를 넣을 수 있다.
	//계좌 번호는 중복 저장이 되면 안된다.	ano컬럼은 중복저장되면 안되게 설정 Set에 저장.
	
   private static Set<Account> aSet = new HashSet<Account>();      //ArrayList에 객체 저장.
   		//컬렉션의 방의 값을 넣을 경우 add() : 제일 마지막 방에 값을 넣을경우, size() <== 방의 갯수, 
   		//각방의 값을 삭제할때, remove() : 삭제시
   
   private static Scanner scanner = new Scanner(System.in);
   
   
   private static void createAccount() {
      //코드 작성 : 1. 계좌생성 스캐너로 1. 계좌번호 2. 계좌주 이름 3. 초기 통장금액
      //배열 객체에 저장
	  Account account = new Account();
	   
      System.out.println("계좌번호를 입력하세요 >> ");
      String ano = scanner.next();
      System.out.println("계좌주의 이름을 입력해주세요 >> ");
      String owner = scanner.next();
      System.out.println("초기 통장 금액을 입력해 주세요 >> ");
      int balance = scanner.nextInt();
      aSet.add(new Account(ano, owner, balance));
      
      System.out.println("계좌가 생성되었습니다.");
      
   }
   private static void accountList() {
      //코드 작성 : 배열에 저장된 객체를 가져와서 계좌번호, 계좌주, 현재금액을 출력
     Iterator<Account> ia = aSet.iterator();
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
      Iterator<Account> ia = aSet.iterator();
      
     
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
     Iterator<Account> ia = aSet.iterator();
//     while(ia.hasNext()) {
//    	 String dbAno = ia.next().getAno();
//    	 if(dbAno.equals(ano)) {
//    		 account = aSet.iterator().next();
//    	 }
//     }
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