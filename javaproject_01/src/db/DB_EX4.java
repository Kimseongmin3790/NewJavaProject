package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_EX4 {
	
	public static void main(String[] args) throws SQLException {
		// STUDENT
		// 학번을 입력받아서 해당 학번의 학생이 있으면
		// 해당 학생의 키를 1증가후 '키를 1증가했습니다' 출력
		// 없으면 '학생이 없습니다' 출력
		DBClass db = new DBClass();
		
		Scanner s = new Scanner(System.in);
		System.out.println("학번을 입력하세요 : ");
		int num = s.nextInt();
		
		String sql = "SELECT * FROM STUDENT";
		ResultSet rs = db.stmt.executeQuery(sql);
		while(rs.next()) {
			int stuNo = rs.getInt("STU_NO");
			String stuName = rs.getString("STU_NAME");
			if(num == stuNo) {
				db.stmt.executeUpdate("UPDATE STUDENT SET STU_HEIGHT = STU_HEIGHT + 1 WHERE STU_NAME = '" + stuName + "'"); // executeUpdate는 0아니면 업데이트한 행의 수를 리턴
				System.out.println("키를 1 증가했습니다");
			}
		}
		if(!rs.next()) {
			System.out.println("학생이 없습니다");
		}
		
	}
}
