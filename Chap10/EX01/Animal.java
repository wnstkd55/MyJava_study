package Chap10.EX01;

class Tiger extends Animal{
	int leg;
	
	void tigerEat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��ƸԽ��ϴ�.");
	}
	
}

class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("���� ��ļ��Դϴ�.");
	}
}

class Eagle extends Animal{
	int eagle;
	
	void eagleEat() {
		
		System.out.println("�������� ����ٴմϴ�.");
	}
}

class Dog_sub extends Dog{
	
	int dog_sub;
	
	void dog_sub() {
		System.out.println("Dog�� �ڽ�Ŭ�����Դϴ�.");
	}
}

public class Animal {
	String name;	//������ �̸�
	int age;		//������ ����
	String color;	//������ ����
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�.");
	}
	
	
	
	public static void main(String[] args) {
		
		//��ĳ������ ���������� �����͸�ó���ϱ� ������ ���� ���� ȿ��������  ���α׷����� ó��.
			//������ : �������̵��� �̿��ؼ� ��ӿ��� �ϳ��� �޼ҵ�� ���� ������ ó��....
		
		//1. Animal Ŭ���� ��üȭ
		Animal a = new Animal();
		a.name = "ȣ����";
		a.age = 12;
		a.color = "yellow";
		a.eat();
		a.sleep();
		
		System.out.println("====================");
		
		//2. Dog Ŭ������ DogŸ������ ��üȭ
		Dog d1 = new Dog();		//Animal, Dog�� �ʵ�� �޼ҵ带 ������ �� �ִ�.
		//3. Dog�� AnimalŸ������ ��ĳ����
		Animal a2 = new Dog();		// Dog�� AnimalŸ�԰� DogŸ���� �����ϰ� �ְ�, Animal�� �ʵ�� �޼ҵ常 ���� ����
		
		//4. Dog_sub�� AnimalŸ������ ��ĳ����
		Animal a3 = new Dog_sub();	//Animal, Dog, Dog_sub�� �����ϰ� �ְ�, Animal�� �ʵ�� �޼ҵ带 ������ �� �ִ�.
			a3.name = "��ũ���׸���";	//Animal
			a3.color = "white";	//Animal
			//a3.dog=6;	//(���ٺҰ�)
		//5. Dog_sub�� Dog������ Ÿ������ ��ĳ����
		Dog d2 = new Dog_sub();		//d2�� Animal, Dog, Dog_sub�� �����ϰ�, Animal�� Dog�� �ʵ�� �޼ҵ带 ������ �� �ִ�. 
			d2.name = "����Ʈ";	//Animal
			d2.dog = 5;			//Dog
			//d2.dog_sub = 3;		//Dog_sub�� �����Ҽ� ����.
			
		//6. Dog_sub�� Dog_sub������ Ÿ������ ��üȭ
		Dog_sub ds1 = new Dog_sub();
			//ds1�� Animal, Dog, Dog_sub�߿� Animal, Dog, Dog_sub�ʵ�� �޼ҵ带 ��� ��� ����
			ds1.name = "������";		//Animal Ŭ������ �ʵ�
			ds1.age=4;		//Animal
			ds1.dog=3;		//Dog
			ds1.dog_sub = 2;	//Dog_sub
			
	//��ӿ��� ��ĳ����, �ٿ�ĳ����
			
		//��ĳ���� : �ڽ�Ÿ���� ������ Ÿ�Կ��� �θ� ������ Ÿ������ ��ȭ
			//�θ�Ÿ���� �ʵ�� �޼ҵ常 ����.
			//���� Ÿ�� ��ȯ ���� �ڵ����� ��ĳ���� ��.
			//ds1�� Dog_sub�� ������ Ÿ���� ������ �ִ�.(Animal, Dog, Dog_sub�� ��� �ʵ�� �޼ҵ� ������ ����)
			
			Dog ds1_c1 = ds1;	//��ĳ���� : Dog_sub ====>Dog Ÿ������ ��ĳ����(Animal, Dog�� ���� ����)
				Dog ds2_c1 = (Dog)ds1;	//<==���� Ÿ�� ��ȯ
			Animal ds1_c2 = ds1;	//��ĳ���� : Dog_sub ===> Animal Ÿ������ ��ĳ����(Animal)
						//(Animal)Ÿ�Ժ�ȯ ����
			
			//ds1 : Dog_sub(Animal, Dog,Dog_sub)
			//ds1_c1: Dog  (Animal, Dog)
			//ds1_c2: Animal(Animal)
			
		//�ٿ� ĳ���� : �θ����� Ÿ���� �ٽ� �ڽĵ����� Ÿ������ ��ȯ
			//������ Ÿ�� ��ȯ�� �ʿ���.
			//a3�� (Animal, Dog, Dog_sub) AnimalŸ�Ը� �� �� �ֵ��� ��ĳ���� �Ǿ��ִ�.
			Dog a3_down1 = (Dog)a3;	//a3 [Animal] ==> a3_down1[Dog]
			Dog_sub a3_down2 = (Dog_sub)a3;	//a3[Animal] ==> a3_down2[Dog_sub]
			
			
			
	}

}
