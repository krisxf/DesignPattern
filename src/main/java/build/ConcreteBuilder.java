package build;

/**
 * @Program: DesignPattern
 * @Description: 具体的实现类
 * @Author: kris
 * @Create: 2023-07-29 15:20
 **/

public class ConcreteBuilder extends Builder{
    @Override
    void buildPart1() {
        System.out.println("1111");
    }

    @Override
    void buildPart2() {
        System.out.println("2222");
    }

    @Override
    void buildPart3() {
        System.out.println("3333");
    }
}
