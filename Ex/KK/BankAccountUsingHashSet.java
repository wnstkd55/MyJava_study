package Ex.KK;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Account{		//���������� �����ϴ� ��ü. �߿��� �ʵ�, private(ĸ��ȭ) 		
					//DTO, VO <== �� �������� �ʵ��� ���� �����ϰ� ����
					//��ü������ �ʵ����� (x) : ������(0), getter(0), setter(0)
	private String ano ; 	//���� ��ȣ
	private String owner;   //���� �� , �̸�
	private int balance; 	// ���� �ݾ�, 
	
	Account(String ano, String owner, int balance){		//��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//getter, setter
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
		public boolean equals(Object obj) {
		if ( obj instanceof Account) {
			Account account = (Account) obj;	
			if (this.ano == account.ano) {	
				return true;
			} else {
				return false;
			}
		}
		return false;
		}
	@Override
		public int hashCode() {
			return Objects.hashCode(ano);
		}
	@Override
		public String toString() {
			return "���� ��ȣ�� : " + ano + ", �����ִ� : " + owner + ", ���ݾ��� : " + balance;
		}
	
}

public class BankAccountUsingHashSet {
	
	//ArrayList�� ������ ���¸� ���� �� �ִ�.
	//���� ��ȣ�� �ߺ� ������ �Ǹ� �ȵȴ�. ano �÷��� �ߺ� ����Ǹ� �ȵǰ� �����ϰ� Set�� ����

	private static Set<Account> aSet = new HashSet<Account>(); 
	
	
	private static Scanner scanner = new Scanner(System.in); 
	
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���� ����.  ��ĳ�ʷ� 1.���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		//�迭 ��ü�� ����. 
		System.out.println("---------");
		System.out.println("1. ���»���");
		System.out.println("---------");
		System.out.println("���� ��ȣ�� �Է� �ϼ��� >>");
		String ano = scanner.next();	//���� ��ȣ�� ��ǲ �޾Ƽ� ano ������ �Ҵ�. <�޼ҵ� �������� ����ϴ� ��������>
		System.out.println("�̸��� �Է� �ϼ��� >>");
		String owner = scanner.next();
		System.out.println("���� ������ �ʱ� �ݾ��� �Է��ϼ��� >>");
		int balance = scanner.nextInt();
		
		//�� �ʵ��� ������ ����ڷκ��� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����.
		
		Account newAccount = new Account(ano, owner, balance);	//�����ڸ� ���ؼ� ��ü�� �ʵ尪 ������ ��ü ����
		do {
			aSet.add(newAccount);
			System.out.println("���������� ���°� �����Ǿ����ϴ�.");
			if (newAccount.getAno() != ano) {
				System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
				break;
			}
		} while(true);
	}
	
	private static void accountList() {
		//�ڵ� �ۼ� :2. ���� ��� ��� :  �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ� �� ��� 
		//�迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴѰ�� �迭���� ��ü�� ������ �ʵ��� ������ ���
		System.out.println("-------------");
		System.out.println("2. ���¸�� ���");
		System.out.println("-------------");
		
		Iterator<Account> itr = aSet.iterator();
		//Ŭ����<E>   ������ü 	  = Set��ü.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
			System.out.println();
		}
	}
	private static void deposit() {
		//�ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ� : �ش� ���¿� ����. 
		//1. ����ڷκ��� �Ա��� ���¸� �޾ƾ� �Ѵ�.
		//2. ����ڷκ��� ���� ���¹�ȣ�� �迭�� ����� ��ü���� ���¹�ȣ�� Ȯ�� �� �ش� ���¿� �Ա�
		
		System.out.println("---------");
		System.out.println("3. �����ϱ�");
		System.out.println("---------");
		System.out.println("������ ���� ��ȣ�� �Է��ϼ��� >>");
		String ano = scanner.next();
		System.out.println("������ �ݾ��� �Է� �ϼ��� >>");
		int money = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano);	//findAccount(���¹�ȣ)
		
		if (account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return;		//�޼ҵ带 ����
		} 
		account.setBalance(account.getBalance() + money);	//setter�� ����ؼ� ������ �ݾ� + �߰� �Ա�
		System.out.println("��� : ������ ���������� �Ա� �Ǿ����ϴ�.");
		
		
		
	}
	private static void withdraw() {
		//�ڵ� �ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���. 
		
		System.out.println("---------");
		System.out.println("4. ����ϱ�");
		System.out.println("---------");
		System.out.println("����� ���� ��ȣ�� �Է��ϼ��� >>");
		String ano = scanner.next();
		System.out.println("����� �ݾ��� �Է� �ϼ��� >>");
		int money = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano);	//findAccount(���¹�ȣ)
		
		if (account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return;		//�޼ҵ带 ����
		} 
		account.setBalance(account.getBalance() - money);	//setter�� ����ؼ� ������ �ݾ� + �߰� �Ա�
		System.out.println("��� : ������ ���������� ��� �Ǿ����ϴ�.");
		System.out.println("���� �ݾ���" + account.getBalance());
	}
	
	//�迭���� Account ��ü ���� ano[���¹�ȣ] �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	//����, ��ݽ� �����ڵ�, ���� �޼ҵ忡�� �ߺ����� �� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ������ش�.
	private static Account findAccount(String ano) {
		//�ڵ� �ۼ� 
		
		Iterator<Account> ir = aSet.iterator();	
		Account account = ir.next();
		while (ir.hasNext()) {						
			String fAno = account.getAno();
			
			if(fAno == ano) {
				return account;
			} 
			break;
		}
		return account;
		
	}
	
	public static void main(String[] args) {
		boolean run = true; 
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.println("����>>");
			int selectNO = scanner.nextInt(); 
			
			if (selectNO == 1) {
				createAccount() ; 	//�޼ҵ� ȣ��, ��ü �������� �޼ҵ������ ȣ��(static)
			}else if (selectNO == 2) {
				accountList(); 
			}else if (selectNO == 3) {
				deposit(); 
			}else if (selectNO == 4) {
				withdraw(); 
			}else if (selectNO == 5) {
				run = false; 
				//break; 
			}
			
		}
		scanner.close(); 
		System.out.println("���α׷� ����");
		
	}

}
