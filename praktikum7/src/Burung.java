public class Burung {
    Burung(String nama) {
        super(nama);
    }

    @Override
    void Gerak() {
        System.out.println("Bergerak dengan terbang");
    }
    @Override
    void Bersuara() {
        System.out.println("Cuit");
    }
}
