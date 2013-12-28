package de.geisslerbenjamin.patterns.behavioral.strategy;

import de.geisslerbenjamin.patterns.behavioral.strategy.interfaces.TaxStrategyInterface;

/**
 * Reduced german taxes
 * Created by Benjamin on 28.12.13.
 */
public class ReducedGermanTaxes implements TaxStrategyInterface {
    @Override
    public float calcTaxes(float bill) {
        return bill + (float) (bill * 0.07);
    }
}
