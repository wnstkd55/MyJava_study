package Chap15.EX19;

//Waiting : 
	//a.join () : 자신의 쓰레드는 Waiting 상태이고 a 객체에게 CPU(Runnable)
			//a 객체가 실행이 완료되면 자신의 쓰레드가  RUNNABLE로 감
		//자신 쓰레드의 처리할 내용이 다른 쓰레드의 결과를 받아서 처리해야할 경우
	//wait(), notify(), notifyAll()	 <=== 동기화 블락에서만 사용됨.
	// - wait() : 동기화 블럭(메소드) 내에서 wait()메소드를 만나면 Waiting상태로 진입.
	// - notify(), notifyAll()가 wait()메소드를 깨워줌. <== 반드시 다른 쓰레드에서 꺠워줄수잇다.

class DataBox{
	int data;		//공유 필드
	synchronized  void inputData(int data) {		//동기화 메소드
		this.data = data;
		System.out.println("입력 데이터: "+data);			// data : 매개변수 값으로 들어온 데이터
	}
	synchronized void outputData() {				//동기화 메소드
		System.out.println("출력 데이터: "+data);			// data : 메모리의 data, this생략되어있음.
	}
}

public class Waiting_WaitNotify_1 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		//첫번째 쓰레드 : 공유 객체에 값을 넣는 쓰레드
		Thread t1 = new Thread() {		//익명 내부 클래스
			public void run() {
				for(int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			};		
		};
		
		//두번째 쓰레드
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			};		//익명 내부 클래스
		};
		
		t1.start();
		t2.start();
	}

}
