/*
 * Program: Sistem Informasi Kebudayaan
 * NPM: 2410010589
 * Mata Kuliah: Pemrograman Berbasis Objek
 * 
 * File: Kebudayaan.java
 * Deskripsi: Merupakan main class/entry point program yang mengjalankan GUI utama.
 *            Class ini bertanggung jawab untuk memulai aplikasi Kebudayaan.
 */

package Kebudayaan;

import java.util.ArrayList;
import Form.frameUtama;

/**
 * Class Kebudayaan
 * @author NPM: 2410010589
 * 
 * Deskripsi: 
 * Class ini merupakan main class yang digunakan untuk menjalankan aplikasi.
 * Ketika program dijalankan, class ini akan membuka frame utama dari GUI.
 */
public class Kebudayaan {
    
    /**
     * Main method - Entry point program
     * @param args Parameter command line (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        
        // Menampilkan frame utama aplikasi Kebudayaan
        new frameUtama().setVisible(true);
        
        // Catatan: Berikut ini adalah kode testing yang dicomment out
        // untuk testing data saat development
        
        /*
        // Testing ArrayList untuk menyimpan data Kebudayaan
        ArrayList<String> budaya = new ArrayList<>();
        budaya.add("Batik");
        budaya.add("Wayang");
        budaya.add("Gamelan");
        budaya.add("Tari Tradisional");
        budaya.add("Angklung");
        budaya.remove(2); // Menghapus element index ke-2
        System.out.println(budaya.get(2)); // Print element index ke-2
        
        // Testing class DataKebudayaan
        DataKebudayaan objBudaya = new DataKebudayaan();
        objBudaya.inputNamaKebudayaan("Batik Tangerang");
        objBudaya.inputNamaKebudayaan("Wayang Kulit");
        objBudaya.inputNamaKebudayaan("Tari Ratoh Jaroe");
        objBudaya.inputIdKebudayaan("001");
        objBudaya.inputIdKebudayaan("002");
        objBudaya.inputIdKebudayaan("003");
        objBudaya.inputKategori("Seni Rupa");
        objBudaya.inputKategori("Seni Pertunjukan");
        objBudaya.inputKategori("Seni Tari");
        System.out.println(objBudaya.listDataNama().get(1));
        objBudaya.cariDataKebudayaan("005");
        
        // Testing class Situs
        Situs situs = new Situs();
        situs.inputIdSitus("S001");
        situs.inputNamaSitus("Makam Syarif Hidayatullah");
        situs.inputLokasi("Jakarta Selatan");
        situs.inputKarakterisasi("Situs Bersejarah");
        System.out.println("Data Situs: " + situs.getNamaSitus());
        */
    }
}