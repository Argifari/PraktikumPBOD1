public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("\n Contoh 1: Variables dan Conditionals");
        contohVariabelDanKondisional();

        System.out.println("\n Contoh 2: Array dan Looping");
        contohArrayDanLooping();
    }

    public static void contohVariabelDanKondisional() {
        // Deklarasi dan inisialisasi variable
        String nama = "Budi";
        int umur = 20;
        double ipk = 3.75;
        boolean mahasiswaAktif = true;

        // Menampilkan Variable
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("ipk: " + ipk);
        System.out.println("Status: " + (mahasiswaAktif ? "Aktif" : "Tidak Aktif"));

        // Conditional if-else untuk menentukan predikat
        System.out.print("Predikat: ");
        if (ipk >= 3.50) {
            System.out.println("Cum Laude");
        }else if (ipk >= 3.00) {
            System.out.println("Sangat Memuaskan");
        }else if (ipk >= 2.75) {
            System.out.println("Memuaskan");
        }else {
            System.out.println("Perlu Peningkatan");
        }
        System.out.print("Kategori: ");
        if (umur < 17) {
            System.out.println("Remaja");
            
        }else if (umur <= 25) {
            System.out.println("Dewasa Muda");
        }else {
            System.out.println("Dewasa");

        }
    }

    public static void contohArrayDanLooping () {

    }
}
