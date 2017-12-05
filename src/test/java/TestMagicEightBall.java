import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestMagicEightBall {
    MagicEightBall magicEightBall;

    @Before
    public void before() {
        magicEightBall = new MagicEightBall();
    }

    @Test
    public void hasAnswer() {
        assertEquals(0, magicEightBall.getCount());
    }

    @Test
    public void hasAnotherAnswer() {
        magicEightBall.addResult("Yes!");
        assertEquals(1, magicEightBall.getCount());
    }

    @Test
    public void canReturnResult() {
        magicEightBall.addResult("Yes");
        magicEightBall.addResult("Maybe");
        magicEightBall.addResult("No");
        System.out.println(magicEightBall.shake());
        assertNotNull(magicEightBall.shake());
    }


}
