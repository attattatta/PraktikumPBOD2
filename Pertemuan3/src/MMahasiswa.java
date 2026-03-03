public class MMahasiswa {
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("Doni Dorianto", "12345", "Teknik Komputer");
        Dosen D1 = new Dosen("Andi", "321", "Teknik Komputer");
        Kendaraan K1 = new Kendaraan("B 1234 ABC", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Matkul yang diambil : " + M1.getListMataKul().getJumlahSKS());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS().getJumlahSKS());
    }
}
