package Ex.KK;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

// ��ü ���� ����
/*				�л��� �뵷 : 100,000
 	�л� 	:   			������ Ż �� (������ - 1000)  	����ö�� Ż ��(-1500)
 	���� 	: 1000��   		�°��� ����, ���� ����
 	����ö	: 1500��										�°��� ����, ���� ����
 	
 */

class Student{
	String studentName;	// �л��̸�
	int money;  // �л��� ���� ��, �ʱⰪ : 100,000
	
	public Student(String studentName , int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}


	public void takeBus(Bus bus) {	// �л��� ������ ���� ��?  ������ ���� �����ؾ� �Ѵ�. 
		bus.take(1000);//1000���� ���̳ʽ� ��
		this.money-=1000;
	}
	
	public void takeOutBus(Bus bus) {	// �������� ���� =? ��
		bus.takeOut();
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	
	public void takeOutSubway (Subway subway) {	// ����ö���� ���� =? ��
		subway.takeOut();
	}
	
	public void moneyInfo() {
		System.out.println(studentName+"���� �������� "+money+"�Դϴ�.");
	}
	
	@Override
	public String toString() {
		return studentName + "\t\t" + money  ;
	}
}

class Bus{
	int busName; 	// N�� ����		<= ��ǲ���� �޾Ƽ� �����ڿ��� �Ű������� ���� �̸� ����
	int passenagerCount;  // �°��� , �л��� ������ Ż���� �°��� �þ
	int money;  // ������ ����
	
	
	
	public int getBusName() {
		return busName;
	}
	public int setBusName(int busName) {
		return this.busName = busName;
	}

	public void take(int money) {		//  ������ ������ ó��, �°��� ó��
		// �� money�� ������ ����,�°��� ������
		this.money+=money;
		passenagerCount++;
	}
	
	public void takeOut(){	// �°����� ����
		this.passenagerCount--;
	}
	public void busInfo() {
		System.out.println("����"+busName+"���� �°��� "+passenagerCount+"���̰� ������ "+money+"�Դϴ�.");
	}
}

class Subway{
	String lineNumber;  // 1ȣ�� 2ȣ�� 3ȣ��
	int passengerCount;		// �°���
	int money;		//����
	
	// �����ڸ� ���ؼ� ����ö ȣ���� ��ǲ�޾Ƽ� Ȱ��ȭ
	
	
	
	public void take (int money) {	//  ����ö�� ������ ó��, �°��� ó��
		this.money+=money;
		passengerCount++;
	}
	
	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void takeOut(){	// �°����� ����
		passengerCount--;	
	}
	
	public void subInfo (){
		System.out.print("����ö"+lineNumber+"ȣ���� �°��� "+passengerCount+"���̰� ������ "+money+"�Դϴ�.");
	}
	
}

public class CooperationBetweenObject {
	public static ArrayList<Student> students = new ArrayList();
	private static ArrayList<Bus> busarr = new ArrayList<Bus>();
	public static Scanner scanner = new Scanner(System.in);
	static String Sname = null;
	static int busNum;  // ���� ��ȣ 
	
	// 1�� �޼���
	public static void create() {
		System.out.println("�л� �̸��� �Է��ϼ��� >>>");
		String studentName = scanner.next();
		System.out.println("���� �Է��ϼ��� >>> ");
		int money = scanner.nextInt();
		
		students.add(new Student(studentName, money));
		System.out.println("�� �ԷµǾ����ϴ�. ");
	}
	
	// 2�� �޼���
	public static void printerInfo() {
		System.out.println("=====�л����� ���=====");
		System.out.println("�л��̸�\t\t ������\t\t");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("�л��� �����ϼ���(�̸� �Է�) >>>");
		Sname = scanner.next();
		Student student = searchMethod(Sname);
		
		if (searchMethod(Sname) == null) {
			System.out.println("������ �̸��� �л��� �����ϴ�. ");
		}else {
			System.out.println(student.getStudentName() + "�� ������ �����߽��ϴ�.");
		}
		
	}
	
	//3�� �޼���
	
	public static void takeBus() {
		Student student = searchMethod(Sname);
		System.out.println("������ȣ�� �Է��ϼ��� >>> ");
		busNum = scanner.nextInt();
		for(Bus bus : busarr) {
			if(bus.busName==busNum) {
				student.takeBus(bus);
				System.out.println(student.studentName+"��"+bus.busName+"�� ������ �����ϴ�. ��ſ� �Ϸ� �Ǽ���.");
				student.moneyInfo();
				bus.busInfo();
			}
		}
	
//		Bus bus = new Bus();
//		student.takeBus(bus);
//		bus.busName=bus.setBusName(busNum);
//		System.out.println(student.getStudentName() + "�� " + busNum + " �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���^^");
//		bus.busInfo();
//		student.moneyInfo();
		
	}
	
	// 4�� �޼���
	public static void takeOffBus() {
		Student student = searchMethod(Sname);
		System.out.println("������ȣ�� �Է��ϼ��� >>> ");
		busNum = scanner.nextInt();
		for(Bus bus : busarr) {
			if(bus.busName == busNum) {
				student.takeOutBus(bus);
				System.out.println(student.studentName+"��"+bus.busName+"�� ������ �����ϴ�. ��ſ� �Ϸ� �Ǽ���.");
				student.moneyInfo();
				bus.busInfo();			
			}
		}
	}
	
	
	// ���� �л� ã�� �޼���
	public static Student searchMethod(String studentName) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null) {
				String	name = students.get(i).getStudentName();
				if (name.equals(studentName)) {
					student = students.get(i);
					return student;
				}
			}
		}
		return student;
	}
	
	
	public static void main(String[] args) {
		for(int i = 1; i<6; i++) { 		//���� ��ü ���� (�������� ��ü � �����ϰ� �϶�� �ϼ̽��ϴ�)
										//����(1~5) ����
			Bus b = new Bus();
			b.setBusName(i);
			busarr.add(b);
		}
		
		
		
		while (true) {
			System.out.println("========================================================================\r\n"
					+ "1. �л���ü ����  | 2. �л����� ��� �� ����  \r\n"
					+ "3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  \r\n"
					+ "========================================================================");
			System.out.println("���� >>> ");
			int selectNum = scanner.nextInt();
			if (selectNum == 1) {
				create();
			}else if (selectNum == 2) {
				printerInfo();
			}else if (selectNum == 3) {
				takeBus();
			}else if (selectNum == 4) {
				takeOffBus();
			}else if (selectNum == 5) {
				
			}else if (selectNum == 6) {
				
			}else if(selectNum == 7) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�. ");

	}

}
