public class Mahasiswa extends User {
    private String fakultas;
    private String programStudi;

    public Mahasiswa(String id, String nama, String email, String password, String fakultas, String programStudi) {
        super(id, nama, email, password);
        this.fakultas = fakultas;
        this.programStudi = programStudi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}
