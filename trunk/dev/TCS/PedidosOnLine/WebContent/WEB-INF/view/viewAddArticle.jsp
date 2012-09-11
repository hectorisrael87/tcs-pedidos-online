<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ include file="include-head.html"%>



<body>
	<!-- loading animation -->
	<div id="qLoverlay"></div>
	<div id="qLbar"></div>

	<%@ include file="include-header.html"%>
	<div id="wrapper">
		<!--Sidebar background-->
		<div id="sidebarbg"></div>

		<%@ include file="include-sidebar.html"%>


		<!--Body content-->
		<div id="content" class="clearfix">
			<div class="contentwrapper">
				<!--Content wrapper-->

				<div class="heading">
					<h3>Agregar Articulos</h3>
				</div>
				<!-- End .heading-->

				<!-- Build page from here: -->
				<div class="row-fluid">
					<div class="span12">

						<!-- COMIENZO LISTADO TABLA DE ARTICULOS -->


						<div class="box">

							<div class="title">

								<h4>
									<span class="icon16 brocco-icon-grid"></span> <span>Ingrese
										aqui los datos del articulo</span>
								</h4>

							</div>
							<div class="content">

								<c:url var="saveArticleUrl" value="saveArticle.html" />
								<form:form class="form-horizontal" modelAttribute="article"
									id="addArticleForm" method="POST" action="${saveArticleUrl}">


									<div class="form-row row-fluid">
										<div class="span12">
											<div class="row-fluid">
												<form:label path="articleName" class="form-label span4"
													for="normal">Nombre:</form:label>
												<form:input path="articleName" class="span8"
													id="articleName" type="text" />
											</div>
										</div>
									</div>

									<div class="form-row row-fluid">
										<div class="span12">
											<div class="row-fluid">
												<label class="form-label span4" for="checkboxes">Simple
													select</label>
												<div class="span8 controls">
													<form:select name="select" path="articleBrand">
														<form:option path="articleBrand" value="Marca A" />Marca A
                                                            <form:option
															path="articleBrand" value="Marca B" selected="selected" />Marca B
                                                            <form:option
															path="articleBrand" value="Marca C" />Marca C
                                                            <form:option
															path="articleBrand" value="Marca D" />Marca D
                                                            <form:option
															path="articleBrand" value="Marca E" />Marca E
                                                        </form:select>
												</div>
											</div>
										</div>
									</div>
									<div class="form-row row-fluid">
										<div class="span12">
											<div class="row-fluid">
												<form:label path="articlePrice" class="form-label span4"
													for="normal">Precio:</form:label>
												<form:input path="articlePrice" class="span8"
													id="articlePrice" name="articlePrice" type="text" />
											</div>
										</div>
									</div>

									<div class="form-row row-fluid">
										<div class="span12">
											<div class="row-fluid">
												<form:label path="articleDesc" class="form-label span4"
													for="normal">Descripcion:</form:label>
												<form:textarea path="articleDesc" class="span8 elastic"
													id="articleDesc" rows="3" />
											</div>
										</div>
									</div>

									<div class="form-row row-fluid">

										<div class="span12">
											<div class="row-fluid">
												<div class="form-actions">
													<div class="span3"></div>
													<div class="span9 controls">

														<button type="submit" class="btn marginR10">Guardar</button>
														<button class="btn btn-danger">Cancelar</button>
													</div>
												</div>
											</div>
										</div>

									</div>

								</form:form>


							</div>

						</div>
						<!-- End .box -->



					</div>
					<!-- End Span12 (ancho) -->
				</div>
				<!-- End .row-fluid -->
			</div>
			<!-- End contentwrapper -->
		</div>
		<!-- End #content -->
	</div>
	<!-- End #wrapper -->
	<%@ include file="include-javascript.html"%>

	<script type="text/javascript">
        // document ready function
        $(document).ready(function() {
            $("input, textarea, select").not('.nostyle').uniform();
            $("#addArticleForm").validate({
                rules: {
                	articleName: {
                        required: true
                       
                    },
                    articlePrice: {
                        required: true,
                        number: true
                       
                    }
                    
                   
                },
                messages: {
                	articleName: {
                        required: "Campo requerido"
						
                    },
                    articlePrice: {
                        
                    	required: "Campo requerido",
                    	number: "El campo debe ser numerico"
                    }
                }   
            });
        });
    </script>
</body>
</html>




