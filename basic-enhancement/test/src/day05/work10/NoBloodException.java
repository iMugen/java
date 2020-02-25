package day05.work10;

/**
 * @author Jin
 * @date 2018/10/11 - 23:28
 */
public class NoBloodException extends RuntimeException {
/*
    请用代码描述:
    在一款角色扮演游戏中,每一个人都会有名字和生命值;角色的生命值不能为负数
    要求:当一个人物的生命值为负数的时候需要抛出自定的异常
*/

    public NoBloodException() {
    }

    public NoBloodException(String message) {
        super(message);
    }
}
