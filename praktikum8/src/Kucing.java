class Kucing extends Anabul{
    private double bobot;
    
    Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Bergerak dengan melata");
    }
    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }


}
