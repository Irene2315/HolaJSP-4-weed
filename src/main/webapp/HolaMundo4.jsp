<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%
     /* se reciben los parametros nombre,apellido1,apellido2*/
     
     String nombre = (String) request.getAttribute("nombre");
     String apellido1 = (String) request.getAttribute("apellido1");
     String apellido2 = (String) request.getAttribute("apellido2");
     
     out.println(nombre +" "+apellido1+" "+apellido2);
     
  
     
     %>
     
     <br><br><br><br><br><br>
     <% out.println(nombre); %>
     <br><br>
     <% out.println(apellido1); %>
     <br><br>
     <% out.println(apellido2); %>
     <br>
</body>
</html>