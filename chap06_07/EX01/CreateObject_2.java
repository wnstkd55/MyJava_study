package chap06_07.EX01;

class Aaa{
	String name;		//�ʵ�(Ŭ���� �޼��� �ܿ� ����� ������) : ��üȭ���Ѿ� ��� ����, Ŭ���� ������ ����
	int age;				//�ʵ��� ������ Heap������ ����, Heap������ ������ ������ ���� �ʱ�ȭ
	double weight;
	String email;			//�ʵ�� ���� �ǰ� ���� �Ҵ��� ���� ���� ��� : 
	boolean man;			//�������� : Null, int : 0, double : 0.0, boolean :false
	
	public String getName() {		//�޼ҵ� 
		return name;
	}
	public void setName(String name) {	//��ǲ�Ǵ� ����, �޴� �����̸�, �޸� �̸��� ��� ������ ���
		this.name = name;				//�޸� �̸��� this: �ڽ��� Ŭ������ ����
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
	
	
}

public class CreateObject_2 {

	public static void main(String[] args) {
		
		Aaa aaa = new Aaa();	//��ü����(aa)
		
		//�ʵ��� �ʱⰪ�� ���
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.email);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println("================");
		
		//������ ���� ���� ����[Heap], ���Ȼ� �޸𸮿� ���� ���� �Ҵ����� �ʴ´�.
		aaa.name="ȫ�浿";
		aaa.age=30;
		aaa.email="aa@aaaa.com";
		aaa.weight = 70.5;
		aaa.man=true;
		
		//������ ���� ���
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.email);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);	
		System.out.println("==================");
		//setter�� ���ؼ� ���� ���� , �޸𸮿� ���� ������ ��� �� �� �ִ�.
			//���� �����ϴ� ����(1~12��)
		aaa.setName("�������");
		aaa.setAge(60);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(true);
		aaa.setWeight(70.5);
		
		//getter�� ���ؼ� �޸��ǰ��� ���
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getClass());
		System.out.println(aaa.getWeight());
		
		//�ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���.
		
		Aaa bbb = new Aaa();
		Aaa ccc =  new Aaa();
	}

}
