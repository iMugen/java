package day10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Gakki
 * @date 2018/10/18 - 10:53
 */
public class Demo02Sort {
    public static void main(String[] args) throws IOException {
        // 1.读取乱序文件的集合
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("test\\出师表.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\出师表.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        // 2.排序 使用collection.sort(list,new Comparator())
//        Collections.sort(list, (o1, o2) -> Integer.parseInt(o1.substring(0,1) )- Integer.parseInt(o2.substring(0,1)));
        list.sort(Comparator.comparingInt(o -> Integer.parseInt(o.substring(0, 1))));

//        Collections.sort(list, Comparator.comparingInt(Integer::parseInt));

        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.substring(0,1) )- Integer.parseInt(o2.substring(0,1));
            }
        });*/

        // 3.写回原件
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }
}
