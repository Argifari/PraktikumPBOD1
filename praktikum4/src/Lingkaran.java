public class Lingkaran extends BangunDatar {

    private double jari;

    public Lingkaran() {

    }
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        jari = diameter/2;
        // setBorder(border);
        // setWarna(warna);
        // setJumlSisi(1);
    }
    public double getJari() {
        return jari;
    }
    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI*Math.pow(jari, 2);
    }
    public double getKeliling() {
        return 2*Math.PI*jari;
    }
    public double getDiameter() {
        return 2*jari;
    }


}
