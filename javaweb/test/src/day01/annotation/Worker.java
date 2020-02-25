package day01.annotation;

/**
 * @author Gakki
 * @date 2018/10/25 - 17:14
 */
@MyAnnotation(value = 26,per = Person.P1,anno2 = @MyAnno2,STRINGS =  "234")
@MyAnno3
public class Worker {
    @MyAnno3
    private String name = "Gakki";
    @MyAnno3
    public static void main(String[] args){

    }
}
