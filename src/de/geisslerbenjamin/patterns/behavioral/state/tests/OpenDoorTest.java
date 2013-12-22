package de.geisslerbenjamin.patterns.behavioral.state.tests;

import de.geisslerbenjamin.patterns.behavioral.state.ClosedDoor;
import de.geisslerbenjamin.patterns.behavioral.state.Key;
import de.geisslerbenjamin.patterns.behavioral.state.OpenDoor;
import de.geisslerbenjamin.patterns.behavioral.state.interfaces.DoorInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * OpenDoorTest
 * Created by Benjamin on 06.12.13.
 */
public class OpenDoorTest {
    protected DoorInterface object;

    @Before
    public void setUp() throws Exception {
        this.object = new OpenDoor(new Key(123));
    }

    @Test
    public void testClose() throws Exception {
        assertThat(this.object.close(), instanceOf(ClosedDoor.class));
    }

    @Test
    public void testIsOpen() throws Exception {
        Assert.assertTrue(this.object.isOpen());
    }

    @Test
    public void testIsClosed() throws Exception {
        Assert.assertFalse(this.object.isClosed());
    }

    @Test
    public void testIsLocked() throws Exception {
        Assert.assertFalse(this.object.isLocked());
    }
}
