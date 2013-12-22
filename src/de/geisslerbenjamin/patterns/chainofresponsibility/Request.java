package de.geisslerbenjamin.patterns.chainofresponsibility;

import de.geisslerbenjamin.patterns.chainofresponsibility.interfaces.RequestInterface;

/**
 * Simple request implementation.
 * Created by Benjamin on 22.12.13.
 */
public class Request implements RequestInterface {
    private String request;

    /**
     * Constructor.
     *
     * @param request the request
     */
    public Request(String request) {
        this.request = request;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
