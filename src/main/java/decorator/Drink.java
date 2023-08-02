package decorator;

/**
 * @Program: DesignPattern
 * @Description: 抽象类Component
 * @Author: kris
 * @Create: 2023-08-02 15:56
 **/

public abstract class Drink {
    String des = "";
    float price = 0.0f;

    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
