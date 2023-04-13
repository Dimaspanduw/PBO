public abstract class DataMtr {
    private String NamaMotor;
    private int JumlahMotor;

    public DataMtr(String NamaMotor, int JumlahMotor) {
        this.NamaMotor = NamaMotor;
        this.JumlahMotor = JumlahMotor;
    }
    
    public String getNamaMotor() {
        return NamaMotor;
    }

    public void setNamaMotor(String NamaMotor) {
        this.NamaMotor = NamaMotor;
    }

    public int getJumlahMotor() {
        return JumlahMotor;
    }

    public void setJumlahMotor(int JumlahMotor) {
        this.JumlahMotor = JumlahMotor;
    }

    public void tambah(){
        System.out.println("DATA BERHASIL DITAMBAHKAN");
    }

    public void edit(){
        System.out.println("DATA BERHASIL DIUBAH");
    }
  
    public void hapus(){
        System.out.println("DATA BERHASIL DIHAPUS");
    }

    public void Dealer(String NamaMotor, int JumlahMotor){
        System.out.println("------------------------------------------------");
        System.out.println("Data motor dengan nama " + NamaMotor);
        System.out.println("Jumlah" + JumlahMotor + " Berhasil Ditambahkan");
        System.out.println("------------------------------------------------");
    }

    public void Dealer(String NamaMotor){
        System.out.println("------------------------------------------------");
        System.out.println("Data motor dengan nama " + NamaMotor);
        System.out.println("------------------------------------------------");
    }

    public abstract void DataMtr();

    public static void transaksi(){
        System.out.println("\nSyarat Transaksi");
        System.out.println("Harus Melakukan Transaksi Sebelum 1x24 jam dan tidak menerima cash");
    }
}


