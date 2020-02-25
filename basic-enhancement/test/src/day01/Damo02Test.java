package day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/26 - 19:06
 */
public class Damo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("input date:");
        String birthdayString = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);
        long birthdayDateTime = birthdayDate.getTime();

        long todayTime = new Date().getTime();
        long time = todayTime - birthdayDateTime;
        System.out.println(time/1000/60/60/24);
    }
}
