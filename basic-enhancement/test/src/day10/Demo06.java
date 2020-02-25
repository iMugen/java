package day10;

import day10.Person2;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Gakki
 * @date 2018/10/18 - 14:44
 */
public class Demo06 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Gakki.txt"));
        ArrayList<Person2> list = new ArrayList<>();
        list.add(new Person2("Gakki", 18));
        list.add(new Person2("Jin", 20));
        list.add(new Person2("Fuu", 18));

        oos.writeObject(list);
        oos.close();


        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Gakki.txt"));
        ArrayList<Person2> list1 = (ArrayList<Person2>) ois.readObject();
        for (Person2 person2 : list1) {
            System.out.println(person2);
        }
        ois.close();
    }
}
