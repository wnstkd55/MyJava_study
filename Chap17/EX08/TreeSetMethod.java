package Chap17.EX08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet : ��½� ���ĵǾ ���. (�������� ����(ascending): 1 --> 9, a --> z , �� --> ��
			//��½� �˻��� �޼ҵ尡 ����.
			// ������ ���� ������ Set�� ���ĵǾ �����. ��½ÿ� ������������ ���ĵǾ ���
			// Set <= SortedSet <= NavigableSet <= TreeSet
			// TreeSet<String> treeSet = new TreeSet<String>(); Ÿ���� TreeSet���� �����ؾ� ����/�˻� ����� ���.
			// Set�������̽��� ��� �޼ҵ� ���. �߰������� ���� �޼ҵ� / �˻� �޼ҵ带 ��� ����

public class TreeSetMethod {

	public static void main(String[] args) {
		//TreeSet�� Set�� ��� �޼ҵ� ��� ����
		//TreeSet�� ���� �־��� ��� �������� ���ĵǾ� ���� Set�� ����, ��½� �������� ���ķ� ���.
		TreeSet<Integer> treeSet = new TreeSet(); //Type�� TreeSet���� �����ؾ� ����(Sort)�� �˻��� ����Ҽ��ִ�.
		for(int i = 50; i>0; i-=2) {	//50, 48, 46, 44 ...2, 0
			treeSet.add(i);		//���������� ������ ���� ������ ������������ ���ĵǾ� ���� ����
		}
		System.out.println(treeSet);
		
		//TreeSet������ ��� ������ �޼ҵ�(1~15)
		System.out.println("============������ �˻�(��������)===============");
		//1. first()	: ���� ó������ ����
		System.out.println(treeSet.first()); 	//2
		//2. last()		: ���� ���������� ����
		System.out.println(treeSet.last());		//50
		//3. lower(E element):element���� ������ ���
		System.out.println(treeSet.lower(26));	//24
		//4. higher(E element) : element���� ū�� ���
		System.out.println(treeSet.higher(26));	//28
		//5. floor(E element) : element�� �����ؼ� ���� ���� ���
		System.out.println(treeSet.floor(25));	//24
		System.out.println(treeSet.floor(26));	//26
		//6. ceiling(E element) : element�� �����ؼ� ū���� ���
		System.out.println(treeSet.ceiling(25));	//26
		System.out.println("=============������ ������====================");
		//7. pollFirse() : ���� ���� ������
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		for(int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst()); 	//25�� �������鼭 ù��° ���� �����ͼ����
		}
		System.out.println();
		System.out.println(treeSet.size()); 	//0, treeSet�� ���� ����ִ� ����
		
		//8. pollLast(): ���� ������ �� �������� 
//		for(int i = 50; i>0; i++) {
//			treeSet.add(i);		//������������ ���ĵǾ� ����.
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
		System.out.println("====================����====================");
		
		//9.SortedSet<E> headSet(E element) : ������ ����ϱ� ���ؼ� SortedSet<E> ��ü�� ����
			//SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set.
				//headSet(E element) : element�� Head�������� ���� ����.
			
		for(int i =50; i>0; i-=2) {
			treeSet.add(i);		//������������ ���ĵǾ treeSet�� ����
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet= treeSet.headSet(20);	//headSet(20)�� SortedSet���� ���ϰ��� ������.
		//Set<Integer>sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		//10. NavigableSet<E> headSet(E element, boolean inclusive) : element�� ����(true), ������(false)
		NavigableSet<Integer> nSet = treeSet.headSet(20,true);
		//Set<Integer>nSet=treeSet.headSet(20,true)
		System.out.println(nSet);
		
		//11. SortedSet<E> tailSet(E element)
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); //���۰��� ������ �⺻, ������ �������� �⺻<==<<������ ������ ����>>
		//Set<Integer>sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet(E element,boolean inclusive): element�� ����(true), ������(false)�ؼ� tail���� ���
		NavigableSet nSet2 = treeSet.tailSet(20, false);
		System.out.println(nSet2);
		System.out.println("================= Ư�������� �� ��������(subSet) ====================");
		
		//13. SortedSet<E> subSet(E element, E element); Ư�������� ���� set���� ������
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3); 	//���۰��� ����, ������ ������	<==��� ���α׷������� �⺻>
		
		//14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, true);
		System.out.println(nSet4);
		
		System.out.println("================== �ݴ�� �����ϱ� descendingSet() ==================");
		
		//15. NavigableSet<E> descendingSet() : ���� ������ �������� �ݴ�� �����Ѵ�. descending <�������� ����>(������)
		System.out.println(treeSet); //�������� ����
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();	//�������� ����
		//Set<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		NavigableSet<Integer>descendingSet2 = descendingSet.descendingSet();	//�������� ����
		//Set<Integer>descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
	}

}
