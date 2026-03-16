//nama file : Pegawai.java
//pembuat : Naufal Rayan Attallah
//NIM : 24060124140170
//deskripsi : kelas Pegawai sebagai kelas abstrak untuk berbagai jenis pegawai dengan atribut dan metode umum yang dimiliki oleh semua pegawai

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, String tglLahir, String tmt, double gajiPokok) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tglLahir, formatter);
        this.tmt = LocalDate.parse(tmt, formatter);
        this.gajiPokok = gajiPokok;
    }

    public String getMasaKerja() {
        LocalDate sekarang = LocalDate.of(2025, 3, 10); // Sesuai instruksi gambar
        Period periode = Period.between(tmt, sekarang);
        return periode.getYears() + " tahun " + periode.getMonths() + " bulan";
    }

    public int getMasaKerjaTahun() {
        return Period.between(tmt, LocalDate.of(2025, 3, 10)).getYears();
    }

    protected String formatTanggal(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID")));
    }

    public abstract double hitungTunjangan();
    public abstract LocalDate hitungTanggalPensiun();
    public abstract void printInfo();
}