package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.User;
import util.DbConn;

public class UserDao {

	DbConn dbconn = new DbConn();
	private Connection conn = null;
	private PreparedStatement st = null;
	private ResultSet rs = null;
	User user = new User();
	
	//注册，增加新用户
	public void addUser(String uname,String upsw) throws Exception{
		conn = dbconn.getConnection();
		String sql = "insert into user(uname,upsw) values(?,?)";
		st = conn.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, upsw);
		st.executeUpdate();
	}
	
	//登录，返回密码
	public String selectUser(String uname) throws Exception{
		String upsw = "";
		conn = dbconn.getConnection();
		String sql = "select upsw from user where uname = ?";
		st = conn.prepareStatement(sql);
		st.setString(1, uname);
		rs = st.executeQuery();
		while(rs.next()){
			upsw = user.getUpsw();
			System.out.println(upsw);
		}
		return upsw;
	}
}
