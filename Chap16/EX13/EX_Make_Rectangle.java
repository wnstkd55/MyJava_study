package Chap16.EX13;

//�� ���� ��ǥ���� ����ؼ� ���̸� ���ϴ� ���α׷�. ���ʸ� �޼ҵ� ���

class Point <T, V> {	//������ ��ǥ�� ��� Ŭ����
	T x;	//������ x ��ǥ
	V y;	//������ y ��ǥ
	
	Point(T x, V y){	//������. Setter ��ſ� �����ڸ� ���ؼ� ��ǥ�� �Ҵ�.
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}

class GenericMethod{
	public static<T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double x1 = (double) p1.getX();				//p1�� x��ǥ���� x1���� ����
		double x2 = (double) p2.getX();				//p2�� x��ǥ���� x2�� ����
		double y1 = (double) p1.getY();				//p1�� y��ǥ���� y1���� ����
		double y2 = (double) p2.getY();				//p2�� y��ǥ���� y2�� ����
		
		double width = x2 - x1;				//���α��̴� x2-x1
		double height = y2 - y1;			//���α��̴� y2-y1
		
		return width * height;		//���� * ���� => ���� �� ����
	}
}

public class EX_Make_Rectangle {

	public static void main(String[] args) {
		Point<Double, Double> p1 = new Point <Double, Double>(1.0, 2.0);
		Point<Double, Double> p2 = new Point<Double, Double>(10.0, 50.0);
		
		double rect = GenericMethod.<Double,Double>makeRectangle(p1, p2);
		System.out.println("�� ���� ���̴� : "+rect+" �Դϴ�.");
		
	}

}
