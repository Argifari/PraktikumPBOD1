abstract class Civitasakademika {
    protected String nama;

    Civitasakademika(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    

    abstract String getNomor(); 
}
