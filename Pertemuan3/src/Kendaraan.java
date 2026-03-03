public class Kendaraan {
    //Atribut
    private String jenis;
    private String noPlat;

    //Method
    //Konstruktor tanpa parameter
    public Kendaraan() {
        this.jenis = "";
        this.noPlat = "";
    }

    //konstruktor dengan parameter
    public Kendaraan(String jenis, String noPlat) {
        this.jenis = jenis;
        this.noPlat = noPlat;
    }

    //Selektor dan mutator untuk masing-masing atribut
    public void setKendaraan(String jenis) {
        this.jenis = jenis;
    }

    public String getKendaraan() {
        return jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getNoPlat() {
        return noPlat;
    }
}
