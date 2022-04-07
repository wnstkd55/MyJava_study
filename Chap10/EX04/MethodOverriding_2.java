package Chap10.EX04;

class Animal2{
	void run() {
		
	}
}

class Tiger extends Animal2{		//ȣ���̴� �׹߷� �޸��ϴ�.
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Eagle extends Animal2{	//�������� �ϴ��� ���ϴ�.
	@Override
	void run() {
		System.out.println("�������� �ϴ��� �޸��ϴ�.");
	}
	void eagleEat() {
		System.out.println("�������� �ٸ����� ��ƸԽ��ϴ�");
	}
}

class Snake extends Animal2{	//���� ���ٴմϴ�.
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
}


public class MethodOverriding_2 {

	public static void main(String[] args) {
		//1. ��簴ü�� Animal2 Ÿ������ ��ĳ�����ؼ�����
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		at.run();
		ae.run();
		as.run();
		System.out.println("=======for���� �̿��Ͽ� �迭 ���============");
		//2. Animal2�迭�� �� ��ü�� ����
		Animal2[] animal = {at, ae, as};		
		//3. for���� ���ؼ� ��� . run()�� ����
		for (int i = 0; i < animal.length; i++) {
			animal[i].run();
		}
		System.out.println("======enhanced for���� �̿��Ͽ� �迭 ���==============");
		//4. enhanced for���� ���ؼ� ���
		for(Animal2 a : animal) {
			a.run();
		}
		//5. �ٿ� ĳ�����ؼ� (instanceof) 
		Tiger t= (Tiger)at;
		System.out.println(t instanceof Tiger);
		t.tigerEat();
		
		Eagle e = (Eagle)ae;
		System.out.println(e instanceof Eagle);
		e.eagleEat();
		
	}

}
