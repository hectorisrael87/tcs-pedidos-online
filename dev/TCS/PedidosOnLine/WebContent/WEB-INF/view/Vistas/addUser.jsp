<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head><title>Agregar Articulo</title></head>
<body>
<h1>Agregar Articulo</h1>

<br />
<br />
<c:url var="saveUserUrl" value="save.html" />
<form:form modelAttribute="user" method="POST" action="${saveUserUrl}">
	<form:label path="username">Usuario:</form:label>
	<form:input path="username" />
	<br />
	<form:label path="password">Password:</form:label>
	<form:input path="password" />
	<br />
	<form:label path="firstName">Nombre:</form:label>
	<form:input path="firstName" />
	<br />
	<form:label path="lastName">Apellido:</form:label>
	<form:input path="lastName" />
	<br />	
	<p>Seleccione el tipo: </p>
	<form:select path="permission" id="permission">
	<form:option value="NONE" label="--- Seleccione ---"/>
    <form:options items="${permissions}" itemValue="permissionId" itemLabel="permissionName"/>
	</form:select>
	<form:checkbox path="valid" value="true"/>Valido
	<br />
	<input type="submit" value="Guardar Usuario" />
</form:form>

</body>
</html>