package dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Reply;
import util.DbConn;

public class ReplyDao {

	DbConn dbconn = new DbConn();
	private Connection conn = null;
	private PreparedStatement st = null;
	private ResultSet rs = null;
	Reply reply = new Reply();

	//添加回复
	public void addReply(int tid,String rcontent) throws Exception{
		
		conn = dbconn.getConnection();
		String sql = "insert into reply(tid,rcontent)values(?,?)";
		st = conn.prepareStatement(sql);
		st.setInt(1, tid);
		st.setString(2, rcontent);
		st.executeUpdate();
	}
	
	//根据rid查找回复
	public ArrayList<Reply> selectReplyByTid(int tid) throws Exception{
		
		ArrayList<Reply> rlist = new ArrayList<Reply>();
		conn = dbconn.getConnection();
		String sql = "select * from reply where tid = ?";
		st = conn.prepareStatement(sql);
		st.setInt(1, tid);
		rs = st.executeQuery();
		while(rs.next()){
			Reply reply = new Reply();
			reply.setRid(rs.getInt("rid"));
			reply.setTid(rs.getInt("tid"));
			reply.setRcontent(rs.getString("rcontent"));
			rlist.add(reply);
		}
		return rlist;
	}
}
