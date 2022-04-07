package Chap17.EX05;

import java.util.ArrayList;

class Member{					//DTO, VO : 각 계층간의 데이터를 받아서 전달해주는 클래스
	private int memberId;
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
	
}

class MemberArrayList{			//MemberArrayList를 객체화하면 ArrayList 객체가 생성된다.
	private ArrayList<Member> arrayList;
	
	//List<Member> aList = new ArrayList<Member>();			제너릭타입클래스 객체 생성.
	//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {		//기본 생성자
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {		//Member객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		//코드 블락
		arrayList.add(member);
		
	}
	public void addMember2(int a, Member member) {		//매개변수2개를 받아서 특정 index방 번호에 값을 삽입
		//코드 블락
		
		try {
			arrayList.add(a, member);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외가 발생되었습니다. 방번호를 정확하게입력하세요");
		}
		
		
	}
	
	public boolean removeMember(int memberId) {
		//ArrayList에 저장된 memberID를 검색해서 해당객체를 삭제하는 메소드
		for(int i = 0; i < arrayList.size(); i++) {		//arrayList의 최대방 만큼 for문을 이용하여 memberID검색
			Member member = arrayList.get(i);			//각 방에 저장된 Member객체를 member참조변수에 할당
			int id = member.getMemberId();			// 객체의 getMemberID(), 객체 내부의 memberId를 id로 할당
			if(id == memberId) {				//조건절 만약 Member의 memberId와 삭제하고싶은 memberId의 값이 같다면
				arrayList.remove(i);		//arrayList방의 저장된 객체를 제거
				System.out.println("회원님의 "+memberId+"는 삭제되었습니다.");
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
		
		
		
	}
	public void showAllMember() {
		//ArrayList에 저장된 모든 사용자 정보를 출력하는 메소드
		for (Member member : arrayList) {		//arrayList는 배열처럼 for문 굴리면 됩니다!
			System.out.println(member);			//enhanced for문 사용
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
			//객체를 생성하는 순간 arrayList필드가 활성화
			//매소드 호출하기 위해서 객체 생성.
			//addMember(), addMember2(), removeMember(), showAllmember()
		
		
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		System.out.println("=======================사용자 추가======================");
		memberArrayList.addMember(memberLee);			//각 객체를 생성해서 ArrayList에 저장
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		System.out.println("===============특정 인덱스에서 사용자 추가======================");
		
		//특정 index방에 추가적인 사용자 추가
		memberArrayList.addMember2(5, memberHong);		//예외 처리
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		System.out.println("===========================전체보기=======================");
		//모든 사용자 정보 출력
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		System.out.println("=======================제거후 전체보기=======================");
		//특정 Id를 가진 사용자 제거
		memberArrayList.removeMember(1003);
		memberArrayList.showAllMember();
		memberArrayList.showSize();
		
	}

}
