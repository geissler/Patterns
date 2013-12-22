package de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.tests;

import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.AddHandler;
import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.MultiplyHandler;
import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.Request;
import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.SubtractHandler;
import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.interfaces.HandlerInterface;
import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.interfaces.ResultInterface;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Some simple test for the chain of responsibility.
 * Created by Benjamin on 22.12.13.
 */
public class ChainOfResponsibilityTest {
    private HandlerInterface chain;

    @Before
    public void setUp() {
        HandlerInterface add = new AddHandler();
        add.setSuccessor(new SubtractHandler());

        this.chain = new MultiplyHandler();
        this.chain.setSuccessor(add);

    }

    @Test
    public void addTest() throws Exception {
        Request request = new Request("4+5");

        ResultInterface result = this.chain.handleRequest(request);
        Assert.assertEquals(9, result.getResult());
    }

    @Test
    public void minusTest() throws Exception {
        Request request = new Request("12-6-3");

        ResultInterface result = this.chain.handleRequest(request);
        Assert.assertEquals(3, result.getResult());
    }

    @Test
    public void multiplyTest() throws Exception {
        Request request = new Request("3*3");

        ResultInterface result = this.chain.handleRequest(request);
        Assert.assertEquals(9, result.getResult());
    }

    @Test(expected = Exception.class)
    public void noSimpleMathsTest() throws Exception {
        Request request = new Request("add 3 to 4");

        this.chain.handleRequest(request);
    }
}
