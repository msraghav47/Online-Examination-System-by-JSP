package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class showall_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title> User_dashboard </title>\n");
      out.write("\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Rubik:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons+Outlined\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin_dashboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"quaries.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <menu>\n");
      out.write("        <p class=\"heading-pri\"> Complete details of users </p>\n");
      out.write("    </menu>\n");
      out.write("    <section class=\"index\">\n");
      out.write("        <h1 class=\"admin-logo\"> Online Examination System </h1>\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"admin_dashboard.html\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"home-outline\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"Home.html\" class=\"index-item\">Home</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"admin_dashboard.html\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"home-outline\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"admin_dashboard.html\" class=\"index-item\">Admin Dashboard</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"admin_login.html\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"log-out-outline\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"admin_login.html\" class=\"index-item\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");

    Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/p1","root","");
PreparedStatement pst=con.prepareStatement("select * from users");
ResultSet rs=pst.executeQuery();
out.print("<table border='1' height='100' width='800'>");
out.print("<tr><td>Fullname</td><td>Email</td><td>Password</td><td>Confirm Password</td><td>Phone Number</td><td>Change</td></tr>");
while(rs.next())
{
out.print("<tr>");
out.print("<td>"+rs.getString(1)+"</td>");
out.print("<td>"+rs.getString(2)+"</td>");
out.print("<td>"+rs.getString(3)+"</td>");
out.print("<td>"+rs.getString(4)+"</td>");
out.print("<td>"+rs.getString(5)+"</td>");
out.print("<td><a href=dell.jsp?em="+rs.getString(2)+">Delete</a></td>");
out.print("</tr>");
}

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
