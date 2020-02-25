package day01;

import java.util.Calendar;

/**
 * @author Gakki
 * @date 2018/10/26 - 20:18
 */
public class DemoCalendar {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DATE));
    }
}
