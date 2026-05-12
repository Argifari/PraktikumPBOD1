public class MPiaran {
    public static void main(String[] args) {
        Piaraan budi;

        budi = new Piaraan();

        Kucing a = new Kucing("Budi");
        a.setBobot(2);

        Kucing b = new Kucing("Jeje");
        b.setBobot(1);

        Anabul c = new Anjing("Kece");

        budi.enqueueAnabul(a);
        budi.enqueueAnabul(b);
        budi.enqueueAnabul(c);

        int jumlahKucing = budi.countKucing();
        int bobotKucing = budi.bobotKucing();

        System.out.println("Jumlah piaran budi : " + budi.getNbElm());
        System.out.println("Jumlah Kucing budi  : " + jumlahKucing);
        System.out.println("Jumlah bobot Kucing budi  : " + bobotKucing);

        budi.showAnabul();
        System.out.println();
        budi.showJenisAnabul();
    }   
}
