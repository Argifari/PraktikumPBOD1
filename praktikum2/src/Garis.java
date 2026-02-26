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

    Titik getTitikAwal() {
        return titikAwal;
    }
    Titik getTitikAkhir() {
        return titikAkhir;
    }
    void setTitikAwal(Titik T) {
        titikAwal = T;
    }
    void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }
    
    static int getCounterGaris() {
        return counterGaris;
    }
}