//Nama : Mtitik.java
//Deskripsi : berisi atribut dan method dalam class titik
//Pembuat : Naufal Rayan Attallah
//Tanggal : 24-02-2026

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T1.printTitik();

        T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T2 = new Titik(3,5); //Membuat objek titik T2 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
    }
}
