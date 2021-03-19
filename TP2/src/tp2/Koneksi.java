/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author abighail
 */
public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){//koneksi database
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/db_mobil";//variabel untuk koneksi
                String user = "root";
                String pass = "";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Berhasil terhubung ke database");//jika koneksi berhasil
            }catch(SQLException e){
                System.out.println("Koneksi ke database gagal " + e.getMessage());//jika koneksi gagal
            }
        }
        return koneksi;
    }

    public static void main(String args[]){
        getKoneksi();
    }
}
