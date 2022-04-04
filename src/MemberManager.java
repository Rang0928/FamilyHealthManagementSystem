import java.util.Scanner;

public class MemberManager {
	Member member;
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void AddMember() {
		member = new Member();
		System.out.println("가입할 구성원의 내용을 기입해주세요.");
        System.out.print("새로운 구성원 ID:");
        member.id= input.next();
        System.out.print("새로운 구성원 PW:");
        member.password= input.nextInt();
		System.out.print("새로운 구성원 이름:");
		member.name= input.next();
        System.out.print("새로운 구성원 이메일:");
        member.email= input.next();
        System.out.print("새로운 구성원 전화번호:");
        member.phonenumber= input.next();
        System.out.println(member.name + "님이 추가되었습니다.");
    }
	
	public void DeleteMember() {
    	System.out.print("삭제하고자 하는 구성원의 ID를 기입해주세요:");
    	String id= input.next();		
		if (member.id == null) {
			System.out.println(id + "님은 미등록 상태입니다.");
			return;
		}
		if (member.id.equals(id)) {
			member = null;
	    	System.out.println(id + "님은 삭제되었습니다.");
		}
    }
	
	public void ViewMember() {
		System.out.print("확인하고자 하는 구성원 ID를 기입해주세요:");
    	String id= input.next();	
		if (member.id.equals(id)) {
			member.printInfo();
		}
	}
}
