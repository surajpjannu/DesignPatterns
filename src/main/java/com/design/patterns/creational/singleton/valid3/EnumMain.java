package com.design.patterns.creational.singleton.valid3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EnumMain {
    public static void main(String[] args) {

        /*
         *   Via multithreading
         * */

        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> Singleton.INSTANCE.printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.INSTANCE.printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.INSTANCE.printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.INSTANCE.printMessage(Thread.currentThread().getName()));
        executorService.submit(() -> Singleton.INSTANCE.printMessage(Thread.currentThread().getName()));

        executorService.shutdown();

        Singleton s1 = Singleton.INSTANCE;
        s1.printMessage("s1");

        /*
         * Via reflection
         * */
        try {
            final Singleton s2 = (Singleton) Enum.valueOf((Class<? extends Enum>) Class.forName(
                    "com.design.patterns.creational.singleton.valid3.Singleton"), "INSTANCE");
            s2.printMessage("s2");
        } catch (Exception e) {
            System.out.println("Exception while reflection");
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
           Singleton s3 = (Singleton) ois.readObject();
            ois.close();

            s3.printMessage("s3");
        } catch (Exception e) {
            System.out.println("Exception while serialization and deserialization " + e.getMessage());
        }

        /*
        * Clone of enum is not allowed so its protected
        * */
    }
}
