package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSystem {
	
	public static String Login () throws SQLException {
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		
		String userId = "";
		boolean idCheck = true;
		while (idCheck) {
			System.out.print("아이디를 입력하세요 : ");
			userId = s.next();
			ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + userId + "'");
			idCheck = rs.next(); // => 입력한 값이 존재하면 true(다시 입력받도록) 없으면 false(빠져나가도록) 리턴
			if (idCheck) { // => 입력한값이 존재하면 실행
				break;
			} else {
				System.out.println("아이디를 확인해주세요");
			} // => 입력한값이 존재하지 않으면 실행
		}
		
		String userPwd = "";
		boolean pwCheck = true;
		while (pwCheck) {
			System.out.print("비밀번호를 입력하세요 : ");
			userPwd = s.next();
			ResultSet rs2 = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + userId + "' AND " + "PASSWORD = '" + userPwd + "'");
			pwCheck = rs2.next(); // => 입력한 값이 존재하면 true(다시 입력받도록) 없으면 false(빠져나가도록) 리턴
			if (pwCheck) { // => 입력한값이 존재하면 실행
				break;
			} else {
				System.out.println("비밀번호를 확인해주세요");
				return null;
			} // => 입력한값이 존재하지 않으면 실행
		}
		
		String query = "SELECT * FROM TBL_USER WHERE USERID = '" + userId + "' " + "AND PASSWORD = '" + userPwd + "'";
		ResultSet rs3 = db.stmt.executeQuery(query);
		
		if (rs3.next()) {
			return userId;
		} else {
			return null;
		}
	}
	
//	public static boolean userCheck(String query) {
//	}
	
	
	public static void main(String[] args) throws SQLException {
		// 사용자 관리 시스템
		Scanner s = new Scanner(System.in);
		System.out.println("======= 사용자 관리 시스템 =======");
		DBClass db = new DBClass();
		while (true) {
			System.out.print("[ (1)회원가입 (2)로그인 (3)비밀번호수정 (4)정보확인 (5)탈퇴 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				String userId = "";
				boolean idCheck = true;
				while (idCheck) {
					System.out.print("아이디를 입력하세요 : ");
					userId = s.next();
					ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + userId + "'");
					idCheck = rs.next(); // => 입력한 값이 존재하면 true(다시 입력받도록) 없으면 false(빠져나가도록) 리턴
					if (idCheck) { // => 입력한값이 존재하면 실행
						System.out.println("다시 입력하세요");
					} else {
						break;
					} // => 입력한값이 존재하지 않으면 실행
				}
				System.out.print("비밀번호를 입력하세요 : ");
				String userPw = s.next();
				System.out.print("이름을 입력하세요 : ");
				String userName = s.next();

				String sql = "INSERT INTO TBL_USER(USERID, PASSWORD, NAME, CDATETIME) VALUES ('" + userId + "', '" + userPw + "', '" + userName + "', " + "SYSDATE" + ")";
				int num = db.stmt.executeUpdate(sql);
				if (num > 0) {
					System.out.println("가입되었습니다.");
				} else {
					System.out.println("오류가 발생헀습니다. 다시 시도해주세요");
				}
			} else if (menu == 2) {
				String id = Login();
				if (id != null) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패!");
				}
			} else if (menu == 3) {
				String id = Login();
				if (id != null) {
					System.out.print("수정할 비밀번호를 입력하세요 : ");
					String newPwd = s.next();
					int num = db.stmt.executeUpdate("UPDATE TBL_USER SET PASSWORD = '" + newPwd + "' WHERE USERID = '" + id + "'");
					if (num > 0) {
						System.out.println("비밀번호가 수정되었습니다.");
					} else {
						System.out.println("오류 발생");
					}
				} else {
					System.out.println("로그인 실패!");
				}
			} else if (menu == 4) {
				String id = Login();
				if (id != null) {
					String info = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
					ResultSet rs = db.stmt.executeQuery(info);
					rs.next();
					System.out.println("아이디 : " + "[" + rs.getString("USERID") + "]");
					System.out.println("이름 : " + "[" + rs.getString("NAME") + "]");
					System.out.println("가입날짜 : " + "[" + rs.getString("CDATETIME") + "]");
				} else {
					System.out.println("로그인 실패!");
				}
			} else if (menu == 5) {
				String id = Login();
				if (id != null) {
					System.out.print("정말 탈퇴하시겠습니까? : ");
					String sure = s.next();
					if (sure.equals("Y")) {
						db.stmt.executeUpdate("DELETE FROM TBL_USER WHERE USERID = '" + id + "'");
						System.out.println("아이디 : " + id + " 유저가 삭제되었습니다.");
					} else {
						System.out.println("메뉴로 이동합니다.");
					}
				} else {
					System.out.println("로그인 실패!");
				}
				
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}
}

// 개선 1. GENDER랑 AGE는 입력받지 않으면 null, 입력받으면 입력받은값 넣기
// 개선 2. 비밀번호 수정시 이전과 같은 비밀번호를 입력하면 이전과 같은 비밀번호 입니다 출력 후 메뉴로 이동
