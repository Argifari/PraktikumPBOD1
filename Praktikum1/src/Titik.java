
/*
Nama File : Titik.java
Deskripsi : berisi atribut dan method dalam class Titik
Pembuat : Muhammad Firdaus Argifari
Tanggal : 21 Februari 2026
*/

public class Titik {

    double absis;
    double ordinat;
    
    // Method
    // Konstruktor untuk membuat titik(0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }
    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }
    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }
    // menggeser nilai absis dan ordinat titik masing2 sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    // print titik 
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat +")");
    }

}// end class Titik
