package day12.hw;

/**
 * @author Gakki
 * @date 2018/10/22 - 9:04
 */
@FunctionalInterface
public interface NumberSupplier {
    int getNum(int... nums);
}
