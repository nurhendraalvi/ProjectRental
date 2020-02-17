package projectrental;

public class DataMobil extends DataTransaksi {
    private String Jenis;
    private String SQLInsert;
    
    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
    private String getJenis(){
        return Jenis;
    }
    
    public String QInputMobil(){
        SQLInsert = "insert into data_mobil values ('"+ getKode_M() +"','"+ getMerk_M() +"','"+ getJenis() +"','"+ getNoPol() +"','"+ getHarga() +"','Tersedia')";
        return SQLInsert;
    }
}
