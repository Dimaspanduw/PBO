public final class Matic extends DataMtr{
    private int KodeMatic;
    private int HargaMatic;
    private String MerkMatic;
    
    public final String jenis = "Motor Matic";
    
    public Matic(String NamaMotor, int JumlahMotor, int KodeMatic, String MerkMatic, int HargaMatic) {
        super(NamaMotor, JumlahMotor);
        this.KodeMatic = KodeMatic;
        this.HargaMatic = HargaMatic;
        this.MerkMatic = MerkMatic;
    }
    

    public int getKodeMatic() {
        return KodeMatic;
    }

    public void setKodeMatic(int KodeMatic) {
        this.KodeMatic = KodeMatic;
    }

    public int getHargaMatic() {
        return HargaMatic;
    }

    public void setHargaMatic(int HargaMatic) {
        this.HargaMatic = HargaMatic;
    }

    public String getMerkMatic() {
        return MerkMatic;
    }

    public void setMerkMatic(String MerkMatic) {
        this.MerkMatic = MerkMatic;
    }

    @Override
    public void tambah(){
        System.out.println("------------------------------------------------");
        System.out.println("|  Data " + this.jenis + " Berhasil Ditambahkan    |");
        System.out.println("------------------------------------------------");         
    }
    
    @Override
    public void edit(){
        System.out.println("-------------------------------------------------");
        System.out.println("|     Data " + this.jenis + " Berhasil Diubah      |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void hapus(){
        System.out.println("-------------------------------------------------");
        System.out.println("|     Data " + this.jenis + " Berhasil Dihapus     |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void DataMtr(){
       System.out.println("Nama Motor   : " + getNamaMotor());
       System.out.println("Jumlah Motor : " + getJumlahMotor());
       System.out.println("Kode Motor   : " + KodeMatic);
       System.out.println("Merk Motor   : " + MerkMatic);
       System.out.println("Harga Motor  : " + HargaMatic);
    }
       
}