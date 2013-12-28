package de.geisslerbenjamin.patterns.behavioral.strategy;

import de.geisslerbenjamin.patterns.behavioral.strategy.interfaces.TaxStrategyInterface;

/**
 * Normal austrian taxes.
 * Created by Benjamin on 28.12.13.
 */
public class NormalAustrianTaxes implements TaxStrategyInterface {
    @Override
    public float calcTaxes(float bill) {
        return bill + (float) (bill * 0.2);
    }
}
