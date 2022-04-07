package Chap17.EX09;

//Map<K,V> : K <= Key, V <=Value�������� �����͸� ����
	//Key�� �ߺ��� �� ����. <==Set���� ����.		index�� �ƴϴ�. index�� 0���� �Ҵ�, JVM�� �Ҵ���
	//Value�� �ߺ��� ���� ���� �� �ִ�.
	
	//HashMap : ����� �����ϰ� ���.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		Map<Integer,String> hMap1 = new HashMap();
		
		System.out.println("===================  1  =====================");
		//1.put(K key, V value) : ���� ������
		hMap1.put(2, "���ٶ�");
		hMap1.put(1, "������");
		hMap1.put(3, "�ٶ�");
//		hMap1.put(3, "������");			//Ű�� �ߺ��ؼ� ������ �� ����. ���� ������� ������ ���� ������ �ȴ�.
		System.out.println(hMap1);
		
		System.out.println("===================  2  ====================");
		//2. putAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> hMap2 = new HashMap();
		hMap2.putAll(hMap1);
		System.out.println(hMap2);
		
		System.out.println("===================  3  ====================");
		//3. replace(K key ,V value); 	:	key�� ����� ���� value�� ����.
		hMap2.replace(1, "������");
		hMap2.replace(4, "����");	//key 4�� �������� �ʴ´�. �۵��� �ȵȴ�. (���ܵ� �߻� �ȵ�)
		System.out.println(hMap2);
		
		System.out.println("===================  4  ====================");
		//4.replace(K key, V oldValue, V newValue)	: oldValue�� newValue�� ����
		hMap2.replace(1, "������", "������");
		hMap2.replace(2, "�ٴٴ�", "����");
		System.out.println(hMap2);
		
		System.out.println("===================  5  ====================");
		//5. get(Object key) : Map�� ���� �����ö�. key�� �־���� Key�� �Ҵ�� Value�� ���.
		System.out.println(hMap2.get(1));		//���� 1�� index�� �ƴ϶� key�Դϴ�
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		System.out.println("===================  6  ====================");
		//6. containsKey(Object key); �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println(hMap2.containsKey(1));	//true
		System.out.println(hMap2.containsKey(5));	//false
		
		System.out.println("===================  7  ====================");
		//7. containsValue(Object value); �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		System.out.println(hMap2.containsValue("������"));	//true
		System.out.println(hMap2.containsValue("�ٴٴ�"));	//false
		
		System.out.println("===================  8  ====================");
		Set<Integer> keySet = hMap2.keySet();	//hMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		System.out.println("===================  9  ====================");
		//9. Set<Map.Entry<K,V>> entrySet(): Ű�� ���� ���� ����
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet);
		
		System.out.println("===================  10  ====================");
		//10. size(); �� ����
		System.out.println(hMap2.size());//3
		
		System.out.println("===================  11  ====================");
		//11. remove(Object key)	//Ű�� �־ key��  value�� ����.
		hMap2.remove(1);		//1�� ����.
		hMap2.remove(4);		//�������� ����.
		System.out.println(hMap2);
		
		System.out.println("===================  12  ====================");
		//12. remove (Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ�ؾ� ����
		hMap2.remove(2, "���ٶ�");	//������
		hMap2.remove(3, "�ٴٴ�");	//���� ����.
		System.out.println(hMap2);
		
		System.out.println("===================  13  ====================");
		//13. clear() : ��� ����
		hMap2.clear();
		System.out.println(hMap2);
		
		
		
		
		
	}

}
