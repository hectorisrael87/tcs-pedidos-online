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
<c:url var="saveRequisitionUrl" value="/requisitions/saveRequisition.html" />
<form:form modelAttribute="requisition"  method="POST" action="${saveRequisitionUrl}">
	<p>Presione en 'Abrir Pedido', para crear un nuevo pedido</p>
	<input type="submit" value="Abrir Pedido" />
</form:form>

</body>
</html>