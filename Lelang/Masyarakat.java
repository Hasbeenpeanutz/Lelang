package Lelang;

import java.util.ArrayList;

public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    Masyarakat(){
    this.namaMasyarakat.add("Imam");
       this.alamat.add("SurBay");
       this.telepon.add("0876546249568");
       
       this.namaMasyarakat.add("Adel");
       this.alamat.add("Bumi");
       this.telepon.add("08907865724");
       
       this.namaMasyarakat.add("Luna");
       this.alamat.add("Malang");
       this.telepon.add("089867543679");
}

    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    }
    
    @Override
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    @Override
    public String getAlamat(int id) {
      return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);}
    
    
}
