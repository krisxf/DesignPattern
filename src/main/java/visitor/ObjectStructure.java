package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-14 14:26
 **/

public class ObjectStructure {
    private List<CorporateSlave> employee= new ArrayList<>();

    public ObjectStructure() {
        employee.add(new Programmer("王二狗"));
        employee.add(new HumanSource("上官无需"));
        employee.add(new Tester("牛翠花"));
    }

    public void startProject(CorporateSlaveVisitor visitor){
        for (CorporateSlave slave : employee) {
            slave.accept(visitor);
        }
    }
}
