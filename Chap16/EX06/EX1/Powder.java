package Chap16.EX06.EX1;

//GenericPrinter�� ���� ��ü[���]

public class Powder extends Material{	//�߻� Ŭ������ ���
	public void doPrinting() {		//�߻�޼ҵ带 ������ �޼ҵ�
		System.out.println("�Ŀ�� ���� ����մϴ�.");
	}
	
	@Override
	public String toString() {
		
		return "���� Powder�Դϴ�.";
	}
}
