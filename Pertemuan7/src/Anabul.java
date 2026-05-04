public class Anabul {
    String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(this.nama + " sedang bergerak!");
    }

    public void bersuara() {
        System.out.println(this.nama + " sedang bersuara!");
    }
}

class Kucing extends Anabul2 {
    public Kucing(String nama) {
        super(nama);
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

class Anjing extends Anabul2 {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(this.nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " berbunyi: Guk-guk!");
    }
}

class Burung extends Anabul2 {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(this.nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " berbunyi: cuit-cuit!");
    }
}
