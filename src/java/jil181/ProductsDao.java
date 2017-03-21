/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jil181;

import java.sql.*;

/**
 *
 * @author LJR
 */
public class ProductsDao {

    static int qty;
    static String bookName;
    static String bookPrice;
    static String bookDescription;

    public static String[] findProduct(int pid) {
        String[] bookInfo = new String[3];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/shopping_cart?zeroDateTimeBehavior=convertToNull", "root", "root");

            //Get the information of selected product
            PreparedStatement ps1 = con.prepareStatement(
                    "select name, price, description from products where id=?");
            ps1.setInt(1, pid);

            //Get the quantity of selected product
            PreparedStatement ps2 = con.prepareStatement(
                    "select quantity from products where id=?");
            ps2.setInt(1, pid);

            //Update quantity
            PreparedStatement ps3 = con.prepareStatement(
                    "update products set quantity = quantity-1 where id=?");
            ps3.setInt(1, pid);

            ResultSet rs1 = ps1.executeQuery(); //name, price, description
            ResultSet rs2 = ps2.executeQuery(); //quantity
            
            //move the cursor to first row so that we can get the values
            while (rs1.next()){
                bookName = rs1.getString("name");
                bookPrice = rs1.getString("price");
                bookDescription = rs1.getString("description");
            }
            
            while (rs2.next()) {
                qty = rs2.getInt("quantity");
            }
            
            if (qty > 0) {
                bookInfo[0] = bookName;
                bookInfo[1] = bookPrice;
                bookInfo[2] = bookDescription;
                ps3.execute();
            } else {
                bookInfo[0] = "OutOfStock";
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return bookInfo;
    }
    
//Test
//    public static void main(String[] args) {
//        
//        String[] test = findProduct(1);
//        System.out.println(qty);
//        System.out.println(bookName);
//        System.out.println(bookPrice);
//        System.out.println(bookDescription);
//        System.out.println(test[0]);
//    }

}
