package Chap12.EX09;

public class SamsungPhone implements Phoneinterface{

	//�������̽����� ������ �޼ҵ带 �����ߴ�.
	
	@Override
	public void sendCall() {
		System.out.println("�츮��������~");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�Խ��ϴپƾƾƾƾƾƾƾƾƾƾƾ�");
	}

	//�߰����� SamsungPhone���� ����� �߰�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
}
