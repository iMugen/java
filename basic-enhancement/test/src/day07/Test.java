package day07;



public class Test {
    public static void main(String[] args) {
        method(new Cook() {
            @Override
            public void makeFood(String str) {
                System.out.println("做饭"+str);
            }
        });

        method((String str) -> {
            System.out.println("做饭"+str);
        });

        method( str ->  System.out.println("做饭"+str) );


    }

    private static void method(Cook c) {
        c.makeFood("西蓝花");
    }
}
