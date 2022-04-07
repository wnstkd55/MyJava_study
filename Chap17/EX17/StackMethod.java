package Chap17.EX17;

import java.util.Stack;

//Stack �ڷᱸ�� : LIFO(Last In First Out) : ���� �������� ������ ���� ���� ó�� ����.

public class StackMethod {

	public static void main(String[] args) {
		System.out.println("============  1  ============");
		Stack<Integer> stack = new Stack<Integer>();
		
		//1. E push(E element) : ���ÿ� ���� ������ ���.				2�� ���� �ؿ� ����
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		System.out.println();
		
		System.out.println("============  2  ============");
		//2. E peek() : ������ ���� ������ �Ĵٺ�.
		System.out.println(stack.peek()); 		//7�� ���� ���� �ִ�
		System.out.println(stack.size()); 		//4
		System.out.println();
		
		System.out.println("============  3  ============");
		//3. search(Object o) : �˻�(���� �־����� index��ȣ�� ���, ���� : ���ȣ�� ���������� 1������ �Ҵ�ȴ�.)
		System.out.println(stack.search(7)); 		//���ȣ 1 ���� ���������� �ε����� 1�̴�.
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(9)); 		//���� �������� ������ -1�� ����
		System.out.println();
		
		System.out.println("============  4  ============");
		//4. E pop() : ������ ���� ��������, ���� �������� ���� ������ ������ �� �ִ�.
		System.out.println(stack.pop());	//7
		System.out.println(stack.pop());	//3
		System.out.println(stack.pop());	//5
		System.out.println(stack.pop());	//2
		System.out.println();
		System.out.println("============  5  ============");
		System.out.println(stack.empty()); 	//true
	}

}
