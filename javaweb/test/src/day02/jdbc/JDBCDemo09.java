package day02.jdbc;

import day02.util.JDBCUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * 需求：
 * 1. 通过键盘录入用户名和密码
 * 2. 判断用户是否登录成功
 * select * from user where username = "" and password = "";
 * 如果这个sql有查询结果，则成功，反之，则失败
 *
 * @author Gakki
 * @date 2018/10/30 - 15:08
 */
public class JDBCDemo09 {
    public static void main(String[] args){
        //1.通过键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String username = sc.nextLine();
        System.out.println("输入密码：");
        String password = sc.nextLine();
        //2.调用方法
        boolean flag = new JDBCDemo09().login2(username, password);
        //3.判断结果
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }

    }


    /**登录方法
     * @param username
     * @param password
     * @return
     */
    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.获取连接
            conn = JDBCUtil.getConnection();
            //2.定义sql
            String sql = "select * from user where username='" + username + "' and password='" + password + "'";
            //3.创建执行对象
            stmt = conn.createStatement();
            //4.执行sql
            rs = stmt.executeQuery(sql);

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs,stmt,conn);
        }

        return false;
    }



    /**登录方法
     * @param username
     * @param password
     * @return
     */
    public boolean login2(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt= null;
        ResultSet rs = null;
        try {
            //1.获取连接
            conn = JDBCUtil.getConnection();
            //2.定义sql
            String sql = "select * from user where username=? and password=?";
            //3.获取执行SQL对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //4.执行sql
            rs = pstmt.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs,pstmt,conn);
        }

        return false;
    }
}
