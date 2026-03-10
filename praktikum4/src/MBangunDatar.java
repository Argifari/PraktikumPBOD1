
public class MBangunDatar {

    public static void main(String[] args) {
        /*
        Bagian 1 :
        2. Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
        Mengapa? tidak bisa karena atribut pada class BangunDatar dibuat private
        Jadi untuk mengubah nilai atributnya harus menggunakan method yang sudah ada

        Bagian 3 :
        2. Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?
        Error karena static method itu melekat pada class BangunDatar

        Bagian 4:
        1. Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
        tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
        Mengapa?
        dapat direalisasikan dan berjalan tanpa error karena aksesnya sudah protected
        yang berarti dapat diakses di kelas yang sama atau subclassnya

        Bagian 5 :
        1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
        Persegi dan Lingkaran?
        Semua subclass mengalami error karena kelas parent mereka berubah menjadi kelas
        yang tidak bisa mewariskan

        2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada
        method printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method
        printInfo() pada kelas Persegi dan Lingkaran?
        method printInfo yang dioverride mengalami error karena printInfo pada kelas parent
        diubah menjadi final yang berarti method tersebut tidak dapat diubah
        */

        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(3.0,"biru","solid");
        P1.setBorder("dashed");
        P1.setSisi(2.5);
        P1.setWarna("red");
        System.out.println("Informasi persegi P2 : ");
        P2.printInfo();
        
        double panjangSisiP1 = P1.getSisi();
        double pamjangSisiP2 = P2.getSisi();
        double luasP1 = P1.getLuas();
        double luasP2 = P2.getLuas();
        double kelilingP1 = P1.getKeliling();
        double kelilingP2 = P2.getKeliling();
        
        System.out.println("\nPanjang sisi P1 : " + panjangSisiP1);
        System.out.println("Luas persegi P1 : " + luasP1);
        System.out.println("Keliling persegi P1 : " + kelilingP1);
        System.out.println("Panjang sisi P2 : " + pamjangSisiP2);
        System.out.println("Luas persegi P2 : " + luasP2);
        System.out.println("Keliling persegi P2 : " + kelilingP2);
        
        
        System.out.println("\n\nTesting lingkaran  : ");
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(14, "black", "solid");
        L1.setBorder("dashed");
        L1.setWarna("white");
        L1.setJari(7);
        
        double panjangJariL1 = L1.getJari();
        double pamjangJariL2 = L2.getJari();
        double luasL1 = L1.getLuas();
        double luasL2 = L2.getLuas();
        double kelilingL1 = L1.getKeliling();
        double kelilingL2 = L1.getKeliling();

        System.out.println("\nPanjang jari L1 : " + panjangJariL1);
        System.out.println("Luas lingkaran L1 : " + luasL1);
        System.out.println("Keliling lingkaran L1 : " + kelilingL1);
        System.out.println("Panjang jari L2 : " + pamjangJariL2);
        System.out.println("Luas lingkaran L2 : " + luasL2);
        System.out.println("Keliling lingkaran L2 : " + kelilingL2);

    }
}