
public class Mahasiswa {

    private String nim;
    private String nama;
    private String programStudi;

    Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    Mahasiswa(Mahasiswa x) {
        this.nim = x.getNim();
        this.nama = x.getNama();
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

    void printInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Program Studi : " + programStudi);
    }
    
}