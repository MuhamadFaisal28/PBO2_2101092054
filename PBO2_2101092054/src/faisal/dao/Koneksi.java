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
 * @author ASUS
 */
public class Koneksi {
   private final String url ="jdbc:mysql://localhost/PBO2_2101092054" ;
   private final String username ="root";
   private final String password="";
   
   public Connection getKoneksi()throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       return DriverManager.getConnection(url,username,password);
   }
   
}
