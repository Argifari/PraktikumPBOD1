import java.util.ArrayList;

public class Mahasiswa {

    private String NIM;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul = new ArrayList<>(50);
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
    }

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIM() {
        return NIM;
    }
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }
    public Dosen getDosenWali() {
        return dosenWali;
    }
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah baru) {
        listMatkul.add(baru);
    }

    public int getJumlahSks() {
        int totalSks = 0;

        for (MataKuliah mataKuliah : listMatkul) {
            totalSks += mataKuliah.getSks();
        }
        return totalSks;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }


}