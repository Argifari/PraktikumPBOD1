abstract class Anabul {
    private String panggilan;

    Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    String getNama() {
        return panggilan;
    }

    public abstract void Gerak();
    public abstract void Bersuara();

}
