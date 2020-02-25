package day09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author Gakki
 * @date 2018/10/17 - 19:08
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("aa.txt"));

        Set<Object> keys = p.keySet();
        for (Object key : keys) {
            System.out.println(key+":"+p.get(key));
        }
    }

    public static void test1() throws IOException {
        Properties p = new Properties();
        p.put("01", "Gakki");
        p.put("02", "Gakki");
        p.put("03", "Gakki");

        p.store(new FileWriter("aa.txt"),null);
    }
}
