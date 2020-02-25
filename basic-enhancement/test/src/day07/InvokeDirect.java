package day07;

/**
 * @author Gakki
 * @date 2018/10/15 - 14:22
 */
public class InvokeDirect {
    public static void main(String[] args) {
// TODO 请使用Lambda【省略格式】调用invokeDirect方法
        invokeDirect(new Director() {
            @Override
            public void makeMovie() {
                System.out.println("make movie");
            }
        });

    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}

interface Director{
    void makeMovie();
}

