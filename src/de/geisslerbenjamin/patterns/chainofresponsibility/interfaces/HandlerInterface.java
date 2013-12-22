package de.geisslerbenjamin.patterns.chainofresponsibility.interfaces;

/**
 * Interface which defines a element of a chain.
 * Created by Benjamin on 22.12.13.
 */
public interface HandlerInterface {
    /**
     * Add a successor to forward the un processed request.
     *
     * @param successor next element in the chain
     */
    public void setSuccessor(HandlerInterface successor);

    /**
     * Handle the received request if the necessary criteria's are full filled. Otherwise forward it to the next handler
     * in the chain. If not further handler exists, throw a exception.
     *
     * @param request the request to handle
     * @throws Exception
     */
    public ResultInterface handleRequest(RequestInterface request) throws Exception;
}
