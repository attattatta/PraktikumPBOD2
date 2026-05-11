//Kucing.java
//Naufal Rayan Attallah
//24060124140170
//28 April 2026

public class Kucing2 extends Anabul2 {
    int bobot;

    public Kucing2(String nama, int bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(this.nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " berbunyi: meong!");
    }
}

class Anggora extends Kucing2 {
    public Anggora(String nama, int bobot) {
        super(nama, bobot);
    }
}

class Kembangtelong extends Kucing2 {
    public Kembangtelong(String nama, int bobot) {
        super(nama, bobot);
    }
}