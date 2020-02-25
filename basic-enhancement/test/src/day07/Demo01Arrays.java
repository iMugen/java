package day07;

import java.util.Arrays;

/**
 * @author Jin
 * @date 2018/10/14 - 16:32
 */
public class Demo01Arrays {
    public static void main(String[] args){
        Person2[] arr = {
                new Person2("Gakki", 25),
                new Person2("Jin", 18),
                new Person2("Fuu", 19)
        };


        Arrays.sort(arr,(Person2 p1, Person2 p2)->{
            return p1.getAge() - p2.getAge();
        });

        for (Person2 p : arr) {
            System.out.println(p);
        }
    }
}
