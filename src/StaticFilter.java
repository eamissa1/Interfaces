import java.util.ArrayList;

public class StaticFilter
{
    public static Object[] collectAll(Object[] objects, Filter filter)
    {
        ArrayList<Object> result = new ArrayList<>();
        for (Object obj : objects) {
            if (filter.accept(obj)) {
                result.add(obj);
            }
        }
        return result.toArray();
    }
}
