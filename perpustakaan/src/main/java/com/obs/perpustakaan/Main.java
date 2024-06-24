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
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new PerpustakaanUmum();
        perpustakaan.pinjamBuku("Buku Kisah Tanah Jawa");
        perpustakaan.kembalikanBuku("Buku Novel Petualangan Banteng  Hitam Penguasa Negeri");
        perpustakaan.lihatDaftarBuku();
        
        PerpustakaanDigital pDigital = new PerpustakaanDigital();
        pDigital.pinjamBuku("Buku Kisah Tanah Jawa");
        pDigital.kembalikanBuku("Buku Petualangan Sherina");
        pDigital.lihatDaftarBuku();
    }
}
