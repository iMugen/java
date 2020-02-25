package day10;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Gakki
 * @date 2018/10/18 - 19:36
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {

        // 1.读取乱序的文件到集合中
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new FileReader("test\\出师表.txt"));
        String line;
        while ((line = bfr.readLine()) != null) {
            list.add(line);
        }
        bfr.close();
        // 2.排序 找到一个对应关系，序号：内容
        HashMap<Integer, String> map = new HashMap<>();
        for (String s : list) {
            // 获取序号
            int num = Integer.parseInt(s.substring(0, 1));
            map.put(num, s);
        }
        System.out.println(map.get(1));
//        System.out.println(map);

        // 3.把排好序的文件再写回原文件
           /* BufferedWriter bw = new BufferedWriter(new FileWriter("出师表.txt"));
            for (int i = 1; i < 10; i++) {
                System.out.println(map.get(i));
                bw.write(map.get(i));
                bw.newLine();

        }*/
//        bw.close();
    }
}
