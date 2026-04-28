class Seminar {
    private Civitasakademika[] peserta = new Civitasakademika[100];
    private int banyakPeserta;

    Seminar() {
        this.banyakPeserta = 0;
    }

    int countPeserta() {
        return banyakPeserta;
    }

    void registrasi(Civitasakademika orang) {
        if (banyakPeserta < 100) {
            peserta[banyakPeserta] = orang;
            banyakPeserta++;
        }else {
            System.out.println("Seminar sudah penuh");
        }
    }

    void tampilPeserta() {
        System.out.println("Daftar Peserta : ");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("Nama : " + peserta[i].getNama());
        }
    }

    int countMahasiswa() {
        int count = 0;
        
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa)  {
                count++;
            }
        }
        return count;
    }
}
