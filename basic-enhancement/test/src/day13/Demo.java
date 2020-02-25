package day13;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Gakki
 * @date 2018/10/23 - 10:33
 */
public class Demo {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Gakki");
        list.add("Gakki");
        list.add("Gakki");
        list.add("Jin");
        list.add("Fuu");
        list.add("Mugen");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Gakii");
        list1.add("Gakii");
        list1.add("Gakii");

        Stream<String> concat = Stream.concat(list.stream(), list1.stream());
        concat.forEach(s -> System.out.println(s));
//        list.stream().skip(2).forEach(s -> System.out.println(s));
//        list.stream().map(s -> s.substring(0, 1).toLowerCase() + s.substring(1)).forEach(s -> System.out.println(s));
//        long count = list.stream().filter(s -> s.startsWith("G")).count();
//        System.out.println(count);

    }

    public static void test1() {
        //        String[] arr = {"Gakki", "Fuu", "Jin", "Mugen"};
//        Stream<String> s = Stream.of(arr);
//        s.forEach(s1 -> System.out.println(s1));

        ArrayList<String> list = new ArrayList<>();
        list.add("Gakki");
        list.add("Jin");
        list.add("Fuu");
        list.add("Mugen");
//        Stream<String> stream = list.stream();
//        stream.forEach(s1 -> System.out.println(s1));
        list.stream().filter(s1 -> !s1.contains("i")).forEach(s1 -> System.out.println(s1));
    }
}
