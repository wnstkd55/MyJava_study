package Chap17.EX12;

import java.util.Comparator;
import java.util.TreeMap;

//TreeMap<K,V> : Key가 정렬되어서 처리됨 <오름차순 정렬>
	//Key : 일반객체를 사용할 경우, Comparable<E> compareTo(), Comparator<E> compare() 재정의 필요

//일반 클래스
class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	
	@Override
	public String toString() {
		return data1 +"값 출력 ";
	}
}
//Comparable<E> 인터페이스의 compareTo() 재정의한 클래스
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	
	@Override
	public int compareTo(MyComparableClass o) {		//오름차순 정렬 방식 처리
		if(this.data1 < o.data1) {
			return -1;
		}else if(this.data1 == o.data1) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	@Override
	public String toString() {
		return data1 +"값 출력 ";
	}
}


public class TreeMapMethod_2 {

	public static void main(String[] args) {
		//1. MyClass를 TreeMap의 Key로 인풋할 경우 : 실행시 오류
//		TreeMap<MyClass,String> treeMap1 = new TreeMap();
//		MyClass m1 = new MyClass(2,5);
//		MyClass m2 = new MyClass(3,3);
//		treeMap1.put(m1, "첫번재 값");				//Comparable, comparator를 구현 안했기 때문에 오류 발생 TreeMap의 key로 사용
//		treeMap1.put(m2, "두번째 값");
//		System.out.println(treeMap1); 			//오류발생
		
		//2. MyComparableClass를 TreeMap의 Key로 인풋할경우
		TreeMap<MyComparableClass,String> treeMap2 = new TreeMap();
		MyComparableClass my1 = new MyComparableClass(2,5);
		MyComparableClass my3 = new MyComparableClass(10,5);
		MyComparableClass my2 = new MyComparableClass(3,3);
		treeMap2.put(my1, "첫번째");
		treeMap2.put(my3, "세번째");
		treeMap2.put(my2, "두번째");
		
		System.out.println(treeMap2);
		
		//3. Comparator를 구현 : 기존의 객체를 사용, 객체 수정이 불필요
		TreeMap<MyClass, String>treeMap3 = new TreeMap(new Comparator<MyClass>() {
			//익명 자식 클래스
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1<o2.data1) {
					return -1;
				}else if(o1.data1 == o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass m4 = new MyClass(2,5);
		MyClass m6 = new MyClass(20,20);
		MyClass m5 = new MyClass(3,3);
		
		
		treeMap3.put(m4, "첫번째");
		treeMap3.put(m6, "세번째");
		treeMap3.put(m5, "두번째");
		
		System.out.println(treeMap3.entrySet());
		
		
	}

}
