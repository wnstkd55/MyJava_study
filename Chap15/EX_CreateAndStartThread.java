package Chap15;

/*
 	쓰레드 4개 생성 : 1 - Thread를 상속 2 - Runnable 구현 3,4 - 익명 내부클래스를 생성해서 구현
 	각 값을 String배열에 저장후 아래와 같이 출력
 	
 	1		2		3		4
 	이름		홍길동	이순신	심사임당
 	나이		40		50		60
 	국어		100		90		80
 	영어		70		60		100
 	수학		50		70		80
 	
 */

class personInfo extends Thread{
	public void run() {
		String[] strArray= {"T_1","이름","나이","국어","영어","수학"};
		
		//출력 구문
//		try {Thread.sleep(20);} catch(InterruptedException e1) {}
			for(int i=0; i<strArray.length; i++) {
				System.out.println(" "+strArray[i]+"\t");
			
		//0.2를 지연후 출력.
			try {Thread.sleep(200);}catch(InterruptedException e) {}
			}	
	}
}

class hongInfo implements Runnable{
	@Override
	public void run() {
		String[] strArray= {"홍길동","40","100","70","50"};
		
		//출력 구문
			try {Thread.sleep(20);} catch(InterruptedException e) {}
			for(int i=0; i<strArray.length; i++) {
				System.out.println(" "+strArray[i]);
			
		//0.2를 지연후 출력.
			try {Thread.sleep(500);}catch(InterruptedException e1) {}
			}	
		
	}
}

public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		Thread cata = new personInfo();
		
//		System.out.println();
		
		Runnable hong = new hongInfo();
		Thread thread1 = new Thread(hong);
		
//		System.out.println();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = {"이순신","50","90","60","70"};
				try {Thread.sleep(20);} catch(InterruptedException e) {}	//0.01초 딜레이
				for(int i =0; i < strArray.length; i++) {
					System.out.print(" "+strArray[i]);
				try {Thread.sleep(500);} catch(InterruptedException e2) {}	//0.2초 딜레이
			}
				};
				
			}
		);
		
		System.out.println();
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = {"심사임당","60","80","100","80"};
				try {Thread.sleep(20);} catch(InterruptedException e) {}	//0.01초 딜레이
				for(int i =0; i < strArray.length; i++) {
					System.out.println(" "+strArray[i]);
				try {Thread.sleep(500);} catch(InterruptedException e3) {}	//0.2초 딜레이
			}
				};
				
			}
		);
		cata.run();
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
