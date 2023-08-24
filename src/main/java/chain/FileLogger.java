package chain;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-24 10:37
 **/

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
