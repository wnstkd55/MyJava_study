package chap06_07.EX03;

class Car{
	String company;		//�ʵ�(�ν��Ͻ��ʵ�)�� company�� �˷��ִ� this, Heap�޸𸮿� ����
	String model;			//�ν��Ͻ� : ��üȭ�������� ��� ������ �ʵ�.
	String color;			//[�ʵ�� : �ʵ��� ��]�� Heap ������ ����
	double maxSpeed;
	
	
	
	Car(String c, String mo, String co, double m){
		this.company = c;		//this Ű�� ��ü�� �ʵ��� ������ ���Ѵ�.
		this.model = mo;		//3���� ���� ��ΰ� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ����
		this.color = co;
		maxSpeed = m;			//this �����Ҽ��ִ�.(�ٸ���)
	}
	
	void work() {					//�޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap������ �޼ҵ��� �����͸� �����ϰ��ִ�.
		System.out.print(company);		//�޼ҵ��� ��ü ������ class������ �޼ҵ� ������ ����
		System.out.print(model);
		System.out.print(color);
		System.out.println(maxSpeed);
	}
}

public class Q1 {
	public static void main(String[] args) {
		//�����ڸ� ���ؼ� �⺻���� �Ҵ� �� �޸𸮿� ������ work() �޼ҵ带 ����ؼ� ���
		
		Car car = new Car("kia ","k7 ","black ",240);
		Car car2 = new Car("bmw ","x7 ","red ",300);
		car.work();
		System.out.println("=================");
		
		car2.work();
		
	}
}
