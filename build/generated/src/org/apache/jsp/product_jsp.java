package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;
import java.sql.DriverManager.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Untitled Document</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .name {\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 36px;\n");
      out.write("            }\n");
      out.write("            .gnrl {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .center1 {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .center1 table {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                font-size: x-large;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            normal {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("            normal {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("            normal {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("            normal {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            .right {\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            .norm {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <table width=\"993\" height=\"102\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"251\" height=\"96\"><img src=\"head.png\" width=\"251\" height=\"88\" alt=\"Logo\" /></td>\n");
      out.write("                <td width=\"726\" class=\"right\">24X7 Customer Support - <a href=\"contact.jsp\">Contact us</a> | <a href=\"main.jsp\">Home</a> |\n");
      out.write("                    ");
 if (session.getAttribute("uname") == null) {
                    
      out.write("\n");
      out.write("                    <a href=\"login.jsp\">Login</a>\n");
      out.write("                    ");
} else {
                    
      out.write("\n");
      out.write("                    <a href=\"logout.jsp\">Logout</a>\n");
      out.write("                    ");
}
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr />\n");
      out.write("        <p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");

                String pid = request.getParameter("product");
                String hname = "Grand";
                PreparedStatement ps;
                Connection con;
                ResultSet rs = null;
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sizgooml");

                Statement st = con.createStatement();
                ps = con.prepareStatement("select * from mtable where prod_id=?");
                ps.setString(1, pid);
                rs = ps.executeQuery();
                while (rs.next()) {
            
      out.write("\n");
      out.write("            <p class=\"name\">");
      out.print(rs.getString(3));
      out.write(' ');
      out.print(rs.getString(2));
      out.write(" </p>\n");
      out.write("            ");
}
                ps = con.prepareStatement("select * from pics where pic_id=?");
                ps.setString(1, pid);
                rs = ps.executeQuery();
                while (rs.next()) {
            
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <table width=\"997\" height=\"399\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"358\" class=\"center1\"><img src=");
      out.print(rs.getString(2));
      out.write(" width=\"200\" height=\"300\" alt=hname/></td>\n");
      out.write("                ");
}
                    ps = con.prepareStatement("select * from mtable where prod_id=?");
                    ps.setString(1, pid);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <td width=\"623\" class=\"center1\"><table width=\"466\" height=\"200\" border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td width=\"179\" class=\"center1\">Model Name :</td>\n");
      out.write("                            <td width=\"277\" class=\"normal\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"center1\">Brand :</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"center1\">Price :</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <p>\n");
      out.write("                        <form action=\"buy.jsp\"> \n");
      out.write("                            <input type=\"hidden\" name=\"name\" value=");
      out.print(pid);
      out.write("> \n");
      out.write("                                <input type=\"image\" src=\"tel-domain-buy-logo.jpg\" name=\"buy\" value=\"grand\"> \n");
      out.write("                                    </form></p></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <p class=\"gnrl\">GENERAL FEATURES</p>\n");
      out.write("                                    ");

                                        rs.close();
                                        ps = con.prepareStatement("select * from gnrl_specs where gs_id=?");
                                        ps.setString(1, pid);
                                        rs = ps.executeQuery();
                                    
      out.write("\n");
      out.write("                                    ");

                                        while (rs.next()) {
                                    
      out.write("\n");
      out.write("                                    <table width=\"630\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"127\" class=\"norm\">Form</td>\n");
      out.write("                                            <td width=\"493\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">SIM Type</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Touch Screen</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Keypad</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Sales Package</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <p class=\"gnrl\">\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from platform where plat_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        PLATFORM</p>\n");
      out.write("                                    <table width=\"629\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"127\" class=\"norm\">OS</td>\n");
      out.write("                                            <td width=\"492\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Java</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Processor</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <p class=\"gnrl\">\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from display where disp_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        DISPLAY</p>\n");
      out.write("                                    <table width=\"629\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"127\" class=\"norm\">Type</td>\n");
      out.write("                                            <td width=\"492\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Size</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Resolution</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Colors</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <p class=\"gnrl\">\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from camera where cam_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        CAMERA</p>\n");
      out.write("                                    <table width=\"628\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"126\" class=\"norm\">Primary</td>\n");
      out.write("                                            <td width=\"492\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Secondary</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Flash</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Video Recording</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Other Features</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <p>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from dimension where dim_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <span class=\"gnrl\">DIMENSION</span> </p><table width=\"627\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"125\" class=\"norm\">Size </td>\n");
      out.write("                                            <td width=\"486\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Weight</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from BATTERY where bat_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <span class=\"gnrl\">BATTERY</span> </p><table width=\"627\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"126\" class=\"norm\">Type</td>\n");
      out.write("                                            <td width=\"485\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Capacity</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from memory where mem_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <span class=\"gnrl\">MEMORY AND STORAGE</span> </p>\n");
      out.write("                                    <table width=\"627\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"125\" class=\"norm\">Internal</td>\n");
      out.write("                                            <td width=\"486\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">RAM</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Expandable</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <p>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from netNconn where net_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <span class=\"gnrl\">INTERNET AND CONNECTIVITY</span> \n");
      out.write("                                    </p>\n");
      out.write("                                    </p>\n");
      out.write("                                    <table width=\"627\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"127\" class=\"norm\">GPRS</td>\n");
      out.write("                                            <td width=\"484\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">EDGE</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">3G</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">WiFi</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">USB Connectivity</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Tethering</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Navigation</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Bluetooth</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Audio Jack</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">DLNA</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(11));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from MULTIMEDIA where media_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <span class=\"gnrl\">MULTIMEDIA</span> </p>\n");
      out.write("                                    <table width=\"627\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"127\" class=\"norm\">Music Player</td>\n");
      out.write("                                            <td width=\"484\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Video Player</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">FM</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        ");

                                            rs.close();
                                            ps = con.prepareStatement("select * from OTHERS where other_id=?");
                                            ps.setString(1, pid);
                                            rs = ps.executeQuery();
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <span class=\"gnrl\">OTHERS</span> </p>\n");
      out.write("                                    <table width=\"627\" border=\"1\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"141\" class=\"norm\">SAR value</td>\n");
      out.write("                                            <td width=\"476\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Sensors</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"norm\">Additional Features</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    </body>\n");
      out.write("                                    </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
