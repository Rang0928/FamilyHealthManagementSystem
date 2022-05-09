import java.util.Scanner;

public class FHMS {
	public static void main(String[] args) { 
		Scanner input =  new Scanner(System.in);
		MemberManager memberManager =  new MemberManager(input);

		int num = 0;				
		while (num < 6) {
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
			num = input.nextInt(); 

			
			switch(num) {
			case 1: 
				memberManager.ViewMember();
				continue;
			case 2: 
				System.out.print("구성원 이름:");
				String MemberName2= input.next();
				System.out.print("구성원 건강상태:");
				String MemberHealthCondition= input.next();
				System.out.print("구성원 병력사항:");
				String MemberHealthHistory= input.next();
				System.out.print("구성원 개선점 및 고려사항:");
				String MemberHealthImprovementsandConsiderations= input.next();
				continue;
			case 3: 
				memberManager.EditMember();
				continue;
			case 4: 
				memberManager.AddMember();
				continue;
			case 5: 
				memberManager.DeleteMember();
				continue;
			case 6: 
				System.out.println("시스템을 종료하겠습니다. 이용해주셔서 감사합니다.");
				break;
			}		  
		}
	}
}