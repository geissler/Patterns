package de.geisslerbenjamin.patterns.structural.adapter.tests;

import de.geisslerbenjamin.patterns.structural.adapter.BlueRayPlayer;
import de.geisslerbenjamin.patterns.structural.adapter.DVDPlayer;
import de.geisslerbenjamin.patterns.structural.adapter.MoviePlayerToMediaPlayerAdapter;
import de.geisslerbenjamin.patterns.structural.adapter.interfaces.MediaPlayerInterface;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Simple test
 * Created by Benjamin on 09.01.14.
 */
@RunWith(Parameterized.class)
public class AdapterTest {
    private MediaPlayerInterface mediaPlayer;

    public AdapterTest(MediaPlayerInterface mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Test
    public void testPlay() {
        Assert.assertTrue(this.mediaPlayer.play());
    }

    @Test
    public void testPause() {
        Assert.assertTrue(this.mediaPlayer.pause());
    }

    @Test
    public void testStop() {
        Assert.assertTrue(this.mediaPlayer.stop());
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new BlueRayPlayer()},
                {new MoviePlayerToMediaPlayerAdapter(new DVDPlayer())}
        });
    }
}
