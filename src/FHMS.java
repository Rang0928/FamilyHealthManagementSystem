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
		    System.out.println("2.������ ���� �� ������");
		    System.out.println("3.������ ����");
		    System.out.println("4.������ �߰�");
		    System.out.println("5.������ ����");
		    System.out.println("6.������");
		    System.out.println("************************");
		    
		    System.out.println("1~6�� �� ���ϴ� �޴��� ����ּ���.");
		    num = input.nextInt(); // ���ϴ� ��ȣ�� �Է��� �� �ְ� �����.		   
		}		  
	}
}
	