import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	ArrayList<Member> members =  new ArrayList<Member>();
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}

	public void EditMember() {
		System.out.print("구성원의 ID:");
		String memberid = input.next();
		for (int i = 0; i<members.size(); i++) {
			Member member = members.get(i);
			if (member.id == memberid) {
				int num = 0;				
				while (num < 6) { // 메뉴가 6개 임으로 num의 수를 제한시킨다.
					System.out.println("****가족 건강 관리 시스템****");
					System.out.println("     메뉴를 선택해주세요     ");

					System.out.println("1.구성원 조회");
					System.out.println("2.구성원 상태");
					System.out.println("3.구성원 개선점");
					System.out.println("4.구성원 추가");
					System.out.println("5.구성원 삭제");
					System.out.println("6.나가기");
					System.out.println("************************");

					System.out.println("1~6번 중 원하는 메뉴를 골라주세요.");
					num = input.nextInt(); // 원하는 번호를 입력할 수 있게 만든다.

					//if나 switch문을 이용하여 표현가능하며 나는 switch문을 이용하여 만들었다.
					if (num == 1) { // 1번은 구성원을 조회하고 간단한 인적사항을 알아볼 수 있다.
						System.out.print("구성원 ID:");
						member.id = input.next();
					}
					if (num == 1) { // 2번은 구성원을 조회하여 건강상태나 병력사항을 알아볼 수 있다.
						System.out.print("구성원 PW:");
						member.password = input.nextInt();
					}	
					if (num == 2) { // 3번은 구성원을 조회하여 2번에 맞추어 개선점 및 고려사항을 알아볼 수 있다.
						System.out.print("구성원 이름:");	
						member.name = input.next();
					}
					if (num == 3) { // 4번은 새로운 구성원을 추가할 수 있다.
						System.out.print("구성원 Email:");
						member.email = input.next();
					}
					if (num == 4) { // 5번은 기존 구성원을 삭제할 수 있다.
						System.out.print("구성원 PN:");
						member.phonenumber = input.next();
					}
					if (num == 5) { // 6번은 메뉴에서 나가는 기능이며 while문에서 break하여 나가진다.
						continue;
					}		  
				}
			}
		}
	}

	public void AddMember() {
		Member member = new Member();
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
		members.add(member);
		System.out.println(member.name + "님이 추가되었습니다.");
	}

	public void DeleteMember() {
		System.out.print("삭제하고자 하는 구성원의 ID를 기입해주세요:");
		String id = input.next();
		int index = -1;
		for(int i = 0; i<members.size(); i++) {   		
			if (members.get(i).id == id) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			members.remove(index);
			System.out.println(id + "님은 삭제되었습니다.");
		}
		else {
			System.out.println(id + "님은 미등록 상태입니다.");
			return;
		}
	}

	public void ViewMember() {
		//		System.out.print("확인하고자 하는 구성원 ID를 기입해주세요:");
		//		String id= input.next();
		for(int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
	}
}