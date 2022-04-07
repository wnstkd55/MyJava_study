package Chap10.EX04;

class Animal2{
	void run() {
		
	}
}

class Tiger extends Animal2{		//호랑이는 네발로 달립니다.
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Eagle extends Animal2{	//독수리는 하늘을 납니다.
	@Override
	void run() {
		System.out.println("독수리는 하늘을 달립니다.");
	}
	void eagleEat() {
		System.out.println("독수리는 다른새를 잡아먹습니다");
	}
}

class Snake extends Animal2{	//뱀은 기어다닙니다.
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
}


public class MethodOverriding_2 {

	public static void main(String[] args) {
		//1. 모든객체는 Animal2 타입으로 업캐스팅해서생성
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		at.run();
		ae.run();
		as.run();
		System.out.println("=======for문을 이용하여 배열 출력============");
		//2. Animal2배열에 각 객체를 저장
		Animal2[] animal = {at, ae, as};		
		//3. for문을 통해서 출력 . run()를 실행
		for (int i = 0; i < animal.length; i++) {
			animal[i].run();
		}
		System.out.println("======enhanced for문을 이용하여 배열 출력==============");
		//4. enhanced for문을 통해서 출력
		for(Animal2 a : animal) {
			a.run();
		}
		//5. 다운 캐스팅해서 (instanceof) 
		Tiger t= (Tiger)at;
		System.out.println(t instanceof Tiger);
		t.tigerEat();
		
		Eagle e = (Eagle)ae;
		System.out.println(e instanceof Eagle);
		e.eagleEat();
		
	}

}
