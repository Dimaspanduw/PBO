package dim.posttest3;

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

  
   
}
