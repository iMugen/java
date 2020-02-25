package day02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Gakki
 * @date 2018/10/29 - 16:32
 */
public class JdbcDemo02 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            // 3.创建执行对象
            stmt = conn.createStatement();
            // 4.定义SQL
            String sql = "insert account values (null,'Gakki',18387723)";
            // 5.执行sql
            int count = stmt.executeUpdate(sql);
            // 6.处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            // 避免空指针
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
