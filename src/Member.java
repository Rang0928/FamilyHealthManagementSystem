import java.util.Scanner;

public class Member {
	protected MemberKind kind = MemberKind.OldMan;
	protected String id;
	protected int password;
	protected String name;
	protected String email;
	protected String phonenumber;

	public Member() {
	}

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member(String id, int password, String name, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;		
	}
	
	public Member(MemberKind kind, String id, int password, String name, String email, String phone) {
		this.kind = kind;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;		
	}

	public MemberKind getKind() {
		return kind;
	}

	public void setKind(MemberKind kind) {
		this.kind = kind;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
		
		System.out.print("새로운 구성원 이메일:");
		String email= input.next();
		this.setEmail(email);
		
		System.out.print("새로운 구성원 전화번호:");
		String phonenumber= input.next();
		this.setPhonenumber(phonenumber);
	}
}