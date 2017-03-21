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

public class RemoveDao {

    //When you remove an item from shopping cart, the quantity of that item in database should +1
    public static void updateDB(String removeItem) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/shopping_cart?zeroDateTimeBehavior=convertToNull", "root", "root");

            PreparedStatement ps = con.prepareStatement("update products set quantity = quantity+1 where name=?");
            ps.setString(1, removeItem);
            
            ps.execute();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
}
