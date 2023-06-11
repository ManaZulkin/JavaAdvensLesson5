package Task2;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        String name;
        Class<?> cl;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name of the class");
        name = in.nextLine();
        try {
            cl = Class.forName("java.lang." + name);
            System.out.println("Class: " + cl);
            System.out.println("SuperClass: " + cl.getSuperclass());
            System.out.println("Interfaces: " + Arrays.toString(cl.getInterfaces()));
            System.out.println("Methods: " + Arrays.toString(cl.getMethods()));
            System.out.println("Filds: " + Arrays.toString(cl.getFields()));
            System.out.println("Modifiers: " + Modifier.toString(cl.getModifiers()));
            System.out.println("Is intrface: " + cl.isInterface());
            System.out.println("Is primitive: " + cl.isPrimitive());
            System.out.println("Is array: " + cl.isArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
