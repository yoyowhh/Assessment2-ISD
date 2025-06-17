public class Kiriman {
    private int idPaket;
    private String namaPelanggan;
    private int tanggalMasuk;
    private String tipePaket;
    private String alamat;

    public Kiriman(int idPaket, String namaPelanggan, int tanggalMasuk, String tipePaket, String alamat) {
        this.idPaket = idPaket;
        this.namaPelanggan = namaPelanggan;
        this.tanggalMasuk = tanggalMasuk;
        this.tipePaket = tipePaket;
        this.alamat = alamat;
    }

    public int getIdPaket() {
        return idPaket;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int getTanggalMasuk() {
        return tanggalMasuk;
    }

    public String getTipePaket() {
        return tipePaket;
    }

    public String getAlamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return "Kiriman [idPaket=" + idPaket + ", namaPelanggan=" + namaPelanggan + ", tanggalMasuk=" + tanggalMasuk
                + ", tipePaket=" + tipePaket + ", alamat=" + alamat + "]";
    }
}