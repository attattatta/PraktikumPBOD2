import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        Anggora a1 = new Anggora("Doomsday", 10);
        Anjing2 a2 = new Anjing2("Darwin");
        Burung2 a3 = new Burung2("Donald");
        ArrayList<Anabul2> anabuls = new ArrayList<>();
        anabuls.add(a1);
        anabuls.add(a2);
        anabuls.add(a3);
        for (Anabul2 anabul : anabuls) {
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }

        Datum<Anabul2> A = new Datum<>();
        A.setisi(a1);
        System.out.println("Isi datum A: " + A.getIsi().nama);
        A.setisi(a2);
        System.out.println("Isi datum A: " + A.getIsi().nama);
        A.setisi(a3);
        System.out.println("Isi datum A: " + A.getIsi().nama);
    }
}
