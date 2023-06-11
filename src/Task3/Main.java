package Task3;

import java.lang.reflect.Modifier;
import java.nio.file.WatchEvent;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // TestClass testClass = new TestClass();
        Class<?> cl = TestClass.class;
        System.out.println("Constructors: " + Arrays.toString(cl.getConstructors()));
        System.out.println("Methods: " + Arrays.toString(cl.getDeclaredMethods()));
        System.out.println("Filds: " + Arrays.toString(cl.getDeclaredFields()));
        System.out.println("Modifiers: " + Modifier.toString(cl.getModifiers()));

    }
}
