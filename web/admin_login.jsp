<%@page import="java.sql.*" %>
<%    
    try{
    response.setContentType("text/html");
    
        String b= request.getParameter("e1");
        String c= request.getParameter("p1");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/p1","root","");
        PreparedStatement pst= con.prepareStatement("select * from admin_login where Email=?  and Password=?");

        pst.setString(1,b);
        pst.setString(2,c);
       ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
        session.setAttribute("em",rs.getString(1));
        response.sendRedirect("admin_dashboard.html");
        }
        else
            response.sendRedirect("adminerror.html");
              
        
    }
catch(Exception ett)
{
        response.sendRedirect("error.html");
}    
        
    
%>
