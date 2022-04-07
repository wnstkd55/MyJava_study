package Chap17.EX12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

//Map<K,V> ���� : K�� �ߺ��� �� ����.
	//1. HashMap			: Key�� �������� ����� �����ϰ� ���, �޼ҵ尡 ����ȭ �ȵ�, �̱۾����� ȯ�濡 ���
	//2. HashTable			: ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�. ��Ƽ ������ ȯ�濡�� ����.
	//3. LinkedHashMap		: �Է� ������� ���.
	//4. TreeMap			: �������� ���ĵǾ� �Է�, Comparable<E>, Comparator<E>


public class MapSummary {

	public static void main(String[] args) {
		//1. HashMap : �Է¼����� ��¼����� �ٸ���.
		Map<String,Integer> hashMap = new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap);
		
		//2. HashTable : �Է¼����� ��¼����� �ٸ���. <����ȭ �Ǿ� �ִ�.> <��Ƽ������ ȯ��>
		Map<String,Integer> hashTable = new Hashtable<>();
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		System.out.println(hashTable);
		
		//3. LinkedHashMap : �Է¼����� ��¼����� ����.
		Map<String,Integer> treeMap = new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(hashTable);
		
		//4. TreeMap : �������� ���ĵǾ� �����.
	}

}
