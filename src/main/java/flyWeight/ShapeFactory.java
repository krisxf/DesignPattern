package flyWeight;

import java.util.HashMap;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-10 14:57
 **/

public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
        }

        return circle;
    }

}
