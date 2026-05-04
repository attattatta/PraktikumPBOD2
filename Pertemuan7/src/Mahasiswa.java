public class Mahasiswa {
    private String nama;
    private String nim;
    private String programStudi;

    public Mahasiswa(String nama, String nim, String programStudi) {
        this.nama = nama;
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa mhsLain) {
        this.nama = mhsLain.nama;
        this.nim = mhsLain.nim;
        this.programStudi = mhsLain.programStudi;
    }

    public Mahasiswa() {
        this.nama = "n/a";
        this.nim = "-999";
        this.programStudi = "n/a";
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa mhsLain) {
        this.programStudi = mhsLain.programStudi;
    }

    public void cetakInfo() {
        System.out.println("Nama : " + this.nama + ", NIM : " + this.nim + ", Program Studi : " + this.programStudi);
    }
}
