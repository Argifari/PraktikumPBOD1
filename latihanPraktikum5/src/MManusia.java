import java.time.LocalDate;

public class MManusia {

    public static void main (String[] args) {
        Pns budi = new Pns();

        budi.setAlamat("Banjarnegara");
        budi.setNama("Budi Cahyadi");
        budi.setNip("123156465");
        budi.setPendapatan(9000000);
        budi.setTglMulaiKerja(LocalDate.of(2024, 2, 12));

        budi.cetakInfo();
    }
}