package Dots;

import java.util.Arrays;
import java.util.Collections;

public class Flatness {

    public static double getDistance(Dot a, Dot b) {
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
    public static double getTriangleArea(Dot a, Dot b, Dot c) {
        return Math.abs(
                (b.x - a.x) * (c.y - a.y) -
                        (c.x - a.x) * (b.y - a.y)
        ) / 2.0;

    }

    public static double getMaxLength(Dot a, Dot b, Dot c) {
        double distanceAB = Math.hypot(b.x - a.x, b.y - a.y);
        double distanceBC = Math.hypot(c.x - b.x, c.y - b.y);
        double distanceCA = Math.hypot(a.x - c.x, a.y - c.y);

        return Collections.max(Arrays.asList(distanceAB, distanceBC, distanceCA));
    }
}
