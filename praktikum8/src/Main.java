
class Main {
    public static void main(String[] args) {
        Datum<Anabul> anu;
        Datum<Anabul> anu2;
        Datum<Integer> interA;
        Datum<Integer> interB;
        Datum<String> strA;
        Datum<String> strB;



        Anjing budi = new Anjing("Budi");
        Kembangtelon baru = new Kembangtelon("Hanji");

        Kucing kucing1 = new Kembangtelon("Suii");
        kucing1.setBobot(5);

        Kucing kucing2 = new Anggora("Eka");
        kucing2.setBobot(3.2);

        Data<Anabul> listAnu;

        System.out.println("I. GENERIK PADA CLASS");
        System.out.println("================================");
        
        
        anu = new Datum<>();
        System.out.println("Isi Datum dengan class Anjing");
        System.out.println("================================");
        
        anu.setIsi(budi);
        anu.getIsi().getNama();
        anu.getIsi().Gerak();
        
        System.out.println("Isi Datum dengan class Anjing");
        System.out.println("================================");
        
        System.out.println();
        anu.setIsi(baru);
        anu.getIsi().getNama();
        anu.getIsi().Gerak();
        
        System.out.println("II. GENERIK PADA OPERATOR");
        System.out.println("================================");
        
        System.out.println("3.");
        System.out.println("a.");
        
        System.out.println("================================");
        
        anu2 = new Datum<>();
        
        anu2.setIsi(budi);
        System.out.println("Isi anu2 : " + anu2.getIsi().getClass().getSimpleName());
        
        System.out.println("Isi anu : " + anu.getIsi().getClass().getSimpleName());
        
        OperatorGenerik.Tukar(anu, anu2);
        
        System.out.println();
        System.out.println("SETELAH PENUKARAN");
        System.out.println("================================");
        System.out.println("Isi anu2 : " + anu2.getIsi().getClass().getSimpleName());
        
        System.out.println("Isi anu : " + anu.getIsi().getClass().getSimpleName());
        
        System.out.println("b.");
        System.out.println("================================");
        
        interA = new Datum<>();
        interB = new Datum<>();
        int a = 9;
        int b = 10;
        
        interA.setIsi(a);
        interB.setIsi(b);
        
        System.out.println("Isi anu1 : " + interA.getIsi());
        
        System.out.println("Isi anu2 : " + interB.getIsi());
        
        OperatorGenerik.Tukar(interA,interB);
        
        System.out.println();
        System.out.println("SETELAH PENUKARAN");
        System.out.println("================================");
        
        System.out.println("Isi anu1 : " + interA.getIsi());
        
        System.out.println("Isi anu2 : " + interB.getIsi());
        
        strA = new Datum<>();
        strB = new Datum<>();
        String aa = "INI ADALAH 1";
        String bb = "INI ADALAH 2";
        
        strA.setIsi(aa);
        strB.setIsi(bb);
        
        System.out.println("Isi anu1 : " + strA.getIsi());
        
        System.out.println("Isi anu2 : " + strB.getIsi());
        
        OperatorGenerik.Tukar(strA,strB);
        
        System.out.println();
        System.out.println("SETELAH PENUKARAN");
        System.out.println("================================");
        
        System.out.println("Isi anu1 : " + strA.getIsi());
        
        System.out.println("Isi anu2 : " + strB.getIsi());
        
        System.out.println("b.");
        System.out.println("================================");
        
        System.out.println("Hitung bobot Kucing 1 dan 2");
        System.out.println("Bobot kucing1 : " + kucing1.getBobot());
        System.out.println("Bobot kucing2 : " + kucing2.getBobot());
        System.out.println("Total bobot keduanya : " + OperatorGenerik.bobot2(kucing1, kucing2));
        
        System.out.println("III. LARIK GENERIK");
        System.out.println("================================");
        
        System.out.println("4.");
        System.out.println("a.");
        System.out.println("================================");
        
        listAnu = new Data<>();
        System.out.println("MENCOBA MEMASUKKAN DATA");
        
        listAnu.setIsi(1, kucing2);
        listAnu.setIsi(2, budi);
        System.out.println("================================\n");
        System.out.println("OUTPUT");

        System.out.println( "1 : " + listAnu.getIsi(1).getClass().getSimpleName());
        System.out.println("2 : " + listAnu.getIsi(2).getClass().getSimpleName());
        
        
        System.out.println("Ukuran sekarang : " + listAnu.getSize());



        
        
        
    }
}
