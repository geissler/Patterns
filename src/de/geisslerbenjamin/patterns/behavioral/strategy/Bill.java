package de.geisslerbenjamin.patterns.behavioral.strategy;

import de.geisslerbenjamin.patterns.behavioral.strategy.interfaces.BillInterface;
import de.geisslerbenjamin.patterns.behavioral.strategy.interfaces.TaxStrategyInterface;

/**
 * Simple bill.
 * Created by Benjamin on 28.12.13.
 */
public class Bill implements BillInterface {
    private TaxStrategyInterface tax;
    private float sum;

    /**
     * Constructor.
     *
     * @param tax the tax calculating strategy
     * @param sum sum
     */
    public Bill(TaxStrategyInterface tax, float sum) {
        this.tax = tax;
        this.sum = sum;
    }

    @Override
    public float getSumWithTaxes() {
        return this.sum + this.tax.calcTaxes(this.sum);
    }
}
