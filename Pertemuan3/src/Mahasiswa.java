import java.util.ArrayList;
public class Mahasiswa {
    //Atribut
    private String nama;
    private String nim;
    private String prodi;

    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //METHOD
    //konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public void addMatkul(MataKuliah newMatkul){
        listMatKul.add(newMatkul);
    }

    public Dosen setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
        return this.dosenWali;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
        return this.kendaraan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public MataKuliah getListMataKul() {
        return new MataKuliah("", "", listMatKul.size());
    }

    public MataKuliah getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getJumlahSKS();
        }
        return new MataKuliah("", "", totalSKS);
    }

    public void printDetailMhs(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Prodi : " + prodi);
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        if (listMatKul.size() == 0){
            System.out.println("Tidak ada mata kuliah yang diambil");
        } else {
            System.out.println("Jumlah SKS : " + getJumlahSKS().getJumlahSKS());
        }
    }
}
