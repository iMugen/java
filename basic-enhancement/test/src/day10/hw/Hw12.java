package day10.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Gakki
 * @date 2018/10/19 - 23:00
 */
public class Hw12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        描述:将上一题保存到stu.txt文件中的学生对象读取出来。
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("stu.txt"));
        Student s = (Student) in.readObject();
        in.close();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
    }
}
