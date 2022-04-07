package Chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : ����ÿ� Key�� �������� �������� ���ĵǾ� �����.
	//��½ÿ� �������� ���ĵǾ� ���.
	//Key�� �Ϲݰ�ü�� �����Ҷ� Comparable<E> compareTo() ������,	<== ��ü ���� �� ��������,
					//Comparator<E> compare()�� ������		<== ��ü ���� ���� ���,

//Map<K,V> <==SortedMap<K,V>(���� �޼ҵ� ����) <== NavigableMap<K,V>(�˻� �޼ҵ� ����) <== TreeMap<K,V>
	//TreeMap�� ����Ҷ��� Ÿ���� TreeMap���� �����ؼ� �˻�, ������ �޼ҵ餩 ����� �� �ִ�.

public class TreeMapMethod_1 {
	public static void main(String[] args) {
		//TreeMap<K,V> �� Map<K,V> �޼ҵ带 ��� ���. �߰������� SortedMap, NavigableMap�� �߰����� �޼ҵ带 ���
		TreeMap<Integer,String> treeMap = new TreeMap();	//������������ ���ĵǾ� �Էµ�.
		
		for(int i=20; i>0; i-=2) {
			treeMap.put(i, i+" ��° ������");
		}
		System.out.println(treeMap);	//Key, Value : Key�� �������� �������� ����
		
		System.out.println("===================  1  =====================");
		//1. firstKey(); : ���� ù��° Ű�� ���
		System.out.println(treeMap.firstKey());	// 2
		
		System.out.println("===================  2  =====================");
		//2. firstEntry(); : [entry = key + value] 
		System.out.println(treeMap.firstEntry());	// 2=2��° ������
		
		System.out.println("===================  3  =====================");
		//3. lastKey() : ���� ������ Ű�� ���
		System.out.println(treeMap.lastKey());
		
		System.out.println("===================  4  =====================");
		//4. lastEntry() : ������ entry [entry = key + value]
		System.out.println(treeMap.lastEntry());	//20=20��° ������
		
		System.out.println("===================  5  =====================");
		//5. lowerKey(K key) : �Է¹���(K) Ű�� ������ ���				
		System.out.println(treeMap.lowerKey(10));	//8
		
		System.out.println("===================  6  =====================");
		//6. highterKey(K key) : �Է¹���Ű�� ���� Ű�ǰ� ���
		System.out.println(treeMap.higherKey(10));	//12
		
		System.out.println("===================  7  =====================");
		//7. pollFirstEntry() : ù��° Ű�� ���� ������ ����.
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap); 		//������ �±� ������ �ٽ� ȣ��� ������ ������ ���ܽ�Ŵ
		
		System.out.println("===================  8  =====================");
		//8. pollLastEntry() : ������ Ű�� ���� ������ ����.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);		//������ �±� ������ �ٽ� ȣ��� ������ ������ ���ܽ�Ŵ
		
		System.out.println("===================  9  =====================");
		//9. SortedMap<K,V> headMap(K toKey) : ��ǲ���� Ű�� head(��)������ ó��
		SortedMap<Integer,String> sMap = treeMap.headMap(8); 	//key8�� ���Խ�Ű�� ����
		System.out.println(sMap);
		
		System.out.println("===================  10  =====================");
		//10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer,String>nMap = treeMap.headMap(8, true);		//key8�� �����ϸ鼭 ,Head������ ���
		System.out.println(nMap);
		
		System.out.println("===================  11  =====================");
		//11. SortedMap<K,V> tailMap (K toKey)
		SortedMap<Integer,String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		System.out.println("===================  12  =====================");
		//12. NavigableMap<K,V> tailMap(K tokey, boolean inclusive)			//������ ������ �⺻, ���� �������� �⺻
		NavigableMap<Integer,String>nMap2 = treeMap.tailMap(14, false);		//true : ���Խ��Ѽ� �������� , false : ���Խ�Ű������ ��������
		System.out.println(nMap2);
		
		System.out.println("===================  13  =====================");
		//13.SortedMap<K,V> subMap(K fromKey, K toKey) : Ư�� ������ ���� ����.
		SortedMap<Integer, String> subMap = treeMap.subMap(6, 10);	//������ ����, ���� �������� �⺻
		System.out.println(subMap);	// 6��° ������, 8��° ������
		
		System.out.println("===================  14  =====================");
		//14. Navigable<K,V> subMap(K fromKey, boolean inclusive ,k toKey, boolean  inclusive)
		NavigableMap<Integer,String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		System.out.println("===================  15  =====================");
		//15.NavigableSet<K> descendingKeySet() : ���� Ű ������ �ݴ�� ���
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		System.out.println("===================  16  =====================");
		//16. NavigableMap<K,V> descendingMap() : ���� ������ �ݴ�� ���
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
