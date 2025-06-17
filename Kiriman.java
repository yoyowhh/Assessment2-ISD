public class Kiriman {

    private int idpaket;
    private String namaPelanggan;
    private int tanggalMasuk;
    private String tipePaket;
    private String alamat;

    public Kiriman(int idpaket, String namaPelanggan, int tanggalMasuk, String tipePaket, String alamat) {
        this.idpaket = idpaket;
        this.namaPelanggan = namaPelanggan;
        this.tanggalMasuk = tanggalMasuk;
        this.tipePaket = tipePaket;
        this.alamat = alamat;
    }

    public int getidpaket() {
        return idpaket;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int gettanggalMasuk() {
        return tanggalMasuk;
    }

    public String gettipePaket() {
        return tipePaket;
    }

    public String getalamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return "Kiriman [idpaket=" + idpaket + ", namaPelanggan=" + namaPelanggan + ", tanggalMasuk=" + tanggalMasuk
                + ", tipePaket=" + tipePaket + ", alamat=" + alamat + "]";
    }
}