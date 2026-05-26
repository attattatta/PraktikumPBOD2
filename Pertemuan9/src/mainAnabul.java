//Naufal Rayan Attallah
//24060124140170
//mainAnabul.java
//Renungan : Koleksi adalah kumpulan objek yang memiliki tipe data yang sama.

public class mainAnabul {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();
        Kucing3 k1 = new Kucing3("Stampy", 5.0);
        Anjing3 a1 = new Anjing3("Buster");
        Burung3 b1 = new Burung3("Kunam");

        p.enqueueAnabul(k1);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        System.out.println("Jenis Anabul:");
        p.showJenisAnabul();
    }
}
