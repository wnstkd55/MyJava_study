package Chap17.EX08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set : �ߺ����� �ʴ� ���� ���� (equals(), hashCode()�޼ҵ带 ������), Wrapper Ŭ������ ��� ������.
	//1. HashSet	: ��µǴ� ���� �����ϰ� ���.
	//2. LinkedHashSet : �ԷµǴ´�� ���
	//3. TreeSet 	: �Է°��� ������ ���������� ����. �������� ���ĵǾ� ���.

public class SetSummary {

	public static void main(String[] args) {	
		//1. HashSet				//�������� ���
		System.out.println();
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		
		System.out.println(hashSet);
		
		//2. LinkedHashSet			//�Էµ� ������� ���
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		
		System.out.println(linkedhashSet);
		
		//3. TreeSet	<== �����ϱ����� Comparable<E>, Comparator<E>
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		
		System.out.println(treeSet);
		
	}

}
