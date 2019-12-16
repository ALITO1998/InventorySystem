/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DBConnection {

    static Connection con ;
    static Statement st;
    static ResultSet rs;
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull","root","");
        st = con.createStatement();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Connection error", 0);
        }
    }
    
    public static boolean login(String id,String pass,String q ){
        rs = null;
        try {
            
            rs = st.executeQuery(q);
            while (rs.next()) {
                String a = rs.getString("id");
                String b = rs.getString("passWord");
                if(id.equals(a)&&pass.equals(b)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            return false;
        }
        return false;
        }
    public static void control (String q){
        try {
            st.execute(q);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error!!!!!!!!هناك خطأ يا أهبل", 1);
        }
    }
}
