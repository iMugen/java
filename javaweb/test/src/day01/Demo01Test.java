package day01;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Gakki
 * @date 2018/10/24 - 9:55
 */
public class Demo01Test {
    @Test
    public void add(){
        Demo01 d = new Demo01();
        int i = d.add(10, 20);
        Assert.assertEquals(30,i);
    }

}
