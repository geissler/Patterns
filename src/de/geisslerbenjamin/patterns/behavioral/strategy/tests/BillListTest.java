package de.geisslerbenjamin.patterns.behavioral.strategy.tests;

import de.geisslerbenjamin.patterns.behavioral.strategy.*;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Bill test
 * Created by Benjamin on 28.12.13.
 */
public class BillListTest {

    @Test
    public void bundleOfDifferentBillsTest() {
        BillList bills = new BillList();
        bills.add(new Bill(new NormalGermanTaxes(), 75));
        bills.add(new Bill(new ReducedGermanTaxes(), 75));
        bills.add(new Bill(new NormalAustrianTaxes(), 50));

        Assert.assertEquals((float) 429.5, bills.calcSumOfAllBillsWithTaxes());
    }
}
