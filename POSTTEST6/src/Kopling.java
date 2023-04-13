public final class Kopling extends DataMtr implements Admin{
    private int KodeKopling;
    private String MerkKopling;
    private int HargaKopling; 
    
    public final String jenis ="Motor Kopling";

    public Kopling(String NamaMotor, int JumlahMotor, int KodeKopling, String MerkKopling, int HargaKopling ) {
        super(NamaMotor, JumlahMotor);
        this.KodeKopling = KodeKopling;
        this.HargaKopling = HargaKopling;
        this.MerkKopling = MerkKopling;
    }

    
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
       System.out.println("Kode Motor   : " + KodeKopling);
       System.out.println("Merk Motor   : " + MerkKopling);
       System.out.println("Harga Motor  : " + HargaKopling);
       System.out.println("--------------------------------");
       System.out.println("Kontak Admin :" + Kontak() );
       System.out.println("Alamat Admin :" + Alamat());

    }
    @Override
    public String Kontak(){
        return "081384725198";
    }
    @Override
    public String Alamat(){
        return "Samarinda";
    }   

}