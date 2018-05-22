/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Yosyafat
 */
public class Config {
    Connection conn;
    Statement stmt;
    public void configDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/atm", "root", "");
            stmt = conn.createStatement();
        } catch (Exception e){
            System.err.println("Koneksi Gagal");            
        }
        
    }
}
