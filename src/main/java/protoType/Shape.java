package protoType;

/**
 * @Program: DesignPattern
 * @Description: 抽象类实现Cloneable接口
 * @Author: kris
 * @Create: 2023-07-28 16:55
 **/

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
