public abstract class Civitasakademika {
    private String nama;

    Civitasakademika(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    abstract String getNomor(); 
}
