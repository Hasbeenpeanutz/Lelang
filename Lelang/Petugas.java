package Lelang;

import java.util.ArrayList;

public class Petugas extends Masyarakat{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    Petugas(){
        this.namaPetugas.add("Bayu");
        this.alamat.add("Lumajang");
        this.telepon.add("0887645454689");
        
        this.namaPetugas.add("Nao");
        this.alamat.add("Bali");
        this.telepon.add("0890687564346");
    }
    
    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String tlp) {
        this.telepon.add(tlp);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    int Petugas(){
        return this.namaPetugas.size();
    }
    public int getJmlPetugas(){
        return this.namaPetugas.size();   
    }
}
