<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Detalle de pedido</title>
</head>
<body>
<h1>Listado de detalle de pedido- Segun Pedido</h1>

<c:if test="${!empty requisitionsDetail}">
	<table>
		<tr>
			<th>ID DETALLE PEDIDO:</th>
			<th>FECHA DEL DETALLE:</th>
			<th>PEDIDO ID:</th>
			<th>MARCA</th>
			<th>NOMBRE ARTICULO</th>
			<th>PRECIO</th>
			<th>CANTIDAD:</th>
		</tr>

		<c:forEach items="${requisitionsDetail}" var="requisitionDetail">
			<tr>
			 	<td><c:out value="${requisitionDetail.requisitionDetailID}"/></td>
				<td><c:out value="${requisitionDetail.requisitionDetailDate}"/></td>
			 	<td><c:out value="${requisitionDetail.requisition.requisitionId}"/></td>
			 	<td><c:out value="${requisitionDetail.article.articleBrand.brandName}"/></td>
				<td><c:out value="${requisitionDetail.article.articleName}"/></td>
				<td><c:out value="${requisitionDetail.article.articlePrice}"/></td>
				<td><c:out value="${requisitionDetail.requisitionDetailTotal}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>