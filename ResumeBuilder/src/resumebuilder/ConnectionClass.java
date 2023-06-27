/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resumebuilder;
import java.sql.*;
/** 
 *
 * @author HP
 */
public class ConnectionClass {
  

    Connection con;
    Statement stm;

    ConnectionClass() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume", "root", "sanchit123");
            stm = con.createStatement();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
        new ConnectionClass();
        System.out.println("hello");
    }
}


