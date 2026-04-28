
public class Mahasiswa extends Civitasakademika{

    private String nim;
    private String programStudi;
    private Dosen dosenWali;

    Mahasiswa() {
        this.nim = "-999";
        super("n/a");
        this.programStudi = "n/a";
    }

    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        super(nama);
    }
    Mahasiswa(String nim, String nama, Dosen dosenWali) {
        this.nim = nim;
        super(nama);
        this.dosenWali = dosenWali;
    }

    Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.programStudi = programStudi;
        super(nama);

    }

    Mahasiswa(Mahasiswa x) {
        this.nim = x.getNim();
        super(x.getNama());
        this.programStudi = x.getProgramStudi();
    }

    String getNim() {
        return nim;
    }
    String getNama() {
        return nama;
    }
    String getProgramStudi() {
        return programStudi;
    }

    void setProgramStudi() {
        programStudi = "Kosong";
    }
    void setProgramStudi(String x) {
        programStudi = x;
    }
    void setProgramStudi(Mahasiswa x) {
        programStudi = x.getProgramStudi();
    }

    void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    void printInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Program Studi : " + programStudi);
    }
    void tampilDataMahasiswa() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Dosen Wali : " + dosenWali);
    }
    @Override
    String getNomor() {
        return nim;
    }




}