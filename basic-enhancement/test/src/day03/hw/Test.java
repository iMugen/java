package day03.hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Gakki
 * @date 2018/10/28 - 16:49
 */
public class Test {
    public static void main(String[] args) {
        List<Student> emps = Arrays.asList(
                new Student("张三", 28, 9999),
                new Student("李四", 28, 6666),
                new Student("王五", 28, 3333),
                new Student("赵六", 28, 7777),
                new Student("田七", 28, 5555)
        );

        Collections.sort(emps,(s1,s2) -> {
            if (s1.getAge() == s2.getAge()) {
                return s1.getName().compareTo(s2.getName());
            } else {
                return -Integer.compare(s1.getAge(),s2.getAge());
            }
        });

        for (Student emp : emps) {
            System.out.println(emp);
        }
    }

}