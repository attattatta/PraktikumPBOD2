//nama file : Garis.java
//Pembuat : Naufal Rayan Attallah
//Deskripsi : berisi atribut dan method dalam class garis
//Tanggal : 01-03-2026

public class Garis {
    //Atribut
    Titik garisawal;
    Titik garisakhir;
    static int counterGaris = 0;

    //Method
    //Konstruktor tanpa parameter untuk membuat garis dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        this.garisawal = new Titik(0, 0);
        this.garisakhir = new Titik(1, 1);
        counterGaris++;
    }

    //Konstruktor dengan parameter untuk membuat garis dengan titik awal dan titik akhir yang diberikan
    public Garis(Titik garisawal, Titik garisakhir) {
        this.garisawal = garisawal;
        this.garisakhir = garisakhir;
        counterGaris++;
    }

    //selektor untuk setiap atribut beserta mutatornya
    public Titik getGarisawal() {
        return garisawal;
    }

    public void setGarisawal(Titik garisawal) {
        this.garisawal = garisawal;
    }

    public Titik getGarisakhir() {
        return garisakhir;
    }

    public void setGarisakhir(Titik garisakhir) {
        this.garisakhir = garisakhir;
    }

    //mengembalikan nilai counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    //menghitung panjang garis menggunakan rumus jarak antara dua titik
    public double panjangGaris() {
        double dx = garisakhir.getAbssis() - garisawal.getAbssis();
        double dy = garisakhir.getOrdinat() - garisawal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    //menghitung gradien garis 
    public double gradienGaris() {  
        double dx = garisakhir.getAbssis() - garisawal.getAbssis();
        double dy = garisakhir.getOrdinat() - garisawal.getOrdinat();
        return dy / dx;
    }

    //menghitung titik tengah garis 
    public Titik titikTengah() {
        double midX = (garisawal.getAbssis() + garisakhir.getAbssis()) / 2;
        double midY = (garisawal.getOrdinat() + garisakhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    //mengecek apakah garis tersebut sejajar dengan garis lain
    public boolean isSejajar(Garis garisLain) {
        return this.gradienGaris() == garisLain.gradienGaris();
    }

    //mengecek apakah garis tersebut tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis garisLain) {
        return this.gradienGaris() * garisLain.gradienGaris() == -1;
    }

    //mencetak koordinat titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Garis dari titik (" + garisawal.getAbssis() + "," + garisawal.getOrdinat() + ") " +
                "ke titik (" + garisakhir.getAbssis() + "," + garisakhir.getOrdinat() + ")");
    }

    //menampilkan persamaan garis dalam bentuk y = mx + c
    public void printPersamaanGaris() {
        double m = gradienGaris();
        double c = garisawal.getOrdinat() - m * garisawal.getAbssis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
