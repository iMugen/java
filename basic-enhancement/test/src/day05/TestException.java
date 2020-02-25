package day05;

/**
 * @author Jin
 * @date 2018/10/11 - 16:25
 */
public class TestException {
    public static void main(String[] args) throws ScoreOutOfBoundsException {
        checkScore(1111);
        System.out.println("检查完毕");
    }

    private static void checkScore(int score) throws ScoreOutOfBoundsException {
        if (score > 100 || score < 0) {
            throw new ScoreOutOfBoundsException("分数：" + score + "超出范围了");
        }
    }
}
