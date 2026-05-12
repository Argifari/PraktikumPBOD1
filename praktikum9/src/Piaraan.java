class Piaraan {

    private int nbElm;
    private Anabul[] Lanabul;

    Piaraan() {
        nbElm = 0;
        Lanabul = new Anabul[10];
    }

    int getNbElm() {
        return nbElm;
    }

    void setNbElm(int nbElm) {
        this.nbElm = nbElm;
    }

    Anabul[] getLanabul() {
        return Lanabul;
    }

    void setLanabul(Anabul[] lanabul) {
        Lanabul = lanabul;
    }

    void enqueueAnabul(Anabul x) {
        if (nbElm < 10) {
            Lanabul[nbElm] = x;
            nbElm++;
        }
        else {
            System.out.println("Gagal : Karena sudah limit");
        }
    }

    boolean isMember(Anabul x) {
        for (int i = 0; i < nbElm; i++) {
            if (x == Lanabul[i]) {
                return true;
            }
        }
        return false;
    }

    Anabul getAnabul() {
        if (nbElm > 0) {
            return Lanabul[0];
        }
        else {
            return null;
        }
    }

    Anabul dequeueAnabul() {
        if (nbElm > 0) {
            Anabul temp = Lanabul[0];

            for (int i = 0; i < nbElm - 1; i++) {
                Lanabul[i] = Lanabul[i + 1];
            }
            Lanabul[nbElm - 1] = null;
            nbElm--;
            return temp;
        }
        return null;
    }

    void showAnabul() {
        System.out.println("List Anabul : ");
        for (int i = 0; i < nbElm; i++) {
            System.out.println(Lanabul[i].getNama());
        }
    }

    int countKucing() {
        int count = 0;

        for (int i = 0; i < nbElm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    int bobotKucing() {
        int berat = 0;

        for (int i = 0; i < nbElm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                berat += Lanabul[i].getBobot();
            }
        }
        return berat;
    }

    void showJenisAnabul() {
        System.out.println("List Anabul : ");
        for (int i = 0; i < nbElm; i++) {
            System.out.println(Lanabul[i].getNama() + " || " + Lanabul[i].getClass().getSimpleName());
        }
    }





    

    
}
