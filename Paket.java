import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Paket {
    private ArrayList<Kiriman> daftarKiriman;

    public Paket() {
        this.daftarKiriman = new ArrayList<>();
    }

    public void terimaKiriman(int idPaket, String namaPelanggan, int tanggalMasuk, String tipePaket, String alamat) {
        Kiriman kirimanBaru = new Kiriman(idPaket, namaPelanggan, tanggalMasuk, tipePaket, alamat);
        this.daftarKiriman.add(kirimanBaru);
    }

    public void urutanPaket() {
        Collections.sort(this.daftarKiriman, new Comparator<Kiriman>() {
            @Override
            public int compare(Kiriman k1, Kiriman k2) {
                return Integer.compare(k1.getIdPaket(), k2.getIdPaket());
            }
        });
    }

    public void tampilanUrut() {
        System.out.println("Urutan paket harus diselesaikan:");
        for (Kiriman kiriman : daftarKiriman) {
            System.out.println("ID Paket: " + kiriman.getIdPaket() + 
                             " namaPelanggan: " + kiriman.getNamaPelanggan() + 
                             " alamatPelanggan: " + kiriman.getAlamat());
        }
    }
}