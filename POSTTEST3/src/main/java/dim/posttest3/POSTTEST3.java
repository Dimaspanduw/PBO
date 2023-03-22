package dim.posttest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class POSTTEST3 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     static ArrayList<Kopling> listKpg = new ArrayList<>();
    static ArrayList<Matic> listMtc = new ArrayList<>();
   
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    public static void tambahData() throws IOException {
        System.out.println("Jenis Motor");
        System.out.println("1. Kopling");
        System.out.println("2. Matic");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Motor ==========");
             System.out.print("Masukkan Nama Motor                       : ");
            String NamaMotor = input.readLine();
             System.out.print("Masukkan Jumlah Motor                    : ");
            int JumlahMotor = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Kode Motor                       : ");
            int KodeKopling = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Merk Motor                       : ");
            String MerkKopling = input.readLine();
             System.out.print("Masukkan Harga Motor                      : ");
            int HargaKopling = Integer.parseInt(input.readLine());
             System.out.println("=============================================");
            listKpg.add(new Kopling(NamaMotor, JumlahMotor, KodeKopling, MerkKopling, HargaKopling ));
             System.out.println("Data " + NamaMotor + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Motor ==========");
             System.out.print("Masukkan Nama Motor                       : ");
            String NamaMotor = input.readLine();
             System.out.print("Masukkan Jumlah Motor                    : ");
            int JumlahMotor = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Kode Motor                       : ");
            int KodeMatic = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Merk Motor                       : ");
            String MerkMatic = input.readLine();
             System.out.print("Masukkan Harga Motor                      : ");
            int HargaMatic = Integer.parseInt(input.readLine());
            System.out.println("=============================================");
            listMtc.add(new Matic(NamaMotor, JumlahMotor, KodeMatic, MerkMatic, HargaMatic  ));
            System.out.println("Data " + NamaMotor + " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void lihatData() throws IOException{
        System.out.println("Jenis Motor");
        System.out.println("1. Kopling");
        System.out.println("2. Matic");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data Motor ============");
            if (listKpg.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKpg.size();i++){
                    System.out.println("indeks ke-" + (i));
                    System.out.println("Nama Motor        :" + listKpg.get(i).getNamaMotor());
                    System.out.println("Jumlah Motor      :" + listKpg.get(i).getJumlahMotor());
                    System.out.println("Kode Motor        :" + listKpg.get(i).getKodeKopling());
                    System.out.println("Merk Motor        :" + listKpg.get(i).getHargaKopling());
                    System.out.println("Harga Motor       :" + listKpg.get(i).getMerkKopling());
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== List Data Motor ===========");
            if (listMtc.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listMtc.size();i++){
                   System.out.println("indeks ke-" + (i));
                    System.out.println("Nama Motor        :" + listMtc.get(i).getNamaMotor());
                    System.out.println("Jumlah Motor      :" + listMtc.get(i).getJumlahMotor());
                    System.out.println("Kode Motor        :" + listMtc.get(i).getKodeMatic());
                    System.out.println("Merk Motor        :" + listMtc.get(i).getMerkMatic());
                    System.out.println("Harga Motor       :" + listMtc.get(i).getHargaMatic());
                    }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void editData() throws IOException{
        System.out.println("Jenis Motor");
        System.out.println("1. Kopling");
        System.out.println("2. Matic");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKpg.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data motor : ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listKpg.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Kopling Kpg = listKpg.get(index);
                    System.out.println("Pilih indeks ke " + index);
                    System.out.println(Kpg);
                    System.out.println("======= Masukkan data motor yang baru =======");
                    System.out.print("Masukkan Nama Motor                       : ");
                    Kpg.setNamaMotor(input.readLine());
                    System.out.print("Masukkan Jumlah Motor                     : ");
                    Kpg.setJumlahMotor(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Kode Motor                       : ");
                    Kpg.setKodeKopling(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Merk Motor                       : ");
                    Kpg.setMerkKopling(input.readLine());
                    System.out.print("Masukkan Harga Motor                      : ");
                    Kpg.setHargaKopling(Integer.parseInt(input.readLine()));
                    System.out.println("=================================================");
                    System.out.println("Data motor berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (listMtc.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Pilih indeks ke: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMtc.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Matic Mtc = listMtc.get(index);
                    System.out.println("Data dosen dengan indeks " + index);
                    System.out.println(Mtc);
                    System.out.println("======= Masukkan data motor yang baru =======");
                    System.out.print("Masukkan Nama Motor                       : ");
                    Mtc.setNamaMotor(input.readLine());
                    System.out.print("Masukkan Jumlah Motor                     : ");
                    Mtc.setJumlahMotor(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Kode Motor                       : ");
                    Mtc.setKodeMatic(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Merk Motor                       : ");
                    Mtc.setMerkMatic(input.readLine());
                    System.out.print("Masukkan Harga Motor                      : ");
                    Mtc.setHargaMatic(Integer.parseInt(input.readLine()));
                    System.out.println("=================================================");
                    System.out.println("Data motor berhasil diubah!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void hapusData() throws IOException{
        System.out.println("Jenis data Motor");
        System.out.println("1. Kopling");
        System.out.println("2. Matic");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKpg.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Motor yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listKpg.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Kopling Kpg = listKpg.get(index);
                    listKpg.remove(index);
                    System.out.println("Data Motor indeks ke" + index + " berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (listMtc.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Motor yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMtc.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Matic Mtc = listMtc.get(index);
                    listMtc.remove(index);
                    System.out.println("Data Motor indeks ke" + index + " berhasil dihapus:");
                    
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
    
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                                  Program Dealer Motor
                           ====================================
                           | 1. Tambah                        |
                           | 2. Lihat                         |
                           | 3. Ubah                          |
                           | 4. Hapus                         |
                           | 5. Keluar                        |
                           ====================================
                           """);
        System.out.print("Pilih: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahData();
                froze();
                break;
            case 2:
                lihatData();
                froze();
                break;
            case 3:
                editData();
                froze();
                break;
            case 4:
                hapusData();
                froze();
                break;
            case 5:
                System.out.println("Program dihentikan");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah");
                froze();
                break;
            }
        }
    }
    
}