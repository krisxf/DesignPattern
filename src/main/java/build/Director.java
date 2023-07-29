package build;

/**
 * @Program: DesignPattern
 * @Description: 监工角色 定义使用建造者角色中的方法来生成实例的方法
 * @Author: kris
 * @Create: 2023-07-29 15:14
 **/

public class Director {
    public Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 在construct方法中构建算法，来确认不同步骤的组合方式
     * 以肯德基点餐为例  可以单点，点套餐
     * 其组合方式是不确定的，就可以在在construct方法中来构建组合而不会影响到Client端的调用
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart2();
        builder.buildPart3();
    }
}
