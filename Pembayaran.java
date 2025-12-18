import java.time.LocalDate;

public class Pembayaran {
    private String idPembayaran;
    private LocalDate tanggalPembayaran;
    private double jumlah;
    private String metodePembayaran;
    private String statusPembayaran;

    public Pembayaran(String idPembayaran, LocalDate tanggalPembayaran,double jumlah, String metodePembayaran, String statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
        this.jumlah = jumlah;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran diproses");
    }

    public void setStatusPembayaran(String status) {
        this.statusPembayaran = status;
    }
}
