package de.geisslerbenjamin.patterns.behavioral.chainofresponsibility;

import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.interfaces.HandlerInterface;
import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.interfaces.RequestInterface;
import de.geisslerbenjamin.patterns.behavioral.chainofresponsibility.interfaces.ResultInterface;

/**
 * Abstract handler which implements a method to forward a request to the next element in the chain.
 * Created by Benjamin on 22.12.13.
 */
abstract public class AbstractHandler implements HandlerInterface {
    protected HandlerInterface successor;

    @Override
    public void setSuccessor(HandlerInterface successor) {
        this.successor = successor;
    }

    /**
     * Forward the un-processed request to the next chain element, if one is injected.
     *
     * @param request the request to handle
     * @return the calculated result
     * @throws Exception
     */
    protected ResultInterface forwardToSuccessor(RequestInterface request) throws Exception {
        if (this.successor != null) {
            return this.successor.handleRequest(request);
        }

        throw new Exception("Request could not be handle!");
    }
}
