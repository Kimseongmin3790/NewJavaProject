package Day13_Practice;

import java.util.ArrayList;
import java.util.Scanner;

import Day13_20250804.Human;

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Human> list = new ArrayList<Human>();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int menu = s.nextInt();
			
			if (menu == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				System.out.print("주소 : ");
				String addr = s.next();
				
				Human human = new Human(name, age, addr);
				list.add(human);
				System.out.println("--------------------------------------");
			}
			
			if (menu == 2) {
				System.out.println("--------------------------------------");
				for (int i=0; i<list.size(); i++) {
					System.out.print((i+1) + ". 이름 : " + list.get(i).getName());
					System.out.print(", 나이 : " + list.get(i).getAge());
					System.out.println(", 주소 : " + list.get(i).getAddr());
				}
				System.out.println("--------------------------------------");	
			}
			
			if (menu == 3) {
				System.out.println("--------------------------------------");
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String delete = s.next();
				boolean n = false;
				for (int i=0; i<list.size(); i++) {
					if (list.get(i).getName().equals(delete)) {
						list.remove(i);
//						i--;  // 삭제후 인덱스 하나 건너뛰는걸 방지
						System.out.println("삭제되었습니다.");
						System.out.println("--------------------------------------");
						n = true; // n = !n
					} 
				}
				if (n == false) { // !n
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
					System.out.println("--------------------------------------");
				} else {}
			
			}
			
			if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			if (menu > 4 || menu < 1) { // else
				System.out.println("1~4중에 선택해 주세요.");
			}
//		System.out.println("--------------------------------------");	
		}
			
	}
}

