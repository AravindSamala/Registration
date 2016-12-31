package com.registration.DaoImpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.registration.DaoI.RegistrationDaoI;
import com.registration.DbUtil.regConnection;
import com.registration.Dto.Pojo;

public class RegistrationDaoImpl implements RegistrationDaoI {
	Connection con = null;

	public int register(Pojo p) {
		// TODO Auto-generated method stub
		con = regConnection.getConnection();
		PreparedStatement pstmt;
		int i = 0;
		try {
			pstmt = con.prepareStatement("insert into reg values(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, p.getFname());
			pstmt.setString(2, p.getLname());
			pstmt.setString(3, p.getSex());
			pstmt.setString(4, p.getCardno());
			pstmt.setString(5, p.getMobile());
			pstmt.setString(6, p.getEmail());
			pstmt.setString(7, p.getPassword());
			pstmt.setString(8, p.getConfirmpassword());
			

			i = pstmt.executeUpdate();
			if (i == 1)
				System.out.println(i + "Record(s) inserted Successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		con = regConnection.getConnection();
		PreparedStatement pstmt;
		boolean b = false;
		try {
			pstmt = con.prepareStatement("select * from reg where email=? and password=?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				b = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

}
