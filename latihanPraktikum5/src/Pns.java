import java.time.LocalDate;
import java.time.Period;

public class Pns extends Manusia implements Pajak{ 

    private String nip;
    private static int counterPNS;

    public Pns() {
        counterPNS++;
    }
    public Pns(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    public String getNip() {
        return nip;
    }
    public static int getCounterPns() {
        return counterPNS;
    }
    public void setNip(String x) {
        this.nip = x;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        String tab = "\t".repeat(4);
        System.out.println("NIP" + tab + " : " + nip);
    }

    //asumsi masa kerja dalam tahun
    @Override
    public int hitungMasaKerja() {
        LocalDate tglSekarang = LocalDate.now();
        Period masaKerja = Period.between(tgl_mulai_kerja, tglSekarang);
        return masaKerja.getYears() + 7;
    }

    @Override
    public double hitungPajak() {
        double pajak = (10/100)*pendapatan;
        return pajak;
    }


}