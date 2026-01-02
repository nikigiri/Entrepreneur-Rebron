

public class Pendaftaran {

    private String idPendaftaran;
    private Mahasiswa mahasiswa;
    private Event event;
    private Pembayaran pembayaran;
    private String status;

    public Pendaftaran(String id, Mahasiswa m, Event e) {
        this.idPendaftaran = id;
        this.mahasiswa = m;
        this.event = e;
        this.status = "MENUNGGU_PEMBAYARAN";
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
        this.status = "MENUNGGU_VERIFIKASI";
    }

    public void verifikasiBerhasil() {
        this.status = "BERHASIL";
    }

    public String getIdPendaftaran() {
        return idPendaftaran;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Event getEvent() {
        return event;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void tampilkanStatus() {
        System.out.println(
                "ID Pendaftaran : " + idPendaftaran +
                        "\nEvent          : " + event.getNamaEvent() +
                        "\nStatus         : " + status +
                        "\n------------------------");
    }
}


