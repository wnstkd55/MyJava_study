package chap06_07.EX06;

import chap06_07.EX05.C;
public class EX_C {

	public static void main(String[] args) {
		//�ٸ�Ŭ������ ������		/public�� ����/ model, color �޸𸮷� ���� �Ұ�
		//model�� color�� setter
		
		C car1 = new C();	// �ٸ���Ű�� �̹Ƿ� import
		
		//company, model, color�� �ٸ� ��Ű������ ���� �Ұ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ����
		car1.maxSpeed = 300;//�ٸ� ��Ű���� Ŭ���������� public, protected(��� ����)
		car1.setColor("gold");
		car1.setModel("matiz");
		
		car1.print();
		
		
	}

}
