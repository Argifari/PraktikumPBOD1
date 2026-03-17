/*
Nama file : MBangunDatar.java
Nama : Muhammad Firdaus Argifari
NIM : 24060124130107
Tanggal : 17 Maret 2026
Deskripsi : Main driver Bangun Datar
*/




public class MBangunDatar {

    public static void main(String[] args) {

        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10);
        // Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        // Lingkaran L2 = new Lingkaran(14);

        P1.setBorder("Solid");
        P1.setWarna("Biru");
        double luasP1 = P1.getLuas();
        double kelilingP1 = P1.getKeliling();
        L1.setBorder("Dashed");
        L1.setWarna("Black");
        double luasL1 = L1.getLuas();
        double kelilingL1 = L1.getKeliling();

        System.out.println("Informasi Persegi P1 : ");
        P1.printInfo();
        System.out.println("Luas Persegi P1 : " + luasP1);
        System.out.println("Keliling Persegi P1 : " + kelilingP1);
        
        System.out.println("\nInformasi Lingkaran L1 : ");
        L1.printInfo();
        System.out.println("Luas Lingkaran L1 : " + luasL1);
        System.out.println("Keliling Lingkaran L1 : " + kelilingL1);
        
    }
}