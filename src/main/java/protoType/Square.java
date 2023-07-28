package protoType;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-07-28 16:58
 **/

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}