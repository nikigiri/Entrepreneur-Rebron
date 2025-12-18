public class Admin extends User {

    public Admin(String id, String nama, String email, String password) {
        super(id, nama, email, password);
    }

    public void tambahUser(User u) {
        System.out.println("User " + u.nama + " ditambahkan oleh Admin");
    }

    public void ubahUser(User u) {
        System.out.println("User " + u.nama + " diubah oleh Admin");
    }

    public void hapusUser(String idUser) {
        System.out.println("User dengan ID " + idUser + " dihapus oleh Admin");
    }

    public void verifikasiEvent(Event e) {
        System.out.println("Event " + e.getNamaEvent() + " diverifikasi oleh Admin");
    }
}