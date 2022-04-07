package Chap17.EX10;

import java.util.Hashtable;

//Map<K,V> : K <= Key, V <=Value�������� �����͸� ����
	//Key�� �ߺ��� �� ����. <==Set���� ����.		index�� �ƴϴ�. index�� 0���� �Ҵ�, JVM�� �Ҵ���
	//Value�� �ߺ��� ���� ���� �� �ִ�.
	
	//HashMap : ����� �����ϰ� ���. ���� ������ ȯ�濡 ����. ��� �޼ҵ尡 ����ȭ �Ǿ����� �ʴ�.
	//Hashtable : ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�. ��Ƽ������ȯ�濡 ����
				//��� �޼ҵ�� Hashtable�� ����



import java.util.Map;
import java.util.Set;

public class HashTableMethod {

	public static void main(String[] args) {
		Map<Integer,String> hTable1 = new Hashtable<>();
		
		System.out.println("===================  1  =====================");
		//1.put(K key, V value) : ���� ������
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");
//		hTable1.put(3, "������");			//Ű�� �ߺ��ؼ� ������ �� ����. ���� ������� ������ ���� ������ �ȴ�.
		System.out.println(hTable1);
		
		System.out.println("===================  2  ====================");
		//2. putAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> hTable2 = new Hashtable();
		hTable2.putAll(hTable1);
		System.out.println(hTable2);
		
		System.out.println("===================  3  ====================");
		//3. replace(K key ,V value); 	:	key�� ����� ���� value�� ����.
		hTable2.replace(1, "������");
		hTable2.replace(4, "����");	//key 4�� �������� �ʴ´�. �۵��� �ȵȴ�. (���ܵ� �߻� �ȵ�)
		System.out.println(hTable2);
		
		System.out.println("===================  4  ====================");
		//4.replace(K key, V oldValue, V newValue)	: oldValue�� newValue�� ����
		hTable2.replace(1, "������", "������");
		hTable2.replace(2, "�ٴٴ�", "����");
		System.out.println(hTable2);
		
		System.out.println("===================  5  ====================");
		//5. get(Object key) : Map�� ���� �����ö�. key�� �־���� Key�� �Ҵ�� Value�� ���.
		System.out.println(hTable2.get(1));		//���� 1�� index�� �ƴ϶� key�Դϴ�
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		System.out.println("===================  6  ====================");
		//6. containsKey(Object key); �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println(hTable2.containsKey(1));	//true
		System.out.println(hTable2.containsKey(5));	//false
		
		System.out.println("===================  7  ====================");
		//7. containsValue(Object value); �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		System.out.println(hTable2.containsValue("������"));	//true
		System.out.println(hTable2.containsValue("�ٴٴ�"));	//false
		
		System.out.println("===================  8  ====================");
		Set<Integer> keySet = hTable2.keySet();	//hTable2�� ����� keySet�� ����
		System.out.println(keySet);
		
		System.out.println("===================  9  ====================");
		//9. Set<Map.Entry<K,V>> entrySet(): Ű�� ���� ���� ����
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		System.out.println("===================  10  ====================");
		//10. size(); �� ����
		System.out.println(hTable2.size());//3
		
		System.out.println("===================  11  ====================");
		//11. remove(Object key)	//Ű�� �־ key��  value�� ����.
		hTable2.remove(1);		//1�� ����.
		hTable2.remove(4);		//�������� ����.
		System.out.println(hTable2);
		
		System.out.println("===================  12  ====================");
		//12. remove (Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ�ؾ� ����
		hTable2.remove(2, "���ٶ�");	//������
		hTable2.remove(3, "�ٴٴ�");	//���� ����.
		System.out.println(hTable2);
		
		System.out.println("===================  13  ====================");
		//13. clear() : ��� ����
		hTable2.clear();
		System.out.println(hTable2);
		
		
		
		
		
	}

}
