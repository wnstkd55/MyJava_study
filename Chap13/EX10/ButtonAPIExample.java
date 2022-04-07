package Chap13.EX10;

class Button{
	//OnClckListener : ��ü Ÿ��, ocl : ���� ����
	OnClickListener ocl;		//ocl �⺻������ null
	
	
	
	//setter�� ���ؼ� OnClickListener�� ���� ���� ocl�� ��ü�ּҸ� ��´�.
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	//�������̽��� �����ϰ� ������ �ڽ� Ŭ������ �������� �ʴ´�.
	//ȣ���ϴ°����� OnClick()�޼ҵ带 �������ؼ� ȣ��
	interface OnClickListener{//InnerInterface, static, Button.OnClickListener :
		void onClick(); 		//�޼ҵ� ���𸸵�. �������� �������̵��ؼ� ������
	}
	void click() {		//���������� ocl.onClick()�� ȣ��
		ocl.onClick();		//ocl : �������� : null ==> set 
		System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		//������ 1 : Ŭ���� �������
		Button button1 = new Button();		//��ư ��ü ����
		
		//A.B = new A.B(){�̳��������̽�B�� �޼ҵ带 �������ڵ�};
			//OnClickListener ��üŸ������ ��ü ���� �Ű������� ����
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������1. �������");
			}
		}
		
				);
		button1.click();
		
		System.out.println("=================================");
		//������ 2 : Ŭ���� ���̹� ����
		Button button2 = new Button();
		//setOnClickListener �޼ҵ忡 �Ű������� OnClickListener�� ���� �͸�ü�� ������
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������2. ���̹� ����");
				
			}
		});
		button2.click();
	}

}
