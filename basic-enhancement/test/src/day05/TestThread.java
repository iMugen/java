package day05;

/**
 * @author Jin
 * @date 2018/10/11 - 17:18
 */
public class TestThread {
    public static void main(String[] args){
        int[] arr = null;
        printArr(arr);
    }
    public static void printArr(int[] arr) throws NullPointerException{
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
