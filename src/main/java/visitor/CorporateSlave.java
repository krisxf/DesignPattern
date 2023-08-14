package visitor;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-14 14:24
 **/

public interface CorporateSlave {
    void accept(CorporateSlaveVisitor visitor);
}