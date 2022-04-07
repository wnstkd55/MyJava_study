package Chap17.EX08;

import java.util.Scanner;
import java.util.TreeSet;

//이름과 나이를 입력했을시 이름을 오름차순으로 출력하도록 구현. TreeSet에 name컬럼을 정렬
//1. Comparable<E>의 compareTo() 메소드 재정의
		//기존의 객체 수정이 필요
//2. Comparator<E>의 compare()를 구현
		//기존의 객체를 수정없이 구현


class Abc{
	String name;		// <<=컬럼이 정렬 컬럼  오름차순 정렬 : 가나다라...하, 
						// 홍길동, 이순신, 강감찬		===> 강감찬, 이순신, 홍길동 순으로 
	int age;			//나이
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "의 나이는 "+ age;
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
		return name + "의 나이는 "+ age;
	}
	
	
}

public class EX_TreeSetMethod_3 {

	public static void main(String[] args) {

		
		TreeSet<Abc_T> treeSet = new TreeSet();
		Abc_T p1 = new Abc_T("홍길동",40);
		Abc_T p2 = new Abc_T("이순신",50);
		Abc_T p3 = new Abc_T("강감찬",60);
		
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		
		System.out.println(treeSet);
		
	}

}

