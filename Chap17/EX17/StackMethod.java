package Chap17.EX17;

import java.util.Stack;

//Stack 자료구조 : LIFO(Last In First Out) : 제일 마지막에 저장한 값이 제일 처음 나옴.

public class StackMethod {

	public static void main(String[] args) {
		System.out.println("============  1  ============");
		Stack<Integer> stack = new Stack<Integer>();
		
		//1. E push(E element) : 스택에 값을 넣을때 사용.				2가 제일 밑에 있음
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		System.out.println();
		
		System.out.println("============  2  ============");
		//2. E peek() : 가져올 값을 위에서 쳐다봄.
		System.out.println(stack.peek()); 		//7이 제일 위에 있다
		System.out.println(stack.size()); 		//4
		System.out.println();
		
		System.out.println("============  3  ============");
		//3. search(Object o) : 검색(값을 넣었을때 index번호를 출력, 주의 : 방번호는 위에서부터 1번부터 할당된다.)
		System.out.println(stack.search(7)); 		//방번호 1 제일 위에서부터 인덱스가 1이다.
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(9)); 		//값이 존재하지 않을때 -1을 리턴
		System.out.println();
		
		System.out.println("============  4  ============");
		//4. E pop() : 스택의 값을 가져오기, 제일 마지막에 넣은 값부터 가져올 수 있다.
		System.out.println(stack.pop());	//7
		System.out.println(stack.pop());	//3
		System.out.println(stack.pop());	//5
		System.out.println(stack.pop());	//2
		System.out.println();
		System.out.println("============  5  ============");
		System.out.println(stack.empty()); 	//true
	}

}
