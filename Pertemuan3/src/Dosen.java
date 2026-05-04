public class Dosen {
    //atribut
    private String nama;
    private String nip;
    private String prodi;

    //method
    //konstruktor untuk membuat dosen tanpa parameter
    public Dosen(){
        this.nama = "";
        this.nip = "";
        this.prodi = "";
    }

    //konstruktor dengan parameter
    public Dosen(String nama, String nip, String prodi) {
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    //selektor dan mutator untuk masing-masing atribut
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }
}
