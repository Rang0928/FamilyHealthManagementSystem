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
			if (member.id == memberid) {
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
						member.id = input.next();
					}
					if (num == 1) { // 2���� �������� ��ȸ�Ͽ� �ǰ����³� ���»����� �˾ƺ� �� �ִ�.
						System.out.print("������ PW:");
						member.password = input.nextInt();
					}	
					if (num == 2) { // 3���� �������� ��ȸ�Ͽ� 2���� ���߾� ������ �� ��������� �˾ƺ� �� �ִ�.
						System.out.print("������ �̸�:");	
						member.name = input.next();
					}
					if (num == 3) { // 4���� ���ο� �������� �߰��� �� �ִ�.
						System.out.print("������ Email:");
						member.email = input.next();
					}
					if (num == 4) { // 5���� ���� �������� ������ �� �ִ�.
						System.out.print("������ PN:");
						member.phonenumber = input.next();
					}
					if (num == 5) { // 6���� �޴����� ������ ����̸� while������ break�Ͽ� ��������.
						continue;
					}		  
				}
			}
		}
	}

	public void AddMember() {
		Member member = new Member();
		System.out.println("������ �������� ������ �������ּ���.");
		System.out.print("���ο� ������ ID:");
		member.id= input.next();
		System.out.print("���ο� ������ PW:");
		member.password= input.nextInt();
		System.out.print("���ο� ������ �̸�:");
		member.name= input.next();
		System.out.print("���ο� ������ �̸���:");
		member.email= input.next();
		System.out.print("���ο� ������ ��ȭ��ȣ:");
		member.phonenumber= input.next();
		members.add(member);
		System.out.println(member.name + "���� �߰��Ǿ����ϴ�.");
	}

	public void DeleteMember() {
		System.out.print("�����ϰ��� �ϴ� �������� ID�� �������ּ���:");
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
		for(int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
	}
}