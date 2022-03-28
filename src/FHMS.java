import java.util.Scanner;

public class FHMS {

	public static void main(String[] args) { // ���� Scanner type�� �޾ƿ��� ���ο� �޸� ���� �Ҵ��� �� �ֵ��ϸ����.
		int num = 0;
		Scanner input =  new Scanner(System.in);
		System.out.print("���̵� �Է����ֽʽÿ�:"); // ���̵�� ��й�ȣ�� ���� �Է��ϰ� ������ �̷�� �������Ѵ�.
		String ID = input.next();
		System.out.print("��й�ȣ�� �Է����ֽʽÿ�:");
		String PW = input.next();
				
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
		    	System.out.print("������ �̸�:");
		    	String MemberName= input.next();
		    	System.out.print("������ ����:");
		    	int MemberAge= input.nextInt();
		    	System.out.print("������ ����:");
		    	String MemberSex= input.next();
		    	System.out.print("������ ��ȭ��ȣ:");
		    	String MemberPhonenumber= input.next();
		    	System.out.print("������ �̸���:");
		    	String MemberEmail= input.next();
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
		    	AddMember();
		    	continue;
		    case 5: // 5���� ���� �������� ������ �� �ִ�.
		    	DeleteMember();
		    	continue;
		    case 6: // 6���� �޴����� ������ ����̸� while������ break�Ͽ� ��������.
		    	System.out.println("�ý����� �����ϰڽ��ϴ�. �̿����ּż� �����մϴ�.");
				break;
		    }		  
	    }
	}
	
	public static void AddMember() {
		System.out.println("������ �������� ������ �������ּ���.");
		Scanner input=  new Scanner(System.in);
        System.out.print("���ο� ������ ID:");
        String memberID= input.next();
        System.out.print("���ο� ������ PW:");
        int memberPW= input.nextInt();
		System.out.print("���ο� ������ �̸�:");
        String memberName= input.next();
        System.out.print("���ο� ������ �̸���:");
        String memberEmail= input.next();
        System.out.print("���ο� ������ ��ȭ��ȣ:");
        String memberPhonenumber= input.next();
        System.out.println(memberID + "���� �߰��Ǿ����ϴ�.");
    }
	
	public static void DeleteMember() {
    	System.out.print("�����ϰ��� �ϴ� �������� ID�� �������ּ���:");
		Scanner input =  new Scanner(System.in);
    	String deletememberID= input.next();
    	System.out.print("��й�ȣ�� �Է����ֽʽÿ�:");
		String memberPW= input.next();
    	System.out.println(deletememberID + "���� �����Ǿ����ϴ�.");
    }	
}	