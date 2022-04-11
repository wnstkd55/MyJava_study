package Chap17.EX13;


//�Ϸ� �ð� : ���� ��ħ 9:30����
import java.util.Scanner;

class Account{		//���� ������ �����ϴ� ��ü. �߿��� �ʵ�, private(ĸ��ȭ), ��ü �ʵ� ����(X), ������(O), getter(O) setter(O)
   private String ano;   //���� ��ȣ
   private String owner;   //������ �̸�
   private int balance;   //���� �ݾ�
   
   public Account(String ano,String owner,int balance) {	//��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
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
		
		return "���¹�ȣ�� "+ano+" �������� �̸��� "+owner+" �ʱ� ���� �ݾ��� "+balance;
	}
   
}

public class BankAccountUsingArray {
   //�迭�� ����ؼ� Account��ü ���
   private static Account[] accountArray = new Account[100];      //�迭�� ��ü ����.
   		//Account[] : �迭 Ÿ��. ����Ÿ��, �迭�� ���濡 ���� �������� ���� ��� �⺻������ NULL�� ���Ե�.
   		// �迭 ������ ��(index)�� ũ�⸦ ����, index = 0, length <= ���� ũ��
   private static Scanner scanner = new Scanner(System.in);
   
   private static void createAccount() {
      //�ڵ� �ۼ� : 1. ���»��� ��ĳ�ʷ� 1. ���¹�ȣ 2. ������ �̸� 3. �ʱ� ����ݾ�
      //�迭 ��ü�� ����
      System.out.println("���¹�ȣ�� �Է��ϼ���>>");
      String ano = scanner.next();	//���¹�ȣ�� ��ǲ�޾Ƽ� ano������ �Ҵ�. <�޼ҵ� �������� ����ϴ� ��������>
      System.out.println("�������� �̸��� �Է��ϼ���>>");
      String owner = scanner.next();
      System.out.println("�ʱ� �ݾ��� �Է��ϼ���>>");
      int balance = scanner.nextInt();
      /*
      �� �ʵ��� ������ ����ڷκ��� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����.
      Account newAccount = new Accoutn(ano,owner,balance);	�����ڸ� ���ؼ� ��ü�� �ʵ尪 ������ ��ü ����.
      
      ��ü�� �迭�� ����(����ִ� �濡 ����). for���� ����ؼ� null�� ���� ã�Ƽ� null��� ��ü�� ����.
      for(int i =0; i<accountArray.length; i++){	//accountArray�迭 ���� 0~99����� ��ȸ
      	if(accountArray[i] == null){	//0�� ����� null�� ���� ã�Ƽ� null�� ��� ��ü�� �迭�� ����
      		accountArray[i] = newAccount;
      		System.out.println("���°� ���������� �����Ǿ����ϴ�");
      		break;
      	}
      }
      
      */
      for (int i = 0; i < accountArray.length; i++) {
         if(accountArray[i]==null) {            // i ��°�� �迭 �ڸ��� ���������
            accountArray[i] = new Account(ano, owner, balance);   //���� �ִ´�.
         System.out.println("���� ���� �Ϸ�");
         break;
         }
         
      }
      
      
   }
   private static void accountList() {
      //�ڵ� �ۼ� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, ����ݾ��� ���
	   //2. ���¸�� ��� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
	   //�迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���
	   /*
	     for(int i = 0; i<accountArray.length; i++){
	     	//�� ���� ��ü�� ��� ������ ����
	     	Account account = accountArray[i];
	     	if(account != null){	//������ ���� null�� �ƴ� ��츸 ��ü������ ���
	     		System.out.print(account.getAno()); //���� ����.
	     		System.out.print("    ");
	     		Sysout.out.print(account.getOwner()); // �̸�
	     		System.out.print("    ");
	     		Sysout.out.print(account.getBalance()); // �ݾ�.
	     		System.out.print(); //���� ����.
	     	}
	     
	     }
	     
	    */
	   
	   
	   
      for (int i = 0; i < accountArray.length; i++) {
         if(accountArray[i]==null) {         //���� i���翡 ����� ���� ������
            break;               //����������
         }
         System.out.println(accountArray[i].toString());
      }
   }
   
      
   private static void deposit() {
      //�ڵ� �ۼ� 3. ���� <==���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ� �Աݱݾ� : ��ǲ�޾Ƽ� �ش���¿� ����
	  //1. ����ڷκ��� �Ա��� ���¸� �޾ƾ��Ѵ�.
	  //2. ����ڷ� ���� ���� ��ȣ�� �迭�� ����� ��ü ���� ���¹�ȣ�� Ȯ�� �� �ش� ���¿� �Ա�
      System.out.println("���¹�ȣ�� �Է��ϼ���>>");
      String ano = scanner.next();
      System.out.println("�Ա��� �ݾ��� �Է��ϼ���>> ");
      int depMoney = scanner.nextInt();
      /*
        �ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
        
        Account account = findAccount(ano);		findAccount(���¹�ȣ)
        
        if(account==null){
        	System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
        	return;
        }
        account.setBalance(account.getBalance()+depMoney); setter�� ����ؼ� ������ �ݾ� + �߰� �Ա�
        
        */
      if(findAccount(ano) == null) {                  
         System.out.println("�ش� ���¸� ã�� ���߽��ϴ�.");
         
      }
      else {
         findAccount(ano).setBalance(findAccount(ano).getBalance()+depMoney);//�Է��� ���¹�ȣ�� ����(findAccount(ano))�� 
                                                   //��(�Է��Ѱ��¹�ȣ������ ������ ����ݾ�(findAccount(ano).getBalance())+�Ա��ҵ�(depMoney)) �ֱ�
         System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. ����ݾ��� "+findAccount(ano).getBalance()+"���Դϴ�."); //findAccount(ano).getBalance() = �Է��� ���¹�ȣ�� �ش��� ������ ���� �ݾ�
      }
      
   }
   private static void withdraw() {
      //�ڵ� �ۼ� 4. ��� <== ���¹�ȣ�� ��ǲ�޾� �ش� ���¸� ��ü���� ã�Ƽ� ���
      System.out.println("���¹�ȣ�� �Է��ϼ���>>");
      String ano = scanner.next();
      System.out.println("����� �ݾ��� �Է��ϼ���>> ");
      int widMoney = scanner.nextInt();
      
      if(findAccount(ano) == null) {      //�ؿ��� ������ ������ȸŬ������ ���¹�ȣ�� �Է��ߴµ� ���� ������
         System.out.println("�ش� ���¸� ã�� ���߽��ϴ�.");      
      }
      else {   //�ش� ���¹�ȣ�� �ִٸ�
         findAccount(ano).setBalance(findAccount(ano).getBalance()-widMoney); //�Է��� ���¹�ȣ�� ����(findAccount(ano))�� 
                                                            //��(�Է��Ѱ��¹�ȣ������ ������ ����ݾ�(findAccount(ano).getBalance())-����ҵ�(widMoney)) �ֱ�
         System.out.println("����� �Ϸ�Ǿ����ϴ�. ����ݾ��� "+findAccount(ano).getBalance()+"���Դϴ�."); //findAccount(ano).getBalance() = �Է��� ���¹�ȣ�� �ش��� ������ ���� �ݾ�
      }
   }
   //�迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
   //����, ����Ҷ� �����ڵ�, ���� �޼ҵ忡�� �ߺ� ���ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ������ش�.
   private static Account findAccount(String ano) {
      Account account = null;      //�ʱⰪ ����
      //�ڵ� �ۼ�
      /*
       for (int i = 0; i < accountArray.length; i++) {
         if(accountArray[i] != null) {     �迭���� ���� null�� �ƴ� ��쿡 ��ü�� ano[����]��ȣ
            String dbAno = accountArray[i].getAno(); �迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�                      
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
         
         if(accountArray[i].getAno().equals(ano)) {   //������ i��°�� ���¹�ȣ�� �Է��� �Ű������� ���� ���¹�ȣ�� ���ٸ�
            return accountArray[i];         //[i]��°�� ���������� �ҷ��´�
         }
      }
      
      return account;
   }
   
   public static void main(String[] args) {
      boolean run = true;
      
      while(run) {
         System.out.println("-----------------------------------------------");
         System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
         System.out.println("-----------------------------------------------");
         System.out.println("����>>");
         int selectNO = scanner.nextInt();
         
         if(selectNO == 1) {
            createAccount();   //�޼ҵ� ȣ��, ��ü ���� ���� �޼ҵ������ ȣ���(static)
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
      System.out.println("���α׷� ����");
   }

}