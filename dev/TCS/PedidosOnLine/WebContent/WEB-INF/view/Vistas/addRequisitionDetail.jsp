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
<c:url var="saveRequisitionDetailUrl" value="/requisitions/saveRequisitionDetail.html" />
<form:form modelAttribute="requisitiondetail"  method="POST" action="${saveRequisitionDetailUrl}">
	<form:label path="requisitionDetailTotal">Cantidad:</form:label>
	<form:input path="requisitionDetailTotal" />
	<p>Seleccione un pedido Abierto: </p>
	<form:select path="requisition" id="requisition">
	<form:option value="NONE" label="--- Seleccione ---"/>
    <form:options items="${requisitions}" itemValue="requisitionId" itemLabel="requisitionDate"/>
	</form:select>
	<br />
	<br />
	<p>Seleccione un Articulo: </p>
	<form:select path="article" id="article">
	<form:option value="NONE" label="--- Seleccione ---"/>
    <form:options items="${articles}" itemValue="articleId" itemLabel="articleName"/>
	</form:select> 
	<br />
	<br />
	<br />
	<input type="submit" value="Agregar detalle al pedido" />
</form:form>

</body>
</html>