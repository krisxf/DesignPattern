package mediator;

/**
 * @Program: DesignPattern
 * @Description: 用户
 * @Author: kris
 * @Create: 2023-08-19 11:57
 **/

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
