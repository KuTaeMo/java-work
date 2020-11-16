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
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
		System.out.println("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >>");
		int menu=scanner.nextInt();
		switch(menu){
		case 1:	//예약
				System.out.println("좌석구분 S(1) A(2) B(3)>>");
				int menu2=scanner.nextInt();
				switch(menu2) {
				case 1:	//s석
					System.out.println("S>>"+seatS[0]+" "+seatS[1]+" "+seatS[2]+" "+seatS[3]+" "+seatS[4]+" "+seatS[5]+" "+seatS[6]+" "+seatS[7]+" "+seatS[8]+" "+seatS[9]);
					System.out.println("이름 >> ");
					String name=scanner.next();
					System.out.println("번호 >>");
					int num=scanner.nextInt();
					seatS[num-1]=name;
					break;
				case 2://a석
					System.out.println("A>>"+seatA[0]+" "+seatA[1]+" "+seatA[2]+" "+seatA[3]+" "+seatA[4]+" "+seatA[5]+" "+seatA[6]+" "+seatA[7]+" "+seatA[8]+" "+seatA[9]);
					System.out.println("이름 >> ");
					String name1=scanner.next();
					System.out.println("번호 >>");
					int num1=scanner.nextInt();
					seatA[num1-1]=name1;
					break;
				case 3:{ //b석
					System.out.println("B>>"+seatB[0]+" "+seatB[1]+" "+seatB[2]+" "+seatB[3]+" "+seatB[4]+" "+seatB[5]+" "+seatB[6]+" "+seatB[7]+" "+seatB[8]+" "+seatB[9]);
					System.out.println("이름 >> ");
					String name2=scanner.next();
					System.out.println("번호 >>");
					int num2=scanner.nextInt();
					seatB[num2-1]=name2;
					break;
				}
				} break;//예약 스위치 끝
		case 2: //조회
			System.out.println("S>>"+seatS[0]+" "+seatS[1]+" "+seatS[2]+" "+seatS[3]+" "+seatS[4]+" "+seatS[5]+" "+seatS[6]+" "+seatS[7]+" "+seatS[8]+" "+seatS[9]);
			System.out.println("A>>"+seatA[0]+" "+seatA[1]+" "+seatA[2]+" "+seatA[3]+" "+seatA[4]+" "+seatA[5]+" "+seatA[6]+" "+seatA[7]+" "+seatA[8]+" "+seatA[9]);
			System.out.println("B>>"+seatB[0]+" "+seatB[1]+" "+seatB[2]+" "+seatB[3]+" "+seatB[4]+" "+seatB[5]+" "+seatB[6]+" "+seatB[7]+" "+seatB[8]+" "+seatB[9]);
			System.out.println("조회를 완료하였습니다.");
			break;
		case 3: //취소
			System.out.println("이름 >>");
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
		case 4: //끝
			break;
		}
	}
	}

}
