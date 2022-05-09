import java.util.Scanner;

public interface MemberInput {
	
	public int getId();
	
	public void setId(String id);
	
	public void setName(String name);
	
	public void setEmail(String email);
	
	public void setPhonenumber(String phonenumber);
	
	public void getUserInput(Scanner input);

	public void setPassword(int password);

	public void printInfo();
}