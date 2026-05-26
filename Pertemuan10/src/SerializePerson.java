//Naufal Rayan Attallah
//24060124140170
//SerializePerson.java
//Deskripsi : program untuk serialisasi objek Person

import java.io.*;
class Person implements Serializable {
    private String name;
    public Person(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}

public class SerializePerson{
    public static void main(String[] args) throws Exception {
        Person p = new Person("John Doe");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(p);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
