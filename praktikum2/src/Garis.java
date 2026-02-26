public class Garis {

    Titik titikAwal;
    Titik titikAkhir;
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

}