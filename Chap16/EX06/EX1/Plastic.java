package Chap16.EX06.EX1;

//GenericPrinter�� ���� ��ü[���]

public class Plastic extends Material{
	
	public void doPrinting() {		//�߻� �޼ҵ��� Ŭ������ ������ �޼ҵ�
		System.out.println("�ö�ƽ ���� ����մϴ�.");
	}
	
	@Override
	public String toString() {
		
		return "���� �ö�ƽ�Դϴ�.";
	}
	
}
