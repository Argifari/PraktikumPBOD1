import java.util.ArrayList;
import java.util.List;

class Teman<G> {
    private int nbElm;
    private List<String> Lnama;

    Teman() {
        nbElm = 0;
        Lnama = new ArrayList<>();
    }

    int getNbElm() {
        return nbElm;
    }

    void setNbElm(int nbElm) {
        this.nbElm = nbElm;
    }

    List<String> getLnama() {
        return Lnama;
    }

    void setLnama(List<String> lnama) {
        Lnama = lnama;
    }

    String getNama(int indeks) {
        if (indeks >= 1) {
            return Lnama.get(indeks - 1);
        }
        return "Indeks tidak valid";
    }

    void setNama(int indeks, String nama) {
        if (indeks >= 1 && indeks <= nbElm) {
            Lnama.set(indeks - 1, nama);
        }else {
            System.out.println("Gagal: Indeks di luar jangkauan");
        }

    }

    void addNama(String nama) {
        Lnama.add(nama);
        nbElm++;
    }

    void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbElm--;
            System.out.println(nama + " berhasil dihapus");
        }else {
            System.out.println("Nama tidak ditemukan");

        }
    }

    boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    void gantiNama(String nama, String namaBaru) {
        int indeks = Lnama.indexOf(nama);

        if (indeks != -1) {
            Lnama.set(indeks, namaBaru);
        }else {
            System.out.println(indeks);
        }
    }


}
