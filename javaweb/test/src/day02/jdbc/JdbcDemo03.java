package day02.jdbc;

import java.sql.*;

/**
 * @author Gakki
 * @date 2018/10/29 - 16:32
 */
public class JdbcDemo03 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            // 3.创建执行对象
            stmt = conn.createStatement();
            // 4.定义SQL
            String sql = "select * from account";
            // 5.执行sql
            rs = stmt.executeQuery(sql);
            // 6.处理结果
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double balance = rs.getDouble(3);

                System.out.println(id+name+balance);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            // 避免空指针
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
