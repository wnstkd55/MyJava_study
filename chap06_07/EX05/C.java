package chap06_07.EX05;

public class C {	//�ٸ� ��Ű������ import����

	//�ʵ忡 �ο��Ǵ� ���� ������
	private String company = "�����ڵ��� ";		//ȸ���
	String model ; 	//��, default
	protected String color;	//����
	public int maxSpeed;	//�ִ�ӵ�
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("company: "+company+"/ model: "+model+"/ color: "+color+"/ maxSpeed: "+maxSpeed);
	}

	
}
