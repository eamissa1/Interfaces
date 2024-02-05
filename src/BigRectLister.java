import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(4, 5));
        // ... add more rectangles

        Object[] bigRectangles = StaticFilter.collectAll(rectangles.toArray(), new BigRectangleFilter());
        for (Object rect : bigRectangles)
        {
            System.out.println(rect);
        }
    }
}

