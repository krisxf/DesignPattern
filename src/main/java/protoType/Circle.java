package protoType;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-07-28 16:57
 **/
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}