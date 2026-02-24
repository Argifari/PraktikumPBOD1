
/*
Nama File : Titik.java
Deskripsi : berisi atribut dan method dalam class Titik
Pembuat : Muhammad Firdaus Argifari
Tanggal : 21 Februari 2026
*/

public class Titik {

    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    // Method
    // Konstruktor untuk membuat titik(0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }
    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }
    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }
    // menggeser nilai absis dan ordinat titik masing2 sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    // print titik 
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat +")");
    }
    void printCounterTitik() {
        System.out.println(this.counterTitik);
    }
    // mengembalikan posisi kuadran
    public int getKuadran(){

        if (absis >= 0 && ordinat >= 0) {
            return 1;
        }else if (absis < 0 && ordinat > 0) {
            return 2;
        }else if (absis < 0 && ordinat < 0 ) {
            return 3;
        }else if (absis > 0 && ordinat < 0) {
            return 4;
        }
    }
    // mengembalikan jarak dari pusat
    public double getJarakPusat() {
        double jarak = ((absis*absis) + (ordinat*ordinat));
        return jarak;
    }
    public double getJarak(Titik T) {
        double selisihX = T.getAbsis() - absis;
        double selisihY = T.getOrdinat() - ordinat;
        double total = Math.sqrt((selisihX*selisihX) + (selisihY*selisihY));
        return total;
    }
    public void refleksiX() {
        ordinat *= -1;
    }
    public void refleksiY() {
        absis *= -1;
    }
    public Titik getRefleksiX() {
        Titik T = new Titik();
        T.setAbsis(absis);
        T.setOrdinat(ordinat*(-1));
        return T;
    }
    public Titik getRefleksiY() {
        Titik T = new Titik();
        T.setAbsis(absis*(-1));
        T.setOrdinat(ordinat);
        return T;
    }

}// end class Titik