package com.design.patterns.creational.singleton.example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazyMain {
    public static void main(String[] args) {

        //        new Singleton(); NOT possible. Compilation error will be thrown as there is no public constructor

        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> Singleton.getInstance().printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.getInstance().printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.getInstance().printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.getInstance().printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.getInstance().printMessage(Thread.currentThread().getName()));

        executorService.shutdown();

        Singleton s1 = Singleton.getInstance();
        s1.printMessage("s1");
        Singleton s2 = Singleton.getInstance();
        s2.printMessage("s2");

        /*
         * Breaking singleton via Reflection
         * */
        try {
            Class<?> aClass = Class.forName("com.design.patterns.creational.singleton.example2.Singleton");
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Singleton s3 = (Singleton) declaredConstructor.newInstance();
            s3.printMessage("s3");
        } catch (Exception e) {
            System.out.println("Exception while reflection " + e.getMessage());
        }

        /*
         * Breaking singleton via serialization and deserialization
         * */
        try {
            final String file = "object.txt";
            final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(s1);
            oos.close();

            final ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Singleton s4 = (Singleton) ois.readObject();
            ois.close();

            s4.printMessage("s4");
        } catch (Exception e) {
            System.out.println("Exception while serialization and deserialization " + e.getMessage());
        }

        /*
         * breaking singleton via clone method
         * */
        try {
            Singleton s5 = (Singleton) s1.clone();
            s5.printMessage("s5");
        } catch (Exception e) {
            System.out.println("Exception while clone " + e.getMessage());
        }

    }
}
