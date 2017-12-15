package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.Context;
import dk.kea.examples.logic.OperationAdd;
import dk.kea.examples.logic.OperationMultiply;
import dk.kea.examples.logic.OperationSubstract;

public class StrategyPatternExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will demo the strategy pattern";
    }

    @Override
    public String getName()
    {
        return "Strategy pattern";
    }

    @Override
    public void runExample()
    {
        //Use the Context to see change in behaviour when it changes its Strategy.

        //StrategyPatternDemo, our demo class, will use Context and strategy objects to
        //demonstrate change in Context behaviour based on strategy it deploys or uses.
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
