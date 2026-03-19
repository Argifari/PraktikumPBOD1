/*
Nama file : Manusia.java
Nama : Muhammad Firdaus Argifari
NIM : 24060124130107
Tanggal : 18 Maret 2026
Deskripsi : main driver clas MManusia
*/

import java.time.LocalDate;

public class MManusia {

    public static void main (String[] args) {
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1),"Jl. Seroja",
        15000000,"198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), 
        "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 
        5000000, "wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), 
        10000000, "198004212010041002");
     
        p2.setAlamat("Jl. Panorama 111 Tembalang");
    


        System.out.println("\nInformasi Jumlah : ");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        
        
        System.out.println("\nInformasi Pajak : ");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        
        
        System.out.println("\nInformasi Masa Kerja : ");
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        
        
        System.out.println("\nInformasi PNS : ");
        p1.cetakInfo();
        System.out.println("\nInformasi Pengusaha : ");
        pe1.cetakInfo();
        System.out.println("\nInformasi Petani : ");
        pt1.cetakInfo();
        // Pns budi = new Pns();

        // budi.setAlamat("Banjarnegara");
        // budi.setNama("Budi Cahyadi");
        // budi.setNip("123156465");
        // budi.setPendapatan(9000000);
        // budi.setTglMulaiKerja(LocalDate.of(2024, 2, 12));

        // System.out.println("\nInformasi Pns : ");
        // budi.cetakInfo();

        // Pengusaha tejo = new Pengusaha();
        // tejo.setAlamat("Klaten");
        // tejo.setNama("Tejo Haryadi");
        // tejo.setNpwp("8488945");
        // tejo.setPendapatan(10000000);
        // tejo.setTglMulaiKerja(LocalDate.of(2022, 10, 3));
        // System.out.println("\nInformasi Pengusaha : ");
        // tejo.cetakInfo();
        
        // Petani hanto = new Petani();
        // hanto.setAlamat("Jember");
        // hanto.setNama("Hanto Hantanto");
        // hanto.setAsalKota("Purworejo");
        // hanto.setPendapatan(5000000);
        // hanto.setTglMulaiKerja(LocalDate.of(2018, 4, 15));
        // System.out.println("\nInformasi Petani : ");
        // hanto.cetakInfo();
      }
    

}