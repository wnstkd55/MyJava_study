package Chap17.EX11;

//Map<K key ,V value> : Key�� �ߺ����� �ʴ´�. 		<==Set���� �����ȴ�.
//HashMap vs LinkedHashMap
	//HashMap<K,V>	: �Է°� ����� �ٸ� �� �ִ�. ����� �����ϰ� ��µ�
	//LinkedHashMap<K,V> : Key�� ��ũ�Ǿ��ִ�. �տ����� ���ǰ��� ������ ������.
		//�Է� ������� ����� �ȴ�.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		Map<Integer,String> lhMap1 = new LinkedHashMap<>();
		
		System.out.println("===================  1  =====================");
		//1.put(K key, V value) : ���� ������	�Էµ� ������� �ȴ�.
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "������");
		lhMap1.put(3, "�ٶ�");
//		lhMap1.put(3, "������");			//Ű�� �ߺ��ؼ� ������ �� ����. ���� ������� ������ ���� ������ �ȴ�.
		System.out.println(lhMap1);
		
		System.out.println("===================  2  ====================");
		//2. putAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> lhMap2 = new LinkedHashMap();
		lhMap2.putAll(lhMap1);
		System.out.println(lhMap2);
		
		System.out.println("===================  3  ====================");
		//3. replace(K key ,V value); 	:	key�� ����� ���� value�� ����.
		lhMap2.replace(1, "������");
		lhMap2.replace(4, "����");	//key 4�� �������� �ʴ´�. �۵��� �ȵȴ�. (���ܵ� �߻� �ȵ�)
		System.out.println(lhMap2);
		
		System.out.println("===================  4  ====================");
		//4.replace(K key, V oldValue, V newValue)	: oldValue�� newValue�� ����
		lhMap2.replace(1, "������", "������");
		lhMap2.replace(2, "�ٴٴ�", "����");
		System.out.println(lhMap2);
		
		System.out.println("===================  5  ====================");
		//5. get(Object key) : Map�� ���� �����ö�. key�� �־���� Key�� �Ҵ�� Value�� ���.
		System.out.println(lhMap2.get(1));		//���� 1�� index�� �ƴ϶� key�Դϴ�
		System.out.println(lhMap2.get(2));
		System.out.println(lhMap2.get(3));
		
		System.out.println("===================  6  ====================");
		//6. containsKey(Object key); �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println(lhMap2.containsKey(1));	//true
		System.out.println(lhMap2.containsKey(5));	//false
		
		System.out.println("===================  7  ====================");
		//7. containsValue(Object value); �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		System.out.println(lhMap2.containsValue("������"));	//true
		System.out.println(lhMap2.containsValue("�ٴٴ�"));	//false
		
		System.out.println("===================  8  ====================");
		Set<Integer> keySet = lhMap2.keySet();	//lhMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		System.out.println("===================  9  ====================");
		//9. Set<Map.Entry<K,V>> entrySet(): Ű�� ���� ���� ����
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);
		
		System.out.println("===================  10  ====================");
		//10. size(); �� ����
		System.out.println(lhMap2.size());//3
		
		System.out.println("===================  11  ====================");
		//11. remove(Object key)	//Ű�� �־ key��  value�� ����.
		lhMap2.remove(1);		//1�� ����.
		lhMap2.remove(4);		//�������� ����.
		System.out.println(lhMap2);
		
		System.out.println("===================  12  ====================");
		//12. remove (Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ�ؾ� ����
		lhMap2.remove(2, "���ٶ�");	//������
		lhMap2.remove(3, "�ٴٴ�");	//���� ����.
		System.out.println(lhMap2);
		
		System.out.println("===================  13  ====================");
		//13. clear() : ��� ����
		lhMap2.clear();
		System.out.println(lhMap2);
		
		
		
		
		
	}

}
