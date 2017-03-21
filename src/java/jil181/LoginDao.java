/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jil181;

/**
 *
 * @author LJR
 */
import java.sql.*;

public class LoginDao {
    
//    static String un;
//    static String psq;

    //If the input username and password can be matched in database, return true, else return false.
    public static boolean validate(String username, String password) {
        boolean status = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/shopping_cart?zeroDateTimeBehavior=convertToNull", "root", "root");

            PreparedStatement ps = con.prepareStatement(
                    "select username, password from customers where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
            
//            un = rs.getString("username");
//            psq = rs.getString("password");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return status;
    }
    
//    public static void main(String[] args) {
//        boolean a = validate("aaa", "aaa");
//        System.out.println(un);
//        System.out.println(psq);
//    }

}
