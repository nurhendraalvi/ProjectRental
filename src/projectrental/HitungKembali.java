package projectrental;


public class HitungKembali extends DataTransaksi {
    private int total, bayar, kembali, BayarDriver, total2;
    public void setTotal(int total){
        this.total = total;
    }
    public int Total(){
        return total;
    }
    public void setBayar(int bayar){
        this.bayar = bayar;
    }
    private int Bayar(){
        return bayar;
    }
    private int Driver(){
        BayarDriver = 500000;
        return BayarDriver;
    }
    public int TotalBD(){
        total2 = Total() + (Driver() * getLama());
        return total2;
    }
    public int KembaliTanpaDriver(){
        kembali = Bayar() - Total();
        return kembali;
    }
    public int KembaliDenganDriver(){
        kembali = Bayar() - TotalBD();
        return kembali;
    }
}
