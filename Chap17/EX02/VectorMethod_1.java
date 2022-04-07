package Chap17.EX02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

//Vector : ArrayList와 모든 메소드를 동일하게 사용.
	//Vector는 모든 메소드가 동기화 처리가 되어있다.

public class VectorMethod_1 {

	public static void main(String[] args) {
		//List의 메소드 : 13개 정도의 메소드,
		//1. ArrayList
		//2. Vector
		//3. LinkedList
	
	List<Integer> vector1 = new ArrayList<Integer>();
	
	//1. add(E element) : 마지막 값에 값을 추가하기
	vector1.add(3);	vector1.add(4);	vector1.add(5);
	System.out.println(vector1);				//값 출력
	System.out.println(vector1.size());		//값의 개수
	
	//2. add(int index, E element)
	vector1.add(1,6);	//방번호 1번에 6을 add(추가)하겠다.
	System.out.println(vector1);
	
	//3. addAll(또다른 리스트의 객체를 복사해서 추가)
	List<Integer> vector2 = new Vector();
	vector2.add(1);
	vector2.add(2);
	
	vector2.addAll(vector1);		//vector1저장된 값을 복사해서 vector2에 추가함.
	System.out.println(vector2);
	
	//4. addAll(int index, 또다른 객체)
	List<Integer> vector3 = new Vector();
	vector3.add(1);
	vector3.add(2);
	
	vector3.addAll(1,vector3);
	System.out.println(vector3);
	
	//5. set(int index, E element) : 특정 방번호의 값을 수정
	vector3.set(1, 5);		//1번 방 번호에 값을 5로 수정
	vector3.set(3, 6);
	//vector3.set(4, 7);		//오류발생 : 4번방은 없다.
	System.out.println(vector3);
	
	//6. remove( int index) : 특정 방 번호의 값을 삭제
	vector3.remove(1);		//방번호 1번방에 있는 값을 삭제
	System.out.println(vector3);
	
	//7. remove (Object o) : 값으로 삭제
	vector3.remove(new Integer(2));		//값으로 삭제를 할 수 있다.
	System.out.println(vector3);
	
	//8. clear() : 모두삭제
	vector3.clear();
	System.out.println(vector3);
	
	//9. imEmpty() : 값이 비어있으면 True, 비어있지않으면 False
	System.out.println(vector3.isEmpty());
	
	//10. size(); 방의 갯수, 값의 갯수
	System.out.println(vector3.size());
	vector3.add(1);	vector3.add(2);	vector3.add(3);
	System.out.println(vector3);
	System.out.println(vector3.size());
	System.out.println("===============================");
	//11.get(int index) : 방번호(인덱스)의 값을 출력
	System.out.println(vector3.get(0));
	System.out.println(vector3.get(1));
	System.out.println(vector3.get(2));
	System.out.println("===============================");
	System.out.println(vector3);
	System.out.println();
	
	
	//12. toArray () : List(리스트) ---> Array(배열)
	Object[] object = vector3.toArray();			//기본적으로 toArray()메소드는 Object타입으로 리턴됨.
		//다운캐스팅이 필요.
	System.out.println(Arrays.toString(object));		//배열일때는 Arrays.toString()사용
	
	for (int i = 0; i < object.length; i++) {
		System.out.println(object[i]);
	}
	
	//13-1 toArray(T[] t)		==> t[]		: Integer로 바로 캐스팅
	Integer[] integer1 = vector3.toArray(new Integer[0]);
	System.out.println(Arrays.toString(integer1));
	
	//13-2 toArray(T[] t)		==> t[]		: Integer로 바로 캐스팅
	Integer[] integer2 = vector3.toArray(new Integer[5]);
	System.out.println(Arrays.toString(integer2));
	
	}

}
