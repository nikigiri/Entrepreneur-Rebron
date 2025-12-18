public abstract class User {
    protected String id;
    protected String nama;
    protected String email;
    protected String password;

    public User(String id, String nama, String email, String password) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void logout() {
        System.out.println("User berhasil logout");
    }
}