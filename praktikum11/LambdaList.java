

import java.util.ArrayList;

/**
 * File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter
 * pada method.
 */

public class LambdaList {
    public static void main(String[] args) {
        // Membuat objek ArrayList untuk menampung data string
        ArrayList<String> mahasiswaList = new ArrayList<>();
        
        // Menambahkan elemen ke dalam ArrayList
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter pada method forEach
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
