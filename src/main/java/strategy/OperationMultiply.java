package strategy;


/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-24 10:30
 **/

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
