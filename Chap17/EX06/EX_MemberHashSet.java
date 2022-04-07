package Chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//HashSet으로 변환
//Member클래스의 memberId 컬럼을 equals(), hashCode() 재정의해서 동일한 객체로 인식

//중요 : Set은 중복된 값을 저장할 수 없다.
	//Wrpper 클래스는 Integer,Long, Double, Float, Character, Byte, Short, Boolean
	//Wrapper 클래스는 equals(), hashCode()메소드가 재정의 되어 있다.
	//특정객체를 생성후 그 객체를 Set에 저장할 경우 그 객체의 Object클래스의 equals(), hashCOde9)를 재정의 해줘야한다.
	//객체의 특정 필드의 값이 같을때 중복을 식별하는 필드를 생성.

class Member{					//DTO, VO : 각 계층간의 데이터를 받아서 전달해주는 클래스
	private int memberId;		//Set에 넣을 식별자, memberid필드의 값이 같을때
	private String memberName;
	
	public Member(int memberId, String memberName) {	//생성자를 통해서 필드의 값 할당
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
			return memberName+"회원님의 아이디는 "+ memberId+" 입니다.";
		}
	@Override
	public int hashCode() {
		//return memberid;		//this.memberid
		//return this.memberId;	/하나의 필드만을 조건으로 hashCode()생성
		return Objects.hashCode(memberId); //권장사항
	}
	@Override	//member1.equals(member2)
	public boolean equals(Object obj) {
		if(obj instanceof Member) { 				// 객체의 정보가 Object로 업캐스팅
			Member member = (Member)obj;	//obj는 Object로 업캐스팅되어서 다운캐스팅
			if(this.memberId == ((Member)obj).memberId)	//this.memberid : member1객체의 , member.memberid: member2
			return true;
		}
		return false; 
	}
}

class MemberHashSet{			//MemberhashSet를 객체화하면 hashSet 객체가 생성된다.
	
	private Set<Member> hashSet;	//Set선언 : <Member>
	
		//Set<Member> hashSet = new HashSet<Member>();
	
	//List<Member> aList = new hashSet<Member>();			제너릭타입클래스 객체 생성.
	//hashSet<Member> hashSet = new hashSet<Member>();
	
	public MemberHashSet() {		//기본 생성자 호출시 Set의 참조변수 활성화
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {		//Member객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		//코드 블락
		hashSet.add(member);	//Member객체를 input받아 hashSet에 member객체를 저장, 중복 저장되면 안된다.
		
	}
public boolean removeMember(int memberId) {		//memberid는 Member객체 내의 필드이므로 Set에 저장된 객체를 가져와야한다.
		//Set은 index가 존재하지 않으므로 기본 for문은 사용할 수 없다.
		//향상된 for문을 사용할 수 있고, iterator를 사용할수 있다.
	
	
		//iterator사용해서 remove
		Iterator<Member> im = hashSet.iterator();	//iterator : 순회자
		
		while(im.hasNext()) {					//hasNext() : hashSet에 값이 존재할때 true, false
			Member member = im.next();		//Next(); 값을 던져주고 다음 값으로 이동.
			int tempId = member.getMemberId();	
			if(memberId == tempId) {	
				hashSet.remove(member);	
				return true;
			}
		}
		System.out.println("제거할 대상을 찾지 못했습니다.");
		return false;
		
	}
	
	public void showAllMember() {
		//iterator 사용해서 showAllMember
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
			//객체를 생성하는 순간 hashSet필드가 활성화
			//매소드 호출하기 위해서 객체 생성.
			//addMember(), addMember2(), removeMember(), showAllmember()
		
		
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee2 = new Member(1001, "이지원");
		
		System.out.println("=======================사용자 추가======================");
		memberhashSet.addMember(memberLee);			//각 객체를 생성해서 hashSet에 저장
		memberhashSet.addMember(memberSon);
		memberhashSet.addMember(memberPark);
		memberhashSet.addMember(memberHong);
		memberhashSet.addMember(memberLee2);	
		memberhashSet.showAllMember();
		memberhashSet.showSize();
	
		System.out.println("===========================전체보기=======================");
		//모든 사용자 정보 출력
		memberhashSet.showAllMember();
		memberhashSet.showSize();
		System.out.println("=======================제거후 전체보기=======================");
		//특정 Id를 가진 사용자 제거
		memberhashSet.removeMember(1003);
		memberhashSet.showAllMember();
		memberhashSet.showSize();
		
	}

}
