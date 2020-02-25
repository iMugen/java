package day05.work10;

/**
 * @author Jin
 * @date 2018/10/11 - 23:30
 */
public class Person {
    private String name;
    private int blood;

    public Person() {
    }

    public Person(String name, int blood) {
        this.name = name;
        setBlood(blood);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        if (blood < 0) {
            throw new NoBloodException("生命值不能为负数");
        }
        this.blood = blood;
    }

}
