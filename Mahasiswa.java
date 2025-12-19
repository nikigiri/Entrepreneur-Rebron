public class Mahasiswa extends User {
    private String Fakultas;
    private String programStudi;

    public Mahasiswa(String id, String nama, String email, String password, String Fakultas, String programStudi) {
        super(id, nama, email, password);
        this.Fakultas = Fakultas;
        this.programStudi = programStudi;
    }

    public void daftarEvent(Event e) {
        if (e.cekKuota()) {
            System.out.println("berhasil mendaftar Event: " + e.getNamaEvent());
            e.kurangiKuota();
        } else {
            System.out.println("Gagal mendaftar, kuota Event penuh");
        }
    }
}