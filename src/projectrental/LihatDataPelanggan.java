package projectrental;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class LihatDataPelanggan extends JFrame {
    JTable tabel;
    JScrollPane scrollPane;
    
    DefaultTableModel model;

    public LihatDataPelanggan() {
        String[] kolom = {"Id Pelanggan", "No Identitas", "Nama", "Alamat", "No HP"};
        DBHelper b = new DBHelper();
        model = new DefaultTableModel(b.getDataPel(), kolom);
        
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("LIHAT DATA");
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(740, 500);
        
        add(scrollPane);
        
        scrollPane.setBounds(10,10,700,500);
        
        setVisible(true);
    }
}
