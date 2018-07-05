package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	//数据库地址
    private String dbUrl="jdbc:mysql://localhost:3306/db_login";
    //账号
    private String userName="root";
    //密码
    private String password="123456";
    //驱动
    private String jdbcName="com.mysql.jdbc.Driver";
    
    //连接数据库
    public Connection getCon() throws Exception{
        Class.forName(jdbcName);
        Connection con=DriverManager.getConnection(dbUrl,userName,password);
        return con;
    }
    
    //关闭数据库
    public void closeCon(Connection con)throws Exception{
        if(con!=null){
            con.close();
        }
    }
    
    //测试
    public static void main(String[] args) {
        DbUtil dbUtil=new DbUtil();
        Connection con=null;
        try {
            //连接数据库
            con=dbUtil.getCon();
            System.out.println("连接数据库成功");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                //关闭数据库
                dbUtil.closeCon(con);
                System.out.println("关闭数据库成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
