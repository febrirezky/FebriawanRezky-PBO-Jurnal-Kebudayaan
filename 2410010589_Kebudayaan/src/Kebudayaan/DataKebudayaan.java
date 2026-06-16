/*
 * Program: Sistem Informasi Kebudayaan
 * NPM: 2410010589
 * Mata Kuliah: Pemrograman Berbasis Objek
 * 
 * File: DataKebudayaan.java
 * Deskripsi: Class yang mengelola data kebudayaan. Data disimpan dalam ArrayList
 *            dan memiliki method untuk menambah, mencari, dan menampilkan data.
 *            Berdasarkan Tabel Kebudayaan dari jurnal dengan field:
 *            id_kebudayaan, nama_kebudayaan, deskripsi, kategori
 */

package Kebudayaan;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Class DataKebudayaan
 * @author NPM: 2410010589
 * 
 * Deskripsi:
 * Class ini digunakan untuk mengelola data kebudayaan. Mirip dengan class MataKuliah
 * dalam project KHS, namun untuk data kebudayaan. 
 * 
 * Fitur:
 * - Input data kebudayaan (ID, Nama, Deskripsi, Kategori)
 * - Penyimpanan data dalam ArrayList
 * - Pencarian data berdasarkan ID
 * - Menampilkan semua data
 */
public class DataKebudayaan extends Deskripsi {
    
    // Deklarasi variabel untuk menyimpan satu record data kebudayaan
    private String idKebudayaan, namaKebudayaan, deskripsi, kategori;
    
    // ArrayList untuk menyimpan koleksi data
    private ArrayList<String> dataKebudayaan;  // Menyimpan nama kebudayaan
    private ArrayList<String> idKebudayaan_list;     // Menyimpan ID kebudayaan
    private ArrayList<String> kategoriKebudayaan;   // Menyimpan kategori kebudayaan
    private ArrayList<String> deskripsiKebudayaan;  // Menyimpan deskripsi kebudayaan
    
    /**
     * Constructor 1 - Default Constructor
     * Inisialisasi ArrayList ketika object dibuat tanpa parameter
     */
    public DataKebudayaan() {
        this.dataKebudayaan = new ArrayList<>();
        this.idKebudayaan_list = new ArrayList<>();
        this.kategoriKebudayaan = new ArrayList<>();
        this.deskripsiKebudayaan = new ArrayList<>();
    } // Akhir constructor default
    
    /**
     * Constructor 2 - Parameterized Constructor
     * Inisialisasi dengan parameter untuk membuat object dengan nilai langsung
     * 
     * @param id ID Kebudayaan
     * @param nama Nama Kebudayaan
     * @param deskrip Deskripsi Kebudayaan
     * @param kateg Kategori Kebudayaan
     */
    public DataKebudayaan(String id, String nama, String deskrip, String kateg) {
        this.idKebudayaan = id;
        this.namaKebudayaan = nama;
        this.deskripsi = deskrip;
        this.kategori = kateg;
        this.dataKebudayaan = new ArrayList<>();
        this.idKebudayaan_list = new ArrayList<>();
        this.kategoriKebudayaan = new ArrayList<>();
        this.deskripsiKebudayaan = new ArrayList<>();
    } // Akhir constructor parameterized
    
