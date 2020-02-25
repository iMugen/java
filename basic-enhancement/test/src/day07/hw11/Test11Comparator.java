package day07.hw11;

import java.util.Arrays;

/**
 * @author Gakki
 * @date 2018/10/15 - 19:59
 */
public class Test11Comparator {
    public static void main(String[] args) {
        Student[] arr = {
                new Student("Gakii", 100),
                new Student("Jin", 90),
                new Student("Fuu", 80),
        };

        Arrays.sort(arr,(s1,s2) -> s2.getScore() - s1.getScore());

        for (Student student : arr) {
            System.out.println(student);
        }

    }
}
