/*
Nama File : MTitik.java
Deskripsi : main driver Titik
Pembuat : Muhammad Firdaus Argifari 24060124130107
Tanggal : 21 Februari 2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1(0,0)
        Titik T2 = new Titik(3,4);
        T1.setAbsis(3); // Set absis jari 3 T1(3,0)
        T1.setOrdinat(4); // Set ordinat jadi 4 T1(3,4)
        T1.printTitik(); // Mencetak Titik T1
        T1.geser(3,4); // Menggeser titik 
        T1.printTitik(); // Mencetak titik T1
        T1.printCounterTitik();
        T1.getJarakPusat();
    }
}