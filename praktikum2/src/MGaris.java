public class MGaris {

    public static void main(String[] args) {
        Titik T1 = new Titik(2,3);
        Titik T2 = new Titik(9,1);
        Garis G1 = new Garis();
        Garis G2 = new Garis(T1,T2);
        
        System.out.print("Garis G1 : ");
        G1.printGaris();
        System.out.print("Garis G2 : ");
        G2.printGaris();
        
        int countGaris = Garis.getCounterGaris();
        System.out.println("Banyak garis sekarang : " + countGaris);
        
        G1.setTitikAwal(new Titik(7,-10));
        G1.setTitikAkhir(new Titik(-9,-8));
        System.out.print("Garis G1 sekarang: ");
        G1.printGaris();
        
        double panjangGarisG1 = G1.panjangGaris();
        System.out.println("Panjang Garis G1 : " + panjangGarisG1);
        
        double gradienG1 = G1.gradien();
        System.out.println("Gradien Garis G1 : " + gradienG1);
        
        Titik tengahG1 = G1.titikTengah();
        System.out.print("Titik tengah Garis G1 : ");
        tengahG1.printTitik();
        
        System.out.print("Persamaan Garis G1 : ");
        G1.showEquation();

        boolean isSejajar = G1.isSejajar(G2);
        boolean isTegakLurus = G1.isTegakLurus(G2);

        if (isSejajar) {
            System.out.print("Garis G1 sejajar dengan G2\n");
        }else {

            System.out.print("Garis G1 tidak sejajar dengan G2\n");
        }

        if (isTegakLurus) {
            System.out.print("Garis G1 tegak lurus dengan G2\n");
        }else {

            System.out.print("Garis G1 tidak tegak lurus dengan G2\n");
        }
        


    }
}