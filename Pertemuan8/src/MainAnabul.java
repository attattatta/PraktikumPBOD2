import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul a1 = new Kucing("Doomsday");   
        Anjing a2 = new Anjing("Darwin");
        Burung a3 = new Burung("Donald");
        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(a1);
        anabuls.add(a2);
        anabuls.add(a3);
        for (Anabul anabul : anabuls) {
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }

        Datum<Anabul> A = new Datum<>();
        A.setisi(a1);
        System.out.println("Isi datum A: " + A.getIsi().nama);
        A.setisi(a2);
        System.out.println("Isi datum A: " + A.getIsi().nama);
        A.setisi(a3);
        System.out.println("Isi datum A: " + A.getIsi().nama);
    }
}
