package Chap17.EX08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set : 중복되지 않는 값을 저장 (equals(), hashCode()메소드를 재정의), Wrapper 클래스는 모두 재정의.
	//1. HashSet	: 출력되는 것이 랜덤하게 출력.
	//2. LinkedHashSet : 입력되는대로 출력
	//3. TreeSet 	: 입력값을 넣으면 내부적으로 정렬. 오름차순 정렬되어 출력.

public class SetSummary {

	public static void main(String[] args) {	
		//1. HashSet				//랜덤으로 출력
		System.out.println();
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		
		System.out.println(hashSet);
		
		//2. LinkedHashSet			//입력된 순서대로 출력
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("다");
		linkedhashSet.add("마");
		linkedhashSet.add("나");
		linkedhashSet.add("가");
		
		System.out.println(linkedhashSet);
		
		//3. TreeSet	<== 정렬하기위해 Comparable<E>, Comparator<E>
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		
		System.out.println(treeSet);
		
	}

}
