package Chap17.EX17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In First Out) : ó�� �� ���� ó�� ��������.






public class QueueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		System.out.println("===========    1     ==============");
		//1. ����ó���� �������� �޼ҵ� (add(), element(), remove())
			// 1) add() : ť�� ���� �߰��Ҷ�,
				//System.out.println(queue1.element()); 	//����� ���� �߻�, ����ó���� �ȵǾ��ִ�.
			queue1.add(3);
			queue1.add(4);
			queue1.add(5);
			
			System.out.println("===========  1 - 2  ==============");
			// 2) element() : 
			System.out.println(queue1.element());	 	//���� ó�� ���� ���� Ȯ��
			System.out.println();
			
			System.out.println("===========  1 - 3  ==============");
			// 3) E remove() : ť�� ���� ������ ���� ���.
			System.out.println(queue1.remove()); //3
			System.out.println(queue1.remove()); //4
			System.out.println(queue1.remove()); //5
			//System.out.println(queue1.remove()); //��� ������ ������ �ѹ��� ������ ���� ���� �߻�(���� �߻�)
			System.out.println();
			
			System.out.println("===========    2     ==============");
		//2. ����ó�� ���� �޼ҵ�( offer(), peek(), poll()) <== �������
		Queue<Integer> queue2 = new LinkedList<Integer>();
			
		System.out.println(queue2.peek()); 		//����ó���� �Ǿ� ������ �߻����� ����
		
			//1) offer(E item) : ���� �߰�
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);
			
			System.out.println("===========  2 - 2  ==============");
			//2) E peek() : ����Ұ��� �̸�����
			System.out.println(queue2.peek());
			System.out.println();
			System.out.println("===========  2 - 3  ==============");
			//3) poll(); ���� ������ ����
			System.out.println(queue2.poll());	//3
			System.out.println(queue2.poll());	//4
			System.out.println(queue2.poll());	//5
			System.out.println(queue2.poll());	//null
		
	}

}
