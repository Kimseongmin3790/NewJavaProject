package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSystem2 {
	static Scanner s = new Scanner(System.in); // static으로 변수 선언해서 class에서 가져다 쓸수 있음
	static DBClass db = new DBClass();
	static ResultSet rs = null;

	public static boolean userAuth(String query) throws SQLException {
		rs = db.stmt.executeQuery(query); // query문을 받아서 조회
		return rs.next(); // boolean 값으로 true or false 리턴
	}

	public static void join() throws SQLException {
		String userId = ""; // 밖에서 선언해야 뒤에 DB에 입력할 때 사용 가능
		while (true) {
			System.out.print("아이디를 입력하세요 : ");
			userId = s.next();
			String query = "SELECT * FROM TBL_USER WHERE USERID = '" + userId + "'";
			if (userAuth(query)) { // query 문장을 보내서 그게 DB에 존재할시 true, 없으면 false 리턴
				System.out.println("중복된 아이디 입니다 다시 입력해주세요."); // true 리턴시 존재하는 아이디임
			} else { // false면 DB에 존재하지 않는 아이디이기에 break로 빠져나감
				break;
			}
		}
		System.out.print("비밀번호를 입력하세요 : ");
		String userPw = s.next();
		System.out.print("이름을 입력하세요 : ");
		String userName = s.next();

		String sql = "INSERT INTO TBL_USER(USERID, PASSWORD, NAME, CDATETIME) VALUES ('" + userId + "', '" + userPw
				+ "', '" + userName + "', " + "SYSDATE" + ")";
		int num = db.stmt.executeUpdate(sql);
		if (num > 0) {
			System.out.println("가입되었습니다.");
		} else {
			System.out.println("오류가 발생헀습니다. 다시 시도해주세요");
		}
	}

	public static void Login() throws SQLException {
		System.out.println("아이디를 입력해주세요 : ");
		String id = s.next();
		System.out.println("비밀번호를 입력해주세요 : ");
		String pw = s.next();
		
		String query = "SELECT U.*, TO_CHAR(CDATETIME, 'YYYY-MM-DD HH24:MI:SS') AS JOINDATE FROM TBL_USER U WHERE USERID = '" + id + "'"; // => TBL_USER에 있는 특정 정보만 꺼내오고 싶으면 
//		TBL_USER에 별칭 U를 부여하고 U.NAME 등을 불러와서 특정 정보만 추출 가능
//		TO_CHAR로 날짜를 가져올수 있고 거기에 별칭 JOINDATE를 붙여서 호출가능하도록 만듬
//		유저가 입력한 id 값이 DB안에 있다면 정보조회가 가능할 거고 USERAUTH 메소드에서 rs.next()를 호출시 true 리턴
//		즉, id가 db안에 존재할 시 true 리턴
		boolean idCheck = userAuth(query);
		boolean allCheck = userAuth(query + " AND PASSWORD = '" + pw + "'");
//		query문만 넣으면 id만 체크, 뒤에 AND PASSWORD = ''를 넣으면 비밀번호까지 같이 맞을시 TRUE리턴
//		id와 비밀번호 모두 체크해서 db안에 있으면 true 리턴, 없으면 false
	}

	public static void main(String[] args) throws SQLException {
		// 사용자 관리 시스템
		Scanner s = new Scanner(System.in);
		System.out.println("======= 사용자 관리 시스템 =======");
		DBClass db = new DBClass();
		while (true) {
			System.out.print("[ (1)회원가입 (2)로그인 (3)비밀번호수정 (4)정보확인 (5)탈퇴 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				join();
			} else if (menu == 2) {
				Login();
			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else {

			}
		}

	}
}

// 개선 1. GENDER랑 AGE는 입력받지 않으면 null, 입력받으면 입력받은값 넣기
// 개선 2. 비밀번호 수정시 이전과 같은 비밀번호를 입력하면 이전과 같은 비밀번호 입니다 출력 후 메뉴로 이동
// 개선 3. 3번에서 비밀번호 말고 정보수정으로 바꾼뒤 바꾸고 싶은 정보를 입력 후 그 정보를 수정
