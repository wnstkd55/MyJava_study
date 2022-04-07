package Chap16.EX13;

//두 점의 좌표값을 사용해서 넓이를 구하는 프로그램. 제너릭 메소드 사용

class Point <T, V> {	//한점의 좌표를 담는 클래스
	T x;	//한점의 x 좌표
	V y;	//한점의 y 좌표
	
	Point(T x, V y){	//생성자. Setter 대신에 생성자를 통해서 좌표값 할당.
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
		double x1 = (double) p1.getX();				//p1의 x좌표값을 x1으로 저장
		double x2 = (double) p2.getX();				//p2의 x좌표갑을 x2로 저장
		double y1 = (double) p1.getY();				//p1의 y좌표값을 y1으로 저장
		double y2 = (double) p2.getY();				//p2의 y좌표값을 y2로 저장
		
		double width = x2 - x1;				//가로길이는 x2-x1
		double height = y2 - y1;			//세로길이는 y2-y1
		
		return width * height;		//가로 * 세로 => 넓이 를 리턴
	}
}

public class EX_Make_Rectangle {

	public static void main(String[] args) {
		Point<Double, Double> p1 = new Point <Double, Double>(1.0, 2.0);
		Point<Double, Double> p2 = new Point<Double, Double>(10.0, 50.0);
		
		double rect = GenericMethod.<Double,Double>makeRectangle(p1, p2);
		System.out.println("두 점의 넓이는 : "+rect+" 입니다.");
		
	}

}
