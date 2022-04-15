package Employeeinfo;

/*

 	- ��� : 

- �̸� : ȫ�浿

- ����ó : 

- ���� :

- �μ� : 

- ���� : 

 

ȫ�浿���� ������ ���������� �Է� �Ǿ����ϴ�. 

 

�޴� �Է� : 2

���	�̸�	����ó	����	�μ�	����

 

�޴� �Է� : 3

������ ��� :  

������ �ʵ� ���� [1. ����ó, 2.����, 3. �μ�, 4.����] : 

 

�޴� �Է� : 4

������ ��� : 

ȫ�浿 ����� ���� �Ǿ����ϴ�. 

 

�޴� �Է� : 5

���α׷��� ���� �Ǿ����ϴ�. 

 

 

==================================

1. TreeSet�� ������ �����ϼ���.

2. ����� �����ؼ� ��� �ؾ� �մϴ�. 

3. ����� �ߺ��ؼ� ����Ǹ� �ȵ˴ϴ�. 

==================================

 */

import java.util.Comparator;

import java.util.Iterator;

import java.util.Scanner;

import java.util.TreeSet;
class Employee{		//����� ������ ���� Ŭ����
	int empNo;		//�����ȣ
	String empName;		//����̸�
	String phone;
	int age;
	String dept;		//�μ�
	String compRank;		//����
	public Employee(int empNo, String empName, String phone, int age, String dept, String compRank){
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age=age;
		this.dept=dept;
		this.compRank=compRank;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompRank() {
		return compRank;
	}
	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	@Override
	public String toString() {
		return "���: "+empNo+" �̸�: "+empName+" ����ó: "+phone+" ����: "+age+" �μ�: "+dept+" ����: "+compRank;
	}
	

	
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Employee) {
				if(this.empNo==((Employee) obj).empNo) {
					return true;
				}
			}return false;
				
		}
}

//Treeset : �ߺ��� �����͸� ������ �� ����. Wrapper Ŭ������ ������ �Ǿ��ִ�. equals(), hashCode()
	//���ĵǾ ���� Comparable compareTo(), Comparator compare()
		//�Ϲݰ�ü�� set �ڷ����� �����Ҷ��� ��ü�� Ư���ʵ尡 �ߺ� ��������ʵ��� equals(), hashCode() ������ �ʿ�...
	//wrapper : �⺻�ڷ����� ��ü�� �⺻�ڷ������� ���� �޼ҵ尡 �߰�.(Boolean, Byte, Charactor, Integer, Double...)
		//Comparable compareTo() : ����ؼ� ����, ��ü ����, COmparator compare() : �������� ��� �����ϵ��� ������
public class Employee_info {
	private static TreeSet<Employee> eSet = new TreeSet<Employee>(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			if(o1.getEmpNo()<o2.getEmpNo()) {
				return -1;
			}else if(o1.getEmpNo() == o2.getEmpNo()) {
				return 0;
			}else {
				return 1;
			}
		};
	});
	private static Scanner scanner = new Scanner(System.in);
	private static void createEmpInfo() {
		System.out.println("- ��� : ");
		int empNo = scanner.nextInt();
		System.out.println("- �̸� : ");
		String empName = scanner.next();
		System.out.println("- ����ó : ");
		String phone = scanner.next();
		System.out.println("- ���� : ");
		int age = scanner.nextInt();
		System.out.println("- �μ� : ");
		String dept = scanner.next();
		System.out.println("- ���� : ");
		String compRank = scanner.next();
		eSet.add(new Employee(empNo,empName,phone,age,dept,compRank));
		System.out.println(empName+ "���� ������ ���������� �Է� �Ǿ����ϴ�.");
	}
	private static void searchEmpInfo() {
		Iterator<Employee> ie = eSet.iterator();
		while(ie.hasNext()) {
			System.out.println(ie.next());
		}
		System.out.println();
	}
	private static void modifyEmpInfo() {
		System.out.println("�����ȣ�� �Է����ּ��� >> ");
		int empNo = scanner.nextInt();
		if(findEmpNo(empNo) == null) {
			System.out.println("�ش��ϴ� ����� �����ϴ�.");
			return;
		}
		System.out.println("������ �ʵ� ���� [1. ����ó, 2. ����, 3. �μ�, 4. ����]");
		int select = scanner.nextInt();
		if(select == 1) {
			System.out.println("������ ����ó�� �Է��ϼ��� >> ");
			String mo_Phone = scanner.next();

			findEmpNo(empNo).setPhone(mo_Phone);

			System.out.println(findEmpNo(empNo).getPhone()+"�� �����Ǿ����ϴ�.");

		}

		else if(select == 2){

			System.out.println("������ ���̸� �Է��ϼ��� >> ");

			int mo_age = scanner.nextInt();

			findEmpNo(empNo).setAge(mo_age);

			System.out.println(findEmpNo(empNo).getAge()+"�� �����Ǿ����ϴ�.");

		}

		else if(select == 3){

			System.out.println("������ �μ��� �Է��ϼ��� >> ");

			String mo_Dept = scanner.next();

			findEmpNo(empNo).setDept(mo_Dept);

			System.out.println(findEmpNo(empNo).getDept()+"�� �����Ǿ����ϴ�.");

		}

		else if(select == 4){

			System.out.println("������ ������ �Է��ϼ��� >> ");

			String mo_CR = scanner.next();

			findEmpNo(empNo).setCompRank(mo_CR);

			System.out.println(findEmpNo(empNo).getCompRank()+"�� �����Ǿ����ϴ�.");

		}

	}

	private static void deleteEmpInfo() {

		System.out.println("�����ȣ�� �Է����ּ��� >> ");

		int empNo = scanner.nextInt();

		Employee employee = findEmpNo(empNo);

		if(findEmpNo(empNo) == null) {

			System.out.println("�ش��ϴ� ����� �����ϴ�.");

			return;

		}

		eSet.remove(employee);

		System.out.println(employee.getEmpName()+"����� �����Ǿ����ϴ�.");

	}

	private static Employee findEmpNo(int empNo) {

		Employee employee = null;

		Iterator<Employee> ie = eSet.iterator();

		while(ie.hasNext()) {

			Employee e1 = ie.next();

			int input_eno = e1.getEmpNo();

			if(input_eno == empNo) {

				employee = e1;

			}

		}

		return employee;

	}

	public static void main(String[] args) {

		boolean run = true;
	      while(run) {
	         System.out.println("-----------------------------------------------------------------------------------");
	         System.out.println("1. ������� �űԵ�� | 2. ������� �˻� | 3. ������� ���� | 4. ����������� | 5. ���α׷�����");
	         System.out.println("-----------------------------------------------------------------------------------");
	         System.out.println("����>>");
	         int selectNO = scanner.nextInt();
	         if(selectNO == 1) {
	            createEmpInfo();   //�޼ҵ� ȣ��
	         }else if(selectNO == 2) {
	            searchEmpInfo();
	         }else if(selectNO==3) {
	            modifyEmpInfo();
	         }else if(selectNO==4) {
	            deleteEmpInfo();
	         }else if(selectNO==5) {
	            break;
		            //run = false;
	         }
	      }
	      scanner.close();
	      System.out.println("���α׷� ����");
	   }
	}

 

 