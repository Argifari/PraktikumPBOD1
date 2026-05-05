class Kucing extends Anabul{
    private double bobot;
    
    Kucing(String nama) {
        super(nama);
    }

    double getBobot() {
        return bobot;
    }

    void setBobot(double bobot) {
        this.bobot = bobot;
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
