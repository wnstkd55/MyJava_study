package Chap17.EX08;

import java.util.Scanner;
import java.util.TreeSet;

//�̸��� ���̸� �Է������� �̸��� ������������ ����ϵ��� ����. TreeSet�� name�÷��� ����
//1. Comparable<E>�� compareTo() �޼ҵ� ������
		//������ ��ü ������ �ʿ�
//2. Comparator<E>�� compare()�� ����
		//������ ��ü�� �������� ����


class Abc{
	String name;		// <<=�÷��� ���� �÷�  �������� ���� : �����ٶ�...��, 
						// ȫ�浿, �̼���, ������		===> ������, �̼���, ȫ�浿 ������ 
	int age;			//����
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "�� ���̴� "+ age;
	}
	
}

class Abc_T implements Comparable<Abc_T>{
	String name;
	int age;
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Abc_T o) {
		
			if(this.name.equals(o.name)) {
				return 0;
			}
			return (this.name.compareTo(o.name));
		
	}
	
	@Override
	public String toString() {
		return name + "�� ���̴� "+ age;
	}
	
	
}

public class EX_TreeSetMethod_3 {

	public static void main(String[] args) {

		
		TreeSet<Abc_T> treeSet = new TreeSet();
		Abc_T p1 = new Abc_T("ȫ�浿",40);
		Abc_T p2 = new Abc_T("�̼���",50);
		Abc_T p3 = new Abc_T("������",60);
		
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		
		System.out.println(treeSet);
		
	}

}

