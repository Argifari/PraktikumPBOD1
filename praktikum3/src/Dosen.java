
public class Dosen {
    private String NIP;
    private String nama;
    private String prodi;

    public Dosen(String NIP, String nama, String prodi) {
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }

    public Dosen() {
    }

    
    public String getNIP() {
        return NIP;
    }
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public void setNIP(String x) {
        NIP = x;
    }
    public void setNama(String x) {
        nama = x;
    }
    public void setProdi(String x) {
        prodi = x;
    }
}
