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
		
		//Object �迭�� ��ü ����
		Object[] arr1 = {aa};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i].toString()); 			//Object�� toString�� ȣ���Ұ��
																//�ڽ��� toStringȣ��
		}
		
		for(Object k : arr1) {
			System.out.println(k); 				//��ü ��ü�� ����� ��� toString()���
		}
		
	}

}
