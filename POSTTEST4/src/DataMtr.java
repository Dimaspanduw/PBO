public class DataMtr {
    private String NamaMotor;
    private int JumlahMotor;

    public DataMtr(String NamaMotor, int JumlahMotor) {
        this.NamaMotor = NamaMotor;
        this.JumlahMotor = JumlahMotor;
    }

    public DataMtr(){}
    
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

    
    @Override
    public String toString(){
        return "Nama Motor :" + NamaMotor + "Jumlah Motor :" + JumlahMotor ;
    }
    
    public void deskripsi(){
        System.out.println("Motor sangat berfungsi untuk kebutuhan sehari hari");
    }
    
    public void deskripsi(int i){
        System.out.println("Data motor ada :" + i);
    }
}


