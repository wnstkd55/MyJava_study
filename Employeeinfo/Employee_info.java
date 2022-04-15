package Employeeinfo;

/*

 	- 사번 : 

- 이름 : 홍길동

- 연락처 : 

- 나이 :

- 부서 : 

- 직급 : 

 

홍길동님의 정보가 정상적으로 입력 되었습니다. 

 

메뉴 입력 : 2

사번	이름	연락처	나이	부서	직급

 

메뉴 입력 : 3

수정할 사번 :  

수정할 필드 선택 [1. 연락처, 2.나이, 3. 부서, 4.직급] : 

 

메뉴 입력 : 4

삭제할 사번 : 

홍길동 사원이 삭제 되었습니다. 

 

메뉴 입력 : 5

프로그램이 종료 되었습니다. 

 

 

==================================

1. TreeSet에 정보를 저장하세요.

2. 사번을 정렬해서 출력 해야 합니다. 

3. 사번은 중복해서 저장되면 안됩니다. 

==================================

 */

import java.util.Comparator;

import java.util.Iterator;

import java.util.Scanner;

import java.util.TreeSet;
class Employee{		//사원의 정보를 담은 클래스
	int empNo;		//사원번호
	String empName;		//사원이름
	String phone;
	int age;
	String dept;		//부서
	String compRank;		//직급
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
		return "사번: "+empNo+" 이름: "+empName+" 연락처: "+phone+" 나이: "+age+" 부서: "+dept+" 직급: "+compRank;
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

//Treeset : 중복된 데이터를 저장할 수 없다. Wrapper 클래스는 재정의 되어있다. equals(), hashCode()
	//정렬되어서 저장 Comparable compareTo(), Comparator compare()
		//일반객체를 set 자료형에 저장할때는 객체의 특정필드가 중복 저장되지않도록 equals(), hashCode() 재정의 필요...
	//wrapper : 기본자료형을 객체와 기본자료형에는 없는 메소드가 추가.(Boolean, Byte, Charactor, Integer, Double...)
		//Comparable compareTo() : 상속해서 구현, 객체 수정, COmparator compare() : 수정없이 사용 가능하도록 재정의
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
		System.out.println("- 사번 : ");
		int empNo = scanner.nextInt();
		System.out.println("- 이름 : ");
		String empName = scanner.next();
		System.out.println("- 연락처 : ");
		String phone = scanner.next();
		System.out.println("- 나이 : ");
		int age = scanner.nextInt();
		System.out.println("- 부서 : ");
		String dept = scanner.next();
		System.out.println("- 직급 : ");
		String compRank = scanner.next();
		eSet.add(new Employee(empNo,empName,phone,age,dept,compRank));
		System.out.println(empName+ "님의 정보가 정상적으로 입력 되었습니다.");
	}
	private static void searchEmpInfo() {
		Iterator<Employee> ie = eSet.iterator();
		while(ie.hasNext()) {
			System.out.println(ie.next());
		}
		System.out.println();
	}
	private static void modifyEmpInfo() {
		System.out.println("사원번호를 입력해주세요 >> ");
		int empNo = scanner.nextInt();
		if(findEmpNo(empNo) == null) {
			System.out.println("해당하는 사원이 없습니다.");
			return;
		}
		System.out.println("수정할 필드 선택 [1. 연락처, 2. 나이, 3. 부서, 4. 직급]");
		int select = scanner.nextInt();
		if(select == 1) {
			System.out.println("수정할 연락처를 입력하세요 >> ");
			String mo_Phone = scanner.next();

			findEmpNo(empNo).setPhone(mo_Phone);

			System.out.println(findEmpNo(empNo).getPhone()+"로 수정되었습니다.");

		}

		else if(select == 2){

			System.out.println("수정할 나이를 입력하세요 >> ");

			int mo_age = scanner.nextInt();

			findEmpNo(empNo).setAge(mo_age);

			System.out.println(findEmpNo(empNo).getAge()+"로 수정되었습니다.");

		}

		else if(select == 3){

			System.out.println("수정할 부서를 입력하세요 >> ");

			String mo_Dept = scanner.next();

			findEmpNo(empNo).setDept(mo_Dept);

			System.out.println(findEmpNo(empNo).getDept()+"로 수정되었습니다.");

		}

		else if(select == 4){

			System.out.println("수정할 직급을 입력하세요 >> ");

			String mo_CR = scanner.next();

			findEmpNo(empNo).setCompRank(mo_CR);

			System.out.println(findEmpNo(empNo).getCompRank()+"로 수정되었습니다.");

		}

	}

	private static void deleteEmpInfo() {

		System.out.println("사원번호를 입력해주세요 >> ");

		int empNo = scanner.nextInt();

		Employee employee = findEmpNo(empNo);

		if(findEmpNo(empNo) == null) {

			System.out.println("해당하는 사원이 없습니다.");

			return;

		}

		eSet.remove(employee);

		System.out.println(employee.getEmpName()+"사원이 삭제되었습니다.");

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
	         System.out.println("1. 사원정보 신규등록 | 2. 사원정보 검색 | 3. 사원정보 수정 | 4. 사원정보삭제 | 5. 프로그램종료");
	         System.out.println("-----------------------------------------------------------------------------------");
	         System.out.println("선택>>");
	         int selectNO = scanner.nextInt();
	         if(selectNO == 1) {
	            createEmpInfo();   //메소드 호출
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
	      System.out.println("프로그램 종료");
	   }
	}

 

 