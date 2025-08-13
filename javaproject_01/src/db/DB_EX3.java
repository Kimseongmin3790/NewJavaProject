package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_EX3 {
	
	public static void main(String[] args) throws SQLException {
		DBClass db = new DBClass();
		// 1. TBL_USER에 있는 모든 사용자 출력
		// 출력 컬럼은 아이디, 이름, 성별(m이면 남자, f면 여자로 출력)		
		String sql = "SELECT * FROM TBL_USER";
		ResultSet rs = db.stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.print("아이디 : " + rs.getString("USERID") + ", 이름 : ");
			System.out.print(rs.getString("NAME") + ", 성별 : ");
			if (rs.getString("GENDER").equals("M")) {
				System.out.println("남자");
			} else if (rs.getString("GENDER").equals("F")){
				System.out.println("여자");
			}
		}
		
	}
}
