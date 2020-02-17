package projectrental;

public class DataTransaksi {
    private int lama_sewa;
    private String no_sewa, id_pel, tgl_sewa, tgl_kembali;
    private String kode_mobil, merk_mobil, nopol, harga;
    private String id_driver, nama_driver;
    private String SQLInput, SQLUpdate_M, SQLUpdate_D, SQLUpdate_Transaksi;
    public void setNo_Sewa(String no_sewa){
        this.no_sewa = no_sewa;
    }
    private String getNo_Sewa(){
        return no_sewa;
    }
    public void setID(String id_pel){
        this.id_pel = id_pel;
    }
    public String getID(){
        return id_pel;
    }
    public void setTGL_Sewa(String tgl_Sewa){
        this.tgl_sewa = tgl_Sewa;
    }
    private String getTGL_Sewa(){
        return tgl_sewa;
    }
    public void setTGL_KML(String tgl_kembali){
        this.tgl_kembali = tgl_kembali;
    }
    private String getTGL_KML(){
        return tgl_kembali;
    }
    public void setLama(int Lama_Sewa){
        this.lama_sewa = Lama_Sewa;
    }
    public int getLama(){
        return lama_sewa;
    }
    public void setKode_M(String Kode_Mobil){
        this.kode_mobil = Kode_Mobil;
    }
    public String getKode_M(){
        return kode_mobil;
    }
    public void setMerk_M(String Merk_Mobil){
        this.merk_mobil = Merk_Mobil;
    }
    public String getMerk_M(){
        return merk_mobil;
    }
    public void setNoPol(String nopol){
        this.nopol = nopol;
    }
    public String getNoPol(){
        return nopol;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public String getHarga(){
        return harga;
    }
    public void setID_D(String id_driver){
        this.id_driver = id_driver;
    }
    public String getID_D(){
        return id_driver;
    }
    public void setNama_D(String nama_driver){
        this.nama_driver = nama_driver;
    }
    public String getNama_D(){
        return nama_driver;
    }
    public String QITransaksiWDriver(){
        SQLInput = "insert into data_transaksi values ('"+ getNo_Sewa() +"','"+ getID() +"','"+ 
                getTGL_Sewa()+"','"+ getLama() +"','Baru Sewa','"+ getKode_M() +"','"+ getMerk_M() +"','"+ 
                getNoPol() +"','"+ getHarga() +"','"+ getID_D() +"','"+ getNama_D() +"')";
        return SQLInput;
    }
    public String QITransaksi(){
        SQLInput = "insert into data_transaksi values ('"+ getNo_Sewa() +"','"+ getID() +"','"+ 
                getTGL_Sewa()+"','"+ getLama() +"','Baru Sewa','"+ getKode_M() +"','"+ getMerk_M() +"','"+ 
                getNoPol() +"','"+ getHarga() +"','tidak dengan driver','tidak dengan driver')";
        return SQLInput;
    }
    public String QUM(){
        SQLUpdate_M =  "UPDATE data_mobil SET keterangan = 'Tidak Tersedia' WHERE kode_mobil = '"+ getKode_M() +"'";
        return SQLUpdate_M;
    }
    public String QUD(){
        SQLUpdate_D =  "UPDATE data_driver SET keterangan = 'sedang bertugas' WHERE id_driver = '"+ getID_D() +"'";
        return SQLUpdate_D;
    }
    public String QUT(){
        SQLUpdate_Transaksi = "UPDATE data_transaksi set tgl_kembali = '"+ getTGL_KML() +"' WHERE no_sewa = '"+ getNo_Sewa() +"'";
        return SQLUpdate_Transaksi;
    }
    public String QUM2(){
        SQLUpdate_M =  "UPDATE data_mobil SET keterangan = 'Tersedia' WHERE kode_mobil = '"+ getKode_M() +"'";
        return SQLUpdate_M;
    }
    public String QUD2(){
        SQLUpdate_D =  "UPDATE data_driver SET keterangan = 'Tersedia' WHERE id_driver = '"+ getID_D() +"'";
        return SQLUpdate_D;
    }
}
