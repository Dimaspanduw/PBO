public class Matic extends DataMtr{
    private int KodeMatic;
    private int HargaMatic;
    private String MerkMatic;
    
    
    public Matic(String NamaMotor, int JumlahMotor, int KodeMatic, String MerkMatic, int HargaMatic) {
        super(NamaMotor, JumlahMotor);
        this.KodeMatic = KodeMatic;
        this.HargaMatic = HargaMatic;
        this.MerkMatic = MerkMatic;
    }
    
    public Matic(){}

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
 public void deskripsi(){
        System.out.println("Motor matic adalah jenis motor tanpa operan gigi manual ataupun kopling, hanya menggunakan gas,rem dan stang supaya motor bisa berjalan");
    }
    
    @Override
    public void deskripsi(int i){
        System.out.println("Data motor ada :" + i);  
    }   
}