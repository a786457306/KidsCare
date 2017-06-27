package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DbConn;
import entity.Topic;

public class TopicDao {

	DbConn dbconn = new DbConn();
	private Connection conn = null;
	private PreparedStatement st = null;
	private ResultSet rs = null;

	
	//发帖
	public void addTopic(Topic topic) throws Exception{
		conn = dbconn.getConnection();
		String sql = "insert into topic(uid,title,content,email,phone)values(?,?,?,?,?)";
		st = conn.prepareStatement(sql);
		st.setInt(1, topic.getUid());
		st.setString(2, topic.getTitle());
		st.setString(3, topic.getContent());
		st.setString(4, topic.getEmail());
		st.setString(5, topic.getPhone());
		st.executeUpdate();
	}
	
	//修改帖子内容
	public void updateTopic(Topic topic) throws Exception{
		conn = dbconn.getConnection();
		String sql = "update topic set title = ?,content  = ?,email = ?,phone = ? where tid = ?";
		st = conn.prepareStatement(sql);
		st.setString(1, topic.getTitle());
		st.setString(2, topic.getContent());
		st.setString(3, topic.getEmail());
		st.setString(4, topic.getPhone());
		st.setInt(5, topic.getTid());
		st.executeUpdate();
	}
	
	//帖子列表
	public ArrayList<Topic> selectAllTopic() throws Exception{
		ArrayList<Topic> tlist = new ArrayList<Topic>();
		conn = dbconn.getConnection();
		String sql = "select * from topic";
		st = conn.prepareStatement(sql);
		rs = st.executeQuery();
		while(rs.next()){
			Topic topic = new Topic();
			topic.setTid(rs.getInt("tid"));
			topic.setUid(rs.getInt("uid"));
			topic.setTitle(rs.getString("title"));
			topic.setContent(rs.getString("content"));
			topic.setPhone(rs.getString("phone"));
			tlist.add(topic);
		}
		return tlist;
	}
	
	//看帖子具体内容
	public Topic selectTopic(int tid) throws Exception{
		Topic topic = new Topic();
		conn = dbconn.getConnection();
		String sql = "select * from topic where tid = ?";
		st = conn.prepareStatement(sql);
		st.setInt(1, tid);
		rs = st.executeQuery();
		while(rs.next()){
			topic.setTid(tid);
			topic.setUid(rs.getInt("uid"));
			topic.setTitle(rs.getString("title"));
			topic.setContent(rs.getString("content"));
			topic.setPhone(rs.getString("phone"));
		}
		return topic; 
	}
}
