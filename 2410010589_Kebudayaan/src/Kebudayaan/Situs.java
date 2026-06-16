/*
 * Program: Sistem Informasi Kebudayaan
 * NPM: 2410010589
 * Mata Kuliah: Pemrograman Berbasis Objek
 * 
 * File: Situs.java
 * Deskripsi: Class yang mengelola data Situs/Tempat Sejarah. Berdasarkan Tabel Situs Makam
 *            dari jurnal dengan field: id_situs, nama_situs, lokasi, karakterisasi
 *            Class ini mirip dengan class Mahasiswa dalam project KHS.
 */

package Kebudayaan;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Class Situs
 * @author NPM: 2410010589
 * 
 * Deskripsi:
 * Class ini digunakan untuk mengelola data Situs/Tempat Sejarah/Makam.
 * Data disimpan dalam ArrayList dan memiliki method untuk menambah, mencari, dan menampilkan data.
 * Class ini extends dari class Deskripsi sehingga mewarisi semua method dari parent class.
 * 
 * Fitur:
 * - Input data Situs (ID, Nama, Lokasi, Karakterisasi)
 * - Penyimpanan data dalam ArrayList
 * - Pencarian data berdasarkan ID
 * - Menampilkan semua data
 * - Analisis deskripsi dan karakterisasi
 */
public class Situs extends Deskripsi {
    
    // Deklarasi variabel untuk menyimpan satu record data Situs
    private String idSitus, namaSitus, lokasi, karakterisasi;
    
    // ArrayList untuk menyimpan koleksi data
    private ArrayList<String> dataSitus;           // Menyimpan nama situs
    private ArrayList<String> idSitus_list;        // Menyimpan ID situs
    private ArrayList<String> lokasiSitus;         // Menyimpan lokasi situs
    private ArrayList<String> karakterisasiSitus;  // Menyimpan karakterisasi situs
    
    /**
     * Constructor 1 - Default Constructor
     * Inisialisasi ArrayList ketika object dibuat tanpa parameter
     */
    public Situs() {
        this.dataSitus = new ArrayList<>();
        this.idSitus_list = new ArrayList<>();
        this.lokasiSitus = new ArrayList<>();
        this.karakterisasiSitus = new ArrayList<>();
    } // Akhir constructor default
    
    /**
     * Constructor 2 - Parameterized Constructor
     * Inisialisasi dengan parameter untuk membuat object dengan nilai langsung
     * 
     * @param id ID Situs
     * @param nama Nama Situs
     * @param lokasi Lokasi Situs
     * @param karakter Karakterisasi Situs
     */
    public Situs(String id, String nama, String lokasi, String karakter) {
        this.idSitus = id;
        this.namaSitus = nama;
        this.lokasi = lokasi;
        this.karakterisasi = karakter;
        this.dataSitus = new ArrayList<>();
        this.idSitus_list = new ArrayList<>();
        this.lokasiSitus = new ArrayList<>();
        this.karakterisasiSitus = new ArrayList<>();
    } // Akhir constructor parameterized
    
