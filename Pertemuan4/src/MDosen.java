public class MDosen {
    public static void main(String[] args) {
        DosenTetap dosen1 = new DosenTetap(
            "9545647548", "78647324", "Andi", 
            "5 Mei 1990", "1 Januari 2015", 5000000, 
            "Fakultas Sains dan Matematika"
        );

        System.out.println("--- Detail Pegawai ---");
        dosen1.printInfo();
    }
}