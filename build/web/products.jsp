<%-- 
    Document   : products
    Created on : Mar 1, 2017, 10:57:17 PM
    Author     : LJR
--%>

<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
        <style type="text/css">
            table {
                background-color: #cdf4ec;
            }
        </style>
    </head>
    <body>
        <!--        <img src="images/title.png" alt="logo" width="440" height="160">-->
        <div class="status">
            <% if (session.getAttribute("name") == null) {
            %>
            <a href="index.html">Login</a>
            <%} else {
            %>
            <p>Welcome</p>
            <a href="LogoutServlet">Logout</a>
            <%}%>
        </div>
    <center>
        <h2>Find Your Favorite Books!</h2>
        <table border="3" style="width:90%">
            <tr>
                <th>Book Name</th>
                <th>Author</th> 
                <th>Price</th>
                <th>Description</th>
                <th></th>
            </tr>
            <tr>
                <td>Foundations of Algorithms</td>
                <td>Richard E. Neapolitan</td>
                <td>145.56</td>
                <td>Condition: new.</td>
                <td>
                    <form action="ProductsServlet">
                        <input type="hidden" name ="productId" value="1">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
            <tr>
                <td>Professional Web 2.0 Programming</td>
                <td>Eric van der Vlist</td>
                <td>14.3</td>
                <td>Condition: good.</td>
                <td>
                    <form action="ProductsServlet">
                        <input type="hidden" name ="productId" value="2">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
            <tr>
                <td>e-Business 2.0</td>
                <td>Ravi Kalakota and Marcia Robinson</td>
                <td>3.9</td>
                <td>Condition: good.</td>
                <td>
                    <form action="ProductsServlet">
                        <input type="hidden" name ="productId" value="3">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
            <tr>
                <td>Interactive System Design</td>
                <td>William M. Newman and Michael G. Lamming</td>
                <td>20.5</td>
                <td>Condition: like new.</td>
                <td>
                    <form action="ProductsServlet">
                        <input type="hidden" name ="productId" value="4">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
            <tr>
                <td>Interaction Design</td>
                <td>Jenny Preece, Yvonne Rogers, Helen Sharp</td>
                <td>6.85</td>
                <td>Condition: very good.</td>
                <td>
                    <form action="ProductsServlet">
                        <input type="hidden" name ="productId" value="5">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
        </table>
    </center>
</body>
</html>
