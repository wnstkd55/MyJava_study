package Chap13.EX10.EX2;

class Abc {		//1. 객체 생성후 필드에 직접 값을 할당. (d1)
	//2. 생성자를 통해서 값 할당. (d2)
	//3. setter를 통해서 값 할당.(d3)
	
	Def d;		//필드 블락
				//생성자 블락
				
	Abc(){}		//기본생성자
	Abc(Def d){		//생성자를 통해서 필드의 기본값 할당.
		this.d=d;
	}
	
	interface Def{		//Abc.Def
		void run();
		void fly();
	}
	
	public void setDef(Def d) {
		this.d=d;
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
	
}

public class InnerInterface_1_2 {
	
	public static void main(String[] args) {
		//1. 객체 생성후 필드에 직접 값을 할당. (d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def)new Abc.Def() {

			@Override
			public void run() {
				System.out.println("뛰어다닙니다.1");
				
			}

			@Override
			public void fly() {
				System.out.println("날아다닙니다.1");
				
			}
			
		};
		d1.ghi();
		System.out.println("==========================");
		//2. 생성자를 통해서 값 할당. (d2)
		Abc d2 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						System.out.println("뛰어다닙니다.2");
						
					}
					
					@Override
					public void fly() {
						System.out.println("날아다닙니다.2");
						
					}
				});
		d2.ghi();
		
		
		System.out.println("================");
		//3. setter를 통해서 값 할당.(d3)
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("뛰어다닙니다.3");
				
			}
			
			@Override
			public void fly() {
				System.out.println("날아다닙니다.3");
				
			}
		});
		d3.ghi();
		
	}
	
}
