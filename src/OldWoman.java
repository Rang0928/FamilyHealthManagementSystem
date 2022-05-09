import java.util.Scanner;

public class OldWoman extends Member implements MemberInput {
	
	public OldWoman (MemberKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.println("������ �������� ������ �������ּ���.");
		System.out.print("���ο� ������ ID:");
		String id= input.next();
		this.setId(id);

		System.out.print("���ο� ������ PW:");
		int password= input.nextInt();
		this.setPassword(password);

		System.out.print("���ο� ������ �̸�:");
		String name= input.next();
		this.setName(name);

		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			System.out.print("�̸����� ������ �ֽ��ϱ�? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {		
				System.out.print("���ο� ������ �̸���:");
				String email= input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.setEmail("");
				break;
			}
			else {			
			}
		}	

		System.out.print("���ο� ������ ��ȭ��ȣ:");
		String phonenumber= input.next();
		this.setPhonenumber(phonenumber);
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case OldMan:
			skind = "OM.";
			break;
		case OldWoman:
			skind = "OW.";
			break;
		case YoungMan:
			skind = "YM.";
			break;
		case YoungWoman:
			skind = "YW.";
			break;
		default:			
		}
		System.out.println("�з�:" + skind + "�̸�:" + name + " ID:" + id + " ��й�ȣ:" + password + " �̸���:" + email + " ��ȭ��ȣ:" + phonenumber + "��ȣ���� �̸���:" + email + "��ȣ���� ��ȭ��ȣ:" + phonenumber );
	}
}