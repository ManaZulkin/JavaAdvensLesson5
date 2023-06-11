package Task4;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Cat {

    public static void main(String[] args) {

        Class<?> cl = Animal.class;
        Animal woolf = new Animal();
        System.out.println(Arrays.toString(cl.getDeclaredFields()));
        Field name;
        Field age;
        Field veight;
        try {
            name = cl.getDeclaredField("name");
            age = cl.getDeclaredField("age");
            veight = cl.getDeclaredField("veight");
            name.setAccessible(true);
            age.setAccessible(true);
            veight.setAccessible(true);

            System.out.println("Basic fields:");
            System.out.println("Age - " + age.getInt(woolf));
            System.out.println("Veight - " + veight.getDouble(woolf));
            System.out.println("Name - " + name.get(woolf) +"\n");

            age.setInt(woolf,2);
            veight.setDouble(woolf,3.3);
            name.set(woolf,"Cat");

            System.out.println("New fields:");
            System.out.println("Age - " + age.getInt(woolf));
            System.out.println("Veight - " + veight.getDouble(woolf));
            System.out.println("Name - " + name.get(woolf));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
