package Chap17.EX07;

//LinkedHashSet
	//HashSet�� ������ : ��� �޼ҵ尡 �����ϴ�. �ߺ��� ���� �������� �ʴ´�. ���ȣ(index)���� ������ �ʴ´�.
						//�⺻ for������ ����� �� ����. iterator, Enhanced For���� ���.
	//HashSet�� �ٸ��� : HashSet�� �Է´�� ��µ��� �ʴ´�. LinkedHashSet�� �Է´�� ��µȴ�.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Set<E> : �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	// - hashSet : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.
	// - LinkedHashSet : �ߺ��Ȱ��� ���� ������. ��½� ������� ���
	// - TreeSet : ����ɶ� ���� ������ �Ǿ ����. ascending(�����������ĵǾ� �����)
public class LinkedHashSetMethod {


	public static void main(String[] args) {
		
		Set<String> linkedhSet1 = new LinkedHashSet();		//Set�� Interface�̹Ƿ� Ÿ�����θ� ����
			//Set�� ���ʸ� Ÿ�Ժ����� wrapperŬ������ ����� ���, equals(), hashCode()�� ������ �Ǿ��ִ�. toString()������
		
		//1. add(E element) : Set �� ���� �߰�,
		linkedhSet1.add("��");linkedhSet1.add("��");linkedhSet1.add("��");		//"��"�� �ߺ� ����=>�ߺ����� �ȵ�.
		System.out.println(linkedhSet1);
		System.out.println(linkedhSet1.toString());	//toString�޼ҵ尡 ������ �Ǿ��ִ�.
		
		//2. addAll(�ٸ� set��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� : �ߺ��� ���� ���ŵ�.
		Set<String> linkedhSet2 = new LinkedHashSet();
		linkedhSet2.add("��"); linkedhSet2.add("��");
		linkedhSet2.addAll(linkedhSet1);	//[��,��,��]
		System.out.println(linkedhSet2);
		
		//3. remove (Object o) : ������ ����, (List�ΰ�� ���ȣ(index)�� ����)
		linkedhSet2.remove("��");
		System.out.println(linkedhSet2);
		
		//4. clear() : ��� ����
		linkedhSet2.clear();
		System.out.println(linkedhSet2);
		
		//5. isEmpty() : ��������� - true, �ƴҽ� -false
		System.out.println(linkedhSet2.isEmpty());
		
		//6. contains(Object o) : ���� set�� �����ϸ� true, �ƴҽ� false
		Set<String> linkedhSet3 = new LinkedHashSet<>();
		linkedhSet3.add("��");linkedhSet3.add("��");linkedhSet3.add("��");
		System.out.println(linkedhSet3);
		System.out.println(linkedhSet3.contains("��"));	//true
		System.out.println(linkedhSet3.contains("��")); 	//false
		
		//7. size():Set�� ���Ե� ���� ����
		System.out.println(linkedhSet3.size());
		
		//8. iterator()	:Set�� index�� ������ �ʴ´�. for���� ���ȣ�� ���� ��� enhanced for���� ��� ����
					//��ȸ�� ,Set�� ������ ��ȸ �ϸ鼭 ���
					//hasNext() : Set�� ���� �����ϸ� true, �������������� false
					//next() : ���� ���� ����ϰ� ���������� �̵�
		
		Iterator<String> iterator = linkedhSet3.iterator();
			// Ŭ����<E> ������ü = Set��ü.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("=========enhanced for���� ����ؼ� ���===============");
		
		for(String k : linkedhSet3) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//9. toArray() : Set�� ������ �迭�� ������. ObjectŸ������ ����, �ٿ�ĳ������ �ʿ�.
		Object[] objArray = linkedhSet3.toArray();
		System.out.println(Arrays.toString(objArray)); 		//
		for(int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i]+" ");
		}
		System.out.println();
		System.out.println("=============================");
		for(Object k : objArray) {			//�ٿ�ĳ������ �ʿ�
			System.out.print(k+" ");
		}
		System.out.println();
		
		//10. toArray(T[] t) : �ٷ� �ٿ�ĳ������ �� �� ���
		String[] strArray1 = linkedhSet3.toArray(new String[0]);	// 0 : ���� ũ�⸦ ����
															//���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� ���� ũ�⸸ŭ ����
		System.out.println(Arrays.toString(strArray1));
		
		//11. ���� Set�� ������ ���� ũ�⸦ ũ�� �������
		String[] strArray2 = linkedhSet3.toArray(new String[5]);		//���� ũ�Ⱑ �������� Ŭ��� null���� ����
		System.out.println(Arrays.toString(strArray2));
		System.out.println("==========================================");
		//12.
		Set<Integer> intSet1 = new LinkedHashSet();
		intSet1.add(30);intSet1.add(50);intSet1.add(100);intSet1.add(10);
		//iterator���, enhanced for���� ����ؼ� ���
		Iterator<Integer> iterator1 = intSet1.iterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+" ");
		}
		System.out.println();
		System.out.println("======enhanced for���� ����ؼ� ���=========");
		for(int k : intSet1) {
			System.out.print(k+" ");
		}
		
		
	}

}
