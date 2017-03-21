## A Simple Shopping Cart

This is a simple shopping cart which allows users to login, logout, view products, add product to shopping cart, and remove product from shopping cart.

IDE: NetBeans 8.1    
Server: GlassFish 4.1    
Database: MySQL

### Database

I created a database shopping_cart which contains two table, customers and products.

Database shopping_cart
![db_shopping_cart](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/db_shopping_cart.png?raw=true)

Table customers
![table_customers_structure](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/table_customers_structure.png)
![table_customers_contents](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/table_customers_content.png)

Table products
![table_products_structure](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/table_products_structure.png)
![table_products_contents](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/table_products_contents.png)

### Login

You can log in with username “aaa” and password “aaa” or username “bbb” and password “bbb”. If you input an invalid username or password, you would not be able to log in and an error message will display in the login page.
![fail_to_login](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/fail%20to%20login.png)

When you successfully to login, you will be able to view the products page.
![products_page](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/products%20page.png)

### Logout

When you click the "logout" on the top left of the page, you will jump to the login page and you can see a message “You are successfully logged out!”.
![logout](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/logout.png)

If you are in a logout status, next time when you directly view the products page, you are unable view the shopping cart. If you want to add something to cart, you will be directed to the login page and you will see a message “Please login first”.
![login_first](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/please%20login%20first.png)

### Add product to shopping cart

When you are in the login status to view the products page, you will be able to add product to the shopping cart by simply clicking on “Add to cart” button. And in the cart page, you can see the total number and total price of the added items.
![shopping_cart](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/shopping%20cart.png)

Each time you add a product to shopping cart, the servlet “ProductsServlet” will be called and it will call the function “findProduct” in ProductDao.java, this function will decide if the item you want to add is still in stock. If the item is in stock, then the item will be added to the cart and the quantity of the item will minus one, otherwise, the items in cart will not change, and there will be a message “Sorry, this item is currently out of stock”.
![out_of_stock](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/item%20not%20in%20stock.png)

### Remove product from shopping cart

You can remove a product from shopping cart by simply clicking on the “Remove” button, when you remove an item, the number and price of current items in cart will be recalculated and updated. The quantity of the removed item in database will add one.
![remove](https://github.com/lajbrc/SimpleShoppingCart/blob/master/Screenshots/after%20remove.png)

### Problems

1. GlassFish Server cannot create new JDBC Resources/JDBC Connection Pools.    
If you are using GlassFish Server 4.1.1, change it to lower version.
I changed my server to GlassFish 4.1 and problem solved.

2. New JDBC Resource does not show in the Server Resources folder.    
Move the glassfish-resources.xml file from Configuration Files folder to Server Resources folder.

### Something that need to improve

1. I should also save the product id into the product information, so that the remove function or update function can be less error-prone because the product id is the primary key in database.
2. Checkout function.
3. I should merge the same product together in shopping cart and develop an update function.
4. The interface.

### Some useful tutorials

1. Connecting to a MySQL Database    
https://netbeans.org/kb/docs/ide/mysql.html
2. Creating a Simple Web Application Using a MySQL Database    
https://netbeans.org/kb/docs/web/mysql-webapp.html#planStructure
3. Example of Login Form in Servlet Tutorial    
http://www.javatpoint.com/example-of-login-form-in-servlet
4. How To Create A Simple Login Form Using Java Servlet And MySQL DB    
http://www.lionblogger.com/how-to-create-a-simple-login-form-using-java-servlet-and-mysql-db/
5. Page Jump    
http://www.cnblogs.com/aszx0413/articles/1886819.html
6. Servlet HttpSession Login and Logout Example    
http://www.javatpoint.com/servlet-http-session-login-and-logout-example
7. JSP Login Logout Example    
http://www.roseindia.net/jsp/jsp-login-logout-example.shtml
8. session.getAttribute() in JSP is giving null value    
http://stackoverflow.com/questions/17274775/session-getattribute-in-jsp-is-giving-null-value
9. Use of HttpSession    
https://tomcat.apache.org/tomcat-5.5-doc/servletapi/javax/servlet/http/HttpSession.html
10. Differences of JDBC getNString() and getString()    
http://stackoverflow.com/questions/5892163/should-i-be-using-jdbc-getnstring-instead-of-getstring
11. Retrieving and Modifying Values from Result Sets    
https://docs.oracle.com/javase/tutorial/jdbc/basics/retrieving.html
12. Interface PreparedStatement    
http://docs.oracle.com/javase/7/docs/api/java/sql/PreparedStatement.html
