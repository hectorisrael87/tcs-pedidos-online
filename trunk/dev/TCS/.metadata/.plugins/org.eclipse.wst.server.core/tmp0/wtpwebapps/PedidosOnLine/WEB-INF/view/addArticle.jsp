<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head><title>Agregar Articulo</title></head>
<body>
<h1>Agregar Articulo</h1>

<c:url var="viewArticlesUrl" value="/articles.html" />
<a href="${viewArticlesUrl}">Ver todos los articulos</a>

<br />
<br />
<c:url var="saveArticleUrl" value="/articles/save.html" />
<form:form modelAttribute="article" method="POST" action="${saveArticleUrl}">
	<form:label path="articleName">Nombre:</form:label>
	<form:input path="articleName" />
	<br />
	<form:label path="articleBrand">Marca:</form:label>
	<form:input path="articleBrand" />
	<br />
	<form:label path="articlePrice">Precio:</form:label>
	<form:input path="articlePrice" />
	<br />
	<form:label path="articleDesc">Descripcion:</form:label>
	<form:textarea path="articleDesc" />
	<br />
	<input type="submit" value="Guardar Articulo" />
</form:form>

</body>
</html>