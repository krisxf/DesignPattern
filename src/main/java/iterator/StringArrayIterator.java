package iterator;

/**
 * @Program: DesignPattern
 * @Description: 具体迭代器
 * @Author: kris
 * @Create: 2023-08-17 12:50
 **/

public class StringArrayIterator implements Iterator{
    String[] args;
    int index;

    StringArrayIterator(String[] args){
        this.args = args;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < args.length;
    }

    @Override
    public Object next() {
        if(index < args.length){
            return args[index++];
        }
        return null;
    }
}
