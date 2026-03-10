public class Persegi extends BangunDatar{
    private double sisi;

    Persegi() {

    }
    Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);    
        setJumlSisi(4);
        setBorder(border);
    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getLuat() {
        return sisi*sisi;
    }
    public double getKeliling() {
        return 4*sisi;
    }
    public double getDiagona() {
        return sisi*Math.sqrt(2);
    }
}
