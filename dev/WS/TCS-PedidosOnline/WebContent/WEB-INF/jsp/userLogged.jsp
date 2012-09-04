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
<h3>Principal</h3>                    
</div><!-- End .heading-->

<!-- Build page from here: -->
<div class="row-fluid">
<div class="span12">


<p>Hola, ${message.firstName}</p>
	
	<p>
		<a href="listArts.html">Ver listado de articulos</a>
		
	</p>




</div> <!-- End Span12 (ancho) -->
</div><!-- End .row-fluid -->   
</div><!-- End contentwrapper -->
</div><!-- End #content -->
</div><!-- End #wrapper -->


<%@ include file="include-javascript.html" %>


</body>
</html>
                    



