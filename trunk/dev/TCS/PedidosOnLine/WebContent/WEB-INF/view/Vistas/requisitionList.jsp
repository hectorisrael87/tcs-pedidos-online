<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todos los Pedidos</title>
</head>
<body>
<h1>Listado de Pedidos</h1>

<c:if test="${!empty requisitions}">
	<table>
		<tr>
			<th>ID</th>
			<th>Fecha</th>
			<th>Ver Detalle de Pedido</th>
		</tr>

			<c:forEach items="${requisitions}" var="requisition">
			<tr>
		
				<td><c:out value="${requisition.requisitionId}"/></td>
				<td><c:out value="${requisition.requisitionDate}"/></td>
				<td><a href="listReqDetailByReq.html?id=<c:out value="${requisition.requisitionId}"/>">Ver Detalle</a></td>
			</tr>
		</c:forEach>
	</table>	
</c:if>
</body>
</html>