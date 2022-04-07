package Chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {

	public static void main(String[] args) {
		//List�� �޼ҵ� : 13�� ������ �޼ҵ�,
			//1. ArrayList
			//2. Vector
			//3. LinkedList
		
		List<Integer> aList1 = new ArrayList<Integer>();
		
		//1. add(E element) : ������ ���� ���� �߰��ϱ�
		aList1.add(3);	aList1.add(4);	aList1.add(5);
		System.out.println(aList1);				//�� ���
		System.out.println(aList1.size());		//���� ����
		
		//2. add(int index, E element)
		aList1.add(1,6);	//���ȣ 1���� 6�� add(�߰�)�ϰڴ�.
		System.out.println(aList1);
		
		//3. addAll(�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer> aList2 = new ArrayList();
		aList2.add(1);
		aList2.add(2);
		
		aList2.addAll(aList1);		//aList1����� ���� �����ؼ� aList2�� �߰���.
		System.out.println(aList2);
		
		//4. addAll(int index, �Ǵٸ� ��ü)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);
		aList3.add(2);
		
		aList3.addAll(1,aList3);
		System.out.println(aList3);
		
		//5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		aList3.set(1, 5);		//1�� �� ��ȣ�� ���� 5�� ����
		aList3.set(3, 6);
		//aList3.set(4, 7);		//�����߻� : 4������ ����.
		System.out.println(aList3);
		
		//6. remove( int index) : Ư�� �� ��ȣ�� ���� ����
		aList3.remove(1);		//���ȣ 1���濡 �ִ� ���� ����
		System.out.println(aList3);
		
		//7. remove (Object o) : ������ ����
		aList3.remove(new Integer(2));		//������ ������ �� �� �ִ�.
		System.out.println(aList3);
		
		//8. clear() : ��λ���
		aList3.clear();
		System.out.println(aList3);
		
		//9. imEmpty() : ���� ��������� True, ������������� False
		System.out.println(aList3.isEmpty());
		
		//10. size(); ���� ����, ���� ����
		System.out.println(aList3.size());
		aList3.add(1);	aList3.add(2);	aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		System.out.println("===============================");
		//11.get(int index) : ���ȣ(�ε���)�� ���� ���
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		System.out.println("===============================");
		System.out.println(aList3);
		System.out.println();
		
		
		//12. toArray () : List(����Ʈ) ---> Array(�迭)
		Object[] object = aList3.toArray();			//�⺻������ toArray()�޼ҵ�� ObjectŸ������ ���ϵ�.
			//�ٿ�ĳ������ �ʿ�.
		System.out.println(Arrays.toString(object));		//�迭�϶��� Arrays.toString()���
		
		for (int i = 0; i < object.length; i++) {
			System.out.println(object[i]);
		}
		
		//13-1 toArray(T[] t)		==> t[]		: Integer�� �ٷ� ĳ����
		Integer[] integer1 = aList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		//13-2 toArray(T[] t)		==> t[]		: Integer�� �ٷ� ĳ����
		Integer[] integer2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
