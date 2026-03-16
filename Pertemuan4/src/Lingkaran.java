//nama file : Lingkaran.java
//pembuat : Naufal Rayan Attallah
//NIM : 24060124140170
//deskripsi : kelas Lingkaran yang merupakan subclass dari BangunDatar

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double jariJari, String warna, String border) {
        super(1, warna, border);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
    }
}
