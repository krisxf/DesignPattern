package iterator;

/**
 * @Program: DesignPattern
 * @Description: 抽象迭代器
 * @Author: kris
 * @Create: 2023-08-17 12:48
 **/

public interface Iterator {
    boolean hasNext();
    Object next();
}
