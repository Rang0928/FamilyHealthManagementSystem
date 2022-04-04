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
		System.out.println("이름:" + name + " ID:" + id + " 비밀번호:" + password + " 이메일:" + email + " 전화번호:" + phonenumber);
	}
}