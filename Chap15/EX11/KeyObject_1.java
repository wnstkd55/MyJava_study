package Chap15.EX11;

/*
   	여러 쓰레드가 공유된 필드에 접근할때 동시성의 문제가 발생.  ====> 동기화는 동시성 문제를 해결하는 방법
    
 	동기화 : 여러 쓰레드가 공유된 필드를 접근할때 하나의 쓰레드가 완료되면 다른 쓰레드에서 접근이 가능.
 		하나의 쓰레드가 사용중인 경우 lock을 걸고 작업이 완료되면 다른 쓰레드가 접근가능하도록 lock 해제
 		
 		- 모든 동기화된 메소드는 this라는 키만 가진다.
 		- 여러 메소드가 동기화된 메소드일 경우 : 하나의쓰레드만 접근이 가능
 */
class MyData{	//공유 객체 : 여러 쓰레드가 공유 객체에 접근
		//동기화된 메소드는 key값이 모두 this가 자동으로 등록, 수정 불가.
			//동기화 메소드는 key값을 넣을 수 없다.
			//하나의 쓰레드가 접근할때 Key를 가지고 동기화된 메소드를 접근 가능하다.
			//Key는 객체를 키로 사용 가능.
		//동기화 블록은 Key값을 임의로 할당 가능.
	 synchronized void abc() {	//여러쓰레드가 접근할때 동시성 문제를 방지하기 위해서 동기화 처리
		for(int i = 0; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e1) {} 	//0.01초 딜레이
			System.out.println(i+"sec"); 	
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	//1초 딜레이
		}
	}
	 synchronized void bcd() {	//여러쓰레드가 접근할때 동시성 문제를 방지하기 위해서 동기화 처리
		 try {Thread.sleep(20);} catch (InterruptedException e1) {} 	//0.02초 딜레이
		for(int i = 0; i < 3; i++) {
			System.out.println(i+"초"); 	
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	//1초 딜레이
		}
	}
	 synchronized void cde() {	//여러쓰레드가 접근할때 동시성 문제를 방지하기 위해서 동기화 처리
		 try {Thread.sleep(30);} catch (InterruptedException e1) {} 	//0.03초 딜레이
		for(int i = 0; i < 3; i++) {
			System.out.println(i+"번째"); 	
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	//1초 딜레이
		}
	}
	
	
}


public class KeyObject_1 {

	public static void main(String[] args) {
		
		//공유 객체
		MyData mydata = new MyData();
		
		//세개의 쓰레드가 각각 메소드 호출
		new Thread() {						//익명 클래스 : 쓰레드 클래스를 구현하는 자식 익명 클래스
			public void run(){
				mydata.abc();		//첫버째 쓰레드 abc()메소드 호출
			};
		}.start();
		
		new Thread() {						//익명 클래스 : 쓰레드 클래스를 구현하는 자식 익명 클래스
			public void run(){
				mydata.bcd();		//두번째 쓰레드 bcd()메소드 호출
			};
		}.start();
		
		new Thread() {						//익명 클래스 : 쓰레드 클래스를 구현하는 자식 익명 클래스
			public void run(){
				mydata.cde();		//세번째 cde()메소드 호출
			};
		}.start();
		
	}

}


// 동시성의 문제점 =====>// 하나의 쓰레드가 점유하고있으면 다른 쓰레드가 접근할 수없다.
					// 





