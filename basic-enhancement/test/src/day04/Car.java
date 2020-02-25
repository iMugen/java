package day04;

import java.util.Objects;

/**
 * @author Jin
 * @date 2018/10/10 - 15:25
 */
public class Car {
    // 1.定义car类，重写equals和hashcode方法 避免键重复
    private String name;
    private String color;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
