import java.time.LocalDate;

class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public double hitungTunjangan() {
        return 0.01 * getMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public LocalDate hitungTanggalPensiun() {
        return tanggalLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));
        System.out.printf("Tunjangan       : 1%% x %d x Rp %.2f = Rp %.2f\n", getMasaKerjaTahun(), gajiPokok, hitungTunjangan());
    }
}