    /**
     * Method untuk mencari data kebudayaan berdasarkan ID
     * 
     * @param id ID Kebudayaan yang dicari
     * @return Index dari data yang ditemukan, -1 jika tidak ditemukan
     */
    public int getIndexData(String id) {
        // Mencari index dari ArrayList berdasarkan parameter id
        int index = -1;
        index = this.idKebudayaan_list.indexOf(id);
        
        // Validasi jika data tidak ditemukan
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
        } else {
            System.out.print("Index ditemukan: " + index);
        }
        return index;
    }
    
    /**
     * Method untuk mencari dan menampilkan detail data kebudayaan
     * Menggunakan method getIndexData untuk menemukan data
     * 
     * @param id ID Kebudayaan yang dicari
     */
    public void cariDataKebudayaan(String id) {
        // Memanggil method getIndexData untuk mencari index
        int index = getIndexData(id);
        
        // Jika data ditemukan (index >= 0)
        if (index >= 0) {
            // Mengambil data dari masing-masing ArrayList sesuai index
            String nama = this.dataKebudayaan.get(index);
            String deskrip = this.deskripsiKebudayaan.get(index);
            String kateg = this.kategoriKebudayaan.get(index);
            
            // Membuat message dengan format yang rapi
            String pesan = "ID Kebudayaan: " + id + "\n" +
                          "Nama Kebudayaan: " + nama + "\n" +
                          "Deskripsi: " + deskrip + "\n" +
                          "Kategori: " + kateg;
            
            // Menampilkan message dialog
            JOptionPane.showMessageDialog(null, pesan);
        } else {
            // Jika data tidak ditemukan
            JOptionPane.showMessageDialog(null, "Data Kosong");
        }
    }
    
    /**
     * Method untuk menginput/menambah ID Kebudayaan
     * 
     * @param id ID Kebudayaan yang akan ditambahkan
     */
    public void inputIdKebudayaan(String id) {
        this.idKebudayaan_list.add(id);
    }
    
    /**
     * Method untuk menginput/menambah Nama Kebudayaan
     * 
     * @param nama Nama Kebudayaan yang akan ditambahkan
     */
    public void inputNamaKebudayaan(String nama) {
        this.dataKebudayaan.add(nama);
    }
    
    /**
     * Method untuk menginput/menambah Deskripsi Kebudayaan
     * 
     * @param deskrip Deskripsi Kebudayaan yang akan ditambahkan
     */
    public void inputDeskripsi(String deskrip) {
        this.deskripsiKebudayaan.add(deskrip);
    }
    
    /**
     * Method untuk menginput/menambah Kategori Kebudayaan
     * 
     * @param kateg Kategori Kebudayaan yang akan ditambahkan
     */
    public void inputKategori(String kateg) {
        this.kategoriKebudayaan.add(kateg);
    }
    
    /**
     * Method untuk mendapatkan semua data ID Kebudayaan
     * 
     * @return ArrayList berisi semua ID Kebudayaan
     */
    public ArrayList<String> listDataId() {
        return this.idKebudayaan_list;
    }
    
    /**
     * Method untuk mendapatkan semua data Nama Kebudayaan
     * 
     * @return ArrayList berisi semua Nama Kebudayaan
     */
    public ArrayList<String> listDataNama() {
        return this.dataKebudayaan;
    }
    
    /**
     * Method untuk mendapatkan semua data Deskripsi Kebudayaan
     * 
     * @return ArrayList berisi semua Deskripsi Kebudayaan
     */
    public ArrayList<String> listDataDeskripsi() {
        return this.deskripsiKebudayaan;
    }
    
    /**
     * Method untuk mendapatkan semua data Kategori Kebudayaan
     * 
     * @return ArrayList berisi semua Kategori Kebudayaan
     */
    public ArrayList<String> listDataKategori() {
        return this.kategoriKebudayaan;
    }
    
    // ===== SETTER METHODS =====
    // Method-method dibawah ini digunakan untuk set value individual record
    
    /**
     * Setter untuk ID Kebudayaan
     * @param id ID yang akan diset
     */
    public void setIdKebudayaan(String id) {
        this.idKebudayaan = id;
    }
    
    /**
     * Setter untuk Nama Kebudayaan
     * @param nama Nama yang akan diset
     */
    public void setNamaKebudayaan(String nama) {
        this.namaKebudayaan = nama;
    }
    
    /**
     * Setter untuk Deskripsi
     * @param deskrip Deskripsi yang akan diset
     */
    public void setDeskripsi(String deskrip) {
        this.deskripsi = deskrip;
    }
    
    /**
     * Setter untuk Kategori
     * @param kateg Kategori yang akan diset
     */
    public void setKategori(String kateg) {
        this.kategori = kateg;
    }
    
    // ===== GETTER METHODS =====
    // Method-method dibawah ini digunakan untuk get value individual record
    
    /**
     * Getter untuk ID Kebudayaan
     * @return ID Kebudayaan
     */
    public String getIdKebudayaan() {
        return this.idKebudayaan;
    }
    
    /**
     * Getter untuk Nama Kebudayaan
     * @return Nama Kebudayaan
     */
    public String getNamaKebudayaan() {
        return this.namaKebudayaan;
    }
    
    /**
     * Getter untuk Deskripsi
     * @return Deskripsi
     */
    public String getDeskripsi() {
        return this.deskripsi;
    }
    
    /**
     * Getter untuk Kategori
     * @return Kategori
     */
    public String getKategori() {
        return this.kategori;
    }
} // Akhir class DataKebudayaan
