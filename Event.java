import java.time.LocalDate;

public class Event {
    private String idEvent;
    private String namaEvent;
    private LocalDate tanggalEvent;
    private String lokasi;
    private String deskripsi;
    private int kuota;
    private boolean terverifikasi; // <<< TAMBAHAN

    public Event(String idEvent, String namaEvent, LocalDate tanggalEvent,
            String lokasi, String deskripsi, int kuota) {
        this.idEvent = idEvent;
        this.namaEvent = namaEvent;
        this.tanggalEvent = tanggalEvent;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.kuota = kuota;
        this.terverifikasi = false; // default
    }

    public boolean cekKuota() {
        return kuota > 0;
    }

    public boolean kurangiKuota() {
        if (kuota > 0) {
            kuota--;
            return true;
        }
        return false;
    }

    // ===== VERIFIKASI EVENT =====
    public void verifikasi() {
        this.terverifikasi = true;
    }

    public boolean isTerverifikasi() {
        return terverifikasi;
    }

    public String getIdEvent() {
        return idEvent;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public int getKuota() {
        return kuota;
    }

    @Override
    public String toString() {
        return "ID Event       : " + idEvent +
                "\nNama Event     : " + namaEvent +
                "\nTanggal Event  : " + tanggalEvent +
                "\nLokasi         : " + lokasi +
                "\nDeskripsi      : " + deskripsi +
                "\nKuota          : " + kuota +
                "\nStatus         : " + (terverifikasi ? "TERVERIFIKASI" : "BELUM DIVERIFIKASI") +
                "\n---------------------------";
    }
}
