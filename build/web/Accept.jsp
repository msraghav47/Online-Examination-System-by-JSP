<%@page import="java.sql.*" %>
<% 
    String a = request.getParameter("N1");
    String b = request.getParameter("E1");
    String c = request.getParameter("PS1");
    String d = request.getParameter("P1");
    String e = request.getParameter("PH1");
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/p1","root","");
PreparedStatement pst=con.prepareStatement("insert into users values(?,?,?,?,?)");
pst.setString(1,a);
pst.setString(2,b);
pst.setString(3,c);
pst.setString(4,d);
pst.setString(5,e);
int u=pst.executeUpdate();
if(u>0)
response.sendRedirect("UserLogin.html");
else
response.sendRedirect("Registererror.html");
%>