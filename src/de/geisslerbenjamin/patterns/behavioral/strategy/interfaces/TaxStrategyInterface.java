package de.geisslerbenjamin.patterns.behavioral.strategy.interfaces;

/**
 * Simple interface to calc the taxes of a given sum.
 * Created by Benjamin on 28.12.13.
 */
public interface TaxStrategyInterface {
    /**
     * Calculate and add the taxes.
     *
     * @param bill sum
     * @return sum with taxes
     */
    public float calcTaxes(float bill);
}
