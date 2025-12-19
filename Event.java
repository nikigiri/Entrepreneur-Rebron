import java.time.LocalDate;

public class Event {
    private String idEvent;
    private String namaEvent;
    private LocalDate tanggalEvent;
    private String lokasi;
    private String deskripsi;
    private int kuota;

    public Event(String idEvent, String namaEvent, LocalDate tanggalEvent, String lokasi, String deskripsi, int kuota) {
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

    public String getIdEvent() {
        return idEvent;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public int getKuota() {
        return kuota;
    }

    // public void tampilkanInfo() {
    //     System.out.println(
    //             "ID Event : " + idEvent +
    //                     " | Nama : " + namaEvent +
    //                     " | Tanggal : " + tanggalEvent +
    //                     " | Lokasi : " + lokasi +
    //                     " | Deskripsi : " + deskripsi +
    //                     " | Kuota : " + kuota);
    // }

    @Override
    public String toString() {
        return "ID Event       : " + idEvent +
                "\nNama Event     : " + namaEvent +
                "\nTanggal Event  : " + tanggalEvent +
                "\nLokasi         : " + lokasi +
                "\nDeskripsi      : " + deskripsi +
                "\nKuota          : " + kuota +
                "\n---------------------------";
    }

}