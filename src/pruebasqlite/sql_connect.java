/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Araceli
 */
public class sql_connect {
    Connection cin=null;
    public static Connection COnncrDB(){
      try{
          Class.forName("org.sqlite.JDBC");
          Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Araceli\\Documents\\NetBeansProjects\\pruebasqlite\\coleccion.sqlite");
          JOptionPane.showMessageDialog(null,"A conexión está establecida");
          return con;
      }  catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          return null;
      }
    }
    
    
}
