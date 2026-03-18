/*
Nama file : Lingkaran.java
Nama : Muhammad Firdaus Argifari
NIM : 24060124130107
Tanggal : 17 Maret 2026
Deskripsi : interface IResize
*/


public interface IResize {

    // memperbesar ukuran 10%
    public void zoomIn();

    // memperkecil ukuran 10%
    public void zoomOut();

    // menaksirkan ukuran sesuai dengan input yg diberikan
    public void zoom(int percent);
}