package singleton;

import java.io.*;

public class SerializeSingletonTest {

    public static void main(String[] args) {
        SerializeSingleton singleton1 = null;
        SerializeSingleton singleton2 = SerializeSingleton.getInstance();

        OutputStream ops = null;
        InputStream is = null;

        try {
            ops = new FileOutputStream("seria.io");
            ObjectOutputStream oos = new ObjectOutputStream(ops);
            oos.writeObject(singleton2);

            is = new FileInputStream("seria.io");
            ObjectInputStream ois = new ObjectInputStream(is);
            singleton1 = (SerializeSingleton) ois.readObject();

            oos.close();
            ois.close();

            System.out.println("singleton1 = " + singleton1);
            System.out.println("singleton2 = " + singleton2);
            System.out.println(singleton1 == singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }
    }
}
