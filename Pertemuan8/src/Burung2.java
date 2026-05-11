public class Burung2 extends Anabul2 {
    public Burung2(String nama) {
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
