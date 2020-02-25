package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/18 - 10:20
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
