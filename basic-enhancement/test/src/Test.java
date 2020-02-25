/**
 * @author Gakki
 * @date 2018/10/19 - 17:21
 */
public class Test {
    public static void main(String[] args) {
        String str = "wowoifheima,heimajfowenfheimavownowie";
        String str1 = "heima";
        int count = getCount(str,str1);
        System.out.println(count);
    }

    private static int getCount(String str, String str1) {
        int count = 0;
        int index = str.indexOf(str1);
        while (index != -1) {
            count++;
            int startIndex = index + str1.length();
            str = str.substring(startIndex);
            index = str.indexOf(str1);
        }
        return count;
    }
}
