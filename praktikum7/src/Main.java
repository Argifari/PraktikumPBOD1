/*
Nama : Muhammad Firdaus Argifari
NIM : 24060124130107
Tanggal : 21 April 2026
*/


public class Main {


    public static void main(String[] args) {
        // Kamus Lokal
        int a;
        char aInChar;
        double aInDouble;
        String aInString;

        String X,Y;
        String S;
        int Z;

        String P, Q;
        String R;
        double D;

        int A;

        String T;

        Mahasiswa mhs,x,mhsKosong,x3,klon;

        Kucing kucingA;
        Anjing anjingA;
        Burung burungA;
        // Algoritma
        System.out.println("\nI. POLIMORFISME AD HOC COERSION");
        System.out.println("\na.");
        
        a = 65;
        aInChar = ((char)a);
        aInDouble = ((double)a);
        aInString = Integer.toString(a);
        
        System.out.println("Tipe data awal : " + ((Object)a).getClass().getSimpleName());
        System.out.println("Nilai : " + a);
        System.out.println("Hasil casting setiap tipe data primitif");
        System.out.println("========================================");
        
        System.out.println(((Object)aInChar).getClass().getSimpleName() + ": " + aInChar);
        System.out.println(((Object)aInDouble).getClass().getSimpleName() + ": " + aInDouble);
        System.out.println(((Object)aInString).getClass().getSimpleName() + ": " + aInString);
        
        int b = ((int)aInDouble);
        System.out.println("\nb.");
        System.out.println("========================================");
        System.out.println("Pengubahan tipe dari real ke int ke variabel lain : ");
        System.out.println(((Object)b).getClass().getSimpleName() + ": " + b);
        System.out.println("\nc.");
        System.out.println("========================================");
        
        X = "1234";
        Y = "5678";
        S = X + Y;
        Z = Integer.parseInt(X) + Integer.parseInt(Y);
        
        System.out.println("String X : " + X);
        System.out.println("String Y : " + Y);
        System.out.println("Hasil penggabungan : ");
        System.out.println("String S : " + S);
        System.out.println("Hasil penjumlahan : ");
        System.out.println("int Z: " + Z);
        
        
        P = "12.34";
        Q = "56.78";
        R = P + Q;
        D = Double.parseDouble(P) + Double.parseDouble(Q);
        
        System.out.println("\nd.");
        System.out.println("========================================");
        System.out.println("String P : " + P);
        System.out.println("String Q : " + Q);
        System.out.println("Hasil penggabungan : ");
        System.out.println("String R : " + R);
        System.out.println("Hasil penjumlahan : ");
        System.out.println("double D: " + D);
        
        System.out.println("\ne.");
        System.out.println("========================================");
        
        A = Integer.parseInt(S);
        
        System.out.println("String S : " + S);
        System.out.println("int A: " + A);
        
        
        
        System.out.println("\nf.");
        System.out.println("========================================");
        
        T = Integer.toString(A);
        
        System.out.println("int A: " + A);
        System.out.println("String T : " + T);
        
        System.out.println("\nII. POLIMORFISME AD HOC OVERLOADING");
        
        System.out.println("\nb.");
        System.out.println("========================================");
        
        mhs = new Mahasiswa("54546454", "Budi Aji");
        mhs.setProgramStudi();
        mhs.printInfo();
        
        System.out.println("getNim() : " + mhs.getNim());
        System.out.println("getNama() : " + mhs.getNama());
        System.out.println( "getProgramStudi() : " + mhs.getNama());
        
        System.out.println("\n========================================");
        System.out.println("menggunakan mhs.setProgramStudi(String x) : ");
        mhs.setProgramStudi("Informatika");
        mhs.printInfo();
        
        System.out.println("\n========================================");
        System.out.println("menggunakan mhs.setProgramStudi(Mahasiswa x) : ");
        System.out.println("\nInfo Mahasiswa x : ");
        
        x = new Mahasiswa("9002312", "Atuk Puji");
        x.setProgramStudi("Matematika");
        x.printInfo();
        
        
        System.out.println("\nInfo Mahasiswa mhs : ");
        mhs.setProgramStudi(x);
        mhs.printInfo();
        
        System.out.println("\nc.");
        System.out.println("========================================");
        mhsKosong = new Mahasiswa();
        System.out.println("Info Mahasiswa mhsKosong : ");
        mhsKosong.printInfo();
        
        System.out.println("\nd.");
        System.out.println("========================================");
        x3 = new Mahasiswa("1242121422","Hiko Makmur", "Statistika");
        System.out.println("menggunakan konstruktor 3 parameter : ");
        
        System.out.println("\nInfo Mahasiswa x3 : ");
        x3.printInfo();
        
        System.out.println("\ne.");
        System.out.println("========================================");
        System.out.println("menggunakan konstruktor kloning : ");
        klon = new Mahasiswa(x3);
        
        System.out.println("\nInfo Mahasiswa klon : ");
        klon.printInfo();


        System.out.println("\nIII. POLIMORFISME UNIVERSAL INCLUSION");
        
        System.out.println("\n3.");
        System.out.println("========================================");



        
    }
}
