package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList vs LinkedList
//ArrayList : 값에 대해서 index값을 가지고 있다. 검색 속도가 빠르다.
			//단점 : 중간에서 값을 추가하거나 삭제시 부하가 굉장히 많이 걸린다.
//LinkedList : 각각의 값은 앞뒤의 연결고리만 가지고 있다. 검색시에 index 번호가 할당된다. 검색이 ArrayList에 비해서 느리다.
	//장점 : 중간에 값을 추가/삭제시 부하가 걸리지 않는다.
public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		//1. 데이터를 추가시간 비교.
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime=0, endTime=0;
		
		//1-1 ArrayList에서 데이터 추가 시간
		startTime = System.nanoTime();		//System.nanoTime():
		for(int i =0; i<100000; i++) {
			aList.add(0,i);		// 0번째 방에 계속해서 10만번째까지, 계속 뒤로 밀리면서 값이 추가
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가 시간" + (endTime - startTime)+"ns");
				
		//1-2 LinkedList에서 데이터추가시간
		startTime = System.nanoTime();
		for(int i = 0 ; i < 100000 ; i++) {
			linkedlist.add(0,i);
		}
		endTime=System.nanoTime();
		System.out.println("linkedList에서 데이터 추가 시간" + (endTime - startTime)+"ns");
				//더 빠르다
		System.out.println("===========================================");
		
		//2. 검색시 비교 : ArrayList가 LinkedList보다 빠르다.
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			aList.get(i);		// 0번째 방에 계속해서 10만번째까지, 계속 뒤로 밀리면서 값이 추가
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 검색 시간" + (endTime - startTime)+"ns");
		
		//2-2 LinkedList검색시간
		startTime = System.nanoTime();
		for(int i = 0 ; i < 100000 ; i++) {
			linkedlist.get(i);
		}
		endTime=System.nanoTime();
		System.out.println("linkedList에서 데이터 검색 시간" + (endTime - startTime)+"ns");
		System.out.println("============================================");
		
		//3. 데이터 삭제시 실행시간 비교. : LinkedList가 훨씬 빠르다.
		//3-1. ArrayList
		startTime = System.nanoTime();
		for(int i = 0 ; i < 100000; i++) {
			aList.remove(0);		//index 0번째 자리를 제거, 값이 당겨온다.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 삭제 시간" + (endTime - startTime)+"ns");
		
		//3-2. linkedList
		startTime = System.nanoTime();
		for(int i = 0 ; i < 100000; i++) {
			linkedlist.remove(0);		//index 0번째 자리를 제거, 값이 당겨온다.
		}
		endTime = System.nanoTime();
		System.out.println("linkedList에서 데이터 삭제 시간" + (endTime - startTime)+"ns");
		
		
	
	
	
	
	
	
	
	}

}
