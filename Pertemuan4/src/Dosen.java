import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}

class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nidn, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    @Override
    public double hitungTunjangan() {
        return 0.02 * getMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public LocalDate hitungTanggalPensiun() {
        // Tgl Lahir + 65 tahun, jatuh pada tanggal 1 bulan berikutnya
        return tanggalLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));
        System.out.printf("Gaji Pokok      : Rp %.2f\n", gajiPokok);
        System.out.printf("Tunjangan       : 2%% x %d x Rp %.2f = Rp %.2f\n", getMasaKerjaTahun(), gajiPokok, hitungTunjangan());
    }
}

class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String nip, String nidk, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas, String tglKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.kontrakBerakhir = LocalDate.parse(tglKontrak, DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID")));
    }

    @Override
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public LocalDate hitungTanggalPensiun() {
        return kontrakBerakhir; // Untuk dosen tamu, pensiun = akhir kontrak
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        // ... (sisanya menyesuaikan format Dosen Tetap)
        System.out.printf("Tunjangan       : 2.5%% x Rp %.2f = Rp %.2f\n", gajiPokok, hitungTunjangan());
    }
}
