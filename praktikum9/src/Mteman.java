public class Mteman {
    public static void main(String[] args) {
        Teman A1 = new Teman();

        A1.addNama("Budi");
        A1.addNama("Ayam");
        A1.addNama("Goreng");
        A1.addNama("Jini");
        A1.addNama("Jeji");
        A1.addNama("BBEEE");

        A1.showTeman();
        
        System.out.println();
        System.out.println("Jumlah teman sekarang : " + A1.getNbElm());
        System.out.println("Nama di indeks 1 : " + A1.getNama(1));
        
        A1.setNama(3, "Jeji");
        A1.delNama("Ayam");

        System.out.println();
        
        A1.gantiNama("BBEEE", "Bebe");
        A1.showTeman();
        
        System.out.println();
        String budi = "Budi";

        if (A1.isMember(budi)) {
            System.out.println(budi + " ada di list teman");
        }else {
            System.out.println(budi + " tidak ada di list teman");

        }

        String jeji = "Jeji";

        System.out.println("Jumlah nama " + jeji + " pada list teman : " + A1.countNama(jeji));
    }
}
