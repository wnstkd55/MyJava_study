package Chap12.EX09;

public interface Phoneinterface {
	int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("�ΰ� ����մϴ�.");
	}
}
