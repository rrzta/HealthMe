/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthme;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class RumahSakit {
    public String id_Rs;
    public String id_pesanan; // dari kelas Pesan_No_Antrian
    public String daftar_dokter; // dari kelas Dokter
    public String nama_RS;
    public String alamat_RS;
    
    Scanner input = new Scanner(System.in);
    
    public RumahSakit(String id_Rs, String id_pesanan, String daftar_dokter, String nama_RS, String alamat_RS) {
        this.id_Rs = id_Rs;
        this.id_pesanan = id_pesanan;
        this.daftar_dokter = daftar_dokter;
        this.nama_RS = nama_RS;
        this.alamat_RS = alamat_RS;
    }
    
    public void displayDaftarDokter() {
        System.out.println("ID RS           :"+getIDRS());
        System.out.println("ID Pesanan      :"+getIDPesanan());
        System.out.println("Daftar Dokter   :"+getDaftarDokter());
        System.out.println("Nama RS         :"+getNamaRS());
        System.out.println("Alamat RS       :"+getAlamatRS());
    }
    
    public String getIDRS() {
        return id_Rs;
    }
    
    public String getDaftarDokter() {
        return daftar_dokter;
    }
    
    public String getNamaRS() {
        return nama_RS;
    }
    
    public String getAlamatRS() {
        return alamat_RS;
    }
    
    public String getIDPesanan() {
        return alamat_RS;
    }
    
    public String location() { // Mengecek apakah lokasi RS dan lokasi User dekat atau tidak. User dapat menginputkan alamat User berada
        String Status = null;
        
        System.out.print("Masukkan Alamat   :");
        String alamat_User = input.nextLine();
        System.out.print("Masukkan Kode Pos :");
        String kodePos = input.nextLine();
        
        if (kodePos == getAlamatRS()) {
            return Status = "Direkomendasikan";
        } else {
            return Status = "Tidak Direkomendasikan";
        }
        
    }
    
    public int kelolaAntrean() { // Mengecek apakah antrean penuh atau tidak
        int Prioritas = 0;
        
        if (null == getIDPesanan()) {
            return Prioritas = 1;
        } else switch (getIDPesanan()) {
            case "Penuh":
                return Prioritas = 3;
            case "Lumayan Penuh":
                return Prioritas = 2;
            default:
                return Prioritas = 1;
        }
        
    }
}

