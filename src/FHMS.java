import java.util.Scanner;

public class FHMS {
	public static void main(String[] args) { // ���� Scanner type�� �޾ƿ��� ���ο� �޸� ���� �Ҵ��� �� �ֵ��ϸ����.
		Scanner input =  new Scanner(System.in);
		MemberManager memberManager =  new MemberManager(input);
		
		//System.out.print("���̵� �Է����ֽʽÿ�:"); // ���̵�� ��й�ȣ�� ���� �Է��ϰ� ������ �̷�� �������Ѵ�.
		//String ID = input.next();
		//System.out.print("��й�ȣ�� �Է����ֽʽÿ�:");
		//String PW = input.next();
				
		int num = 0;				
		while (num < 6) { // �޴��� 6�� ������ num�� ���� ���ѽ�Ų��.
		    System.out.println("****���� �ǰ� ���� �ý���****");
		    System.out.println("     �޴��� �������ּ���     ");
		   
		    System.out.println("1.������ ��ȸ");
		    System.out.println("2.������ ����");
		    System.out.println("3.������ ������");
		    System.out.println("4.������ �߰�");
		    System.out.println("5.������ ����");
		    System.out.println("6.������");
		    System.out.println("************************");
		    
		    System.out.println("1~6�� �� ���ϴ� �޴��� ����ּ���.");
		    num = input.nextInt(); // ���ϴ� ��ȣ�� �Է��� �� �ְ� �����.
		   
		    //if�� switch���� �̿��Ͽ� ǥ�������ϸ� ���� switch���� �̿��Ͽ� �������.
		    switch(num) {
		    case 1: // 1���� �������� ��ȸ�ϰ� ������ ���������� �˾ƺ� �� �ִ�.
		    	memberManager.ViewMember();
		    	continue;
		    case 2: // 2���� �������� ��ȸ�Ͽ� �ǰ����³� ���»����� �˾ƺ� �� �ִ�.
		    	System.out.print("������ �̸�:");
		    	String MemberName2= input.next();
		    	System.out.print("������ �ǰ�����:");
		    	String MemberHealthCondition= input.next();
		    	System.out.print("������ ���»���:");
		    	String MemberHealthHistory= input.next();
		    	continue;
		    case 3: // 3���� �������� ��ȸ�Ͽ� 2���� ���߾� ������ �� ��������� �˾ƺ� �� �ִ�.
		    	System.out.print("������ �̸�:");
		    	String MemberName3= input.next();
		    	System.out.print("������ ������ �� �������:");
		    	String MemberHealthImprovementsandConsiderations= input.next();
		    	continue;
		    case 4: // 4���� ���ο� �������� �߰��� �� �ִ�.
		    	memberManager.AddMember();
		    	continue;
		    case 5: // 5���� ���� �������� ������ �� �ִ�.
		    	memberManager.DeleteMember();
		    	continue;
		    case 6: // 6���� �޴����� ������ ����̸� while������ break�Ͽ� ��������.
		    	System.out.println("�ý����� �����ϰڽ��ϴ�. �̿����ּż� �����մϴ�.");
				break;
		    }		  
	    }
	}
}	