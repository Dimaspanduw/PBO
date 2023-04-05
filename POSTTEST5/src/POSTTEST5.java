import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class POSTTEST5 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     static ArrayList<Kopling> listKpg = new ArrayList<>();
    static ArrayList<Matic> listMtc = new ArrayList<>();
   

    public static void main(String[] args) throws IOException{       
        
        while (true) {
            System.out.println("\n=======================================");            
            System.out.println("|             Dealer Motor            |");
            System.out.println("=======================================");            
            System.out.println("| 1. TAMBAH                           |");
            System.out.println("| 2. LIHAT                            |");
            System.out.println("| 3. UBAH                             |");
            System.out.println("| 4. HAPUS                            |");
            System.out.println("| 5. EXIT                             |");
            System.out.println("======================================="); 
            
            System.out.print("Pilih Menu: ");
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    editData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:   
                    keluar();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
    }    

    public static void jenisMotor()
    {
        System.out.println("\n====================");
        System.out.println("Jenis Motor");
        System.out.println("1. Kopling");
        System.out.println("2. Matic");
        System.out.println("====================");
    }

    public static void tambahData() throws IOException {
        jenisMotor();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Motor ==========");
             System.out.print("Masukkan Nama Motor                       : ");
            String NamaMotor = input.readLine();
             System.out.print("Masukkan Jumlah Motor                     : ");
            int JumlahMotor = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Kode Motor                       : ");
            int KodeKopling = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Merk Motor                       : ");
            String MerkKopling = input.readLine();
             System.out.print("Masukkan Harga Motor                      : ");
            int HargaKopling = Integer.parseInt(input.readLine());
             System.out.println("=============================================");
            
            Kopling Kpg = new Kopling(NamaMotor, JumlahMotor, KodeKopling, MerkKopling, HargaKopling );
            listKpg.add(Kpg);
            Kpg.Dealer(NamaMotor, JumlahMotor);
            Kpg.tambah();

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Motor ==========");
             System.out.print("Masukkan Nama Motor                       : ");
            String NamaMotor = input.readLine();
             System.out.print("Masukkan Jumlah Motor                     : ");
            int JumlahMotor = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Kode Motor                       : ");
            int KodeMatic = Integer.parseInt(input.readLine());
             System.out.print("Masukkan Merk Motor                       : ");
            String MerkMatic = input.readLine();
             System.out.print("Masukkan Harga Motor                      : ");
            int HargaMatic = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            Matic Mtc = new Matic(NamaMotor, JumlahMotor, KodeMatic, MerkMatic, HargaMatic );
            listMtc.add(Mtc);
            Mtc.Dealer(NamaMotor, JumlahMotor);
            Mtc.tambah();

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void lihatData() throws IOException{
        jenisMotor();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data Motor Kopling ============");
            if (listKpg.isEmpty()){
                System.out.println("\nBelum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listKpg.size();i++){
                System.out.println("\nData Ke-" + (i+1));
                listKpg.get(i).DataMtr();
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== List Data Motor Matic ===========");
            if (listMtc.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listMtc.size();i++){
                System.out.println("\nData Ke-" + (i+1));
                listMtc.get(i).DataMtr();
                }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void editData() throws IOException{
        jenisMotor();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKpg.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listKpg.size();i++){
                    System.out.println("Data Kopling dengan nomor " + i+1);
                    
                    listKpg.get(i).DataMtr();
                    }
                 
                System.out.print("Masukkan Nomor Data Kopling yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index <= listKpg.size() || index > 0) {
                    System.out.println("======= Masukkan data motor yang baru =======");
                    System.out.print("Masukkan Nama Motor                       : ");
                    String NamaMotor = input.readLine();
                    listKpg.get(index-1).setNamaMotor(NamaMotor);
                    System.out.print("Masukkan Jumlah Motor                     : ");
                    int JumlahMotor = Integer.parseInt (input.readLine());
                    listKpg.get(index-1).setJumlahMotor(JumlahMotor);
                    System.out.print("Masukkan Kode Motor                       : ");
                    int KodeKopling = Integer.parseInt (input.readLine());
                    listKpg.get(index-1).setKodeKopling(KodeKopling);
                    System.out.print("Masukkan Merk Motor                       : ");
                    String MerkKopling = input.readLine();
                    listKpg.get(index-1).setMerkKopling(MerkKopling);
                    System.out.print("Masukkan Harga Motor                      : ");
                    int HargaKopling = Integer.parseInt (input.readLine());
                    listKpg.get(index-1).setHargaKopling(HargaKopling);

                    listKpg.get(index-1).Dealer(NamaMotor);
                    listKpg.get(index-1).edit();
                    }else{
                        System.out.println("Input Salah");
                    }   
            }
        }else if(pil == 2){
            if (listMtc.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listMtc.size();i++){
                    System.out.println("Data matic dengan nomor " + i+1);
                    
                    listMtc.get(i).DataMtr();
                    }
                 
                System.out.print("Masukkan Nomor Data Matic yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index <= listMtc.size() || index > 0) {
                    System.out.println("======= Masukkan data motor yang baru =======");
                    System.out.print("Masukkan Nama Motor                       : ");
                    String NamaMotor = input.readLine();
                    listMtc.get(index-1).setNamaMotor(NamaMotor);
                    System.out.print("Masukkan Jumlah Motor                     : ");
                    int JumlahMotor = Integer.parseInt (input.readLine());
                    listMtc.get(index-1).setJumlahMotor(JumlahMotor);
                    System.out.print("Masukkan Kode Motor                       : ");
                    int KodeMatic = Integer.parseInt (input.readLine());
                    listMtc.get(index-1).setKodeMatic(KodeMatic);
                    System.out.print("Masukkan Merk Motor                       : ");
                    String MerkKopling = input.readLine();
                    listMtc.get(index-1).setMerkMatic(MerkKopling);
                    System.out.print("Masukkan Harga Motor                      : ");
                    int HargaMatic = Integer.parseInt (input.readLine());
                    listMtc.get(index-1).setHargaMatic(HargaMatic);

                    listMtc.get(index-1).Dealer(NamaMotor);
                    listMtc.get(index-1).edit();
                    }else{
                        System.out.println("Input Salah");
                    }   
            }
        }else{
            System.out.println("Pilihan tidak ada!");
        }
    }
    
    public static void hapusData() throws IOException{
        jenisMotor();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listKpg.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listKpg.size();i++){
                    System.out.println("Data motor dengan nomor " + i+1);
                        
                    listKpg.get(i).DataMtr();
                    }
                    
                    System.out.print("Masukkan nomor data kopling yang ingin dihapus: ");
                    int index = Integer.parseInt(input.readLine());
                    if(index <= listKpg.size() || index > 0) 
                    {
                        listKpg.remove(index-1).hapus();
                    }
                    else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
                
            }
        }else if(pil == 2){
            if (listMtc.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listMtc.size();i++){
                    System.out.println("Data motor dengan nomor " + i+1);
                        
                    listMtc.get(i).DataMtr();
                    }
                    
                    System.out.print("Masukkan nomor data matic yang ingin dihapus: ");
                    
                    int index = Integer.parseInt(input.readLine());
                    if(index <= listMtc.size() || index > 0) 
                    {
                        listMtc.remove(index-1).hapus();
                    }
                    else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
                }
            }else{
                System.out.println("Pilihan tidak ada!");
            }
        
    }
    
    static final void keluar(){          
        System.out.println("TERIMA KASIH TELAH DATANG KE DEALER SAYA");
    } 
    

}