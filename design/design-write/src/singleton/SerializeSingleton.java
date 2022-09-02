package singleton;

import java.io.Serializable;

public class SerializeSingleton implements Serializable {
    private static final SerializeSingleton SERIALIZE_SINGLETON = new SerializeSingleton();
    public SerializeSingleton(){

    }

    public static SerializeSingleton getInstance(){
        return SERIALIZE_SINGLETON;
    }

    private Object readResolve(){
        return SERIALIZE_SINGLETON;
    }
}
