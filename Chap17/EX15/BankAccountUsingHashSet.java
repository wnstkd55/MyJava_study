package Chap17.EX15;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
//�迭�� ������ ������ ArrayList�� ��ȯ�ؼ� ���
import java.util.Scanner;
import java.util.Set;

 class Account{
   private String ano;  //���� ��ȣ
   private String owner;   //������ �̸�
   private int balance;   //���� �ݾ�

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
		
		return "���¹�ȣ�� "+ano+" �������� �̸��� "+owner+" �ʱ� ���� �ݾ��� "+balance;
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
  
	//������ ���¸� ���� �� �ִ�.
	//���� ��ȣ�� �ߺ� ������ �Ǹ� �ȵȴ�.	ano�÷��� �ߺ�����Ǹ� �ȵǰ� ���� Set�� ����.
	
   private static Set<Account> aSet = new HashSet<Account>();      //ArrayList�� ��ü ����.
   		//�÷����� ���� ���� ���� ��� add() : ���� ������ �濡 ���� �������, size() <== ���� ����, 
   		//������ ���� �����Ҷ�, remove() : ������
   
   private static Scanner scanner = new Scanner(System.in);
   
   
   private static void createAccount() {
      //�ڵ� �ۼ� : 1. ���»��� ��ĳ�ʷ� 1. ���¹�ȣ 2. ������ �̸� 3. �ʱ� ����ݾ�
      //�迭 ��ü�� ����
	  Account account = new Account();
	   
      System.out.println("���¹�ȣ�� �Է��ϼ��� >> ");
      String ano = scanner.next();
      System.out.println("�������� �̸��� �Է����ּ��� >> ");
      String owner = scanner.next();
      System.out.println("�ʱ� ���� �ݾ��� �Է��� �ּ��� >> ");
      int balance = scanner.nextInt();
      aSet.add(new Account(ano, owner, balance));
      
      System.out.println("���°� �����Ǿ����ϴ�.");
      
   }
   private static void accountList() {
      //�ڵ� �ۼ� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, ����ݾ��� ���
     Iterator<Account> ia = aSet.iterator();
     while(ia.hasNext()) {
    	 System.out.println(ia.next());
     }
     System.out.println();
   }
   
      
   private static void deposit() {
      //�ڵ� �ۼ� 3. ���� <==���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ� �Աݱݾ� : ��ǲ�޾Ƽ� �ش���¿� ����
      System.out.println("���¹�ȣ�� �Է����ּ��� >> ");
      String ano = scanner.next();
      System.out.println("�Ա��� ���� �Է����ּ��� >> ");
      int depoMoney = scanner.nextInt();
      Iterator<Account> ia = aSet.iterator();
      
     
    	 if(findAccount(ano)==null) {
    		 System.out.println("�ش� ���¹�ȣ�� �����ϴ�.");
    		 return;
    	 }
    	 findAccount(ano).setBalance(findAccount(ano).getBalance()+depoMoney);
    	 System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. ���� �ܾ���"+findAccount(ano).getBalance());
   }
   private static void withdraw() {
      //�ڵ� �ۼ� 4. ��� <== ���¹�ȣ�� ��ǲ�޾� �ش� ���¸� ��ü���� ã�Ƽ� ���
      System.out.println("���¹�ȣ�� �Է����ּ��� >> ");
      String ano = scanner.next();
      System.out.println("����� ���� �Է����ּ��� >> ");
      int widMoney = scanner.nextInt();
      
      if(findAccount(ano)==null) {
 		 System.out.println("�ش� ���¹�ȣ�� �����ϴ�.");
 		 return;
 	 }
 	 findAccount(ano).setBalance(findAccount(ano).getBalance()-widMoney);
 	 System.out.println("����� �Ϸ�Ǿ����ϴ�. ���� �ܾ���"+findAccount(ano).getBalance());
   }
   //�迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
   private static Account findAccount(String ano) {
      Account account = null;      //�ʱⰪ ����
      //�ڵ� �ۼ�
     Iterator<Account> ia = aSet.iterator();
//     while(ia.hasNext()) {
//    	 String dbAno = ia.next().getAno();
//    	 if(dbAno.equals(ano)) {
//    		 account = aSet.iterator().next();
//    	 }
//     }
     while(ia.hasNext()) {
    	 Account a1 = ia.next();
    	 String dbAno = a1.getAno(); 	//�迭�� �� �濡 ����� ��ü�� ano�� dbAno������ �Ҵ�.
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
         System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
         System.out.println("-----------------------------------------------");
         System.out.println("����>>");
         int selectNO = scanner.nextInt();
         
         if(selectNO == 1) {
            createAccount();   //�޼ҵ� ȣ��
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