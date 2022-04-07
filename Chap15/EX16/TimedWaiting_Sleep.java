package Chap15.EX16;

//Thread.sleep(1000) ===> TimedWaiting 상태로 이동 ===> 특정 시간(1초)이 경과되면 Runnable상태로 이동
											//		==> 인터럽트가 발생되면 예외를 발생시키고 Runnable
//인스턴스명(객체명)[a].join(1000) ===> TimedWaiting 상태로 이동 ==> 특정 시간(1초)이 경과되면 Runnable상태로 이동
	//a.join(1000)	: 자신의 쓰레드는 1초를 기다리고 a객체에게  CPU할당(Runnable), 
					// 1초 뒤에는 자신의 쓰레드도 RUNNABLE
//참고) 인스턴스명(객체명)[a]. join()	==> Waiting 상태로 이동. ==> 
			//자신의 쓰레드는 잠시 Waiting 상태로 가고 a객체에게 CPU(RUNNABLE) 사용하도록 할당.
			// a객체가 모두 완료된 경우 자신의 쓰레드도 RUNNABLE

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);		//3초동안 TimedWaiting 상태로 진입
		} catch (InterruptedException e) {
			System.out.println("---sleep() 진행중 Interrupt 발생");
			for(long i = 0; i < 100000000L; i++) {	}//0.5초 딜레이 시간지연
				
			
		}
		
	}
}

public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();	//RUNNABLE
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}		//쓰레드 시작 준비 시간
		System.out.println("MyThread state: " + myThread.getState());	//TIMED_WAITING
		
		//3초 이전에 인터럽트 강제 발생.
		myThread.interrupt();  //TIMED_WAITING상태
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread state2: "+myThread.getState()); 	//runnable상태
	}

}
