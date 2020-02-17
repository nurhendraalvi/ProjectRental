package projectrental;

import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class LihatDataTransaksi extends JFrame {
    JTable tabel;
    JScrollPane scrollPane;
    
    DefaultTableModel model;

    public LihatDataTransaksi() {
        String[] kolom = {"No. Sewa", "Id Pelanggan", "Tanggal Sewa", "Lama Sewa", "Tanggal Kembali", "Kode Mobil", "Merk Mobil", "No. Polisi", "Harga", "Id Driver", "Nama Driver"};
        DBHelper b = new DBHelper();
        model = new DefaultTableModel(b.getDataTransaksi(), kolom);
        
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("LIHAT DATA");
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1100, 500);
        
        add(scrollPane);
        
        scrollPane.setBounds(20,20,1000,500);
        
        setVisible(true);
    }
}
