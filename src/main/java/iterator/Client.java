package iterator;

import java.util.ArrayList;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-17 12:54
 **/

public class Client {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator it = nameRepository.getIterator(); it.hasNext();){
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}
