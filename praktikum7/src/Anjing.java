public class Anjing extends Anabul {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void Gerak() {
        System.out.println("Bergerak dengan melata");
    }
    @Override
    void Bersuara() {
        System.out.println("Guk-guk");
    }
}
