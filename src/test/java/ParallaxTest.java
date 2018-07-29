import com.harium.etyl.cinematics.parallax.Parallax;
import com.harium.etyl.core.graphics.Graphics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParallaxTest {

    Parallax parallax;

    @Before
    public void setUp() {
        parallax = new Parallax() {
            public void draw(Graphics g) {

            }
        };
    }

    @Test
    public void testDummy() {
        Assert.assertNotNull(parallax);
    }

}
