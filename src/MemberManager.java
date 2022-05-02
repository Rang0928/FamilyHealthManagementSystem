import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	ArrayList<Member> members =  new ArrayList<Member>();
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}

	public void EditMember() {
		System.out.print("�������� ID:");
		String memberid = input.next();
		for (int i = 0; i<members.size(); i++) {
			Member member = members.get(i);
			if (member.getId() == memberid) {
				int num = 0;				
				while (num < 6) { // �޴��� 6�� ������ num�� ���� ���ѽ�Ų��.
					System.out.println("****���� �ǰ� ���� �ý���****");
					System.out.println("     �޴��� �������ּ���     ");

					System.out.println("1.������ ��ȸ");
					System.out.println("2.������ ����");
					System.out.println("3.������ ������");
					System.out.println("4.������ �߰�");
					System.out.println("5.������ ����");
					System.out.println("6.������");
					System.out.println("************************");

					System.out.println("1~6�� �� ���ϴ� �޴��� ����ּ���.");
					num = input.nextInt(); // ���ϴ� ��ȣ�� �Է��� �� �ְ� �����.

					//if�� switch���� �̿��Ͽ� ǥ�������ϸ� ���� switch���� �̿��Ͽ� �������.
					if (num == 1) { // 1���� �������� ��ȸ�ϰ� ������ ���������� �˾ƺ� �� �ִ�.
						System.out.print("������ ID:");
						String id = input.next();
						member.setId(id);
					}
					if (num == 1) { // 2���� �������� ��ȸ�Ͽ� �ǰ����³� ���»����� �˾ƺ� �� �ִ�.
						System.out.print("������ PW:");
						int password = input.nextInt();
						member.setPassword(password);
					}	
					if (num == 2) { // 3���� �������� ��ȸ�Ͽ� 2���� ���߾� ������ �� ��������� �˾ƺ� �� �ִ�.
						System.out.print("������ �̸�:");	
						String name = input.next();
						member.setName(name);
					}
					if (num == 3) { // 4���� ���ο� �������� �߰��� �� �ִ�.
						System.out.print("������ Email:");
						String email = input.next();
						member.setEmail(email);
					}
					if (num == 4) { // 5���� ���� �������� ������ �� �ִ�.
						System.out.print("������ PN:");
						String phonenumber = input.next();
						member.setPhonenumber(phonenumber);
					}
					if (num == 5) { // 6���� �޴����� ������ ����̸� while������ break�Ͽ� ��������.
						continue;
					}		  
				}
				break;
			}
		}
	}

	public void AddMember() {
		int kind = 0;
		Member member;
		while (kind != 1 && kind != 2) {
			System.out.println("1��-���� ����");
			System.out.println("2��-���� ����");
			System.out.println("3��-��� ����");
			System.out.println("4��-��� ����");
			System.out.print("1������ 4�� �� �������� ������ �´� ��ȣ�� ���ÿ�:");
			kind = input.nextInt();
			if (kind == 1) {
				member = new Member(MemberKind.OldMan);
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if (kind == 2) {
				member = new OldWoman(MemberKind.OldWoman);
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if (kind == 3) {
				member = new YoungMan(MemberKind.YoungMan);
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if (kind == 4) {
				member = new YoungWoman(MemberKind.YoungWoman);
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else {
				System.out.print("1������ 4�� �� �������� ������ �´� ��ȣ�� ���ÿ�:");
			}
		}		
	}
	

	public void DeleteMember() {
		System.out.print("�����ϰ��� �ϴ� �������� ID�� �������ּ���:");
		String id = input.next();
		int index = -1;
		for(int i = 0; i<members.size(); i++) {   		
			if (members.get(i).getId() == id) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			members.remove(index);
			System.out.println(id + "���� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println(id + "���� �̵�� �����Դϴ�.");
			return;
		}
	}

	public void ViewMember() {
		//		System.out.print("Ȯ���ϰ��� �ϴ� ������ ID�� �������ּ���:");
		//		String id= input.next();
		System.out.println("# of registered members:" + members.size());
		for(int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
	}
}