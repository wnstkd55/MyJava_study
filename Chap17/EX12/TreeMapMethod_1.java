package Chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : 저장시에 Key를 기준으로 오름차순 정렬되어 저장됨.
	//출력시에 오름차순 정렬되어 출력.
	//Key에 일반객체를 저장할때 Comparable<E> compareTo() 재정의,	<== 객체 수정 및 재컴파일,
					//Comparator<E> compare()를 재정의		<== 객체 수정 없이 사용,

//Map<K,V> <==SortedMap<K,V>(정렬 메소드 정의) <== NavigableMap<K,V>(검색 메소드 정의) <== TreeMap<K,V>
	//TreeMap을 사용할때는 타입을 TreeMap으로 지정해서 검색, 정렬의 메소들ㄹ 사용할 수 있다.

public class TreeMapMethod_1 {
	public static void main(String[] args) {
		//TreeMap<K,V> 은 Map<K,V> 메소드를 모두 사용. 추가적으로 SortedMap, NavigableMap의 추가적인 메소드를 사용
		TreeMap<Integer,String> treeMap = new TreeMap();	//오름차순으로 정렬되어 입력됨.
		
		for(int i=20; i>0; i-=2) {
			treeMap.put(i, i+" 번째 데이터");
		}
		System.out.println(treeMap);	//Key, Value : Key를 기준으로 오름차순 정렬
		
		System.out.println("===================  1  =====================");
		//1. firstKey(); : 제일 첫번째 키를 출력
		System.out.println(treeMap.firstKey());	// 2
		
		System.out.println("===================  2  =====================");
		//2. firstEntry(); : [entry = key + value] 
		System.out.println(treeMap.firstEntry());	// 2=2번째 데이터
		
		System.out.println("===================  3  =====================");
		//3. lastKey() : 제일 마지막 키를 출력
		System.out.println(treeMap.lastKey());
		
		System.out.println("===================  4  =====================");
		//4. lastEntry() : 마지막 entry [entry = key + value]
		System.out.println(treeMap.lastEntry());	//20=20번째 데이터
		
		System.out.println("===================  5  =====================");
		//5. lowerKey(K key) : 입력받은(K) 키의 낮은값 출력				
		System.out.println(treeMap.lowerKey(10));	//8
		
		System.out.println("===================  6  =====================");
		//6. highterKey(K key) : 입력받은키의 높은 키의값 출력
		System.out.println(treeMap.higherKey(10));	//12
		
		System.out.println("===================  7  =====================");
		//7. pollFirstEntry() : 첫번째 키와 값을 끄집어 낸다.
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap); 		//끄집어 냈기 때문에 다시 호출시 끄집어 낸값을 제외시킴
		
		System.out.println("===================  8  =====================");
		//8. pollLastEntry() : 마지막 키와 값을 끄집어 낸다.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);		//끄집어 냈기 때문에 다시 호출시 끄집어 낸값을 제외시킴
		
		System.out.println("===================  9  =====================");
		//9. SortedMap<K,V> headMap(K toKey) : 인풋받은 키의 head(앞)쪽으로 처리
		SortedMap<Integer,String> sMap = treeMap.headMap(8); 	//key8을 포함시키지 않음
		System.out.println(sMap);
		
		System.out.println("===================  10  =====================");
		//10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer,String>nMap = treeMap.headMap(8, true);		//key8을 포함하면서 ,Head쪽으로 출력
		System.out.println(nMap);
		
		System.out.println("===================  11  =====================");
		//11. SortedMap<K,V> tailMap (K toKey)
		SortedMap<Integer,String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		System.out.println("===================  12  =====================");
		//12. NavigableMap<K,V> tailMap(K tokey, boolean inclusive)			//시작은 포함이 기본, 끝은 미포함이 기본
		NavigableMap<Integer,String>nMap2 = treeMap.tailMap(14, false);		//true : 포함시켜서 가져오기 , false : 포함시키지말고 가져오기
		System.out.println(nMap2);
		
		System.out.println("===================  13  =====================");
		//13.SortedMap<K,V> subMap(K fromKey, K toKey) : 특정 범위의 값을 저장.
		SortedMap<Integer, String> subMap = treeMap.subMap(6, 10);	//시작은 포함, 끝은 미포함이 기본
		System.out.println(subMap);	// 6번째 데이터, 8번째 데이터
		
		System.out.println("===================  14  =====================");
		//14. Navigable<K,V> subMap(K fromKey, boolean inclusive ,k toKey, boolean  inclusive)
		NavigableMap<Integer,String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		System.out.println("===================  15  =====================");
		//15.NavigableSet<K> descendingKeySet() : 현재 키 정렬을 반대로 출력
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		System.out.println("===================  16  =====================");
		//16. NavigableMap<K,V> descendingMap() : 현재 정렬을 반대로 출력
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
