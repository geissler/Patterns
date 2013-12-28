package de.geisslerbenjamin.patterns.behavioral.strategy;

import de.geisslerbenjamin.patterns.behavioral.strategy.interfaces.BillInterface;

import java.util.ArrayList;

/**
 * Simple list of bills.
 * Created by Benjamin on 28.12.13.
 */
public class BillList {
    private ArrayList<BillInterface> bills;

    /**
     * Constructor.
     */
    public BillList() {
        this.bills = new ArrayList<BillInterface>();
    }

    /**
     * Add a bill
     *
     * @param bill bill
     * @return self
     */
    public BillList add(BillInterface bill) {
        this.bills.add(bill);
        return this;
    }

    /**
     * Calculate the sum of all bills including there taxes.
     *
     * @return sum
     */
    public float calcSumOfAllBillsWithTaxes() {
        float sum = 0;

        for (BillInterface bill : this.bills) {
            sum += bill.getSumWithTaxes();
        }

        return sum;
    }
}
