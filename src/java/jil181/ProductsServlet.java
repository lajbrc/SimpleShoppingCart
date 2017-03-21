/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jil181;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LJR
 */
public class ProductsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ArrayList<String[]> cart = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            // if users are not logged in, they are not allowed to view the shopping cart
            HttpSession session = request.getSession(false);
            if (session == null) {
                out.print("Please login first");
                request.getRequestDispatcher("index.html").include(request, response);
                return;
            } else {
                String name = (String) session.getAttribute("name");
                if (name == null) {
                    out.print("Please login first");
                    request.getRequestDispatcher("index.html").include(request, response);
                    return;
                } else {
                    out.print("Hello, " + name + ". Welcome to Shopping Cart!");
                    out.println("<hr>");
                }
            }

            int itemNum = 0; // the number of items in shopping cart
            float priceSum = 0; // the total price of all items in shopping cart
            String OOS = "OutOfStock";
            int pid = Integer.parseInt(request.getParameter("productId"));
            String[] bookInfo = ProductsDao.findProduct(pid);
            if (!OOS.equals(bookInfo[0])) {
                cart.add(bookInfo);
                session.setAttribute("result", cart);
            } else {
                out.println("<p>Sorry, this item is currently out of stock.</p>");
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Shopping Cart</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=\"3\" style=\"width:90%\">");
            out.println("<tr>");
            out.println("<th>Item Name</th>");
            out.println("<th>Price</th> ");
            out.println("<th>Description</th> ");
            out.println("<th>Quantity</th> ");
            out.println("<th></th>");
            out.println("</tr>");
            //bookInfo[0] ~ book name
            //bookInfo[1] ~ book price
            //bookInfo[2] ~ book description
//            out.println("<p>" + bookInfo[0] + "</p>");

            for (int i = 0; i < cart.size(); i++) {
                String[] itemInfo = cart.get(i);
//                if (!OOS.equals(itemInfo[0])) { //if the book is in stock
                float price = Float.valueOf(itemInfo[1]);
                itemNum++;
                priceSum = priceSum + price;
                out.println("<tr>");
                out.println("<td>" + itemInfo[0] + "</td>"); //name
                out.println("<td>" + itemInfo[1] + "</td>"); //price
                out.println("<td>" + itemInfo[2] + "</td>"); //description
                out.println("<td>1</td>");
                out.println("<td><form action=\"CartServlet\">");
                out.println("<input type=\"hidden\" name =\"arrayId\" value=" + i +">");
                out.println("<input type=\"submit\" value=\"Remove\"></form></td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("<p>Items: " + itemNum + "</p>");
            out.println("<p>Total price: " + priceSum + "</p>");
            out.println("<a href=\"products.jsp\">Continue Shopping</a>");
            out.println("</body>");
            out.println("</html>");

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
