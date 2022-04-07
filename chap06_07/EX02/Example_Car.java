package chap06_07.EX02;


public class Example_Car {

	public static void main(String[] args) {
		//Car Class를 객체화해서 5개의 객체를 생성해서 값을 할당해서 출력해보세요
		
		//메모리 직접사용
		Car sonata = new Car();
		Car lamborgini = new Car();
		//setter사용(3가지)
		Car cooper = new Car();
		Car k5 = new Car();
		Car matiz = new Car();
		
		
		//각 변수의 값을 할당하고 출력해보세요.(메모리를 직접 사용, setter를 통해서 넣을 수 있음)
		// * 직접할당방법 : 변수의 값을 직접 할당, 권장사항은 아니다. 메모리에 원하지 않는 값을 직접 항달.
		//		sonata.company = "현대"
		//		private 변수명 : 캡슐화, 직접 변수의 값을 할당하지 못하도록함
		// * setter활용 할당방법 : 변수의 입력된값을 제어할 수 있다, Ram의 값을 부여 할때 사용
		//		sonnata.setCompany("hyundai");
		
		sonata.setCompany("hyundai");
		sonata.setModel("sonata");
		sonata.setColor("black");
		sonata.setMaxSpeed(200); 	//-,700값 이상을 넣을수 없도록 제어
		
		lamborgini.setCompany("lamborgini");
		lamborgini.setModel("lamborgini");
		lamborgini.setColor("yellow");
		lamborgini.setMaxSpeed(320);

		cooper.setCompany("cooper");
		cooper.setModel("mini");
		cooper.setColor("red");
		cooper.setMaxSpeed(240);

		k5.setCompany("kia");
		k5.setModel("k5");
		k5.setColor("silver");
		k5.setMaxSpeed(260);

		matiz.setCompany("kia");
		matiz.setModel("matiz");
		matiz.setColor("gold");
		matiz.setMaxSpeed(180);

		//getter는 메모의 값을 출력할때, return이 있기때문에
		System.out.println("==========sonata========");
		System.out.println("회사는: "+sonata.getCompany());
		System.out.println("모델이름은: "+sonata.getModel());
		System.out.println("색깔은: "+sonata.getColor());
		System.out.println("최고속도는: "+sonata.getMaxSpeed());
		System.out.println("======lamborgini========");
		System.out.println("회사는: "+lamborgini.getCompany());
		System.out.println("모델이름은: "+lamborgini.getModel());
		System.out.println("색깔은: "+lamborgini.getColor());
		System.out.println("최고속도는: "+lamborgini.getMaxSpeed());
		System.out.println("==========cooper========");
		System.out.println("회사는: "+cooper.getCompany());
		System.out.println("모델이름은: "+cooper.getModel());
		System.out.println("색깔은: "+cooper.getColor());
		System.out.println("최고속도는: "+cooper.getMaxSpeed());
		System.out.println("============k5==========");
		System.out.println("회사는: "+k5.getCompany());
		System.out.println("모델이름은: "+k5.getModel());
		System.out.println("색깔은: "+k5.getColor());
		System.out.println("최고속도는: "+k5.getMaxSpeed());
		System.out.println("=========matiz==========");
		System.out.println("회사는: "+matiz.getCompany());
		System.out.println("모델이름은: "+matiz.getModel());
		System.out.println("색깔은: "+matiz.getColor());
		System.out.println("최고속도는: "+matiz.getMaxSpeed());
		
		
		
	}

}
