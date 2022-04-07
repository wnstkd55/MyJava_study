package Chap17.EX08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet : 출력시 정렬되어서 출력. (오름차순 정렬(ascending): 1 --> 9, a --> z , 가 --> 하
			//출력시 검색의 메소드가 지원.
			// 임의의 값을 넣으면 Set에 정렬되어서 저장됨. 출력시에 오름차순으로 정렬되어서 출력
			// Set <= SortedSet <= NavigableSet <= TreeSet
			// TreeSet<String> treeSet = new TreeSet<String>(); 타입을 TreeSet으로 지정해야 정렬/검색 기능을 사용.
			// Set인터페이스의 모든 메소드 사용. 추가적으로 정렬 메소드 / 검색 메소드를 사용 가능

public class TreeSetMethod {

	public static void main(String[] args) {
		//TreeSet은 Set의 모든 메소드 사용 가능
		//TreeSet에 값을 넣었을 경우 오름차순 정렬되어 값이 Set에 저장, 출력시 오름차순 정렬로 출력.
		TreeSet<Integer> treeSet = new TreeSet(); //Type을 TreeSet으로 지정해야 정렬(Sort)과 검색을 사용할수있다.
		for(int i = 50; i>0; i-=2) {	//50, 48, 46, 44 ...2, 0
			treeSet.add(i);		//내부적으로 임의의 값을 넣을때 오름차순으로 정렬되어 값이 저장
		}
		System.out.println(treeSet);
		
		//TreeSet에서만 사용 가능한 메소드(1~15)
		System.out.println("============데이터 검색(가져오기)===============");
		//1. first()	: 제일 처음값을 리턴
		System.out.println(treeSet.first()); 	//2
		//2. last()		: 제일 마지막값을 리턴
		System.out.println(treeSet.last());		//50
		//3. lower(E element):element보다 작은값 출력
		System.out.println(treeSet.lower(26));	//24
		//4. higher(E element) : element보다 큰값 출력
		System.out.println(treeSet.higher(26));	//28
		//5. floor(E element) : element를 포함해서 작은 값을 출력
		System.out.println(treeSet.floor(25));	//24
		System.out.println(treeSet.floor(26));	//26
		//6. ceiling(E element) : element를 포함해서 큰값을 출력
		System.out.println(treeSet.ceiling(25));	//26
		System.out.println("=============데이터 꺼내기====================");
		//7. pollFirse() : 제일 값을 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		for(int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst()); 	//25번 루프돌면서 첫번째 값만 꺼내와서출력
		}
		System.out.println();
		System.out.println(treeSet.size()); 	//0, treeSet의 값이 비어있는 상태
		
		//8. pollLast(): 제일 마지막 값 꺼내오기 
//		for(int i = 50; i>0; i++) {
//			treeSet.add(i);		//오름차순으로 정렬되어 저장.
//		}
//		treeSetSize = treeSet.size();
//		System.out.println(treeSetSize); 	//25
//		System.out.println(treeSet);
//		
//		for (int i = 0; i < treeSetSize; i++) {
//			System.out.println(treeSet.pollLast());
//		}
//		System.out.println();
//		System.out.println(treeSet.size());
		System.out.println("====================정렬====================");
		
		//9.SortedSet<E> headSet(E element) : 정렬을 사용하기 위해서 SortedSet<E> 객체를 생성
			//SortedSet<E> : 정렬된 데이터를 저장하는 Set.
				//headSet(E element) : element의 Head쪽으로의 값을 저장.
			
		for(int i =50; i>0; i-=2) {
			treeSet.add(i);		//오름차순으로 정렬되어서 treeSet에 저장
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet= treeSet.headSet(20);	//headSet(20)은 SortedSet으로 리턴값을 돌려줌.
		//Set<Integer>sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		//10. NavigableSet<E> headSet(E element, boolean inclusive) : element를 포함(true), 미포함(false)
		NavigableSet<Integer> nSet = treeSet.headSet(20,true);
		//Set<Integer>nSet=treeSet.headSet(20,true)
		System.out.println(nSet);
		
		//11. SortedSet<E> tailSet(E element)
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); //시작값은 포함이 기본, 끝값을 미포함이 기본<==<<모든언어에서 동일한 내용>>
		//Set<Integer>sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet(E element,boolean inclusive): element를 포함(true), 미포함(false)해서 tail쪽을 출력
		NavigableSet nSet2 = treeSet.tailSet(20, false);
		System.out.println(nSet2);
		System.out.println("================= 특정범위의 값 가져오기(subSet) ====================");
		
		//13. SortedSet<E> subSet(E element, E element); 특정범위의 값을 set으로 담을때
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3); 	//시작값은 포함, 끝값은 미포함	<==모든 프로그램에서의 기본>
		
		//14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, true);
		System.out.println(nSet4);
		
		System.out.println("================== 반대로 정렬하기 descendingSet() ==================");
		
		//15. NavigableSet<E> descendingSet() : 현재 정렬을 기준으로 반대로 정렬한다. descending <내림차순 정렬>(원래뜻)
		System.out.println(treeSet); //오름차순 정렬
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();	//내림차순 정렬
		//Set<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		NavigableSet<Integer>descendingSet2 = descendingSet.descendingSet();	//오름차순 정렬
		//Set<Integer>descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
	}

}
