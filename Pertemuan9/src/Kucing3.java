public class Kucing3 extends Anabul3 {
    private final double bobot; 

    public Kucing3(String nama, double bobot) {
        this.panggilan = nama;
        this.bobot = bobot;
    }

    @Override
    public double getBobot() {
        return this.bobot;
    }
}
