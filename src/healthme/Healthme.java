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
public class Healthme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        RumahSakit RS1 = new RumahSakit("01","Penuh","Angela, Thessa, Paldi","RS Borromeus","40291");
        RumahSakit RS2 = new RumahSakit("02","Lumayan Penuh","Jaya, Ginting, Sisil","RS Hasansadikin","40292");
        RumahSakit RS3 = new RumahSakit("03","Tidak Penuh","Risqio, Olva, Aziz","RS Advent","40293");
        
        Dokter D1 = new Dokter("D01","Umum","Senin/08:00 WIB/19:00 WIB");
        Dokter D2 = new Dokter("D02","Mata","Selasa/09:00 WIB/17:00 WIB");
        Dokter D3 = new Dokter("D03","Jantung","Rabu/10:00 WIB/18:00 WIB");
        
        System.out.println("===== HEALTHME =====");
        
        System.out.println("=== Pilih Menu ===");
        System.out.println("1. RS Terdekat");
        System.out.println("2. Dokter");
        System.out.println("3. Keluar");
        
        System.out.print("Pilih menu:");
        String menu = input.nextLine();
        
        if ("1".equals(menu)) {
            System.out.println();
            RS1.displayDaftarDokter();
            System.out.println();
            RS2.displayDaftarDokter();
            System.out.println();
            RS3.displayDaftarDokter();
            
                
            String cariRS = RS1.location();
            System.out.println("Pilih RS:"+cariRS);
                
            int prio = RS1.kelolaAntrean();
            System.out.println("Prioritas RS:"+prio);
                
                
        } else if ("2".equals(menu)) {
            System.out.println();
            D1.ShowDesc();
            System.out.println();
            D2.ShowDesc();
            System.out.println();
            D3.ShowDesc();
            System.out.println();
                
            D3.Konsultasi();
                
            System.out.print("Tambah Jadwal? (Ya/Tidak)");
            String pilih = input.nextLine();
        
            if (!"Ya".equals(pilih) || !"ya".equals(pilih)) {
                System.out.print("Masukkan ID: ");
                String id = input.nextLine();
                System.out.print("Masukkan Spesialis: ");
                String spesialis = input.nextLine();
                    
                D1.addJadwal(id, spesialis);
            }
        } 
    }
}
