public class Kopling extends DataMtr{
    private int KodeKopling;
    private String MerkKopling;
    private int HargaKopling; 
    
    
    public Kopling(String NamaMotor, int JumlahMotor, int KodeKopling, String MerkKopling, int HargaKopling ) {
        super(NamaMotor, JumlahMotor);
        this.KodeKopling = KodeKopling;
        this.HargaKopling = HargaKopling;
        this.MerkKopling = MerkKopling;
    }

    public Kopling(){}
    
    public int getKodeKopling() {
        return KodeKopling;
    }

    public void setKodeKopling(int KodeKopling) {
        this.KodeKopling = KodeKopling;
    }

    public String getMerkKopling() {
        return MerkKopling;
    }

    public void setMerkKopling(String MerkKopling) {
        this.MerkKopling = MerkKopling;
    }

    public int getHargaKopling() {
        return HargaKopling;
    }

    public void setHargaKopling(int HargaKopling) {
        this.HargaKopling = HargaKopling;
    }
    
    @Override
     public void deskripsi(){
        System.out.println("Motor kopling adalah jenis motor yang menggunakan operan gigi kopling");
    }
    
    @Override
    public void deskripsi(int i){
        System.out.println("Data motor ada :" + i);
    }
}