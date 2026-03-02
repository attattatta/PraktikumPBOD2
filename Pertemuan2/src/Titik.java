//Nama File : Titik.java
//Deskripsi : berisi atribut dan method dalam calss Titik
//Pembuat   : Naufal Rayan Attallah
//Tanggal   : 24-02-2026

public class Titik {
    //Atribut
    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    //Method
    //Konstruktor utk membuat titik (x,y)
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //Mengembalikan nilai absis dan ordinat
    double getAbssis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ") ");
    }

    void printCounterTitik(){
        System.out.println("Jumlah Objek Titik = " + Titik.counterTitik);
    }

    double jarak(Titik T){
        double jarak = Math.sqrt(Math.pow((absis - T.absis), 2) + Math.pow((ordinat - T.ordinat), 2));
        return jarak;
    }

    double kuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0; //titik berada pada sumbu x atau y
        }
    }
    
    void refleksiX(){
        ordinat = -ordinat;
    }

    void refleksiY(){
        absis = -absis;
    }

    double JarakPusat(){
        double jarakPusat = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarakPusat;
    }

    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}