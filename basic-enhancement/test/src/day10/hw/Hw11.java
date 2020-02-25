package day10.hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Gakki
 * @date 2018/10/19 - 22:44
 */
public class Hw11 {
    public static void main(String[] args) throws IOException {
//        描述:定义一个学生类，包含姓名，年龄，性别等成员变量，
//        提供setters和getters方法以及构造方法。
//        在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。
//        然后将该对象保存到当前项目根目录下的stu.txt文件中
        Student s = new Student();
        s.setName("Gakki");
        s.setAge(18);
        s.setGender("女");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
        oos.writeObject(s);
        oos.close();

    }
}
