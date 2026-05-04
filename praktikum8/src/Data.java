

class Data<G> {

    private G[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    Data() {
        ruang = (G[]) new Object[100];
        banyak = 0;
    }


    void setIsi(int i, G isi) {
        if (i >= 1 && i <= 100) {
            ruang[i - 1] = isi;

            if (i > banyak) {
                banyak = i;
            }
        }

    }

    G getIsi(int i) {
        if (i >= 1 && i <= 100) {
            return ruang[i - 1];
        }
        return null;
    }

    int getSize() {
        return banyak;
    }
}
