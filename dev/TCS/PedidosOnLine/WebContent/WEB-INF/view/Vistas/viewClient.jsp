<%@page import="com.tcs.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%

User user = (User) session.getAttribute("usuario");

%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido al sistema de pedidos OnLine</title>
</head>
<body>

	<p>Bienvenido <%=user.getFirstName() %></p>


	<h3>MENU:</h3>
	<a href="articles/list.html">Ver listado de Articulos</a>
	<a href="brands/list.html">Ver listado de Marcas</a>
	<a href="requisitions/addRequisition.html">Crear Pedido</a>
	<a href="requisitions/addReqDetail.html">Agregar Detalle al Pedido</a>
	
	<a href="logout.html">Cerrar Sesion</a>
	<a href="logout.html?id=<c:out value=<%session.invalidate(); %>/>">Ver listados de Articulos</a>
</body>
</html>