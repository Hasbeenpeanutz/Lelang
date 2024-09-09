package Lelang;

public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang();
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Lelang lelang = new Lelang();
        Laporan laporan = new Laporan();
        
        laporan.Laporan(petugas);
        laporan.Laporan(barang);
        laporan.Laporan(masyarakat);
        lelang.prosesLelang(masyarakat, lelang, barang);
    }
}
