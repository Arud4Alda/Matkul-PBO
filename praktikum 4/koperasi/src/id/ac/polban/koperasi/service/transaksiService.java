package id.ac.polban.koperasi.service;

import id.ac.polban.koperasi.model.transaksi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class transaksiService 
{ 
    private List<transaksi> transaksiList;

    public transaksiService() {
        this.transaksiList = new ArrayList<>();
    }

    // Tambah transaksi baru
    public void tambahTransaksi(transaksi tr) {
        transaksiList.add(tr);
    }

    // Ambil semua transaksi
    public List<transaksi> getSemuaTransaksi() {
        return transaksiList;
    }

    // Cari transaksi berdasarkan ID
    public transaksi cariTransaksi(String id) {
        for (transaksi tr : transaksiList) {
            if (tr.getidtransaksi().equalsIgnoreCase(id)) {
                return tr;
            }
        }
        return null; // kalau tidak ketemu
    }

    // Hitung total omzet koperasi
    public int hitungTotalOmzet() {
        int total = 0;
        for (transaksi tr : transaksiList) {
            total += tr.getttlharga();
        }
        return total;
    }

    // Filter transaksi berdasarkan nama petugas
    public List<transaksi> filterByPetugas(String namaPetugas) {
        return transaksiList.stream()
                .filter(tr -> tr.getnamaptgs().getnamaptgs().equalsIgnoreCase(namaPetugas))
                .collect(Collectors.toList());
    }

    // Export laporan sederhana (string)
    public String exportLaporan() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== LAPORAN TRANSAKSI ===\n");
        for (transaksi tr : transaksiList) {
            sb.append(tr.toString()).append("\n");
        }
        sb.append("Total Omzet: Rp ").append(hitungTotalOmzet());
        return sb.toString();
    }
}
