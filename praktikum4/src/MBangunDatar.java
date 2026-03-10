
public class MBangunDatar {

    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(3.0,"biru","solid");
        P1.setBorder("dashed");
        P1.setSisi(2.5);
        P1.setWarna("red");
        P2.printInfo();

        double panjangSisiP1 = P1.getSisi();
        double pamjangSisiP2 = P2.getSisi();
        double luasP1 = P1.getLuas();
        double luasP2 = P2.getLuas();
        double kelilingP1 = P1.getKeliling();
        double kelilingP2 = P2.getKeliling();

        System.out.println("Panjang sisi P1 : " + panjangSisiP1);
        System.out.println("Luas persegi P1 : " + luasP1);
        System.out.println("Keliling persegi P1 : " + kelilingP1);
        System.out.println("Panjang sisi P2 : " + pamjangSisiP2);
        System.out.println("Luas persegi P2 : " + luasP2);
        System.out.println("Keliling persegi P2 : " + kelilingP2);


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

        System.out.println("Panjang jari L1 : " + panjangJariL1);
        System.out.println("Luas lingkaran L1 : " + luasL1);
        System.out.println("Keliling lingkaran L1 : " + kelilingL1);
        System.out.println("Panjang jari L2 : " + pamjangJariL2);
        System.out.println("Luas lingkaran L2 : " + luasL2);
        System.out.println("Keliling lingkaran L2 : " + kelilingL2);

    }
}