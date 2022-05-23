import java.io.Serializable;
import java.util.Scanner;

public abstract class Member implements MemberInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -65027500114073922126L;
	
	protected MemberKind kind = MemberKind.OldMan;
	protected String id;
	protected int password;
	protected String name;
	protected String email;
	protected String phonenumber;

	public Member() {
	}
	
	public Member(MemberKind kind) {
		this.kind = kind;
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
	
	public abstract void printInfo();
}	
