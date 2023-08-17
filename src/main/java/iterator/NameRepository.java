package iterator;

/**
 * @Program: DesignPattern
 * @Description: 具体聚合类
 * @Author: kris
 * @Create: 2023-08-17 12:53
 **/

public class NameRepository implements Container{
    public String[] args = {"jack","Bob","Lora"};
    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(args);
    }
}
