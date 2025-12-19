import java.time.LocalDate;

public class Pembayaran {
    private String idPembayaran;
    private String idEvent;
    private LocalDate tanggalPembayaran;
    private double jumlah;
    private String metodePembayaran;
    private String statusPembayaran;

    public Pembayaran(String idPembayaran, String idEvent, LocalDate tanggalPembayaran, double jumlah,
            String metodePembayaran, String statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.idEvent = idEvent;
        this.tanggalPembayaran = tanggalPembayaran;
        this.jumlah = jumlah;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
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

    public void tampilkanInfo() {
        System.out.println(
                "ID Pembayaran : " + idPembayaran +
                        "\n | ID Event : " + idEvent +
                        "\n | Jumlah : " + jumlah +
                        "\n | Metode : " + metodePembayaran +
                        "\n | Status : " + statusPembayaran);
    }
}
