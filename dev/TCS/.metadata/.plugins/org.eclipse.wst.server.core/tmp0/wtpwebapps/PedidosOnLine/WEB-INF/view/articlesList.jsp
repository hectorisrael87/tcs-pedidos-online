<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todos los Articulos</title>
</head>
<body>
<h1>Listado de articulos</h1>

<c:if test="${!empty articles}">
	<table>
		<tr>
			<th>Article ID</th>
			<th>Nombre</th>
			<th>Marca</th>
			<th>Precio</th>
			<th>Descripcion</th>
		</tr>

		<c:forEach items="${articles}" var="article">
			<tr>
				<td><c:out value="${article.articleId}"/></td>
				<td><c:out value="${article.articleName}"/></td>
				<td><c:out value="${article.articleBrand}"/></td>
				<td><c:out value="${article.articlePrice}"/></td>
				<td><c:out value="${article.articleDesc}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>