import java.util.Scanner;

public class FHMS {
	public static void main(String[] args) { 
		Scanner input =  new Scanner(System.in);
		MemberManager memberManager =  new MemberManager(input);

		int num = 0;				
		while (num < 6) {
			System.out.println("****���� �ǰ� ���� �ý���****");
			System.out.println("     �޴��� �������ּ���     ");

			System.out.println("1.������ ��ȸ");
			System.out.println("2.������ ���� �� ������");
			System.out.println("3.������ ����");
			System.out.println("4.������ �߰�");
			System.out.println("5.������ ����");
			System.out.println("6.������");
			System.out.println("************************");

			System.out.println("1~6�� �� ���ϴ� �޴��� ����ּ���.");
			num = input.nextInt(); 

			
			switch(num) {
			case 1: 
				memberManager.ViewMember();
				continue;
			case 2: 
				System.out.print("������ �̸�:");
				String MemberName2= input.next();
				System.out.print("������ �ǰ�����:");
				String MemberHealthCondition= input.next();
				System.out.print("������ ���»���:");
				String MemberHealthHistory= input.next();
				System.out.print("������ ������ �� �������:");
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
				System.out.println("�ý����� �����ϰڽ��ϴ�. �̿����ּż� �����մϴ�.");
				break;
			}		  
		}
	}
}