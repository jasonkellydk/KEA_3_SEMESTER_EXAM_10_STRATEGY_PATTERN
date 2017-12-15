package dk.kea.examples.logic;

// We are going to create a Strategy interface defining an action and
// concrete strategy classes implementing the Strategy interface.
public interface Strategy
{
    public int doOperation(int num1, int num2);
}
