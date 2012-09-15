<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head><title>Agegar Marca</title></head>
<body>
<h1>Agregar Marca</h1>

<c:url var="viewBrandsUrl" value="/brands.html" />
<a href="${viewBrandsUrl}">Ver todos las marcas</a>

<br />
<br />
<c:url var="saveBrandUrl" value="/brands/save.html" />
<form:form modelAttribute="brand" method="POST" action="${saveBrandUrl}">
	<form:label path="brandName">Nombre:</form:label>
	<form:input path="brandName" />
	<br />
	<form:label path="brandDesc">Descripcion:</form:label>
	<form:textarea path="brandDesc" />
	<br />
	<input type="submit" value="Guardar Marca" />
</form:form>

</body>
</html>