import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager implements Serializable {
	
	
	
	
	private static final long serialVersionUID = 3685095473703752321L;

	
	ArrayList<MemberInput> members =  new ArrayList<MemberInput>();
	transient Scanner input;
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}

	public void EditMember() {
		System.out.print("구성원의 ID:");
		String memberid = input.next();
		for (int i = 0; i<members.size(); i++) {
			MemberInput memberinput = members.get(i);
			if (memberinput.getId() == memberid) {
				int num = 0;				
				while (num < 6) { // 메뉴가 6개 임으로 num의 수를 제한시킨다.
					showMenu();
					num = input.nextInt();

					System.out.println("1~6번 중 원하는 메뉴를 골라주세요.");
					num = input.nextInt(); // 원하는 번호를 입력할 수 있게 만든다.
					
					switch(num) {
					case1:
						MemberManager.addMember();
						break;
					case2:
						MemberManager.deleteMember();
						break;
					case3:
						MemberManager.editMember();
						break;
					case4:
						MemberManager.viewMember();
						break;
					default:
					    continue;
					}


					//if나 switch문을 이용하여 표현가능하며 나는 switch문을 이용하여 만들었다.
					if (num == 1) { // 1번은 구성원을 조회하고 간단한 인적사항을 알아볼 수 있다.
						System.out.print("구성원 ID:");
						String id = input.next();
						memberinput.setId(id);
					}
					else if (num == 2) { // 2번은 구성원을 조회하여 건강상태나 병력사항을 알아볼 수 있다.
						System.out.print("구성원 PW:");
						int password = input.nextInt();
						memberinput.setPassword(password);
					}	
					else if (num == 3) { // 3번은 구성원을 조회하여 2번에 맞추어 개선점 및 고려사항을 알아볼 수 있다.
						System.out.print("구성원 이름:");	
						String name = input.next();
						memberinput.setName(name);
					}
					else if (num == 4) { // 4번은 새로운 구성원을 추가할 수 있다.
						System.out.print("구성원 Email:");
						String email = input.next();
						memberinput.setEmail(email);
					}
					else if (num == 5) { // 5번은 기존 구성원을 삭제할 수 있다.
						System.out.print("구성원 PN:");
						String phonenumber = input.next();
						memberinput.setPhonenumber(phonenumber);
					}
					else (num == 6) { // 6번은 메뉴에서 나가는 기능이며 while문에서 break하여 나가진다.
						continue;
					}		  
				}
				break;
			}
		}
	}

	public void AddMember() {
		
		int kind = 0;
		MemberInput memberInput;
		while (kind != 1 && kind != 2) {
			System.out.println("1번-성인 남자");
			System.out.println("2번-성인 여자");
			System.out.println("3번-어린이 남자");
			System.out.println("4번-어린이 여자");
			System.out.print("1번에서 4번 중 구성원의 성별에 맞는 번호를 고르시오:");
			kind = input.nextInt();
			if (kind == 1) {
				memberInput = new OldMan(MemberKind.OldMan);
				memberInput.getUserInput(input);
				members.add(memberInput);
				break;
			}
			else if (kind == 2) {
				memberInput = new OldWoman(MemberKind.OldWoman);
				memberInput.getUserInput(input);
				members.add(memberInput);
				break;
			}
			else if (kind == 3) {
				memberInput = new YoungMan(MemberKind.YoungMan);
				memberInput.getUserInput(input);
				members.add(memberInput);
				break;
			}
			else if (kind == 4) {
				memberInput = new YoungWoman(MemberKind.YoungWoman);
				memberInput.getUserInput(input);
				members.add(memberInput);
				break;
			}
			else {
				System.out.print("1번에서 4번 중 구성원의 성별에 맞는 번호를 고르시오:");
			}
		}		
	}
	
	public static void showMenu() {
		System.out.println("****가족 건강 관리 시스템****");
		System.out.println("     메뉴를 선택해주세요     ");

		System.out.println("1.구성원 조회");
		System.out.println("2.구성원 상태");
		System.out.println("3.구성원 개선점");
		System.out.println("4.구성원 추가");
		System.out.println("5.구성원 삭제");
		System.out.println("6.나가기");
		System.out.println("************************");
	}
	

	public void DeleteMember() {
		System.out.print("삭제하고자 하는 구성원의 ID를 기입해주세요:");
		String id = input.next();
		int index = -1;
		for(int i = 0; i<members.size(); i++) {   		
			if (memberInput.get(i).getId() == id) {
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
		System.out.println("# of registered members:" + members.size());
		for(int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
	}
}