//Nama File : main.java
//Pembuat : Naufal Rayan Attallah
//NIM : 24060124140170
//tanggal : 21 April 2026

//Renungan : Polimorfisme berguna untuk mengubah sifat objek berdasarkan tipe class tertentu.

public class main {
    public static void main(String[] args) {
        System.out.println("=== 2. MAHASISWA ===");
        Mahasiswa m1 =  new Mahasiswa();
        m1.cetakInfo();

        Mahasiswa m2 = new Mahasiswa("Budi", "24080115120006", "Teknik Mesin");
        m2.cetakInfo();

        Mahasiswa m3 = new Mahasiswa(m2);
        m3.cetakInfo();

        m1.setProgramStudi();
        System.out.print("M1 setelah setProgramStudi(): ");
        m1.cetakInfo();

        m1.setProgramStudi("Teknik Informatika");
        System.out.print("M1 setelah setProgramStudi(\"Teknik Informatika\"): ");
        m1.cetakInfo();

        Mahasiswa m4 = new Mahasiswa("Siti", "24080115120007", "Teknik Elektro");
        m4.setProgramStudi(m2);
        System.out.print("M4 setelah setProgramStudi(m2): ");
        m4.cetakInfo();

        System.out.println("=== 3. ANABUL ===");
        Anabul a1 = new Kucing("Oggy");
        Anabul a2 = new Anjing("Dawg");
        Anabul a3 = new Burung("Mordecai");

        a1.gerak();
        a1.bersuara();

        a2.gerak();
        a2.bersuara();

        a3.gerak();
        a3.bersuara();    
    }
}
