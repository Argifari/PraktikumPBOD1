/*
Nama file : Manusia.java
Nama : Muhammad Firdaus Argifari
NIM : 24060124130107
Tanggal : 18 Maret 2026
Deskripsi : parent abstract class Manusia
*/




import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {

    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() {
        counterMns++;
    }
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat,
        double pendapatan
    ) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }
    public double getPendapatan() {
        return pendapatan;
    }
    public static int getCounterMns() {
        return counterMns;
    }
    public void setNama(String x) {
        this.nama = x;
    }
    public void setTglMulaiKerja(LocalDate x) {
        this.tgl_mulai_kerja = x;
    }
    public void setAlamat(String x) {
        this.alamat = x;
    }
    public void setPendapatan(double x) {
        this.pendapatan = x;
    }

    @SuppressWarnings("deprecation")
    public void cetakInfo() {
        String tab = "\t".repeat(4);
        Locale localeID = new Locale("id","ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(localeID);
        String formatRupiah = formatter.format(pendapatan);
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formatTanggal = formatDate.format(tgl_mulai_kerja);
        System.out.println("Nama" + tab +": " + nama);
        System.out.println("Tanggal Mulai Kerja" + tab +": " + formatTanggal);
        System.out.println("Alamat" + tab +": " + alamat);
        System.out.println("Pendapatan" + tab +": " + formatRupiah);
    }


    public abstract int hitungMasaKerja();
}