    /**
     * Method untuk mencari data Situs berdasarkan ID
     * 
     * @param id ID Situs yang dicari
     * @return Index dari data yang ditemukan, -1 jika tidak ditemukan
     */
    public int getIndexData(String id) {
        // Mencari index dari ArrayList berdasarkan parameter id
        int index = -1;
        index = this.idSitus_list.indexOf(id);
        
        // Validasi jika data tidak ditemukan
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Data Situs Tidak Ditemukan");
        } else {
            System.out.print("Index ditemukan: " + index);
        }
        return index;
    }
    
    /**
     * Method untuk mencari dan menampilkan detail data Situs
     * Menggunakan method getIndexData untuk menemukan data
     * 
     * @param id ID Situs yang dicari
     */
    public void cariDataSitus(String id) {
        // Memanggil method getIndexData untuk mencari index
        int index = getIndexData(id);
        
        // Jika data ditemukan (index >= 0)
        if (index >= 0) {
            // Mengambil data dari masing-masing ArrayList sesuai index
            String nama = this.dataSitus.get(index);
            String lokasi_temp = this.lokasiSitus.get(index);
            String karakter = this.karakterisasiSitus.get(index);
            
            // Membuat message dengan format yang rapi
            String pesan = "ID Situs: " + id + "\n" +
                          "Nama Situs: " + nama + "\n" +
                          "Lokasi: " + lokasi_temp + "\n" +
                          "Karakterisasi: " + karakter;
            
            // Menampilkan message dialog
            JOptionPane.showMessageDialog(null, pesan);
        } else {
            // Jika data tidak ditemukan
            JOptionPane.showMessageDialog(null, "Data Situs Kosong");
        }
    }
    
    /**
     * Method untuk menginput/menambah ID Situs
     * 
     * @param id ID Situs yang akan ditambahkan
     */
    public void inputIdSitus(String id) {
        this.idSitus_list.add(id);
    }
    
    /**
     * Method untuk menginput/menambah Nama Situs
     * 
     * @param nama Nama Situs yang akan ditambahkan
     */
    public void inputNamaSitus(String nama) {
        this.dataSitus.add(nama);
    }
    
    /**
     * Method untuk menginput/menambah Lokasi Situs
     * 
     * @param lokasi Lokasi Situs yang akan ditambahkan
     */
    public void inputLokasi(String lokasi) {
        this.lokasiSitus.add(lokasi);
    }
    
    /**
     * Method untuk menginput/menambah Karakterisasi Situs
     * 
     * @param karakter Karakterisasi Situs yang akan ditambahkan
     */
    public void inputKarakterisasi(String karakter) {
        this.karakterisasiSitus.add(karakter);
    }
    
    /**
     * Method untuk mendapatkan semua data ID Situs
     * 
     * @return ArrayList berisi semua ID Situs
     */
    public ArrayList<String> listDataId() {
        return this.idSitus_list;
    }
    
    /**
     * Method untuk mendapatkan semua data Nama Situs
     * 
     * @return ArrayList berisi semua Nama Situs
     */
    public ArrayList<String> listDataNama() {
        return this.dataSitus;
    }
    
    /**
     * Method untuk mendapatkan semua data Lokasi Situs
     * 
     * @return ArrayList berisi semua Lokasi Situs
     */
    public ArrayList<String> listDataLokasi() {
        return this.lokasiSitus;
    }
    
    /**
     * Method untuk mendapatkan semua data Karakterisasi Situs
     * 
     * @return ArrayList berisi semua Karakterisasi Situs
     */
    public ArrayList<String> listDataKarakterisasi() {
        return this.karakterisasiSitus;
    }
    
    // ===== SETTER METHODS =====
    // Method-method dibawah ini digunakan untuk set value individual record
    
    /**
     * Setter untuk ID Situs
     * @param id ID yang akan diset
     */
    public void setIdSitus(String id) {
        this.idSitus = id;
    }
    
    /**
     * Setter untuk Nama Situs
     * @param nama Nama yang akan diset
     */
    public void setNamaSitus(String nama) {
        this.namaSitus = nama;
    }
    
    /**
     * Setter untuk Lokasi
     * @param lokasi Lokasi yang akan diset
     */
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    /**
     * Setter untuk Karakterisasi
     * @param karakter Karakterisasi yang akan diset
     */
    public void setKarakterisasi(String karakter) {
        this.karakterisasi = karakter;
    }
    
    // ===== GETTER METHODS =====
    // Method-method dibawah ini digunakan untuk get value individual record
    
    /**
     * Getter untuk ID Situs
     * @return ID Situs
     */
    public String getIdSitus() {
        return this.idSitus;
    }
    
    /**
     * Getter untuk Nama Situs
     * @return Nama Situs
     */
    public String getNamaSitus() {
        return this.namaSitus;
    }
    
    /**
     * Getter untuk Lokasi
     * @return Lokasi
     */
    public String getLokasi() {
        return this.lokasi;
    }
    
    /**
     * Getter untuk Karakterisasi
     * @return Karakterisasi
     */
    public String getKarakterisasi() {
        return this.karakterisasi;
    }
} // Akhir class Situs