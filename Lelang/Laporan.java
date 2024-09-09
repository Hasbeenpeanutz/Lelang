package Lelang;

import java.util.Scanner;

public class Laporan {
    
    public void Laporan(Barang barang){
        int x = barang.getJmlBarang();
        
        System.out.println("\n=========================");
        System.out.println("-- BARANG YANG DILELANG --");
        System.out.println("==========================");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        
        for (int i = 0; i < x; i++) {
        System.out.println(i+"\t"+barang.getNamaBarang(i)+"\t\t"+barang.getHargaAwal(i)+"\t"+barang.getStatus(i));
        }
    }
    public void Laporan(Petugas petugas){
        Scanner sc = new Scanner(System.in);
        int x = petugas.getJmlPetugas();
        
        System.out.println("\n====================================");
        System.out.println("------- PETUGAS YANG TERSEDIA -------");
        System.out.println("=====================================");
        System.out.println("ID \tNama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println((i)+".\t"+petugas.getNama(i)+"\t"+petugas.getAlamat(i)+"\t\t"+petugas.getTelepon(i));
        }
        
        System.out.println("============= PILIH PETUGAS =============");
        System.out.print("Masukkan ID Petugas\t: ");
        int idPetugas = sc.nextInt();
        
        if (idPetugas > 1) {
            System.out.println("\n------------- Tidak Valid -------------");
            System.out.println("====================================");
            System.out.println("----------- LELANG DITUTUP ----------");
            System.out.println("=====================================");
            System.exit(0);
        }
        
    }
    
    public void Laporan(Masyarakat masyarakat){
        int x = masyarakat.getJmlMasyarakat();
        
        System.out.println("\n=====================================");
        System.out.println("------- MASYARAKAT SAAT INI ----------");
        System.out.println("======================================");
        System.out.println("ID \tNama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i +"\t"+masyarakat.getNama(i)+"\t"+masyarakat.getAlamat(i)+"\t\t"+masyarakat.getTelepon(i));
        }
    }
}
