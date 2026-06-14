public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
/**
 * File       : Asersi1.java
 * Deskripsi  : Program untuk menunjukkan asersi
 *
 */
public class Asersi1{
  public static void main(String[] args){
    int x=0;
    if(x>0){
      System.out.println("x bilangan positif");
    }else{
      assert(x<0):"ada kesalahan kode";
      System.out.println("x bilangan negatif");
    }
  }
}

/**
 * File       : Asersi2.java
 * Deskripsi  : Program untuk demo asersi, yang akan menolak input
 * jari-jari lingkaran yang bernilai nol
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

/**
 * File       : ExceptionOnArray.java
 * Deskripsi  : Program penggunaan eksepsi menggunakan class library Java
 *
 */

public class ExceptionOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}

/**
 * File       : AngkaSialException.java
 * Deskripsi  : Eksepsi buatan sendiri, menolak masukan angka 13!
 *
 */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}

/**
 * File       : AngkaSial.java
 * Deskripsi  : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}