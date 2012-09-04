<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<%@ include file="include-head.html" %>


</head>

<body>
   <!-- loading animation -->
<div id="qLoverlay"></div>
<div id="qLbar"></div>   

<%@ include file="include-header.html" %>
<div id="wrapper">
<!--Sidebar background-->
<div id="sidebarbg"></div>

<%@ include file="include-sidebar.html" %>


<!--Body content-->
<div id="content" class="clearfix">
<div class="contentwrapper"><!--Content wrapper-->

<div class="heading">
<h3>Listado de Articulos</h3>                    
</div><!-- End .heading-->

<!-- Build page from here: -->
<div class="row-fluid">
<div class="span12">



<!-- COMIENZO LISTADO TABLA DE ARTICULOS -->    

            <div class="box chart gradient">

                <div class="title">

                    <h4>
                        <span class="icon16 icomoon-icon-bars"></span>
                        <span>Listado de Articulos</span>
                    </h4>
                    
                </div>
            

 <div class="content noPad clearfix">
                        <table cellpadding="0" cellspacing="0" border="0" class="responsive dynamicTable display table table-bordered" width="100%">
                            <thead>
                                <tr>
                                    <th>Codigo</th>
                                     <th>Marca</th>
										<th>Nombre</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                   
                                    
                                </tr>
                            </thead>

                            
                            <tbody>
<c:forEach items="${listArticle}" var="article">
<tr class="odd gradeX">
    <td>${article.articleId} </td>
    <td>${article.articleBrand}</td>
<td>${article.articleName}</td>
<td>${article.articleDesc}</td>
<td>${article.articlePrice}</td>


   
</tr>
</c:forEach>
                            
                            </tbody>
                            <tfoot>
                                <tr>
                           <th>Codigo</th>
                                     <th>Marca</th>
										<th>Nombre</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                  
                                </tr>
                            </tfoot>
                        </table>
                    </div>
            </div><!-- End .box -->





</div> <!-- End Span12 (ancho) -->
</div><!-- End .row-fluid -->   
</div><!-- End contentwrapper -->
</div><!-- End #content -->
</div><!-- End #wrapper -->


<%@ include file="include-javascript.html" %>


</body>
</html>
                    



