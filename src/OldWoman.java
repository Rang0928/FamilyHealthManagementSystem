import java.util.Scanner;

public class OldWoman extends Member implements MemberInput {
	
	public OldWoman (MemberKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.println("가입할 구성원의 내용을 기입해주세요.");
		System.out.print("새로운 구성원 ID:");
		String id= input.next();
		this.setId(id);

		System.out.print("새로운 구성원 PW:");
		int password= input.nextInt();
		this.setPassword(password);

		System.out.print("새로운 구성원 이름:");
		String name= input.next();
		this.setName(name);

		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			System.out.print("이메일을 가지고 있습니까? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {		
				System.out.print("새로운 구성원 이메일:");
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

		System.out.print("새로운 구성원 전화번호:");
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
		System.out.println("분류:" + skind + "이름:" + name + " ID:" + id + " 비밀번호:" + password + " 이메일:" + email + " 전화번호:" + phonenumber + "보호자의 이메일:" + email + "보호자의 전화번호:" + phonenumber );
	}
}