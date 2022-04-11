package Chap17.EX13;


//완료 시간 : 내일 아침 9:30까지
import java.util.Scanner;

class Account{		//계좌 정보를 저장하는 객체. 중요한 필드, private(캡슐화), 객체 필드 접근(X), 생성자(O), getter(O) setter(O)
   private String ano;   //계좌 번호
   private String owner;   //계좌주 이름
   private int balance;   //통장 금액
   
   public Account(String ano,String owner,int balance) {	//객체 생성시 필드의 값을 받아서 필드에 로드
      this.ano = ano;
      this.owner = owner;
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
   
}

public class BankAccountUsingArray {
   //배열을 사용해서 Account객체 등록
   private static Account[] accountArray = new Account[100];      //배열에 객체 저장.
   		//Account[] : 배열 타입. 참조타입, 배열의 각방에 값이 존재하지 않을 경우 기본값으로 NULL이 들어가게됨.
   		// 배열 생성시 방(index)의 크기를 선언, index = 0, length <= 방의 크기
   private static Scanner scanner = new Scanner(System.in);
   
   private static void createAccount() {
      //코드 작성 : 1. 계좌생성 스캐너로 1. 계좌번호 2. 계좌주 이름 3. 초기 통장금액
      //배열 객체에 저장
      System.out.println("계좌번호를 입력하세요>>");
      String ano = scanner.next();	//계좌번호를 인풋받아서 ano변수에 할당. <메소드 내에서만 사용하는 지역변수>
      System.out.println("계좌주의 이름을 입력하세요>>");
      String owner = scanner.next();
      System.out.println("초기 금액을 입력하세요>>");
      int balance = scanner.nextInt();
      /*
      각 필드의 정보를 사용자로부터 할당 받아서 객체를 생성후 객체에 필드의 값을 저장.
      Account newAccount = new Accoutn(ano,owner,balance);	생성자를 통해서 객체에 필드값 적용후 객체 생성.
      
      객체를 배열에 저장(비어있는 방에 저장). for문을 사용해서 null인 방을 찾아서 null경우 객체를 저장.
      for(int i =0; i<accountArray.length; i++){	//accountArray배열 방을 0~99방까지 순회
      	if(accountArray[i] == null){	//0번 방부터 null인 방을 찾아서 null일 경우 객체를 배열에 저장
      		accountArray[i] = newAccount;
      		System.out.println("계좌가 성공적으로 생성되었습니다");
      		break;
      	}
      }
      
      */
      for (int i = 0; i < accountArray.length; i++) {
         if(accountArray[i]==null) {            // i 번째의 배열 자리가 비어있으면
            accountArray[i] = new Account(ano, owner, balance);   //값을 넣는다.
         System.out.println("계좌 생성 완료");
         break;
         }
         
      }
      
      
   }
   private static void accountList() {
      //코드 작성 : 배열에 저장된 객체를 가져와서 계좌번호, 계좌주, 현재금액을 출력
	   //2. 계좌목록 출력 : 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
	   //배열의 각 방을 순회하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력
	   /*
	     for(int i = 0; i<accountArray.length; i++){
	     	//각 방의 객체를 담는 변수를 선언
	     	Account account = accountArray[i];
	     	if(account != null){	//각방의 값이 null이 아닐 경우만 객체정보를 출력
	     		System.out.print(account.getAno()); //계좌 정보.
	     		System.out.print("    ");
	     		Sysout.out.print(account.getOwner()); // 이름
	     		System.out.print("    ");
	     		Sysout.out.print(account.getBalance()); // 금액.
	     		System.out.print(); //라인 개행.
	     	}
	     
	     }
	     
	    */
	   
	   
	   
      for (int i = 0; i < accountArray.length; i++) {
         if(accountArray[i]==null) {         //만약 i번재에 저장된 값이 없으면
            break;               //빠져나오기
         }
         System.out.println(accountArray[i].toString());
      }
   }
   
      
   private static void deposit() {
      //코드 작성 3. 예금 <==계좌번호를 받아서 객체에서 해당 계좌를 찾아서 입금금액 : 인풋받아서 해당계좌에 저장
	  //1. 사용자로부터 입금할 계좌를 받아야한다.
	  //2. 사용자로 받은 계좌 번호를 배열에 저장된 객체 내의 계좌번호를 확인 후 해당 계좌에 입금
      System.out.println("계좌번호를 입력하세요>>");
      String ano = scanner.next();
      System.out.println("입금할 금액을 입력하세요>> ");
      int depMoney = scanner.nextInt();
      /*
        해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다.
        
        Account account = findAccount(ano);		findAccount(계좌번호)
        
        if(account==null){
        	System.out.println("결과 : 해당 계좌가 존재하지 않습니다.");
        	return;
        }
        account.setBalance(account.getBalance()+depMoney); setter를 사용해서 기존의 금액 + 추가 입금
        
        */
      if(findAccount(ano) == null) {                  
         System.out.println("해당 계좌를 찾지 못했습니다.");
         
      }
      else {
         findAccount(ano).setBalance(findAccount(ano).getBalance()+depMoney);//입력한 계좌번호의 계좌(findAccount(ano))에 
                                                   //값(입력한계좌번호에대한 계좌의 현재금액(findAccount(ano).getBalance())+입금할돈(depMoney)) 넣기
         System.out.println("입금이 완료되었습니다. 현재금액은 "+findAccount(ano).getBalance()+"원입니다."); //findAccount(ano).getBalance() = 입력한 계좌번호에 해당한 계좌의 현재 금액
      }
      
   }
   private static void withdraw() {
      //코드 작성 4. 출금 <== 계좌번호를 인풋받아 해당 계좌를 객체에서 찾아서 출금
      System.out.println("계좌번호를 입력하세요>>");
      String ano = scanner.next();
      System.out.println("출금할 금액을 입력하세요>> ");
      int widMoney = scanner.nextInt();
      
      if(findAccount(ano) == null) {      //밑에서 정의한 계좌조회클래스에 계좌번호를 입력했는데 값이 없을시
         System.out.println("해당 계좌를 찾지 못했습니다.");      
      }
      else {   //해당 계좌번호가 있다면
         findAccount(ano).setBalance(findAccount(ano).getBalance()-widMoney); //입력한 계좌번호의 계좌(findAccount(ano))에 
                                                            //값(입력한계좌번호에대한 계좌의 현재금액(findAccount(ano).getBalance())-출금할돈(widMoney)) 넣기
         System.out.println("출금이 완료되었습니다. 현재금액은 "+findAccount(ano).getBalance()+"원입니다."); //findAccount(ano).getBalance() = 입력한 계좌번호에 해당한 계좌의 현재 금액
      }
   }
   //배열에서 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
   //예금, 출금할때 공통코드, 여러 메소드에서 중복 사용될때 별도의 메소드를 생성해서 중복코드를 간단하게 만들어준다.
   private static Account findAccount(String ano) {
      Account account = null;      //초기값 설정
      //코드 작성
      /*
       for (int i = 0; i < accountArray.length; i++) {
         if(accountArray[i] != null) {     배열방의 값이 null이 아닐 경우에 객체의 ano[계좌]번호
            String dbAno = accountArray[i].getAno(); 배열의 각 방에 저장된 객체의 ano를 dbAno 변수에 할당                      
         	if(dbAno.equals(ano)){
         		account = accountArray[i];
         		break;
         	
         	}
         }
      }
       */
      
      for (int i = 0; i < accountArray.length; i++) {
         if(accountArray[i] == null) {     
            break;                        
         }
         
         if(accountArray[i].getAno().equals(ano)) {   //조건절 i번째의 계좌번호가 입력한 매개변수로 받은 계좌번호와 같다면
            return accountArray[i];         //[i]번째의 계좌정보를 불러온다
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
            createAccount();   //메소드 호출, 객체 생성 없이 메소드명으로 호출됨(static)
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