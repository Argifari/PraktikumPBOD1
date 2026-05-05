class Burung extends Anabul{
    Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Bergerak dengan terbang");
    }
    @Override
    public void Bersuara() {
        System.out.println("Cuit");
    }
}
