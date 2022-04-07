package Chap17.EX16;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


//Account ��ü�� TreeSet�� ����. ano[���¹�ȣ], owner[�̸�], balance[���ݱݾ�]
//TreeSet�� �Ϲ� ��ü�� ������ � �÷��� ���������� ����. Comparable<E>, Comparator<E>
//Account��ü�� �������� �ʰ�, balance���� ū�ͺ��� ��µǵ��� ����<��������>

public class BankAccountUsingTreeSet {
	//�÷���( ArrayList<E>)�� ����ؼ� Account ��ü ��� (�迪�� ���� ũ�Ⱑ ����, �÷����� ���� ũ�Ⱑ ����, ������ ����)
	
	private static TreeSet<Account> tSet = new TreeSet<Account>(new Comparator<Account>(){
		public int compare(Account o1, Account o2) {
			if(o1.getBalance()<o2.getBalance()) {		//�������� ����ó��
				return 1;
			}else if(o1.getBalance() == o2.getBalance()) {
				return 0;
			}else {
				return -1;
			}
		};
		
	});
	//.add() : ���� �������濡 ���� �߰��� ���, .size(), .remove() : �� ���� ���� ���� ��
	
	
	
	private static Scanner scanner = new Scanner(System.in); 
	
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���� ����.  ��ĳ�ʷ� 1.���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		//�迭 ��ü�� ����. 
		//�ڵ� �ۼ� : 1. ���»��� ��ĳ�ʷ� 1. ���¹�ȣ 2. ������ �̸� 3. �ʱ� ����ݾ�
	      //�迭 ��ü�� ����
	
		
		
	      System.out.println("���¹�ȣ�� �Է��ϼ��� >> ");
	      String ano = scanner.next();
	      System.out.println("�������� �̸��� �Է����ּ��� >> ");
	      String owner = scanner.next();
	      System.out.println("�ʱ� ���� �ݾ��� �Է��� �ּ��� >> ");
	      int balance = scanner.nextInt();
	      tSet.add(new Account(ano, owner, balance));
	      
	      System.out.println("���°� �����Ǿ����ϴ�.");
	      
	      
	      
	   }
	   private static void accountList() {
	      //�ڵ� �ۼ� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, ����ݾ��� ���
	     Iterator<Account> ia = tSet.iterator();
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
	     Iterator<Account> ia = tSet.iterator();
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
