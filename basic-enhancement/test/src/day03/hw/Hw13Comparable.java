package day03.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 十三、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，
 * 如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
 *
 * @author Gakki
 * @date 2018/10/28 - 11:04
 */
public class Hw13Comparable {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("liusan", 20, 90.0F));
        list.add(new Student("lisi", 22, 90.0F));
        list.add(new Student("wangwu", 20, 99.0F));
        list.add(new Student("sunliu", 22, 100.0F));
//        Student s1 = new Student("liusan",20, 90.0F);
//        Student s2 = new Student("lisi",22, 90.0F);
//        Student s3 = new Student("wangwu",20, 99.0F);
//        Student s4 = new Student("sunliu",22, 100.0F);
        /*Student[] stu = {
                new Student("liusan", 20, 90.0F),
                new Student("lisi", 22, 90.0F),
                new Student("wangwu", 20, 99.0F),
                new Student("sunliu", 22, 100.0F)
        };*/

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) {
                    return -1;
                } else if (o1.getScore() < o2.getScore()) {
                    return 1;
                } else {
                    if (o1.getAge() > o2.getAge()) {
                        return 1;
                    } else if (o1.getAge() < o2.getAge()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }

            }
        });

//        Arrays.sort(stu);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
