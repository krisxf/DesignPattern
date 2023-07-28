package protoType;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-07-28 16:58
 **/

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}