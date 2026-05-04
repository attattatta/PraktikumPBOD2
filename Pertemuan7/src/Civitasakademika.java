public class Civitasakademika {
    protected String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNamaString() {
        return this.nama;
    }

    public String getNomor(){
        return "";
    }
}

class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return this.nip;
    }
}

class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return this.nim;
    }

    public void cetakDataMahasiswa(){
        String namaWali = (dosenWali != null) ? dosenWali.getNamaString() : "Belum memiliki dosen wali";
        System.out.println("Nama: " + this.nama + ", NIM: " + this.nim + ", Dosen Wali: " + namaWali);
    }
}
