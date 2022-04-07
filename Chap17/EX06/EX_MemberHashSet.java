package Chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//HashSet���� ��ȯ
//MemberŬ������ memberId �÷��� equals(), hashCode() �������ؼ� ������ ��ü�� �ν�

//�߿� : Set�� �ߺ��� ���� ������ �� ����.
	//Wrpper Ŭ������ Integer,Long, Double, Float, Character, Byte, Short, Boolean
	//Wrapper Ŭ������ equals(), hashCode()�޼ҵ尡 ������ �Ǿ� �ִ�.
	//Ư����ü�� ������ �� ��ü�� Set�� ������ ��� �� ��ü�� ObjectŬ������ equals(), hashCOde9)�� ������ ������Ѵ�.
	//��ü�� Ư�� �ʵ��� ���� ������ �ߺ��� �ĺ��ϴ� �ʵ带 ����.

class Member{					//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;		//Set�� ���� �ĺ���, memberid�ʵ��� ���� ������
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
	@Override
	public int hashCode() {
		//return memberid;		//this.memberid
		//return this.memberId;	/�ϳ��� �ʵ常�� �������� hashCode()����
		return Objects.hashCode(memberId); //�������
	}
	@Override	//member1.equals(member2)
	public boolean equals(Object obj) {
		if(obj instanceof Member) { 				// ��ü�� ������ Object�� ��ĳ����
			Member member = (Member)obj;	//obj�� Object�� ��ĳ���õǾ �ٿ�ĳ����
			if(this.memberId == ((Member)obj).memberId)	//this.memberid : member1��ü�� , member.memberid: member2
			return true;
		}
		return false; 
	}
}

class MemberHashSet{			//MemberhashSet�� ��üȭ�ϸ� hashSet ��ü�� �����ȴ�.
	
	private Set<Member> hashSet;	//Set���� : <Member>
	
		//Set<Member> hashSet = new HashSet<Member>();
	
	//List<Member> aList = new hashSet<Member>();			���ʸ�Ÿ��Ŭ���� ��ü ����.
	//hashSet<Member> hashSet = new hashSet<Member>();
	
	public MemberHashSet() {		//�⺻ ������ ȣ��� Set�� �������� Ȱ��ȭ
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {		//Member��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		//�ڵ� ���
		hashSet.add(member);	//Member��ü�� input�޾� hashSet�� member��ü�� ����, �ߺ� ����Ǹ� �ȵȴ�.
		
	}
public boolean removeMember(int memberId) {		//memberid�� Member��ü ���� �ʵ��̹Ƿ� Set�� ����� ��ü�� �����;��Ѵ�.
		//Set�� index�� �������� �����Ƿ� �⺻ for���� ����� �� ����.
		//���� for���� ����� �� �ְ�, iterator�� ����Ҽ� �ִ�.
	
	
		//iterator����ؼ� remove
		Iterator<Member> im = hashSet.iterator();	//iterator : ��ȸ��
		
		while(im.hasNext()) {					//hasNext() : hashSet�� ���� �����Ҷ� true, false
			Member member = im.next();		//Next(); ���� �����ְ� ���� ������ �̵�.
			int tempId = member.getMemberId();	
			if(memberId == tempId) {	
				hashSet.remove(member);	
				return true;
			}
		}
		System.out.println("������ ����� ã�� ���߽��ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		//iterator ����ؼ� showAllMember
		for(Member member : hashSet) {
			System.out.println(member+" ");
		}
	}
	public void showSize() {
		hashSet.size();
		System.out.println(hashSet.size());
	}
	
}

public class EX_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberhashSet = new MemberHashSet();	
			//��ü�� �����ϴ� ���� hashSet�ʵ尡 Ȱ��ȭ
			//�żҵ� ȣ���ϱ� ���ؼ� ��ü ����.
			//addMember(), addMember2(), removeMember(), showAllmember()
		
		
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee2 = new Member(1001, "������");
		
		System.out.println("=======================����� �߰�======================");
		memberhashSet.addMember(memberLee);			//�� ��ü�� �����ؼ� hashSet�� ����
		memberhashSet.addMember(memberSon);
		memberhashSet.addMember(memberPark);
		memberhashSet.addMember(memberHong);
		memberhashSet.addMember(memberLee2);	
		memberhashSet.showAllMember();
		memberhashSet.showSize();
	
		System.out.println("===========================��ü����=======================");
		//��� ����� ���� ���
		memberhashSet.showAllMember();
		memberhashSet.showSize();
		System.out.println("=======================������ ��ü����=======================");
		//Ư�� Id�� ���� ����� ����
		memberhashSet.removeMember(1003);
		memberhashSet.showAllMember();
		memberhashSet.showSize();
		
	}

}
