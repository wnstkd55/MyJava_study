package Chap10.EX07.EX01;

class AA{
	int a= 3;
	int b= 4;
	
	@Override
	public String toString() {
		return "a: "+a+"b: "+b;
	}
}

public class Object_Type {

	public static void main(String[] args) {
		Object aa = new AA();
		
		//Object 배열에 객체 저장
		Object[] arr1 = {aa};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i].toString()); 			//Object의 toString을 호출할경우
																//자식의 toString호출
		}
		
		for(Object k : arr1) {
			System.out.println(k); 				//객체 자체를 출력할 경우 toString()출력
		}
		
	}

}
