package Day14_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {
	
	/*public static int checkNumber(String  msg) {
		Scanner s= new Scanner(System.in);
		int input = 0;
		while(true) {
			System.out.print(msg + " : ");
			input = s.nextInt();
			if(input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요");
			} else {
				break;
			}
		}
		return input;
	}*/
	public static int fruitPrice() {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("가격 : ");
			int price = s.nextInt();
			if (price < 0) {
				System.out.println("0 이상의 값을 입력해주세요");
				continue;
			}
			if (price % 100 == 0) {
				return price;
			} else {
				System.out.println("100단위로 가격을 입력해주세요.");
				continue;
			}
		}
	}

	public static int fruitCount() {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("개수 : ");
			int count = s.nextInt();
			if (count < 0) {
				System.out.println("0 이상의 값을 입력해주세요.");
				continue;
			} else {
				return count;
			}

		}
	}
	
	public static HashMap<String, Object> searchFruit(String fruitName, ArrayList<HashMap<String, Object>> list) {
		// list에 fruitName과 같은 Value값을 가진 map이 있다면 그 map을 리턴해주고
		// 없다면 null을 리턴해주는 메소드
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> getFruit = list.get(i);
			if (fruitName.equals(list.get(i).get("fruitName"))) {
				return getFruit;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *과일가게 프로그램*
		// 메뉴 1. 과일명, 가격, 개수 추가(map)한 후 list에 담기
		// 메뉴 2. 과일명을 입력받고, 해당 과일명의 가격, 개수 출력
		// 만약 없는 과일명이면 ' 해당 과일이 존재하지 않습니다' 출력
		// 메뉴 3. 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
		// 'oo개가 판매되었습니다.' 출력
		// 메뉴 -1. '종료되었습니다' 출력 후 프로그램 종료

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======= 과일가게 프로그램 =======");

		while (true) {
			System.out.print("[ (1)추가 (2)확인 (3)판매 (4)가격 수정 (-1)종료 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				System.out.print("과일명 : ");
				String fruitName = s.next();
				HashMap<String, Object> fruit = searchFruit(fruitName, list);
				// searchFruit 메소드를 사용하면 최초에는 list에 아무것도 들어가있지 않기에
				// null값을 리턴하고 아래 코드를 실행한다
				// 이후에 실행했을때는 입력한 fruitName과 list에 있는 map과 비교하고
				// 같은 Value값이 존재하면 list에 존재하는 HashMap을 리턴 받는다
				// 그럴 경우 else를 실행하고 개수만 추가함
				if(fruit == null) {
					fruit = new HashMap<String, Object>();
					fruit.put("fruitName", fruitName);
					fruit.put("price", fruitPrice());
					fruit.put("count", fruitCount());
					list.add(fruit);
				} else {
					fruit.put("count", (int) fruit.get("count") + fruitCount());
				} // 
				
				
			} else if (menu == 2) {
				System.out.print("검색할 과일명 : ");
				String fruitName = s.next();
				
				HashMap<String, Object> check = searchFruit(fruitName, list);
				
				if (check == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					System.out.print("가격 : " + check.get("price") + "원, ");
					System.out.println("개수 : " + check.get("count") + "개");
				}

			} else if (menu == 3) {
				System.out.print("판매할 과일명 : ");
				String fruitName = s.next();
				
				HashMap<String, Object> sell = searchFruit(fruitName, list);
				
				if (sell == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					int sellCount = fruitCount();
					if (sellCount > (int)sell.get("count")) {
						System.out.println("판매 가능한 개수는 " + (int) sell.get("count") + "개 입니다");
					}
					sell.put("count", (int)sell.get("count") - sellCount);
					System.out.println(sellCount + "개가 판매되었습니다.");
				}

			} else if (menu == 4) {
				System.out.println("수정할 과일명 : ");
				String fruitName = s.next();
				
				HashMap<String, Object> fix = searchFruit(fruitName, list);
				
				if(fix == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					fix.put("price", fruitPrice());
				}

			} else if (menu == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else {

			} 

		}

	}

}
