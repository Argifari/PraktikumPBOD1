public class Kucing extends Anabul{
    
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void Gerak() {
        System.out.println("Bergerak dengan melata");
    }
    @Override
    void Bersuara() {
        System.out.println("Meong");
    }
}
