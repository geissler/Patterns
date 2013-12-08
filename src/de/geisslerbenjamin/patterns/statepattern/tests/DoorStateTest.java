package de.geisslerbenjamin.patterns.statepattern.tests;

import de.geisslerbenjamin.patterns.statepattern.*;
import de.geisslerbenjamin.patterns.statepattern.interfaces.DoorActionInterface;
import de.geisslerbenjamin.patterns.statepattern.interfaces.KeyInterface;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * State tests.
 * Created by Benjamin on 06.12.13.
 */
public class DoorStateTest {

    @Test
    public void testCloseAndLockOpenDoor() throws Exception {
        KeyInterface key = new Key(123);
        DoorActionInterface door = new Door(new OpenDoor(key));
        Assert.assertTrue(door.isOpen());
        Assert.assertTrue(door.close());
        assertThat(door.getState(), instanceOf(ClosedDoor.class));
        Assert.assertTrue(door.lock(key));
        assertThat(door.getState(), instanceOf(LockedDoor.class));
    }

    @Test
    public void testDoNotLockOpenDoor() throws Exception {
        KeyInterface key = new Key(123);
        DoorActionInterface door = new Door(new OpenDoor(key));
        Assert.assertTrue(door.isOpen());
        Assert.assertFalse(door.lock(key));
    }

    @Test
    public void testDoNotLockDoorWithWrongKey() throws Exception {
        KeyInterface key = new Key(123);
        DoorActionInterface door = new Door(new OpenDoor(key));
        Assert.assertTrue(door.isOpen());
        Assert.assertTrue(door.close());
        Assert.assertFalse(door.lock(new Key(44)));
    }

    @Test
    public void testOpenALockedDoor() throws Exception {
        KeyInterface key = new Key(123);
        DoorActionInterface door = new Door(new LockedDoor(key));
        Assert.assertFalse(door.isOpen());
        Assert.assertTrue(door.isClosed());
        Assert.assertTrue(door.isLocked());
        Assert.assertTrue(door.unlock(key));
        assertThat(door.getState(), instanceOf(ClosedDoor.class));
        Assert.assertTrue(door.open());
        assertThat(door.getState(), instanceOf(OpenDoor.class));
        Assert.assertTrue(door.isOpen());
    }
}
