package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_EX5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 2. 아이디, 비밀번호, 이름, 성별, 나이를 입력받은 후
		// TBL_USER에 저장. (CDATETIME는 현재 시간 저장)
		// 단, 아이디 입력시에 이미 테이블에서 사용하는 아이디를 입력할 경우
		// '이미 사용중인 아이디 입니다' 출력 후 다시 입력받도록 함
		DBClass db = new DBClass();
		
		Scanner s = new Scanner(System.in);
		
//		System.out.print("아이디를 입력하세요 : ");
//		String userId = s.next();
//		ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + userId + "'");
		String userId = "";
//		boolean idCheck = true;
//		while(idCheck) {
//			System.out.print("아이디를 입력하세요 : ");
//			userId = s.next();
//			ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + userId + "'");
//			idCheck = rs.next(); => 입력한 값이 존재하면 true(다시 입력받도록) 없으면 false(빠져나가도록) 리턴
//			if(rs.next) => 입력한값이 존재하면 실행
//				{ "다시 입력하세요"}
//			else {break} => 입력한값이 존재하지 않으면 실행
//		}
		System.out.print("비밀번호를 입력하세요 : ");
		String userPw = s.next();
		System.out.print("이름을 입력하세요 : ");
		String userName = s.next();
		System.out.print("성별을 입력하세요 : ");
		String userMf = s.next();
		System.out.print("나이를 입력하세요 : ");
		int userAge = s.nextInt();
		
		String sql = "INSERT TBL_USER VALUES ('" + userId + "', '" + userPw + "', '" + userName + "', '" + userMf + "', '" + userAge + "', " + "SYSDATE" + ")";
		int num = db.stmt.executeUpdate(sql);
		if (num > 0) {
			System.out.println("가입되었습니다.");
		} else {
			System.out.println("오류가 발생헀습니다. 다시 시도해주세요");
		}
//		String userId = "" => 바깥에서 선언해야 VALUES에 넣기 가능
//		boolean idCheck = true;
//		while(idCheck) {
//			System.out.print("아이디를 입력하세요 : ");
//			String userId = s.next();
//			ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + userId + "'");
//			idCheck = rs.next(); => 입력한 값이 존재하면 true(다시 입력받도록) 없으면 false(빠져나가도록) 리턴
//			if(rs.next) => 입력한값이 존재하면 실행
//				{ "다시 입력하세요"}
//			else {break} => 입력한값이 존재하지 않으면 실행
//		}
		
	}

}
