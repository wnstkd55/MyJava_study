package Chap17.EX05;

import java.util.ArrayList;

class Member{					//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {	//�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.memberId = memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
		public String toString() {
			return memberName+"ȸ������ ���̵�� "+ memberId+" �Դϴ�.";
		}
	
}

class MemberArrayList{			//MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� �����ȴ�.
	private ArrayList<Member> arrayList;
	
	//List<Member> aList = new ArrayList<Member>();			���ʸ�Ÿ��Ŭ���� ��ü ����.
	//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {		//�⺻ ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {		//Member��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		//�ڵ� ���
		arrayList.add(member);
		
	}
	public void addMember2(int a, Member member) {		//�Ű�����2���� �޾Ƽ� Ư�� index�� ��ȣ�� ���� ����
		//�ڵ� ���
		
		try {
			arrayList.add(a, member);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ȣ�� ��Ȯ�ϰ��Է��ϼ���");
		}
		
		
	}
	
	public boolean removeMember(int memberId) {
		//ArrayList�� ����� memberID�� �˻��ؼ� �ش簴ü�� �����ϴ� �޼ҵ�
		for(int i = 0; i < arrayList.size(); i++) {		//arrayList�� �ִ�� ��ŭ for���� �̿��Ͽ� memberID�˻�
			Member member = arrayList.get(i);			//�� �濡 ����� Member��ü�� member���������� �Ҵ�
			int id = member.getMemberId();			// ��ü�� getMemberID(), ��ü ������ memberId�� id�� �Ҵ�
			if(id == memberId) {				//������ ���� Member�� memberId�� �����ϰ���� memberId�� ���� ���ٸ�
				arrayList.remove(i);		//arrayList���� ����� ��ü�� ����
				System.out.println("ȸ������ "+memberId+"�� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
		
		
		
	}
	public void showAllMember() {
		//ArrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
		for (Member member : arrayList) {		//arrayList�� �迭ó�� for�� ������ �˴ϴ�!
			System.out.println(member);			//enhanced for�� ���
		}
		System.out.println();
		
		
		//for(int i=0; i<arrayList.sizeof(); i++){
		//		System.out.println(arrayList.get(i);
		//}
	}
	public void showSize() {
		arrayList.size();
		System.out.println(arrayList.size());
	}
}

public class EX_MemberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();	
			//��ü�� �����ϴ� ���� arrayList�ʵ尡 Ȱ��ȭ
			//�żҵ� ȣ���ϱ� ���ؼ� ��ü ����.
			//addMember(), addMember2(), removeMember(), showAllmember()
		
		
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		System.out.println("=======================����� �߰�======================");
		memberArrayList.addMember(memberLee);			//�� ��ü�� �����ؼ� ArrayList�� ����
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		System.out.println("===============Ư�� �ε������� ����� �߰�======================");
		
		//Ư�� index�濡 �߰����� ����� �߰�
		memberArrayList.addMember2(5, memberHong);		//���� ó��
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		System.out.println("===========================��ü����=======================");
		//��� ����� ���� ���
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		System.out.println("=======================������ ��ü����=======================");
		//Ư�� Id�� ���� ����� ����
		memberArrayList.removeMember(1003);
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		
	}

}
