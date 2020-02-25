package day10;

import java.io.*;

/**
 * @author Gakki
 * @date 2018/10/18 - 16:02
 */
public class Demo04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        Person2 person = new Person2("Gakki", 18);
        oos.writeObject(person);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        Object person1 = ois.readObject();
        System.out.println(person1);
        ois.close();

    }
}
