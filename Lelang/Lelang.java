package Lelang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lelang {
    ArrayList<Integer> idPenawar= new ArrayList<Integer>();
    ArrayList<Integer> idBarang= new ArrayList<Integer>();
    ArrayList<Integer> hargaTawar= new ArrayList<Integer>();
    
    Lelang(){
        this.idPenawar.add(0);
        this.idPenawar.add(1);
        this.idPenawar.add(2);
        this.idBarang.add(0);
        this.hargaTawar.add(0);
        this.hargaTawar.add(0);
        this.hargaTawar.add(0);
    }
    
    public void prosesLelang(Masyarakat masyarakat, Lelang lelang, Barang barang) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        int i = 0;
        int idmasyarakat = 0;
        String nawar;
        
        if (barang.getStatus(i) == true) {
            System.out.println("\n====================================");
            System.out.println("------------ LELANG DIBUKA -----------");
            System.out.println("======================================");
            do {
                int hargatawar;
                System.out.print("\nApakah ada harga penawaran terbaru? [y/n]: ");
                nawar = sc.next();
                
                if ("y".equalsIgnoreCase(nawar)) {
                    System.out.print("Masukkan Id Penawar                : ");
                    idmasyarakat = sc.nextInt();
                    
                    if (idmasyarakat > 2) {
                        System.out.println("\n------------- Tidak Valid -------------");
                        System.out.println("====================================");
                        System.out.println("----------- LELANG DITUTUP ----------");
                        System.out.println("=====================================");
                        System.exit(0);
                    }else{
                    System.out.println("Selamat datang " + masyarakat.getNama(idmasyarakat));
                    System.out.print("Masukkan harga yang ingin ditawar  : ");
                    hargatawar = sc.nextInt();
                    editHargaTawar(idmasyarakat, hargatawar);
                    int max = Collections.max(hargaTawar);
                        if (hargatawar <= barang.getHargaAwal(0) || hargatawar == barang.getHargaAwal(0)){
                        System.out.println("Harga harus diatas "+barang.getHargaAwal(0));
                        }else{
                        System.out.println("--- Harga telah disimpan ---");
                        i++;
                        }       
                    }
                    
                }
            } while("y".equalsIgnoreCase(nawar));
                barang.editStatus(0, false);
                System.out.println("\n====================================");
                System.out.println("----------- LELANG DITUTUP ----------");
                System.out.println("=====================================");

                System.out.println("\n====================================");
                System.out.println("----------- HASIL LELANG ------------");
                System.out.println("=====================================");
                System.out.println("Nama  \t\tNama Barang \tHarga Tawar \t");
                int x = hargaTawar.size();
                for (int j = 0; j < x; j++) {
                    System.out.println(masyarakat.getNama(j) + "\t\t" + barang.getNamaBarang(0) + "\t\t" + hargaTawar.get(j));
                }
                int max = Collections.max(hargaTawar);
                int maxId = hargaTawar.indexOf(max);

                if (max == 0) {
                    System.out.println("\n--------- Tidak ada pemenang --------");
                }else{
                    System.out.println(" ");
                    System.out.println("Pemenang lelang adalah dengan harga tawar : " + max + " atas nama " + masyarakat.getNama(maxId));
                    System.out.println(" ");
                }
            
            System.out.println("=======================================");
        }
    }
    
    public void setLelang(Barang barang, int idPenawar, int idBarang, int hargaTawar) {
        this.idPenawar.add(idPenawar);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int gethargaTawar(int id) {
        return this.hargaTawar.get(id);
    }

    public int getIdMasyarakat(int id) {
        return this.idPenawar.get(id);
    }

    public int getJmlLelang() {
        return this.hargaTawar.size();
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public int getHargaTawar(int idMasyarakat) {
        return this.hargaTawar.get(idMasyarakat);
    }

    public void editHargaTawar(int idMasyarakat, int hargaTawar) {
        this.hargaTawar.set(idMasyarakat, hargaTawar);
    }
}
