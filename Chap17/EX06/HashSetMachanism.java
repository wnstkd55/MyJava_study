package Chap17.EX06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : �ߺ��� ���� ���� ��  ����.
	//equals() �޼ҵ�, hasCode()�޼ҵ尡 ���ǵǾ��־�� �Ѵ�.
	//String, Integer Ŭ�������� equals() �޼ҵ�� hashCode()�� ������ �Ǿ��ִ�.
	//Ư�� ��ü�� Set�� ������ ��� �ߺ� ������ ���� ���ϵ��� �ϱ����ؼ��� equals()�� hashCode()�� ������ �ؾ���.
	//Object Ŭ������ equals() �� hashCode()
		//Object Ŭ������ equals()�޼ҵ�� '=='�� ����.
			// ==�� Stack�޸��� ���� ��. 

//equals(), hashCode() �޼ҵ尡 ������ ���� ���� ����
class A{
	int data;
	public A(int data){
		this.data = data;
	}
}
//equals()�� ������ �ϰ� ,hashCode()�� ������ ���� ���� ����

class B{
	int data;		//�ΰ��� ��ü�� data�ʵ��� ���� ������ �����ϴٶ�� �ĺ��ڸ� �־���� �Ѵ�.
					//equals(), hashCode() 
	
	public B(int data) {
		this.data=data;
	}
	
	@Override
	public boolean equals(Object obj) {		// ��ü�� �ּҸ� ���ϴ°��� �ƴ϶� ��ü������ Ư���ʵ��� ���� ���ϵ��� ����.
		
		if(obj instanceof B) { 				//obj�� BŸ���� �����ϰ� �������� �ٿ�ĳ����, ���ܹ��� ����(instanceof)
			if(this.data == ((B)obj).data)	//���� : �߸� �ٿ�ĳ������ �� ��� - ���ܰ� �߻���.
			return true;
		}
		return false; 
	}
}

class C{
	int data;		//�ΰ��� ��ü�� data�ʵ��� ���� ������ �����ϴٶ�� �ĺ��ڸ� �־���� �Ѵ�.
					//equals(), hashCode() 
	
	public C(int data) {
		this.data=data;
	}
	
	@Override
	public boolean equals(Object obj) {		// ��ü�� �ּҸ� ���ϴ°��� �ƴ϶� ��ü������ Ư���ʵ��� ���� ���ϵ��� ����.
		
		if(obj instanceof C) { 				//obj�� CŸ���� �����ϰ� �������� �ٿ�ĳ����, ���ܹ��� ����(instanceof)
			if(this.data == ((C)obj).data)	//���� : �߸� �ٿ�ĳ������ �� ��� - ���ܰ� �߻���.
			return true;
		}
		return false; 
	}
	
	@Override
	public int hashCode() {				//Objects.hash(�ʵ��,�ʵ��,�ʵ��) 	<==�������� �ʵ��� �ؽ��ڵ带
		return Objects.hash(data);
		
		//return data; 		//data�ʵ��� ���� ������ hashCode�� �����ϰ� ����.
	}
}

public class HashSetMachanism {

	public static void main(String[] args) {
		
		//1.equals(), hashCode() �޼ҵ尡 ������ ���� ���� ����
		Set<A> hashSet1 = new HashSet();
		
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1==a2);		//false
			// == : ����(Stack) �޸��� ���� ��.
		
		System.out.println(a1);		//��ü���� ��� : ��Ű����.Ŭ������@���޸��ּ��� �ؽ��ڵ�(16����)
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));		//false ,Object�� equals()�� ' == ' �� ����.
		System.out.println(a1.hashCode() + ","+a2.hashCode()); 		//10������ ǥ��
		
		hashSet1.add(a1);	//Set�� �ߺ��� ���� ���� ���Ѵ�.
		hashSet1.add(a2);	//
		
		System.out.println(hashSet1.size()); 	//2 		< == equals()�� hashCode()�޼ҵ尡 ������ �Ǿ����� �ʴ�.
		
		//2. equals() ������(��ü�� data�ʵ��� ���� ��, hashCode()�޼ҵ尡 ������ ���� ���� ����
		Set<B> hashSet2 = new HashSet();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); 		//Stack �޸��� ���� �� 	//false
		System.out.println(b1.equals(b2));	//true
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size()); 		//equals()�� ������, hashCode�� ������ ����.
		System.out.println(b1.hashCode() + ","+b2.hashCode());
		
		//3. equals()������ (��ü�� data�ʵ��� ���� ��), hashCode()�޼ҵ尡 ������
		
		Set<C>hashSet3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2);		//false , ������ �ּҸ� ��
		System.out.println(c1.equals(c2)); 		//true, ��ü�� data�ʵ��� ���� ���ϵ��� ������
		System.out.println(c1.hashCode() + ", "+c2.hashCode()); 	//data�ʵ带 �������� hashCode�� ����.
			//�� ��ü�� ������ ��ü
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); 		//1 		equals(), hashCode() ������ �Ǿ� �ִ�. data�ʵ忡 ���ؼ�.
		
		
		
		
		
		
		
		
	}

}
