package Chap17.EX17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In First Out) : 처음 들어간 값이 처음 나오도록.






public class QueueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		System.out.println("===========    1     ==============");
		//1. 예외처리를 미포함한 메소드 (add(), element(), remove())
			// 1) add() : 큐의 값을 추가할때,
				//System.out.println(queue1.element()); 	//실행시 오류 발생, 예외처리가 안되어있다.
			queue1.add(3);
			queue1.add(4);
			queue1.add(5);
			
			System.out.println("===========  1 - 2  ==============");
			// 2) element() : 
			System.out.println(queue1.element());	 	//제일 처음 나올 값을 확인
			System.out.println();
			
			System.out.println("===========  1 - 3  ==============");
			// 3) E remove() : 큐의 값을 끄집어 낼때 사용.
			System.out.println(queue1.remove()); //3
			System.out.println(queue1.remove()); //4
			System.out.println(queue1.remove()); //5
			//System.out.println(queue1.remove()); //모두 끄집어 내고나서 한번더 끄집어 낼때 예외 발생(오류 발생)
			System.out.println();
			
			System.out.println("===========    2     ==============");
		//2. 예외처리 포함 메소드( offer(), peek(), poll()) <== 권장사항
		Queue<Integer> queue2 = new LinkedList<Integer>();
			
		System.out.println(queue2.peek()); 		//예외처리가 되어 오류가 발생하지 않음
		
			//1) offer(E item) : 값을 추가
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);
			
			System.out.println("===========  2 - 2  ==============");
			//2) E peek() : 출력할값을 미리보기
			System.out.println(queue2.peek());
			System.out.println();
			System.out.println("===========  2 - 3  ==============");
			//3) poll(); 값을 끄집어 내기
			System.out.println(queue2.poll());	//3
			System.out.println(queue2.poll());	//4
			System.out.println(queue2.poll());	//5
			System.out.println(queue2.poll());	//null
		
	}

}
