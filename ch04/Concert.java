package ch04;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Concert {
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Concert con=new Concert();

		String seatS[]= {"---","---","---","---","---","---","---","---","---","---"};
		String seatA[]= {"---","---","---","---","---","---","---","---","---","---"};
		String seatB[]= {"---","---","---","---","---","---","---","---","---","---"};
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while(true) {
		System.out.println("���� : 1, ��ȸ : 2, ��� : 3, ������ : 4 >>");
		int menu=scanner.nextInt();
		switch(menu){
		case 1:	//����
				System.out.println("�¼����� S(1) A(2) B(3)>>");
				int menu2=scanner.nextInt();
				switch(menu2) {
				case 1:	//s��
					System.out.println("S>>"+seatS[0]+" "+seatS[1]+" "+seatS[2]+" "+seatS[3]+" "+seatS[4]+" "+seatS[5]+" "+seatS[6]+" "+seatS[7]+" "+seatS[8]+" "+seatS[9]);
					System.out.println("�̸� >> ");
					String name=scanner.next();
					System.out.println("��ȣ >>");
					int num=scanner.nextInt();
					seatS[num-1]=name;
					break;
				case 2://a��
					System.out.println("A>>"+seatA[0]+" "+seatA[1]+" "+seatA[2]+" "+seatA[3]+" "+seatA[4]+" "+seatA[5]+" "+seatA[6]+" "+seatA[7]+" "+seatA[8]+" "+seatA[9]);
					System.out.println("�̸� >> ");
					String name1=scanner.next();
					System.out.println("��ȣ >>");
					int num1=scanner.nextInt();
					seatA[num1-1]=name1;
					break;
				case 3:{ //b��
					System.out.println("B>>"+seatB[0]+" "+seatB[1]+" "+seatB[2]+" "+seatB[3]+" "+seatB[4]+" "+seatB[5]+" "+seatB[6]+" "+seatB[7]+" "+seatB[8]+" "+seatB[9]);
					System.out.println("�̸� >> ");
					String name2=scanner.next();
					System.out.println("��ȣ >>");
					int num2=scanner.nextInt();
					seatB[num2-1]=name2;
					break;
				}
				} break;//���� ����ġ ��
		case 2: //��ȸ
			System.out.println("S>>"+seatS[0]+" "+seatS[1]+" "+seatS[2]+" "+seatS[3]+" "+seatS[4]+" "+seatS[5]+" "+seatS[6]+" "+seatS[7]+" "+seatS[8]+" "+seatS[9]);
			System.out.println("A>>"+seatA[0]+" "+seatA[1]+" "+seatA[2]+" "+seatA[3]+" "+seatA[4]+" "+seatA[5]+" "+seatA[6]+" "+seatA[7]+" "+seatA[8]+" "+seatA[9]);
			System.out.println("B>>"+seatB[0]+" "+seatB[1]+" "+seatB[2]+" "+seatB[3]+" "+seatB[4]+" "+seatB[5]+" "+seatB[6]+" "+seatB[7]+" "+seatB[8]+" "+seatB[9]);
			System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
			break;
		case 3: //���
			System.out.println("�̸� >>");
			String name3=scanner.next();
			for(int i=0;i<9;i++) {
				if(seatS[i]==name3) {
					seatS[i]="---";
					if(seatA[i]==name3) {
						seatA[i]="---";
						if(seatB[i]==name3)
							seatB[i]="---";
					}
				}
			}
			break;
		case 4: //��
			break;
		}
	}
	}

}
