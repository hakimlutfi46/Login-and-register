package miniproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ROG
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Config {

    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
    
        try {
        String url ="jdbc:mysql://localhost:3307/data_mhs";
        String user = "root";
        String pass = "";
        
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        }catch (Exception e){
        System.err.println("Koneksi Gagal "+ e.getMessage());
        
        }
        return mysqlconfig;
    }

}  

    
    
    
//    public static Connection con;
//    public static Statement stm;
//    public static void main(String args[]){
//        try {
//            String url ="jdbc:mysql://localhost:3307/data_mhs";
//            String user="root";
//            String pass="";
//            Class.forName("com.mysql.jdbc.Driver");
//            con =DriverManager.getConnection(url,user,pass);
//            stm = con.createStatement();
//            System.out.println("koneksi berhasil;");
//        } catch (Exception e) {
//            System.err.println("koneksi gagal " +e.getMessage());
//        }
//    }
//}
