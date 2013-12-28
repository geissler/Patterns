package de.geisslerbenjamin.patterns.behavioral.strategy.interfaces;

/**
 * Simple bill which is using different strategies to determine the additional taxes.
 * Created by Benjamin on 28.12.13.
 */
public interface BillInterface {
    /**
     * Calc the sum of the bill including the taxes
     *
     * @return sum with taxes
     */
    public float getSumWithTaxes();
}
