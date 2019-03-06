<%-- 
    Document   : index
    Created on : 12-Febrero-2018, 10:24:59
    Author     : Christian Camilo Gámez
--%>
<%@page import="JavaBeans.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cad.CategoriaCad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Gestión de Productos |  Crea e-Commerce JAVA EE con pagos Online Paypal y Payu</title>
    <%@include file="../../WEB-INF/css.jsp" %>
</head><!--/head-->

<body>
    <%@include file="../../WEB-INF/header.jsp" %>	

	
        <section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
                                            
                                            
					
					</div>
				</div>
				
				<div class="col-sm-9 padding-right">
                                    
                                    <h3>Gestionar producto</h3>
                                    <form action="controlProducto.jsp" method="POST">                                        
                                    
                                        <div class="for-one">
                                            <input type="text" name="nombre" placeholder="Nombre producto" value="" />
                                            <input type="number" name="precio" placeholder="Precio" value="0" />
                                            <input type="number" name="precio_nuevo" placeholder="Precio Nuevo" value="0" />
                                        </div>

                                    </form>   
					
				</div>
			</div>
		</div>
	</section>
	
        <%@include file="../../WEB-INF/footer.jsp"%>                                        
        <%@include file="../../WEB-INF/js.jsp"%>
</body>
</html>
