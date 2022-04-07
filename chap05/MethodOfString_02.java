package chap05;

import java.util.Arrays;

public class MethodOfString_02 {

	public static void main(String[] args) {
		//5 ���ڿ� ����
		//toLowerCase() : �ҹ��ڷ� ��ȯ, toUppercase() : �빮�ڷ� ��ȯ
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());		//java study
		System.out.println(str1.toUpperCase());		//JAVA STUDY
		System.out.println();

		//replace(old,new)	: old �� new�� �ٲ�.
		System.out.println(str1.replace("Study", "����"));	//Java ����
		
		//substring(����index, �ڸ� ������ index �ձ���) : ���ڿ��� �߶� ���
		System.out.println(str1.substring(0,5));	//Java
		System.out.println(str1.substring(6,8));	//tu
		
		//split() : Ư�� ���ڸ� �������� �߶� String[] �迭�� ����.
		
		String str11 = "abc/def-ghi jkl";
		String[] strArray = str11.split("/|-| ");			// .split("�ڸ�����1 |(or)�ڸ�����2|�ڸ�����3")
															//	'/'�Ǵ� '-'�Ǵ� '����'
		System.out.println(Arrays.toString(strArray));
		
		String str111 = "������ ������ �帳�ϴ�. ";
		String[] strArray1 = str111.split(" ");				//������ �������� �߶� strArray2 �迭�� ����
		System.out.println(Arrays.toString(strArray1));
		
		String str1111 = "�̸�, ����, ����, ��ȭ��ȣ, �����ּ�";
		String[] strArray3 = str1111.split(",");
		System.out.println(Arrays.toString(strArray3));
		System.out.println();
		
		System.out.println("        abc          ");
		System.out.println("        abc          ".trim());
		System.out.println("====================================");
		//6. ���ڿ��� ���� ��.equals() : ��ҹ��� �����ϸ鼭 ���� ��.
				//equalsIgnoreCase() : ��ҹ��� �������� ���� ���.
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//�޸��� �ּ� �� ��(==)
		System.out.println(str2==str3);	//false
		System.out.println(str3==str4);	//false
		System.out.println(str4==str2);	//false
		// ? : �� new�� ���⶧���� 
		System.out.println();
		//���� ��( equals(), equalsIgnoreCase())
		System.out.println(str2.equals(str3));				//true , ��ҹ��� ����
		System.out.println(str3.equals(str4));				//false , ��ҹ��� ����
		System.out.println(str4.equals(str2));				//false , ��ҹ��� ����
		System.out.println(str3.equalsIgnoreCase(str4));	//true , ��ҹ��� �������� �ʴ´�.
	}

}
