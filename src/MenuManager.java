import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	static EventLogger Logger =  new EventLogger("log.txt");

	public static void main(String[] args) {
		getObject
		
		Scanner input = new Scanner(System.in);
		MemberManager memberManager = getObject("membermanager.ser");
		if (memberManager == null) {
			memberManager == new MemberManager(input);
		}
				// new MemberManager(input);
		
		selectMenu(input, memeberManager);
		putObject(studnetManager, "membermanager.ser");

	}
	
    public static void selectMenu(Scanner input, MemberManager memeberManager) {
    	int num = -1;
    	while (num != 5) {
    		try {
    			showMenu();
    			num = input.nextInt();
    			switch(num) {
    			case 1:
    				memberManager.addMember();
    				Logger.log("add a student");
    				break;
    			case 2:
    				memberManager.addMember();
    				Logger.log("delete a student");
    				break;
    			case 3:
    				memberManager.editMember();
    				Logger.log("edit a student");
    				break;
    			case 4:
    				memberManager.viewMember();
    				Logger.log("edit a list of member");
    				break;
    			default:
    				continue;
    			}
    		}
    		catch(InputMismatchException e) {
    			System.out.println("1과 5사이의 정수값을 넣어주세요!");
    			if (input.hasNext()) {
    				input.next();
    			}
    			num = -1;
    		}
    	}
    }
    
    public static void showMenu() {
    	System.out.println("****가족 건강 관리 시스템****");
		System.out.println("     메뉴를 선택해주세요     ");

		System.out.println("1.구성원 조회");
		System.out.println("2.구성원 상태 및 개선점");
		System.out.println("3.구성원 수정");
		System.out.println("4.구성원 추가");
		System.out.println("5.구성원 삭제");
		System.out.println("6.나가기");
		System.out.println("************************");

		System.out.println("1~6번 중 원하는 메뉴를 골라주세요.");
    }
    
    public static void getObject(String filename) {
    	MemberManager memberManager = null;
    	try {
    		FileInputStream file = new FileInputStream(filename);
    	    ObjectInputStream in =  new ObjectInputStream(file);
    	    
    	    memberManager = (MemberManager) in.readObject();
    	    
    	    in.close();
    	    file.close();   	    
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}  	
    	return memberManager;   	
    }
    
    public static void putObject(MemberManager memberManager, String filename) {
    	try {
    		FileOutputStream file = new FileOutputStream(filename);
    	    ObjectOutputStream out =  new ObjectOutputStream(file);
    	    
    	    out.writeObject(memberManager);
    	    
    	    out.close();
    	    file.close();   	    
    	} catch (FileNotFoundException e) {
    		return memberManger;
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}    	
    	return memberManager;    	
    }
}