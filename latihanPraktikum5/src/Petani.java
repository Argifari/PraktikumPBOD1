import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{

    private String asal_kota;
    private static int counterPetani;

    public Petani() {
        counterPetani++;
    }
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, 
        double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        
        counterPetani++;
    }
    public String getAsalKota() {
        return asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }
    public void setAsalKota(String x) {
        this.asal_kota = x;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        String tab = "\t".repeat(4);
        System.out.println("Asal Kota" + tab + " : " + asal_kota);
    }
    //asumsi masa kerja dalam tahun
    @Override
    public int hitungMasaKerja() {
        LocalDate tglSekarang = LocalDate.now();
        Period masaKerja = Period.between(tgl_mulai_kerja, tglSekarang);
        return masaKerja.getYears() + 1;
    }
    @Override
    public double hitungPajak() {
        return 0;
    }    
}