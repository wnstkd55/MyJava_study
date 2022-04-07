package Chap13.EX10.EX2;

class Abc {		//1. ��ü ������ �ʵ忡 ���� ���� �Ҵ�. (d1)
	//2. �����ڸ� ���ؼ� �� �Ҵ�. (d2)
	//3. setter�� ���ؼ� �� �Ҵ�.(d3)
	
	Def d;		//�ʵ� ���
				//������ ���
				
	Abc(){}		//�⺻������
	Abc(Def d){		//�����ڸ� ���ؼ� �ʵ��� �⺻�� �Ҵ�.
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
		//1. ��ü ������ �ʵ忡 ���� ���� �Ҵ�. (d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def)new Abc.Def() {

			@Override
			public void run() {
				System.out.println("�پ�ٴմϴ�.1");
				
			}

			@Override
			public void fly() {
				System.out.println("���ƴٴմϴ�.1");
				
			}
			
		};
		d1.ghi();
		System.out.println("==========================");
		//2. �����ڸ� ���ؼ� �� �Ҵ�. (d2)
		Abc d2 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						System.out.println("�پ�ٴմϴ�.2");
						
					}
					
					@Override
					public void fly() {
						System.out.println("���ƴٴմϴ�.2");
						
					}
				});
		d2.ghi();
		
		
		System.out.println("================");
		//3. setter�� ���ؼ� �� �Ҵ�.(d3)
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("�پ�ٴմϴ�.3");
				
			}
			
			@Override
			public void fly() {
				System.out.println("���ƴٴմϴ�.3");
				
			}
		});
		d3.ghi();
		
	}
	
}
