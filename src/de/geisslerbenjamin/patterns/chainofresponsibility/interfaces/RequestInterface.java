package de.geisslerbenjamin.patterns.chainofresponsibility.interfaces;

/**
 * Simple request.
 * Created by Benjamin on 22.12.13.
 */
public interface RequestInterface {
    /**
     * Receive the requested string.
     *
     * @return the request
     */
    public String getRequest();
}
