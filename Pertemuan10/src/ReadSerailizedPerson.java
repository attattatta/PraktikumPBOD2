
import java.io.*;
public class ReadSerailizedPerson {
    public static void main(String[] args) throws Exception {
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            Person p = (Person) s.readObject();
            s.close();
            System.out.println("Nama person: " + p.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
