public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    static int counterGaris;

    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    Garis(Titik T1, Titik T2) {
        titikAwal = T1;
        titikAkhir = T2;
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }
    public Titik getTitikAkhir() {
        return titikAkhir;
    }
    public void setTitikAwal(Titik T) {
        titikAwal = T;
    }
    public void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }
    
    static int getCounterGaris() {
        return counterGaris;
    }
    public double panjangGaris() {
        double selisihX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double selisihY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double panjang = Math.sqrt(selisihX*selisihX + selisihY*selisihY);
        return panjang;
    }
    public double gradien(){
        double selisihX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double selisihY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double gradienM = selisihY / selisihX;
        return gradienM;
    }

    public Titik titikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2;
        Titik tengah = new Titik(x,y);
        return tengah;
    }

    public boolean isSejajar(Garis G) {
        return this.gradien() == G.gradien();
    }
    
    public boolean isTegakLurus(Garis G) {
        return this.gradien() * G.gradien() == -1;
    }
    public void printGaris() {
        System.out.printf("Titik Awal = (%0.2f,%0.2f), Titik Akhir = (%0.2f,%0.2f)\n",
        titikAwal.getAbsis(),titikAwal.getOrdinat(),titikAkhir.getAbsis(),titikAkhir.getOrdinat() );
    }

    public void showEquation() {
        double m = this.gradien();
        double c = m*(-titikAwal.getAbsis()) + titikAwal.getOrdinat();
        String equation = "y = " + m + "x + " + c;
        System.out.println(equation); 

    }


}