package com.lcpan.m07;

import java.sql.*;
import java.util.ArrayList;

import com.lcpan.db.ConnConst;

public class RaiseSalary {
	private static final String SQL_1 =
			"SELECT empno, salary FROM employee";
	private static final String SQL_2 =
			"UPDATE employee SET salary = ? WHERE empno = ?";

	int count = 0;
	
	public static void main(String[] args) {
//		ArrayList<Integer> empnoList = new ArrayList<>();
//		ArrayList<Integer> salaryList = new ArrayList<>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL_1);
			PreparedStatement pstmt = conn.prepareStatement(SQL_2);
			while (rs.next()) {
				pstmt.setInt(1, rs.getInt("empno"));
				pstmt.setInt(2, rs.getInt("salary") + 2000);
				pstmt.addBatch();
			}
//			while (rs.next()) {
//				empnoList.add(rs.getInt("empno"));
//				salaryList.add(rs.getInt("salary") + 2000);
//			}
//			rs.close();
//			stmt.close();
//			
//			PreparedStatement pstmt = conn.prepareStatement(SQL_2);
//			for(int i = 0; i < empnoList.size(); i++) {
//				pstmt.setInt(1, salaryList.get(i));
//				pstmt.setInt(2, empnoList.get(i));
//				pstmt.addBatch();
//			}
			
			pstmt.executeBatch();
			rs.close();
			stmt.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
