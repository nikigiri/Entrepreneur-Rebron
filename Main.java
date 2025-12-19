import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        //DATA USER 
        Admin admin = new Admin("A01", "Admin", "admin@mail.com", "admin");

        Panitia panitia = new Panitia(
                "P01", "Andre", "panitia@mail.com", "123", "Ketua");

        Mahasiswa mhs = new Mahasiswa(
                "M01", "Muthia", "mhs@mail.com", "123",
                "Informatika", "D3IF");

        //DATA EVENT & PEMBAYARAN
        ArrayList<Event> daftarEvent = new ArrayList<>();
        ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();

        //LOOP PROGRAM  
        while (jalan) {
            System.out.println("\n--- TELU EVENT ---");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("Pilih: ");
            int menuAwal = input.nextInt();
            input.nextLine();

            if (menuAwal == 2) {
                System.out.println("Program selesai.");
                break;
            }

            //LOGIN 
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Password: ");
            String pass = input.nextLine();

            int pilihan;

            //ADMIN 
            if (admin.login(email, pass)) {
                System.out.println("Login Admin berhasil");

                do {
                    System.out.println("\n--- MENU ADMIN ---");
                    System.out.println("1. Lihat Event");
                    System.out.println("2. Logout");
                    System.out.print("Pilih: ");
                    pilihan = input.nextInt();
                    input.nextLine();

                    switch (pilihan) {
                        case 1:
                            if (daftarEvent.isEmpty()) {
                                System.out.println("Belum ada event");
                            } else {
                                for (Event e : daftarEvent) {
                                    System.out.println(e);
                                }
                            }
                            break;
                        case 2:
                            admin.logout();
                            break;
                        default:
                            System.out.println("Pilihan tidak valid");
                    }
                } while (pilihan != 2);
            }

            //PANITIA
            else if (panitia.login(email, pass)) {
                System.out.println("Login Panitia berhasil");

                do {
                    System.out.println("\n--- MENU PANITIA ---");
                    System.out.println("1. Tambah Event");
                    System.out.println("2. Lihat Event");
                    System.out.println("3. Verifikasi Pembayaran");
                    System.out.println("4. Logout");
                    System.out.print("Pilih: ");
                    pilihan = input.nextInt();
                    input.nextLine();

                    switch (pilihan) {
                        case 1:
                            System.out.print("ID Event: ");
                            String idEvent = input.nextLine();
                            System.out.print("Nama Event: ");
                            String namaEvent = input.nextLine();
                            System.out.print("Lokasi: ");
                            String lokasi = input.nextLine();
                            System.out.print("Deskripsi: ");
                            String deskripsi = input.nextLine();
                            System.out.print("Kuota: ");
                            int kuota = input.nextInt();
                            input.nextLine();

                            Event event = new Event(
                                    idEvent,
                                    namaEvent,
                                    LocalDate.now(),
                                    lokasi,
                                    deskripsi,
                                    kuota);
                            daftarEvent.add(event);
                            System.out.println("Event berhasil ditambahkan");
                            break;

                        case 2:
                            if (daftarEvent.isEmpty()) {
                                System.out.println("Belum ada event");
                            } else {
                                for (Event e : daftarEvent) {
                                    System.out.println(e);
                                }
                            }
                            break;

                        case 3:
                            if (daftarPembayaran.isEmpty()) {
                                System.out.println("Belum ada pembayaran");
                                break;
                            }

                            System.out.println("=== DAFTAR PEMBAYARAN ===");
                            for (Pembayaran p : daftarPembayaran) {
                                p.tampilkanInfo();
                            }

                            System.out.print("Masukkan ID Pembayaran: ");
                            String idVerif = input.nextLine();

                            boolean ketemu = false;
                            for (Pembayaran p : daftarPembayaran) {
                                if (p.getIdPembayaran().equals(idVerif)) {
                                    panitia.verifikasiPembayaran(p);
                                    ketemu = true;
                                    break;
                                }
                            }

                            if (!ketemu) {
                                System.out.println("ID Pembayaran tidak ditemukan");
                            }
                            break;

                        case 4:
                            panitia.logout();
                            break;

                        default:
                            System.out.println("Pilihan tidak valid");
                    }
                } while (pilihan != 4);
            }

            //MAHASISWA 
            else if (mhs.login(email, pass)) {
                System.out.println("Login Mahasiswa berhasil");

                do {
                    System.out.println("\n--- MENU MAHASISWA ---");
                    System.out.println("1. Lihat Event");
                    System.out.println("2. Daftar Event");
                    System.out.println("3. Bayar Event");
                    System.out.println("4. Logout");
                    System.out.print("Pilih: ");
                    pilihan = input.nextInt();
                    input.nextLine();

                    switch (pilihan) {
                        case 1:
                            if (daftarEvent.isEmpty()) {
                                System.out.println("Belum ada event");
                            } else {
                                for (Event e : daftarEvent) {
                                    System.out.println(e);
                                }
                            }
                            break;

                        case 2:
                            System.out.print("Masukkan ID Event: ");
                            String idDaftar = input.nextLine();

                            for (Event e : daftarEvent) {
                                if (e.getIdEvent().equals(idDaftar)) {
                                    mhs.daftarEvent(e);
                                }
                            }
                            break;

                        case 3:
                            System.out.print("Masukkan ID Event: ");
                            String idBayar = input.nextLine();

                            System.out.print("Metode Pembayaran: ");
                            String metode = input.nextLine();

                            Pembayaran bayar = new Pembayaran(
                                    "BY" + System.currentTimeMillis(),
                                    idBayar,
                                    LocalDate.now(),
                                    50000,
                                    metode,
                                    "Menunggu");
                            daftarPembayaran.add(bayar);
                            System.out.println("Pembayaran berhasil, menunggu verifikasi");
                            break;

                        case 4:
                            mhs.logout();
                            break;

                        default:
                            System.out.println("Pilihan tidak valid");
                    }
                } while (pilihan != 4);
            }

            else {
                System.out.println("Login gagal");
            }
        }

        input.close();
    }
}