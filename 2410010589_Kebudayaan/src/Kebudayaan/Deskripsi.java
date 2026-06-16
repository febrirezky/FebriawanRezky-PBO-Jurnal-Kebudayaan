/*
 * Program: Sistem Informasi Kebudayaan
 * NPM: 2410010589
 * Mata Kuliah: Pemrograman Berbasis Objek
 * 
 * File: Deskripsi.java
 * Deskripsi: Class parent yang berisi method-method untuk analisis dan konversi
 *            data deskripsi kebudayaan. Class ini akan di-extend oleh class lain.
 *            Mirip dengan class Nilai dalam project KHS.
 */

package Kebudayaan;

/**
 * Class Deskripsi
 * @author NPM: 2410010589
 * 
 * Deskripsi:
 * Class ini merupakan parent class yang memiliki method untuk analisis deskripsi.
 * Dalam konteks aplikasi ini, Deskripsi dianalisis berdasarkan panjang text dan jenis kategori.
 * Class ini akan digunakan sebagai parent class oleh DataKebudayaan dan Situs.
 * 
 * Analisis yang dilakukan:
 * - Kategori Kebudayaan: Seni Rupa, Seni Pertunjukan, Seni Tari, Tradisi Lisan
 * - Tingkat Detail: Lengkap, Cukup, Minim
 */
public class Deskripsi {
    
    // Deklarasi variabel untuk menyimpan berbagai jenis deskripsi
    private String deskripsiKebudayaan;
    private String deskripsiSitus;
    private String deskripsiKarakterisasi;
    
    /**
     * Constructor Default
     */
    public Deskripsi() {
    }
    
    /**
     * Constructor dengan parameter
     * @param deskrip Deskripsi yang akan diset
     */
    public Deskripsi(String deskrip) {
        this.deskripsiKebudayaan = deskrip;
    }
    
    /**
     * Method untuk menginput Deskripsi Kebudayaan
     * @param deskrip Deskripsi yang akan diinput
     */
    public void inputDeskripsiKebudayaan(String deskrip) {
        this.deskripsiKebudayaan = deskrip;
    }
    
    /**
     * Method untuk mendapatkan Deskripsi Kebudayaan
     * @return Deskripsi Kebudayaan
     */
    public String getDeskripsiKebudayaan() {
        return this.deskripsiKebudayaan;
    }
    
    /**
     * Method untuk menginput Deskripsi Situs
     * @param deskrip Deskripsi Situs yang akan diinput
     */
    public void inputDeskripsiSitus(String deskrip) {
        this.deskripsiSitus = deskrip;
    }
    
    /**
     * Method untuk mendapatkan Deskripsi Situs
     * @return Deskripsi Situs
     */
    public String getDeskripsiSitus() {
        return this.deskripsiSitus;
    }
    
    /**
     * Method untuk menginput Deskripsi Karakterisasi
     * @param deskrip Deskripsi Karakterisasi yang akan diinput
     */
    public void inputDeskripsiKarakterisasi(String deskrip) {
        this.deskripsiKarakterisasi = deskrip;
    }
    
    /**
     * Method untuk mendapatkan Deskripsi Karakterisasi
     * @return Deskripsi Karakterisasi
     */
    public String getDeskripsiKarakterisasi() {
        return this.deskripsiKarakterisasi;
    }
    
    /**
     * Method untuk menganalisis tingkat detail deskripsi
     * Analisis berdasarkan jumlah karakter dalam deskripsi
     * 
     * Kriteria:
     * - Jika panjang >= 100 karakter: "Lengkap"
     * - Jika panjang >= 50 dan < 100: "Cukup"
     * - Jika panjang < 50: "Minim"
     * 
     * @param deskrip Deskripsi yang akan dianalisis
     * @return String berisi tingkat detail (Lengkap, Cukup, Minim)
     */
    public String analisisTingkatDetail(String deskrip) {
        String hasil = "";
        
        // Validasi input tidak null
        if (deskrip == null) {
            hasil = "Tidak Tersedia";
        } 
        // Analisis berdasarkan panjang deskripsi
        else if (deskrip.length() >= 100) {
            hasil = "Lengkap"; // Deskripsi panjang dan detail
        } 
        else if (deskrip.length() >= 50 && deskrip.length() < 100) {
            hasil = "Cukup"; // Deskripsi cukup detail
        } 
        else if (deskrip.length() > 0 && deskrip.length() < 50) {
            hasil = "Minim"; // Deskripsi singkat/minim
        }
        else {
            hasil = "Kosong"; // Deskripsi kosong
        }
        
        return hasil;
    }
    
    /**
     * Method untuk mengklasifikasikan kategori kebudayaan
     * Berdasarkan nilai kategori yang diberikan
     * 
     * Kategori yang didukung:
     * - Seni Rupa
     * - Seni Pertunjukan
     * - Seni Tari
     * - Tradisi Lisan
     * - Lainnya
     * 
     * @param kategori Kategori yang akan diklasifikasikan
     * @return String berisi klasifikasi kategori
     */
    public String klasifikasiKategori(String kategori) {
        String hasil = "";
        
        // Menggunakan switch untuk klasifikasi kategori
        if (kategori == null) {
            hasil = "Tidak Diketahui";
        }
        // Klasifikasi berdasarkan kategori
        else if (kategori.equalsIgnoreCase("Seni Rupa")) {
            hasil = "Kategori: Seni Rupa (Batik, Wayang, dll)";
        } 
        else if (kategori.equalsIgnoreCase("Seni Pertunjukan")) {
            hasil = "Kategori: Seni Pertunjukan (Wayang Kulit, Gamelan, dll)";
        } 
        else if (kategori.equalsIgnoreCase("Seni Tari")) {
            hasil = "Kategori: Seni Tari (Tari Tradisional, Tari Daerah, dll)";
        } 
        else if (kategori.equalsIgnoreCase("Tradisi Lisan")) {
            hasil = "Kategori: Tradisi Lisan (Cerita Rakyat, Pantun, dll)";
        }
        else {
            hasil = "Kategori: " + kategori + " (Lainnya)";
        }
        
        return hasil;
    }
    
    /**
     * Method untuk mengecek kelengkapan data
     * Mengecek apakah deskripsi sudah diisi atau belum
     * 
     * @param deskrip Deskripsi yang akan dicek
     * @return boolean - true jika lengkap, false jika tidak
     */
    public boolean isBukuLengkap(String deskrip) {
        // Data dianggap lengkap jika deskripsi panjangnya >= 50 karakter
        return deskrip != null && deskrip.length() >= 50;
    }
} // Akhir class Deskripsi