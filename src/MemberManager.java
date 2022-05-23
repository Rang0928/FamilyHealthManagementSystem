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
		System.out.print("�������� ID:");
		String memberid = input.next();
		for (int i = 0; i<members.size(); i++) {
			MemberInput memberinput = members.get(i);
			if (memberinput.getId() == memberid) {
				int num = 0;				
				while (num < 6) { // �޴��� 6�� ������ num�� ���� ���ѽ�Ų��.
					showMenu();
					num = input.nextInt();

					System.out.println("1~6�� �� ���ϴ� �޴��� ����ּ���.");
					num = input.nextInt(); // ���ϴ� ��ȣ�� �Է��� �� �ְ� �����.
					
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


					//if�� switch���� �̿��Ͽ� ǥ�������ϸ� ���� switch���� �̿��Ͽ� �������.
					if (num == 1) { // 1���� �������� ��ȸ�ϰ� ������ ���������� �˾ƺ� �� �ִ�.
						System.out.print("������ ID:");
						String id = input.next();
						memberinput.setId(id);
					}
					else if (num == 2) { // 2���� �������� ��ȸ�Ͽ� �ǰ����³� ���»����� �˾ƺ� �� �ִ�.
						System.out.print("������ PW:");
						int password = input.nextInt();
						memberinput.setPassword(password);
					}	
					else if (num == 3) { // 3���� �������� ��ȸ�Ͽ� 2���� ���߾� ������ �� ��������� �˾ƺ� �� �ִ�.
						System.out.print("������ �̸�:");	
						String name = input.next();
						memberinput.setName(name);
					}
					else if (num == 4) { // 4���� ���ο� �������� �߰��� �� �ִ�.
						System.out.print("������ Email:");
						String email = input.next();
						memberinput.setEmail(email);
					}
					else if (num == 5) { // 5���� ���� �������� ������ �� �ִ�.
						System.out.print("������ PN:");
						String phonenumber = input.next();
						memberinput.setPhonenumber(phonenumber);
					}
					else (num == 6) { // 6���� �޴����� ������ ����̸� while������ break�Ͽ� ��������.
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
			System.out.println("1��-���� ����");
			System.out.println("2��-���� ����");
			System.out.println("3��-��� ����");
			System.out.println("4��-��� ����");
			System.out.print("1������ 4�� �� �������� ������ �´� ��ȣ�� ���ÿ�:");
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
				System.out.print("1������ 4�� �� �������� ������ �´� ��ȣ�� ���ÿ�:");
			}
		}		
	}
	
	public static void showMenu() {
		System.out.println("****���� �ǰ� ���� �ý���****");
		System.out.println("     �޴��� �������ּ���     ");

		System.out.println("1.������ ��ȸ");
		System.out.println("2.������ ����");
		System.out.println("3.������ ������");
		System.out.println("4.������ �߰�");
		System.out.println("5.������ ����");
		System.out.println("6.������");
		System.out.println("************************");
	}
	

	public void DeleteMember() {
		System.out.print("�����ϰ��� �ϴ� �������� ID�� �������ּ���:");
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