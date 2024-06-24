/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obs.perpustakaan;

/**
 *
 * @author D-16
 */
public class PerpustakaanUmum implements Perpustakaan{
    private String[] daftarBuku = {"Buku Kisah Tanah Jawa", "Buku Novel Petualangan Banteng Hitam Penguasa negeri", "Buku Petualangan Sherina"};

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println("Meminjam buku: " + judulBuku);
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println("Mengembalikan buku: " + judulBuku);
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan:");
        for (String buku : daftarBuku) {
            System.out.println("- " + buku);
        }
    }
}
