package org.iii.simulatedata.utils;

import java.sql.*;

import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

public class SqliteHandler {

	public Connection getConnection() throws SQLException {
		SQLiteConfig config = new SQLiteConfig();
		// config.setReadOnly(true);
		config.setSharedCache(true);
		config.enableRecursiveTriggers(true);

		SQLiteDataSource ds = new SQLiteDataSource(config);
		ds.setUrl("jdbc:sqlite:sample.db");
		return ds.getConnection();
		// ds.setServerName("sample.db");

	}

	// create Table
	public void createTable(Connection con) throws SQLException {
		String sql = "DROP TABLE IF EXISTS test ;create table test (id integer, name string); ";
		Statement stat = null;
		stat = con.createStatement();
		stat.executeUpdate(sql);

	}

	// drop table
	public void dropTable(Connection con) throws SQLException {
		String sql = "drop table test ";
		Statement stat = null;
		stat = con.createStatement();
		stat.executeUpdate(sql);
	}

	// 新增
	public void insert(Connection con, int id, String name) throws SQLException {
		String sql = "insert into test (id,name) values(?,?)";
		PreparedStatement pst = null;
		pst = con.prepareStatement(sql);
		int idx = 1;
		pst.setInt(idx++, id);
		pst.setString(idx++, name);
		pst.executeUpdate();

	}

	// 修改
	public void update(Connection con, int id, String name) throws SQLException {
		String sql = "update test set name = ? where id = ?";
		PreparedStatement pst = null;
		pst = con.prepareStatement(sql);
		int idx = 1;
		pst.setString(idx++, name);
		pst.setInt(idx++, id);
		pst.executeUpdate();
	}

	// 刪除
	public void delete(Connection con, int id) throws SQLException {
		String sql = "delete from test where id = ?";
		PreparedStatement pst = null;
		pst = con.prepareStatement(sql);
		int idx = 1;
		pst.setInt(idx++, id);
		pst.executeUpdate();
	}

	public void selectAll(Connection con) throws SQLException {
		String sql = "select * from test";
		Statement stat = null;
		ResultSet rs = null;
		stat = con.createStatement();
		rs = stat.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
		}
	}
}
