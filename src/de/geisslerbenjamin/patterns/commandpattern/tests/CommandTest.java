package de.geisslerbenjamin.patterns.commandpattern.tests;

import de.geisslerbenjamin.patterns.commandpattern.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Some simple tests.
 * Created by Benjamin on 22.12.13.
 */
public class CommandTest {
    private Document document;
    private DocumentHistory history;

    @Before
    public void setUp() {
        this.document = new Document("Arial", 12);
        this.history = new DocumentHistory();
    }

    @Test
    public void increaseAndDecreaseTest() {
        MenuElement increase = new MenuElement("Increase font", new IncreaseCommand(this.history), this.document);
        MenuElement decrease = new MenuElement("Decrease font", new DecreaseCommand(this.history), this.document);

        increase.click();
        Assert.assertEquals(14, this.document.getSize());
        Assert.assertEquals("Arial", this.document.getFont());
        decrease.click();
        Assert.assertEquals(12, this.document.getSize());
    }

    @Test
    public void changeFontTest() {
        MenuElement arial = new MenuElement("Set font to 'Arial'", new ArialCommand(this.history), this.document);
        MenuElement times = new MenuElement("Set font to 'Times'", new TimesCommand(this.history), this.document);

        times.click();
        Assert.assertEquals("Times New Roman", this.document.getFont());
        arial.click();
        Assert.assertEquals("Arial", this.document.getFont());
    }

    @Test
    public void changeSizeAndFontAndUndoTest() {
        MenuElement times = new MenuElement("Set font to 'Times'", new TimesCommand(this.history), this.document);
        MenuElement increase = new MenuElement("Increase font", new IncreaseCommand(this.history), this.document);
        MenuElement undo = new MenuElement("Undo", new UndoCommand(this.history), this.document);

        times.click();
        Assert.assertEquals("Times New Roman", this.document.getFont());
        increase.click();
        Assert.assertEquals(14, this.document.getSize());
        increase.click();
        Assert.assertEquals(16, this.document.getSize());
        undo.click();
        Assert.assertEquals(14, this.document.getSize());
        Assert.assertEquals("Times New Roman", this.document.getFont());
        undo.click();
        Assert.assertEquals(12, this.document.getSize());
        undo.click();
        Assert.assertEquals("Arial", this.document.getFont());
    }
}
