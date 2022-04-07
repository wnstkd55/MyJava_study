package Chap17.EX16;

public class Account {
		      //계좌 정보를 저장하는 객체. 중요한 필드, private (캡슐화),   
			//DTO, VO <== 각계층으로 필드의 값을 저장하고 전달  
			// 객체명 필드접근(x), 생성자(0), getter(0), setter(0)
	private String ano ; 	//계좌 번호
	private String owner;   //계좌 주 , 이름
	private int balance; 	// 통장 금액, 
		
	
	
	Account(String ano, String owner, int balance){   //객체 생성시 필드의 값을 받아서 필드에 로드 
		this.ano = ano ; 
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
	public String toString() {
		return "계좌 번호는 : " + ano + ", 예금주는 : " + owner + ", 예금액은 : " + balance;
	}
	
	
	
}

