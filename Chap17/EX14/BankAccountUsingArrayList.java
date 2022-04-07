package Chap17.EX14;


import java.util.ArrayList;
//�Ϸ� �ð� : ���� ��ħ 9:30����

//�迭�� ������ ������ ArrayList�� ��ȯ�ؼ� ���
import java.util.Scanner;

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
   
}

public class BankAccountUsingArrayList {
   //�÷����� ����ؼ� Account��ü ���
	//�迭�� ���� ũ�Ⱑ ����, ����� ���� ũ�⸦ ����, ���� ũ�⸦ ������ �� ����.
	//�÷����� ���� ũ�Ⱑ ����, ������ ����.
   private static ArrayList<Account> aList = new ArrayList<Account>();      //ArrayList�� ��ü ����.
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
      aList.add(new Account(ano, owner, balance));
      
      System.out.println("���°� �����Ǿ����ϴ�.");
      
   }
   private static void accountList() {
      //�ڵ� �ۼ� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, ����ݾ��� ���
     for (int i = 0; i < aList.size(); i++) {
		Account account = aList.get(i);
		
		System.out.println(account.toString());
	}
   }
   
      
   private static void deposit() {
      //�ڵ� �ۼ� 3. ���� <==���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ� �Աݱݾ� : ��ǲ�޾Ƽ� �ش���¿� ����
      System.out.println("���¹�ȣ�� �Է����ּ��� >> ");
      String ano = scanner.next();
      System.out.println("�Ա��� ���� �Է����ּ��� >> ");
      int depoMoney = scanner.nextInt();
      
      for (int i = 0; i < aList.size(); i++) {
		if(findAccount(ano) == null) {
			System.out.println("���°� �ٸ��ϴ�.");
			break;
		}
			findAccount(ano).setBalance(findAccount(ano).getBalance()+depoMoney);
			System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. ���� �ܾ��� "+findAccount(ano).getBalance()+"�� �Դϴ�.");
		
		
	}
     
      
   }
   private static void withdraw() {
      //�ڵ� �ۼ� 4. ��� <== ���¹�ȣ�� ��ǲ�޾� �ش� ���¸� ��ü���� ã�Ƽ� ���
      System.out.println("���¹�ȣ�� �Է����ּ��� >> ");
      String ano = scanner.next();
      System.out.println("����� ���� �Է����ּ��� >> ");
      int widMoney = scanner.nextInt();
      
      for (int i = 0; i < aList.size(); i++) {
		if(findAccount(ano)==null) {
			System.out.println("���°� �ٸ��ϴ�.");
			break;
		}
			findAccount(ano).setBalance(findAccount(ano).getBalance()-widMoney);
			System.out.println("����� �Ϸ�Ǿ����ϴ�. ���� �ܾ��� "+findAccount(ano).getBalance()+"�Դϴ�.");
		
		
	}
   }
   //�迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
   private static Account findAccount(String ano) {
      Account account = null;      //�ʱⰪ ����
      //�ڵ� �ۼ�
      for (int i = 0; i < aList.size(); i++) {
		if(aList.get(i)!=null) {
			if(aList.get(i).getAno().equals(ano)) {
				account = aList.get(i);		//account ���������� ��ü�� �ּ������� ��´�.
				break;
			}
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