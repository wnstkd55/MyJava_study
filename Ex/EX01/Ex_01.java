package Ex.EX01;

class Abc{
	Def d;
	
	Abc(){}
	
	Abc(Def d) {
		this.d = d;
	}
	
	public void setDef(Def d) {
		this.d=d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
	
}

public class Ex_01 {
	public static void main(String[] args) {
		Abc d1 = new Abc();
		d1.d = (Abc.Def)new Abc.Def() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
			
		};
		d1.ghi();
		System.out.println("=============");
		
		Abc d2 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void fly() {
						// TODO Auto-generated method stub
						
					}
				});
		d2.ghi();
		System.out.println("===============");
		
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
