package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*		����� �ٷ�� ����, ������ �����ڿ� super() �޼ҵ� ���
  	�������ϵ� �����ؼ� ����, (*.java, Fruit_App.zip)
  	�Ϸ�ð� 11:20
  
 */
class Fruit{
	String fruitName;	//���� �̸�
	String color;		//���� ����
	int large;			//���� ũ��
	
	
	
	public String toString(){	//������ ������ ����ϴ� �޼ҵ�
		return "";
	}
}

class Apple extends Fruit{
	public Apple(String fruit,String color, int large) {
		super.fruitName=fruit;
		super.color=color;
		super.large=large;
	}
	@Override
	public String toString() {
		return "<"+this.fruitName+"> �̰�, ������ <"+this.color+">, ũ��� <"+this.large+"> �Դϴ�.";
	}
}

class Orange extends Fruit{
	public Orange(String fruit,String color, int large) {
		super.fruitName=fruit;
		super.color=color;
		super.large=large;
	}
	@Override
	public String toString() {
		return "<"+this.fruitName+"> �̰�, ������ <"+this.color+">, ũ��� <"+this.large+"> �Դϴ�.";
	}
}

class Banana extends Fruit{
	public Banana(String fruit,String color, int large) {
		super.fruitName=fruit;
		super.color=color;
		super.large=large;
	}
	@Override
	public String toString() {
		return "<"+this.fruitName+"> �̰�, ������ <"+this.color+">, ũ��� <"+this.large+"> �Դϴ�.";
	}
}


public class Fruit_Test {

	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<>();
		
		/*	1. �ڵ� �ۼ� : ��ĳ�ʸ� ��ǲ�޴� �ڵ��ۼ�
		 	���� >>
		 	========================================================
		 	1. ���	|	2. ������	| 3. �ٳ��� | 4. ���	| 5. ���α׷� ����
		 	========================================================
		 	
		 	���� >>1
		 	���ϸ� : 
		 	���� : 
		 	ũ�� : 
		 	
		 	2. �ڵ� �ۼ� : ��ĳ�ʷ� ��ǲ ���� ������ ������ ��ü�� �����ؼ� ArrayList�� ����
		 	
		 	3. ����#4 �ϰ�� ArrayList�� �ִ� ��� ��ü�� ������ �ͼ� ��ü�� ����Ҷ�, Enhanced For�� ���
		 		��°�� : 
		 		//������ �̸�: <���> �̰�, ������ <������>, ũ��� <10> �Դϴ�.
		 		//������ �̸�: <������> �̰�, ������ <��������>, ũ��� <20> �Դϴ�.
		 		//������ �̸�: <�ٳ���> �̰�, ������ <�����>, ũ��� <30> �Դϴ�.
		 */
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			 System.out.println("---------------------------------------------------");
	         System.out.println("1. ���	|2. ������| 3. �ٳ��� | 4. ���| 5. ���α׷� ����");
	         System.out.println("----------------------------------------------------");
	         System.out.println("����>>");
	         int selectNO = sc.nextInt();
	         
	         	if(selectNO == 1) {
		            System.out.println("���� �̸�: ");
		            String f_name = sc.next();
		            System.out.println("���� ����: ");
		            String f_color = sc.next();
		            System.out.println("���� ũ��: ");
		            int f_size = sc.nextInt();
		            
		            Apple apple = new Apple(f_name, f_color, f_size);
		            fruitList.add(apple);
		            System.out.println(f_name+"�� �ԷµǾ����ϴ�.");
		         }else if(selectNO == 2) {
		        	 System.out.println("���� �̸�: ");
			            String f_name = sc.next();
			            System.out.println("���� ����: ");
			            String f_color = sc.next();
			            System.out.println("���� ũ��: ");
			            int f_size = sc.nextInt();
			            
			            Orange orange = new Orange(f_name, f_color, f_size);
			            fruitList.add(orange);
			            System.out.println(f_name+"�� �ԷµǾ����ϴ�.");
		         }else if(selectNO==3) {
		        	 System.out.println("���� �̸�: ");
			            String f_name = sc.next();
			            System.out.println("���� ����: ");
			            String f_color = sc.next();
			            System.out.println("���� ũ��: ");
			            int f_size = sc.nextInt();
			            
			            Banana banana = new Banana(f_name, f_color, f_size);
			            fruitList.add(banana);
			            System.out.println(f_name+"�� �ԷµǾ����ϴ�.");
		         }else if(selectNO==4) {
		            for( Fruit f : fruitList) {
		            	System.out.println(f);
		            }
		         }else if(selectNO==5) {
		            break;
			            
		         }
		}
		sc.close();
	}

}
