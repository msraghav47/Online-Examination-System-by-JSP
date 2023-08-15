<%@page import="java.sql.*" %>
<%
try
{
String a=request.getParameter("em");
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/p1","root","");
PreparedStatement pst=con.prepareStatement("delete from users where email=?");
pst.setString(1,a);
int u=pst.executeUpdate();
response.sendRedirect("showall.jsp");
}
catch(Exception et)
{
try
{
out.print(et);
}
catch(Exception er)
{

}
}
%>
