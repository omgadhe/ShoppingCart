<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.inautix.ProjectDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shop1</title>
</head>
<body>
<% 
String sql="Select * from Shop1";
ProjectDAO pd=new ProjectDAO();
Statement stmt=pd.database().createStatement();
ResultSet rs=stmt.executeQuery(sql);
%>
<table>
<tr>
<th></th>
</tr>
<%while(rs.next()) {%>
<tr>
<td><%rs.getString(1); %></td>
<td><%rs.getString(2); %></td>
<td><%rs.getString(3); %></td>
<td><%rs.getString(4); %></td>
<td><%rs.getString(5); %></td>
<td><a href="Cart?action=add&id=<%rs.getString(1);%>&name=<%rs.getString(2);%>&desc=<%rs.getString(3);%>&quantity=<%rs.getString(4);%>&unitPrice=<%rs.getString(5);%>">Add to Cart</a></td>
</tr>
<%} %>
</table>
</body>
</html>