package Ex.JJ;



import java.util.Scanner;


class Account{
	private String ano;  //���¹�ȣ
	private String owner; // ������(�̸�)
	private int balance; // ���� �ݾ�, 
	
	public Account(String ano,String owner, int balance) {
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
		return "���� ��ȣ : " + ano + " ���� ������ : " + owner + " �ݾ� : " + balance;
	}
}

public class BankAccountUsingArray {
	
	// 1. �Ϲ� �迭����ؼ� Account ��ü ���
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount(){
		// �ڵ� �ۼ� : 1. ���� ������ �迭�� ���� (��ĳ�ʷ� Account�� ������ ���� ��ǲ�ޱ�-> �迭 ��ü�� ����)
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String ano_sc = scanner.next();
		System.out.println("�����ָ� �Է��ϼ���");
		String owner_sc = scanner.next();
		System.out.println("�ݾ��� �Է��ϼ���");
		int balance_sc = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null) {            // i ��°�� �迭 �ڸ��� ���������
	            accountArray[i] = new Account(ano_sc, owner_sc, balance_sc);   //���� �ִ´�.
	         System.out.println("���� ���� �Ϸ�");
	         break;
	         }
		}
	}

	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��¹迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
//		for (int i = 0; i < accountArray.length; i++) {
//			
//			if (accountArray[i] == null) {
//				break;
//			}else {
//				System.out.println(Arrays.toString(accountArray)); 		//Arrays => accountArray[i]�� �ٲٱ�
//			}
//		}
		for (int i = 0; i < accountArray.length; i++) {
			
			if (accountArray[i] == null) {
				break;
			}else {
				System.out.println(accountArray[i].toString());
			}
		}
	}


	private static void deposit() {
		// �ڵ� �ۼ�: 3. ���� <== ���� ��ȣ�� input �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ� , �Ա� �ݾ��� input�޾Ƽ� �ش� ���¿� ����
		System.out.println("���� ��ȣ�� �Է��ϼ���>>>");
		String ano_sc = scanner.next(); //���¹�ȣ input
		System.out.println("�Ա� �ݾ��� �Է��ϼ���>>>");
		//String money_sc = scanner.next();		//���� String ���ڿ��� �ƴ� int ���������� ��ġ��
		int money_sc = scanner.nextInt();
		
		
			
		if(findAccount(ano_sc)==null) {
			System.out.println("���¹�ȣ�� �ٸ��ϴ�.");
		}else {
			findAccount(ano_sc).setBalance(findAccount(ano_sc).getBalance()+money_sc);
		}
		
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. �����ܾ���"+findAccount(ano_sc).getBalance());
		
		
		
		
	}
	private static void withdraw() {
		// �ڵ��ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ�޾Ƽ� �ش� ���¸� ��ü���� ã�Ƽ� ���
		System.out.println("���� ��ȣ�� �Է��ϼ���>>>");
		String ano_sc = scanner.next(); //���¹�ȣ input
		System.out.println("��� �ݾ��� �Է��ϼ���>>>");
		//String money_sc = scanner.next();
		int money_sc = scanner.nextInt();
		
		if(findAccount(ano_sc)==null) {
			System.out.println("���¹�ȣ�� �ٸ��ϴ�.");
		}else {
			findAccount(ano_sc).setBalance(findAccount(ano_sc).getBalance()-money_sc);
		}
		
		System.out.println("����� �Ϸ�Ǿ����ϴ�. �����ܾ���"+findAccount(ano_sc).getBalance());
		
	}
	//�迭���� Account��ü ���� ano(���¹�ȣ)�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������
	private static Account findAccount(String ano_sc) {
		Account account = null;
		//�ڵ��ۼ�
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			if (accountArray[i].getAno().equals(ano_sc)) {
				return accountArray[i];
			}
		}
		return account;
		
	}
	
	
	

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1. ���� ���� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-----------------------");
			System.out.println("����>>>");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				
				createAccount(); //�޼��� ȣ��
			}else if (selectNo == 2) {
				accountList();
			}else if(selectNo == 3){
				deposit();
			}else if(selectNo == 4){
				withdraw();
			} else if (selectNo == 5) {
				break;
			}

	}
		
		
		
		scanner.close();
		System.out.println("���α׷� ����");
	}
}