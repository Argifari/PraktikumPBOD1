public class Dosen extends Civitasakademika {
    private String nip;

    Dosen(String nama, String nip) {
        super(nama);
    }
    @Override
    String getNomor() {
        return nip;
    }

    
}
