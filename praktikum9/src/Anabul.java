abstract class Anabul {
    private String panggilan;
    private double bobot;

    Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    String getNama() {
        return panggilan;
    }

    void setNama(String x) {
        panggilan = x;
    }
    
    double getBobot() {
        return bobot;
    }

    void setBobot(double x) {
        bobot = x;
    }

    public abstract void Gerak();
    public abstract void Bersuara();

}
