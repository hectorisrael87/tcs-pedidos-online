<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todos las Marcas</title>
</head>
<body>
<h1>Listado de Marcas</h1>

<c:if test="${!empty brands}">
	<table>
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Descripcion</th>
			<th>Articulos</th>
		</tr>

			<c:forEach items="${brands}" var="brand">
			<tr>
		
				<td><c:out value="${brand.brandId}"/></td>
				<td><c:out value="${brand.brandName}"/></td>
				<td><c:out value="${brand.brandDesc}"/></td>
				<td><a href="articles/listArticleByBrand.html?id=<c:out value="${brand.brandId}"/>">Ver listados de Articulos</a></td>
			</tr>
		</c:forEach>
	</table>	
</c:if>
</body>
</html>