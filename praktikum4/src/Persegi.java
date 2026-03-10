public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi() {

    }
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
        // setWarna(warna);    
        // setJumlSisi(4);
        // setBorder(border);
        // this.jmlSisi = 4;
        // this.warna = warna;
        // this.border = border;
    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getLuas() {
        return sisi*sisi;
    }
    public double getKeliling() {
        return 4*sisi;
    }
    public double getDiagona() {
        return sisi*Math.sqrt(2);
    }
    @Override
    public void printInfo() {
        super.printInfo();
        // System.out.println("Jumlah sisi : " + getJumlSisi());
        // System.out.println("Warna : "+ getWarna());
        // System.out.println("Border : " + getBorder());
        System.out.println("Sisi : " + sisi);
    }
    // @Override 
    // public static void printCounterBangunDatar() {
    //     super.printCounterBangunDatar();
    
    // }
}
