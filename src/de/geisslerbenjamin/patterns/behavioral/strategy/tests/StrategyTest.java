package de.geisslerbenjamin.patterns.behavioral.strategy.tests;

import de.geisslerbenjamin.patterns.behavioral.strategy.NormalAustrianTaxes;
import de.geisslerbenjamin.patterns.behavioral.strategy.NormalGermanTaxes;
import de.geisslerbenjamin.patterns.behavioral.strategy.ReducedGermanTaxes;
import de.geisslerbenjamin.patterns.behavioral.strategy.interfaces.TaxStrategyInterface;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Test different strategies.
 * Created by Benjamin on 28.12.13.
 */
@RunWith(Parameterized.class)
public class StrategyTest {
    private float sum;
    private float result;
    private TaxStrategyInterface strategy;

    /**
     * Inject the parameters from the data method
     *
     * @param sum      sum
     * @param result   expected result
     * @param strategy strategy to use
     */
    public StrategyTest(float sum, float result, TaxStrategyInterface strategy) {
        this.sum = sum;
        this.result = result;
        this.strategy = strategy;
    }

    @Test
    public void differentTaxStrategiesTest() {
        Assert.assertEquals(this.result, this.strategy.calcTaxes(this.sum));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {75, (float) 89.25, new NormalGermanTaxes()},
                {75, (float) 80.25, new ReducedGermanTaxes()},
                {75, (float) 90.0, new NormalAustrianTaxes()},
        });

    }
}
