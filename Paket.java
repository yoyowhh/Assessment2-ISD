import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Paket {
    private ArrayList<Kiriman> daftarKiriman;
    private Map<String, Integer> prioritasTipe;

    public Paket() {
        this.daftarKiriman = new ArrayList<>();
        this.prioritasTipe = new HashMap<>();
        prioritasTipe.put("biasa", 1);
        prioritasTipe.put("express", 2);
        prioritasTipe.put("kilat", 3);
        prioritasTipe.put("Same Day", 4);
    }

    public void terimaKiriman(int idPaket, String namaPelanggan, int tanggalMasuk, String tipePaket, String alamat) {
        Kiriman kirimanBaru = new Kiriman(idPaket, namaPelanggan, tanggalMasuk, tipePaket, alamat);
        this.daftarKiriman.add(kirimanBaru);
    }

    public void urutanPaket() {
        Collections.sort(this.daftarKiriman, new Comparator<Kiriman>() {
            @Override
            public int compare(Kiriman k1, Kiriman k2) {
                int prioritas1 = prioritasTipe.getOrDefault(k1.getTipePaket().toLowerCase(), Integer.MAX_VALUE);
                int prioritas2 = prioritasTipe.getOrDefault(k2.getTipePaket().toLowerCase(), Integer.MAX_VALUE);

                if (prioritas1 != prioritas2) {
                    return Integer.compare(prioritas2, prioritas1); // Urutan descending (prioritas tinggi dulu)
                } else {
                    return Integer.compare(k1.getTanggalMasuk(), k2.getTanggalMasuk());
                }
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