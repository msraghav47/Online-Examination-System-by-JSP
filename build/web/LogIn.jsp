<%@ page import = "java.sql.*" %>

<%
   String a = request.getParameter("e1");
   String b = request.getParameter("p1");
   Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/p1","root","");
   PreparedStatement pst = con.prepareStatement("select * from users where Email=? and Password=?");
   pst.setString(1,a);
   pst.setString(2,b);
   ResultSet rs=pst.executeQuery();
if(rs.next())
{
    session.setAttribute("na",rs.getString(1));
    
    response.sendRedirect("well.jsp"); 
}
else
{
    response.sendRedirect("userloginerror.html");
}
%>