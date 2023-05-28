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
public class Dokter {
    public String id_Dokter;
    public String Spesialis;
    public String JadwalDokter;
    
    Scanner input = new Scanner(System.in);
    
    public Dokter(String id_Dokter, String Spesialis, String JadwalDokter) {
        this.id_Dokter = id_Dokter;
        this.Spesialis = Spesialis;
        this.JadwalDokter = JadwalDokter;
    }
    
    public String getIDDokter() {
        return id_Dokter;
    }
    
    public String getSpesialis() {
        return Spesialis;
    }
    
    public String getJadwal() {
        return JadwalDokter;
    }
    
    public void addJadwal(String id_Dokter, String Spesialis) {
        System.out.print("Hari/Jam Masuk/Jam Selesai: ");
        String jadwal = input.nextLine();
        
        Dokter D = new Dokter(id_Dokter,Spesialis,jadwal);
    }
    
    public void Konsultasi() {
        
        System.out.println("=== KONSULTASI DENGAN DOKTER "+getIDDokter()+" ===");
        
        System.out.print("Keluar? (Ya/Tidak)");
        String pilih = input.nextLine();
        
        if (pilih != "Ya" || pilih != "ya") {
            
            System.out.print("Masukkan Pesan: ");
            String chat = input.nextLine();
            
            System.out.print("Keluar? (Ya/Tidak)");
            pilih = input.nextLine();
            
        }
        
    }
    
    public void ShowDesc() {
        System.out.println("ID Dokter                   :"+getIDDokter());
        System.out.println("Spesialis                   :"+getSpesialis());
        System.out.println("Hari/Jam Masuk/Jam Selesai  :"+getJadwal());
    }
}
