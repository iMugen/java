package day02.jdbc;

import day02.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Gakki
 * @date 2018/10/30 - 16:24
 */
public class JDBCDemo10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //1.获取连接
            conn = JDBCUtil.getConnection();
            //开启事务
            conn.setAutoCommit(false);

            //2.定义sql
            //2.1 张三 - 500
            String sql1 = "update account set balance = balance -? where id=?";
            //2.2 李四 + 500
            String sql2 = "update account set balance = balance +? where id=?";
            //3.获取执行对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            //4.设置参数
            pstmt1.setInt(1, 500);
            pstmt1.setInt(2, 1);

            pstmt2.setInt(1, 500);
            pstmt2.setInt(2, 2);


            //4.执行
            pstmt1.executeUpdate();
            int i = 3 / 0;
            pstmt2.executeUpdate();

            //提交事务
            conn.commit();
            //抛个大异常，无论什么异常都回滚
        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtil.close(pstmt1, conn);
            JDBCUtil.close(pstmt2, null);
        }
    }
}
