package projectrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBHelper {
    String DB_URL = "jdbc:mysql://localhost/apsrental";
    String USER = "root";
    String PASS = "";
    Connection koneksi;
    Statement stmt;
     public void addMobilMasuk(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = sql;
            stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            koneksi.close();
             JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }
    public String[][] getDataMobil() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "select * from data_mobil";
            stmt = koneksi.createStatement();

            ResultSet hasilQuery = stmt.executeQuery(query);
            String[][] data = new String[500][6];
            int i = 0;
            while (hasilQuery.next()) {
                data[i][0] = hasilQuery.getString("kode_mobil");
                data[i][1] = hasilQuery.getString("merk_mobil");
                data[i][2] = hasilQuery.getString("jenis_mobil");
                data[i][3] = hasilQuery.getString("nopol");
                data[i][4] = hasilQuery.getString("harga");
                data[i][5] = hasilQuery.getString("keterangan");
                i++;
            }

            koneksi.close();
            stmt.close();
            hasilQuery.close();
            return data;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    public void setDataPel(String sql2) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = sql2;
            stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            koneksi.close();
             JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }
    public String[][] getDataPel() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "select * from data_pelanggan";
            stmt = koneksi.createStatement();

            ResultSet hasilQuery = stmt.executeQuery(query);
            String[][] data = new String[500][5];
            int i = 0;
            while (hasilQuery.next()) {
                data[i][0] = hasilQuery.getString("id_pel");
                data[i][1] = hasilQuery.getString("no_id");
                data[i][2] = hasilQuery.getString("nama");
                data[i][3] = hasilQuery.getString("alamat");
                data[i][4] = hasilQuery.getString("no_hp");
                i++;
            }

            koneksi.close();
            stmt.close();
            hasilQuery.close();
            return data;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    public void setDataDriver(String sql3) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = sql3;
            stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            koneksi.close();
             JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }
    public String[][] getDataDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "select * from data_driver";
            stmt = koneksi.createStatement();

            ResultSet hasilQuery = stmt.executeQuery(query);
            String[][] data = new String[500][4];
            int i = 0;
            while (hasilQuery.next()) {
                data[i][0] = hasilQuery.getString("id_driver");
                data[i][1] = hasilQuery.getString("nama_driver");
                data[i][2] = hasilQuery.getString("kategori");
                data[i][3] = hasilQuery.getString("keterangan");
                i++;
            }

            koneksi.close();
            stmt.close();
            hasilQuery.close();
            return data;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    public void setDataTransaksi(String sql4) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = sql4;
            stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            koneksi.close();
             JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }
    public String[][] getDataTransaksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "select * from data_transaksi";
            stmt = koneksi.createStatement();

            ResultSet hasilQuery = stmt.executeQuery(query);
            String[][] data = new String[500][11];
            int i = 0;
            while (hasilQuery.next()) {
                data[i][0] = hasilQuery.getString("no_sewa");
                data[i][1] = hasilQuery.getString("id_pel");
                data[i][2] = hasilQuery.getString("tgl_sewa");
                data[i][3] = hasilQuery.getString("lama_sewa");
                data[i][4] = hasilQuery.getString("tgl_kembali");
                data[i][5] = hasilQuery.getString("kode_mobil");
                data[i][6] = hasilQuery.getString("merk_mobil");
                data[i][7] = hasilQuery.getString("nopol");
                data[i][8] = hasilQuery.getString("harga");
                data[i][9] = hasilQuery.getString("id_driver");
                data[i][10] = hasilQuery.getString("nama_driver");
                i++;
            }

            koneksi.close();
            stmt.close();
            hasilQuery.close();
            return data;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    public void UpdateMobil(String upData1) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(upData1);
            stmt.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "data gagal di UPDATE");
        }
    }
    public void UpdateDriver(String upData2) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(upData2);
            stmt.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "data gagal di UPDATE");
        }
    }
    public void UpdateTransaksi(String upData3) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = koneksi.createStatement();
            stmt.executeUpdate(upData3);
            stmt.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "data gagal di UPDATE");
        }
    }
}
