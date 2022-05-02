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
		System.out.println("�з�:" + skind + "�̸�:" + name + " ID:" + id + " ��й�ȣ:" + password + " �̸���:" + email + " ��ȭ��ȣ:" + phonenumber + "��ȣ���� �̸���:" + email + "��ȣ���� ��ȭ��ȣ:" + phonenumber );
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
		
		System.out.print("���ο� ������ �̸���:");
		String email= input.next();
		this.setEmail(email);
		
		System.out.print("���ο� ������ ��ȭ��ȣ:");
		String phonenumber= input.next();
		this.setPhonenumber(phonenumber);
	}
}