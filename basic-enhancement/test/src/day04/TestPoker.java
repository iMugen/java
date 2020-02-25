package day04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Jin
 * @date 2018/10/9 - 17:12
 */
public class TestPoker {
    public static void main(String[] args) {
        //创建花色集合与数字集合
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        //存储花色与数字
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");

        //创建一个牌盒
        ArrayList<String> poker = new ArrayList<>();
        //create存储编号的集合
        ArrayList<Integer> indexs = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            String num = numbers.get(i);
            for (int j = 0; j < colors.size(); j++) {
                String color = colors.get(j);
                poker.add(color + num);
                indexs.add(index++);
            }
        }
        poker.add("小王");
        indexs.add(index++);
        poker.add("大王");
        indexs.add(index);

        System.out.println(poker);
        System.out.println(indexs);

        //洗牌
        Collections.shuffle(indexs);

        //发牌
        ArrayList<Integer> 周润发 = new ArrayList<>();
        ArrayList<Integer> 周星驰 = new ArrayList<>();
        ArrayList<Integer> 刘德华 = new ArrayList<>();

        for (int i = 0; i < indexs.size() - 3; i++) {
            if (i % 3 == 0) {
                周润发.add(indexs.get(i));
            } else if (i % 3 == 1) {
                周星驰.add(indexs.get(i));
            } else if (i % 3 == 2) {
                刘德华.add(indexs.get(i));
            }
        }

        Collections.sort(周润发);
        Collections.sort(周星驰);
        Collections.sort(刘德华);

        for (int i = 0; i < 周润发.size(); i++) {
            Integer ii = 周润发.get(i);
            System.out.print(poker.get(ii) + " ");
        }
        System.out.println();
        for (int i = 0; i < 周星驰.size(); i++) {
            Integer ii = 周星驰.get(i);
            System.out.print(poker.get(ii) + " ");
        }
        System.out.println();
        for (int i = 0; i < 刘德华.size(); i++) {
            Integer ii = 刘德华.get(i);
            System.out.print(poker.get(ii) + " ");
        }
        System.out.println();

        System.out.println("底牌");
        for (int i = indexs.size() - 3; i < indexs.size(); i++) {
            Integer ii = indexs.get(i);
            System.out.print(poker.get(ii) + " ");

        }
    }
}
