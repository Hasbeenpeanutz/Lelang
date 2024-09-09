package Lelang;

import java.util.ArrayList;
import java.util.Scanner;

public class Barang {
    private ArrayList<Integer> idMasyarakat= new ArrayList<Integer>();
    private ArrayList<String> namaBarang= new ArrayList<String>();
    private ArrayList<Integer> hargaAwal= new ArrayList<Integer>();
    private ArrayList<Boolean> status= new ArrayList<Boolean>();
    
    Barang(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan nama barang yang akan di lelang: ");
        this.namaBarang.add(sc.next());
        System.out.print("Harga awal barang:Rp ");
        this.hargaAwal.add(sc.nextInt());
        
        System.out.print("Apakah barang bisa di tawar? [y/n]: ");
        String yn = sc.next();
        
        if ("y".equalsIgnoreCase(yn)) {
            this.status.add(true);
            System.out.println("");
        }else if ("n".equalsIgnoreCase(yn)) {
            this.status.add(false);
            System.out.println("\n--- Mohon maaf. Barang ini tidak bisa ditawar ---");
            System.out.print("\n================ LELANG DITUTUP  ==================");
            System.exit(0);
        }else{
            System.out.print("---- Harap jawab dengan benar! ----");
            System.exit(0);
        }
    }
    
    int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public void setHargaAwal(int hargaAwal){
        this.hargaAwal.add(hargaAwal);
    }
    public void setStatus(boolean status){
        this.status.add(status);
    }
    public void editStatus(int idMasyarakat, boolean status){
        this.status.set(idMasyarakat, status);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public Integer getHargaAwal(int idBarang){
        return this.hargaAwal.get(idBarang);
    }
    public Boolean getStatus(int idBarang){
        return this.status.get(idBarang);
    }
}
