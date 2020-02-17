package projectrental;

public class DataPelanggan extends DataTransaksi {
    private String no_id, nama, alamat, no_hp;
    private String SQLInput;
    public void setNoId(String no_id){
        this.no_id = no_id;
    }
    private String getNoId(){
        return no_id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    private String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    private String getAlamat(){
        return alamat;
    }
    public void setNoHP(String no_hp){
        this.no_hp = no_hp;
    }
    private String getNoHP(){
        return no_hp;
    }
    public String QIDataPel(){
        SQLInput = "insert into data_pelanggan values ('"+ getID() +"','"+ getNoId() +"','"+ getNama() +"','"+ getAlamat() +"','"+ getNoHP() +"')";
        return SQLInput;
    }
}
