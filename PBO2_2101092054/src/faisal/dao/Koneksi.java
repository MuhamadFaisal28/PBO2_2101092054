/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faisal.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author User
 */
public class Koneksi {
    private String url = "jdbc:mysql://localhost/pbo2_2101092054";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }

   
}

