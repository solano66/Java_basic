package com.lcpan.m08;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class Transaction {
	private static final String SQL =
			"INSERT INTO department VALUES (?, ?)";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			
			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, 401);
			pstmt.setString(2, "Sales");
			pstmt.executeUpdate();
			pstmt.setInt(1, 402);
			pstmt.setString(2, "Service");
			pstmt.executeUpdate();
			pstmt.setInt(1, 403);
			pstmt.setString(2, "Production");
			pstmt.executeUpdate();
			conn.commit();

			pstmt.setInt(1, 404);
			pstmt.setString(2, "Sales1");
			pstmt.executeUpdate();
			pstmt.setInt(1, 405);
			pstmt.setString(2, "Service2");
			pstmt.executeUpdate();
			pstmt.setInt(1, 406);
			pstmt.setString(2, "Production2");
			pstmt.executeUpdate();
			conn.commit();

			conn.setAutoCommit(true);

			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				System.err.println("Transaction is being rolled back");
				conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
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
