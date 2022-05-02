import java.util.Scanner;

public class OldMan extends Member {

	public OldMan (MemberKind kind) {
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
}
