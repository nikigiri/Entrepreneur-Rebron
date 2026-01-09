import java.time.LocalDate;

public class Pembayaran {
    private String idPembayaran;
    private String idEvent;
    private LocalDate tanggalPembayaran;
    private double jumlah;
    private String metodePembayaran;
    private String statusPembayaran;
    private Event event;

    public Pembayaran(String idPembayaran, String idEvent, LocalDate tanggalPembayaran,
            double jumlah, String metodePembayaran, String statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.idEvent = idEvent;
        this.tanggalPembayaran = tanggalPembayaran;
        this.jumlah = jumlah;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public boolean validasiHarga() {
        if (event == null) {
            System.out.println("ERROR: Event belum diset pada pembayaran!");
            return false;
        }

        if (jumlah == event.getHarga()) {
            System.out.println("Pembayaran sesuai harga event");
            return true;
        } else {
            System.out.println("WARNING: Pembayaran tidak sesuai!");
            System.out.println("Harga Event : " + event.getHarga());
            System.out.println("Jumlah Bayar: " + jumlah);
            return false;
        }
    }

    public void tampilkanInfo() {
        System.out.println(
                "ID Pembayaran : " + idPembayaran +
                        "\n | ID Event : " + idEvent +
                        "\n | Jumlah Bayar : " + jumlah +
                        "\n | Harga Event  : " + (event != null ? event.getHarga() : "-") +
                        "\n | Metode : " + metodePembayaran +
                        "\n | Status : " + statusPembayaran);

        // panggil validasi harga di sini
        validasiHarga();
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public String getIdEvent() {
        return idEvent;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String status) {
        this.statusPembayaran = status;
    }
}
