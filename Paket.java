import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Paket {

    private ArrayList<Paket> daftarPaket;
    private Map<String, Integer> prioritasTipe;
    
    public Paket() {
        this.daftarPaket = new ArrayList<>();
        this.prioritasTipe = new HashMap<>();
        prioritasTipe.put("Biasa", 1);
        prioritasTipe.put("Express", 2);
        prioritasTipe.put("Kilat", 3);
        prioritasTipe.put("Same Day", 4);

    }

    public void terimaKiriman(int idPelanggan, String namaPelanggan, int tanggalmasuk, String tipePaket, String alamat) {
        Paket paketBaru = new Paket(idPelanggan, namaPelanggan, tanggalmasuk, tipePaket, alamat);
        this.daftarPaket.add(paketBaru);
    }

    public void urutanPaket() {
        Collections.sort(this.daftarPaket, new Comparator<Paket>() {
            @Override
            public int compare(Paket p1, Paket p2) {
                int prioritas1 = prioritasTipe.getOrDefault(p1.getTipePaket(), Integer.MAX_VALUE);
                int prioritas2 = prioritasTipe.getOrDefault(p2.getTipePaket(), Integer.MAX_VALUE);

                if (prioritas1 != prioritas2) {
                    return Integer.compare(prioritas1, prioritas2);
                } else {
                    return Integer.compare(p1.getTanggalMasuk(), p2.getTanggalMasuk());
                }
            }
        });
    }

    public void tampilanUrut() {
        System.out.println("Urutan Paket harus diselesaikan: ");
        for (Paket paket : daftarPaket) {
            System.out.println("Id Paket: " + paket.getIdPaket() + ", Nama Pelanggan: " + paket.getNamaPelanggan() + ", Tanggal Masuk: " + paket.getTanggalMasuk()
                    + ", Tipe Paket: " + paket.getTipePaket() + ", Alamat: " + paket.getAlamat());
        }
    }
}
