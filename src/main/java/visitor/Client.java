package visitor;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-14 14:29
 **/

public class Client {
    public void startProject(){
        //访问者模式适用于结构稳定，即元素不常变动，但元素的功能或者说是用途发生改变的情况
        ObjectStructure bigHuYou= new ObjectStructure();
        //可以很轻松的更换Visitor，但是要求BigHuYouCompany的结构稳定
        System.out.println("-----------------启动社交APP项目--------------------");
        bigHuYou.startProject(new SocialApp());
        System.out.println("-----------------启动短视频APP项目--------------------");
        bigHuYou.startProject(new LiveApp());
    }
}
