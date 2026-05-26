

/**
 * File DiskonLambda.java
 * Deskripsi: Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 */

// 1. Definisikan Functional Interface
interface IDiskon {
    public double hitungDiskon(int harga);
}

// 2. Kelas Utama
public class DiskonLambda {
    public static void main(String[] args) {
        int hargaAwal = 45000;

        // --- Pendekatan 1: Tanpa Lambda (Anonymous Inner Class) ---
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3); // Diskon 30%
            }
        };

        // --- Pendekatan 2: Dengan Lambda (Single Expression / Satu Baris) ---
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4); // Diskon 40%

        // --- Pendekatan 3: Dengan Lambda (Block Statement) ---
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1); // Diskon 10%
        };

        // --- Cetak Output Ke Konsol ---
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(hargaAwal));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(hargaAwal));
        System.out.println("Diskon Biasa:   " + diskonBiasa.hitungDiskon(hargaAwal));
    }
}