import java.time.LocalDate;

public class MPegawai {

    public static void main(String[] args) {
        Tendik A1 = new Tendik();
        A1.setBidang("Kemahasiswaan");
        A1.setNip("1223344");
        A1.setNama("Budi Setiyadi");
        LocalDate x = LocalDate.of(1994, 3, 3);
        A1.setTanggalLahir(x);
        A1.setTmt(LocalDate.of(2013, 12, 12));
        A1.setGajiPokok(5000000.00);

        A1.printInfo();
    }
}
