package chap06_07.EX02;


public class Example_Car {

	public static void main(String[] args) {
		//Car Class�� ��üȭ�ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ��ؼ� ����غ�����
		
		//�޸� �������
		Car sonata = new Car();
		Car lamborgini = new Car();
		//setter���(3����)
		Car cooper = new Car();
		Car k5 = new Car();
		Car matiz = new Car();
		
		
		//�� ������ ���� �Ҵ��ϰ� ����غ�����.(�޸𸮸� ���� ���, setter�� ���ؼ� ���� �� ����)
		// * �����Ҵ��� : ������ ���� ���� �Ҵ�, ��������� �ƴϴ�. �޸𸮿� ������ �ʴ� ���� ���� �״�.
		//		sonata.company = "����"
		//		private ������ : ĸ��ȭ, ���� ������ ���� �Ҵ����� ���ϵ�����
		// * setterȰ�� �Ҵ��� : ������ �ԷµȰ��� ������ �� �ִ�, Ram�� ���� �ο� �Ҷ� ���
		//		sonnata.setCompany("hyundai");
		
		sonata.setCompany("hyundai");
		sonata.setModel("sonata");
		sonata.setColor("black");
		sonata.setMaxSpeed(200); 	//-,700�� �̻��� ������ ������ ����
		
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

		//getter�� �޸��� ���� ����Ҷ�, return�� �ֱ⶧����
		System.out.println("==========sonata========");
		System.out.println("ȸ���: "+sonata.getCompany());
		System.out.println("���̸���: "+sonata.getModel());
		System.out.println("������: "+sonata.getColor());
		System.out.println("�ְ�ӵ���: "+sonata.getMaxSpeed());
		System.out.println("======lamborgini========");
		System.out.println("ȸ���: "+lamborgini.getCompany());
		System.out.println("���̸���: "+lamborgini.getModel());
		System.out.println("������: "+lamborgini.getColor());
		System.out.println("�ְ�ӵ���: "+lamborgini.getMaxSpeed());
		System.out.println("==========cooper========");
		System.out.println("ȸ���: "+cooper.getCompany());
		System.out.println("���̸���: "+cooper.getModel());
		System.out.println("������: "+cooper.getColor());
		System.out.println("�ְ�ӵ���: "+cooper.getMaxSpeed());
		System.out.println("============k5==========");
		System.out.println("ȸ���: "+k5.getCompany());
		System.out.println("���̸���: "+k5.getModel());
		System.out.println("������: "+k5.getColor());
		System.out.println("�ְ�ӵ���: "+k5.getMaxSpeed());
		System.out.println("=========matiz==========");
		System.out.println("ȸ���: "+matiz.getCompany());
		System.out.println("���̸���: "+matiz.getModel());
		System.out.println("������: "+matiz.getColor());
		System.out.println("�ְ�ӵ���: "+matiz.getMaxSpeed());
		
		
		
	}

}
