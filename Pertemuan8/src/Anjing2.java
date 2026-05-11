public class Anjing2 extends Anabul2 {
    public Anjing2(String nama) {
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
