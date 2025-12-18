import java.time.LocalDate;

public class Event {
    private String idEvent;
    private String namaEvent;
    private LocalDate tanggalEvent;
    private String lokasi;
    private String deskripsi;
    private int kuota;

    public Event(String idEvent, String namaEvent, LocalDate tanggalevent, String lokasi, String deskripsi, int kuoat) {
        this.idEvent = idEvent;
        this.namaEvent = namaEvent;
        this.tanggalEvent = tanggalEvent;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.kuota = kuota;

    }

    public boolean cekKuota() {
        return kuota > 0;
    }

    public void kurangiKuota() {
        kuota--;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public int getKuota() {
        return kuota;
    }
}