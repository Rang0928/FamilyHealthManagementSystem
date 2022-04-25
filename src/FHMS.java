import java.util.Scanner;

public class FHMS {
	public static void main(String[] args) { // 먼저 Scanner type을 받아오고 새로운 메모리 값을 할당할 수 있도록만든다.
		Scanner input =  new Scanner(System.in);
		MemberManager memberManager =  new MemberManager(input);
		
		//System.out.print("아이디를 입력해주십시오:"); // 아이디와 비밀번호를 먼저 입력하고 접속이 이루어 지도록한다.
		//String ID = input.next();
		//System.out.print("비밀번호를 입력해주십시오:");
		//String PW = input.next();
				
		int num = 0;				
		while (num < 6) { // 메뉴가 6개 임으로 num의 수를 제한시킨다.
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
		    num = input.nextInt(); // 원하는 번호를 입력할 수 있게 만든다.		   
		}		  
	}
}
	