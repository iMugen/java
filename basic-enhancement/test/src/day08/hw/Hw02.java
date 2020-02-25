package day08.hw;

import java.io.File;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/15 - 21:13
 */
public class Hw02 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        file.createNewFile();
    }
}
