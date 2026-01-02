public class Admin extends User {

    public Admin(String id, String nama, String email, String password) {
        super(id, nama, email, password);
    }
    public void verifikasiEvent(Event e) {
        e.verifikasi(); 
        System.out.println("Event " + e.getNamaEvent() + " berhasil diverifikasi");
    }
}
