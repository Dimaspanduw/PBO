import java.util.ArrayList;
import java.util.Scanner;

public class app {
    static ArrayList<Motor> listMotor = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("===== Sistem Penjualan Dealer Motor =====");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Lihat Motor");
            System.out.println("3. Ubah Motor");
            System.out.println("4. Hapus Motor");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahMotor();
                    break;
                case 2:
                    lihatMotor();
                    break;
                case 3:
                    ubahMotor();
                    break;
                case 4:
                    hapusMotor();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        } while (pilihan != 5);
    }

    static void tambahMotor() {
        System.out.print("Masukkan nama motor: ");
        String nama = scanner.next();
        System.out.print("Masukkan harga motor: ");
        int harga = scanner.nextInt();
        Motor motor = new Motor(nama, harga);
        listMotor.add(motor);
        System.out.println("Motor berhasil ditambahkan.");
    }

    static void lihatMotor() {
        if (listMotor.isEmpty()) {
            System.out.println("Tidak ada motor.");
        } else {
            System.out.println("===== Daftar Motor =====");
            for (Motor motor : listMotor) {
                System.out.println(motor);
            }
        }
    }

    static void ubahMotor() {
        if (listMotor.isEmpty()) {
            System.out.println("Tidak ada motor.");
        } else {
            System.out.print("Masukkan nomor motor yang akan diubah: ");
            int nomor = scanner.nextInt() - 1;
            if (nomor >= 0 && nomor < listMotor.size()) {
                System.out.print("Masukkan nama motor baru: ");
                String nama = scanner.next();
                System.out.print("Masukkan harga motor baru: ");
                int harga = scanner.nextInt();
                listMotor.get(nomor).setNama(nama);
                listMotor.get(nomor).setHarga(harga);
                System.out.println("Motor berhasil diubah.");
            } else {
                System.out.println("Nomor motor tidak tersedia.");
            }
        }
    }

    static void hapusMotor() {
        if (listMotor.isEmpty()) {
            System.out.println("Tidak ada motor.");
        } else {
            System.out.print("Masukkan nomor motor yang akan dihapus: ");
            int nomor = scanner.nextInt() - 1;
            if (nomor >= 0 && nomor < listMotor.size()) {
                listMotor.remove(nomor);
                System.out.println("Motor berhasil dihapus.");
            } else {
                System.out.println("Nomor motor tidak tersedia.");
            }
        }
    }
}

class Motor {
    private String nama;
    private int harga;

    public Motor(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + harga;
    }
}