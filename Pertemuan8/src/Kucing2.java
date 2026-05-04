//Kucing.java
//Naufal Rayan Attallah
//24060124140170
//28 April 2026

public class Kucing extends Anabul {
    int bobot;

    public Kucing(String nama, int bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public int getBobot() {
        return this.bobot;
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

class Anggora extends Kucing {
    public Anggora(String nama, int bobot) {
        super(nama, bobot);
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

class Kembangtelong extends Kucing {
    public Kembangtelong(String nama, int bobot) {
        super(nama, bobot);
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