//Nama file : MataKuliah.java
//Pembuat : Naufal Rayan Attallah
//Deskripsi : berisi atribut dan method dalam class MataKuliah
//Tanggal : 03-03-2026

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    //Method
    //Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor untuk setiap atribut beserta mutatornya
    public String getIdMatKul() {
        return idMatKul;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahSKS() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
