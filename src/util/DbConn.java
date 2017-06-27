package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.jar.Attributes.Name;

public class DbConn {

	private static final String driver = "com.mysql.jdbc.Driver";//数据库驱动
	//连接地址
	private static final String url = "jdbc:mysql://localhost:3306/kidscare?useUnicode=true&characterEncoding=UTF-8";
	private static final String username = "root";//用户名
	private static final String password = "root";//密码
	
	private static Connection conn = null;
	
	//加载驱动
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//返回连接对象
	public static Connection getConnection() throws Exception{
		
		if (conn == null) {
			conn = DriverManager.getConnection(url,username,password);
			return conn;
		}
		return conn;
	}
	
	public static void main(String[] args){
		try
		{
		   Connection conn = DbConn.getConnection();
		   if(conn!=null)
		   {
			   System.out.println("数据库连接正常！");
		   }
		   else
		   {
			   System.out.println("数据库连接异常！");
		   }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
