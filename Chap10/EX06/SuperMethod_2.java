package Chap10.EX06;

//this()�� super()�� ȥ��.	<== ������ ȣ��, ������ ����, ù����
	//this() : �ڽ� ��ü�� ������ ȣ��
	//super() : �θ� ��ü�� ������ ȣ��

class AAAA{
	AAAA(){
		this(3);
		System.out.println("AAAA������ 1");
	}
	AAAA(int a){
		System.out.println("AAAA������ 2");
	}
}

class BBBB extends AAAA{
	BBBB(){
		this(3);
		System.out.println("BBBB������ 1");
	}
	BBBB(int a){
		System.out.println("BBBB������ 2");
	}
}
public class SuperMethod_2 {

	public static void main(String[] args) {
		//1. ��ü ����
		AAAA aaaa1 = new AAAA();
		System.out.println("====================");
		
		AAAA aaaa2 = new AAAA(3);
		System.out.println("====================");
		
		//2. �ڽ��� ��ü ����
		BBBB bbbb1 = new BBBB();
		System.out.println("=====================");
		
		BBBB bbbb2 = new BBBB(5);
		
		
	}

}
