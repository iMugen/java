package day13.hw;

import java.util.ArrayList;

/**
 * @author Gakki
 * @date 2018/10/23 - 13:29
 */
public class Hw05 {
    public static void main(String[] args){
//        已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
//        1、取出前2个元素并在控制台打印输出。
//        2、取出后2个元素并在控制台打印输出。
        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");

//        list.stream().limit(2).forEach(s -> System.out.println(s));
        list.stream().skip(4).forEach(s -> System.out.println(s));
    }
}
