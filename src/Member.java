public class Member {	
	String id;
	int password;
	String name;
	String email;
	String phonenumber;
	
	public Member() {		
	}
	
	public Member(String name, String id) {
		this.id = id;
		this.password = password;
	}
	
	public Member(String name, String id, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;		
	}
	
	public void printInfo() {
		System.out.println("�̸�:" + name + " ID:" + id + " ��й�ȣ:" + password + " �̸���:" + email + " ��ȭ��ȣ:" + phonenumber);
	}
}