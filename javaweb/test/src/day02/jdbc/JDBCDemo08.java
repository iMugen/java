package day02.jdbc;

import day02.domain.Emp;
import day02.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 *
 * @author Gakki
 * @date 2018/10/30 - 10:01
 */
public class JDBCDemo08 {
    public static void main(String[] args) {
        List<Emp> list = new JDBCDemo08().findAll2();
        System.out.println(list);
        System.out.println(list.size());
    }

    /**
     * 查询所有emp对象
     *
     * @return
     */
    public List<Emp> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            // 3.定义sql
            String sql = "select * from emp";
            // 4.创建执行SQL的statement对象
            stmt = conn.createStatement();
            // 5.执行sql
            rs = stmt.executeQuery(sql);
            // 6.处理结果
            list = new ArrayList<Emp>();
            while (rs.next()) {
                //获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                //创建emp对象,并赋值
                Emp emp = new Emp();

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                //装载集合
                list.add(emp);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }


    /**
     * 测试JDBC工具类
     *
     * @return
     */
    public List<Emp> findAll2() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try {
            // 1.注册驱动
//            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取数据库连接对象
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            conn = JDBCUtil.getConnection();
            // 3.定义sql
            String sql = "select * from emp";
            // 4.创建执行SQL的statement对象
            stmt = conn.createStatement();
            // 5.执行sql
            rs = stmt.executeQuery(sql);
            // 6.处理结果
            list = new ArrayList<Emp>();
            while (rs.next()) {
                //获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                //创建emp对象,并赋值
                Emp emp = new Emp();

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                //装载集合
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            /*if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }*/
            JDBCUtil.close(rs,stmt,conn);

        }
        return list;
    }
}
