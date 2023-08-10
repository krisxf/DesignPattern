package flyWeight;

/**
 * @Program: DesignPattern
 * @Description: 享元模式，换句话说就是共享对象，在某些对象需要重复创建，且最终只需要得到单一结果的情况下使用。因为此种模式是利用先前创建的已有对象，
 * @Description 通过某种规则去判断当前所需对象是否可以利用原有对象做相应修改后得到想要的效果，如以上教程的实例，创建了20个不同效果的圆，但相同颜色的圆只需要创建一次便可，
 * @Description 相同颜色的只需要引用原有对象，改变其坐标值便可。此种模式下，同一颜色的圆虽然位置不同，但其地址都是同一个，所以说此模式适用于结果注重单一结果的情况。
 * @Author: kris
 * @Create: 2023-08-10 14:59
 **/

public class Client {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        Integer integer = Integer.valueOf(123);
        Integer integer2 = Integer.valueOf(123);
        System.out.println(integer == integer2);

    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
