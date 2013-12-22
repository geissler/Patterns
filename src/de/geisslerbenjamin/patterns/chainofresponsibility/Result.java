package de.geisslerbenjamin.patterns.chainofresponsibility;

import de.geisslerbenjamin.patterns.chainofresponsibility.interfaces.ResultInterface;

/**
 * Simple result implementation.
 * Created by Benjamin on 22.12.13.
 */
public class Result implements ResultInterface {
    private int result;

    /**
     * Constructor
     *
     * @param result the result
     */
    public Result(int result) {
        this.result = result;
    }

    @Override
    public int getResult() {
        return this.result;
    }
}
