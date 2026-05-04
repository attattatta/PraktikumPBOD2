public class Seminar {
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int jumlahPeserta;

    public Seminar(){
        this.jumlahPeserta = 0;
    }

    public void registrasi(Civitasakademika peserta) {
        if (jumlahPeserta < 100){
            this.pesertas[this.jumlahPeserta] = peserta;
            this.jumlahPeserta++;
        } else {
            System.out.println("Maaf, seminar sudah penuh.");
        }
    }

    public int countPeserta() {
        return this.jumlahPeserta;
    }

    public void tampilPeserta(){
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < this.jumlahPeserta; i++) {
            Civitasakademika peserta = this.pesertas[i];
            System.out.println((i + 1) + ". " + peserta.getNamaString() + " - " + peserta.getNomor());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < this.jumlahPeserta; i++) {
            if (this.pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
