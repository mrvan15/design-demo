package prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype implements Cloneable, Serializable {
    private String name;
    private int age;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }

    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }

    public ConcretePrototype deepClone(){
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;

        try {
            bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object o = ois.readObject();
            return (ConcretePrototype) o;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("fan");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("sing");
        hobbies.add("dance");
        concretePrototype.setHobbies(hobbies);
        System.out.println("concretePrototype = " + concretePrototype);

//        ConcretePrototype prototype = concretePrototype.clone();
        ConcretePrototype prototype = concretePrototype.deepClone();
        prototype.getHobbies().add("draw");
        System.out.println("prototype = " + prototype);
    }
}
