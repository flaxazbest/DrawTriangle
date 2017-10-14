import javafx.geometry.Point2D;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WindowTest {
    Window w;

    @Before
    public void init() {
        w = new Window(-5, 5, -5,5, 300, 300);
    }

    @Test
    public void screenToReal() throws Exception {
        Point2D p = w.screenToReal(new Point2D(150, 150));
        assertEquals(new Point2D(0,0), p);

        p =  w.screenToReal(new Point2D(0, 0));
        assertEquals(new Point2D(-5,5), p);

        p =  w.screenToReal(new Point2D(300, 300));
        assertEquals(new Point2D(5,-5), p);
    }

    @Test
    public void realToScreen() throws Exception {
        Point2D p = w.realToScreen(new Point2D(0, 0));
        assertEquals(new Point2D(150,150), p);

        p = w.realToScreen(new Point2D(-5, -5));
        assertEquals(new Point2D(0,300), p);

        p = w.realToScreen(new Point2D(-5, 5));
        assertEquals(new Point2D(0,0), p);
    }

}