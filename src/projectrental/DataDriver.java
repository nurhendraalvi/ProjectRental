package projectrental;

public class DataDriver extends DataTransaksi {
    private String  kategori;
    private String SQLInput;
    
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    private String getKategori(){
        return kategori;
    }
    public String QIDriver(){
        SQLInput = "insert into data_driver values ('"+ getID_D() +"','"+ getNama_D() +"','"+ getKategori() +"','Tersedia')";
        return SQLInput;
    }
}
