//Nama file : mainSeminar.java
//Pembuat : Naufal Rayan Attallah
//NIM : 24060124140170
//Tanggal : 21 April 2026

public class mainSeminar {
    public static void main(String[] args) {
        System.out.println("=== 4. CIVITAS AKADEMIKA ===");
        Dosen d1 = new Dosen("Dr. Andi", "12345678");
        Dosen d2 = new Dosen("Dr. Budi", "87654321");

        Mahasiswa m1 = new Mahasiswa("Alya", "24080115120007");
        Mahasiswa m2 = new Mahasiswa("Bagas", "24080115120008");

        m1.setWali(d1);
        m2.setWali(d2);

        m1.cetakDataMahasiswa();
        m2.cetakDataMahasiswa();

        Seminar s1 = new Seminar();
        s1.registrasi(d1);
        s1.registrasi(d2);
        s1.registrasi(m1);
        s1.registrasi(m2);

        System.out.println("\nTotal Peserta Seminar:" + s1.countPeserta());
        System.out.println("Jumlah Mahasiswa Peserta Seminar:" + s1.countMahasiswa());
        s1.tampilPeserta();
    }
}
