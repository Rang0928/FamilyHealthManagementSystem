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
		    System.out.println("2.구성원 상태");
		    System.out.println("3.구성원 개선점");
		    System.out.println("4.구성원 추가");
		    System.out.println("5.구성원 삭제");
		    System.out.println("6.나가기");
		    System.out.println("************************");
		    
		    System.out.println("1~6번 중 원하는 메뉴를 골라주세요.");
		    num = input.nextInt(); // 원하는 번호를 입력할 수 있게 만든다.
		   
		    //if나 switch문을 이용하여 표현가능하며 나는 switch문을 이용하여 만들었다.
		    switch(num) {
		    case 1: // 1번은 구성원을 조회하고 간단한 인적사항을 알아볼 수 있다.
		    	memberManager.ViewMember();
		    	continue;
		    case 2: // 2번은 구성원을 조회하여 건강상태나 병력사항을 알아볼 수 있다.
		    	System.out.print("구성원 이름:");
		    	String MemberName2= input.next();
		    	System.out.print("구성원 건강상태:");
		    	String MemberHealthCondition= input.next();
		    	System.out.print("구성원 병력사항:");
		    	String MemberHealthHistory= input.next();
		    	continue;
		    case 3: // 3번은 구성원을 조회하여 2번에 맞추어 개선점 및 고려사항을 알아볼 수 있다.
		    	System.out.print("구성원 이름:");
		    	String MemberName3= input.next();
		    	System.out.print("구성원 개선점 및 고려사항:");
		    	String MemberHealthImprovementsandConsiderations= input.next();
		    	continue;
		    case 4: // 4번은 새로운 구성원을 추가할 수 있다.
		    	memberManager.AddMember();
		    	continue;
		    case 5: // 5번은 기존 구성원을 삭제할 수 있다.
		    	memberManager.DeleteMember();
		    	continue;
		    case 6: // 6번은 메뉴에서 나가는 기능이며 while문에서 break하여 나가진다.
		    	System.out.println("시스템을 종료하겠습니다. 이용해주셔서 감사합니다.");
				break;
		    }		  
	    }
	}
}	