import java.lang.reflect.Field;
import java.util.*;

/**
 * Description of this file.
 *
 * @author XiongNeng
 * @version 1.0
 * @since 14-3-24
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Class cache = Integer.class.getDeclaredClasses()[0];
        System.out.println(cache.getName());
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = array[133];
        System.out.printf(" 2 + 2 = %d", 2 + 2);
    }
}
