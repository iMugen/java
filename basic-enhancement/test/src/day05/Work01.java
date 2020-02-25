package day05;

/**
 * @author Jin
 * @date 2018/10/11 - 22:44
 */
public class Work01 {
    public static void main(String[] args){
/*
    请使用代码实现
    每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
    如果老师给学生赋值一个负数,抛出一个自定异常
*/
        Student s = new Student();
        s.setScore(100);
        s.setScore(-10);
    }
}
