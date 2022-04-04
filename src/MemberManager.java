import java.util.Scanner;

public class MemberManager {
	Member member;
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void AddMember() {
		member = new Member();
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
        System.out.println(member.name + "���� �߰��Ǿ����ϴ�.");
    }
	
	public void DeleteMember() {
    	System.out.print("�����ϰ��� �ϴ� �������� ID�� �������ּ���:");
    	String id= input.next();		
		if (member.id == null) {
			System.out.println(id + "���� �̵�� �����Դϴ�.");
			return;
		}
		if (member.id.equals(id)) {
			member = null;
	    	System.out.println(id + "���� �����Ǿ����ϴ�.");
		}
    }
	
	public void ViewMember() {
		System.out.print("Ȯ���ϰ��� �ϴ� ������ ID�� �������ּ���:");
    	String id= input.next();	
		if (member.id.equals(id)) {
			member.printInfo();
		}
	}
}
