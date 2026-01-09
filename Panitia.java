public class Panitia extends User {
    private String jabatan;

    public Panitia(String id, String nama, String email, String password, String jabatan) {
        super(id, nama, email, password);
        this.jabatan = jabatan;
    }

    public void tambahEvent(Event e) {
        System.out.println("Event " + e.getNamaEvent() + " ditambahkan");
    }

    public void ubahEvent(Event e) {
        System.out.println("Event " + e.getNamaEvent() + " diubah");
    }

    public boolean hapusEvent(Event e) {
        System.out.println("Event " + e.getNamaEvent() + " berhasil dihapus dari sistem.");
        return true; 
    }

    public boolean verifikasiPembayaran(Pembayaran p) {
        p.setStatusPembayaran("Terverifikasi");
        return true;
    }
}
