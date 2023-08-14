package visitor;

/**
 * @author Kristin
 */
public interface CorporateSlaveVisitor {
    void visit(Programmer programmer);

    void visit(HumanSource humanSource);

    void visit(Tester tester);
}
