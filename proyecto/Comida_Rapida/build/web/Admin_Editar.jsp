<%-- 
    Document   : Admin_Editar
    Created on : 15/11/2017, 07:04:25 AM
    Author     : Alfem
--%>

<%@page import="clases.Producto"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="objConn" class="mysql.MySqlConexion"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comida Rapida Literalmente</title>
        <link href="Estilos.css" media="screen" rel="stylesheet" type="text/css" />
	<link href="iconic.css" media="screen" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <header> 
		<table FRAME="void" RULES="rows">
			<tr>
				<td>
					<!--Logo-->
					<img class="logo_pag" src="./Img/logo.png" width="120" height="60" align="left">  
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<div class="wrap">
						<nav>
							<ul class="menu">
								<li><a href="Admin_Pedidios.jsp" class="Tam"><span class="iconic book-alt"></span> Pedidos</a></li>
								<li><a href="Admin_Editar.jsp" class="Tam"><span class="iconic pencil"></span> Editar Producto</a></li>
								<li><a href="Admin_Nuevo.jsp" class="Tam"><span class="iconic plus"></span> Nuevo Producto</a></li>
								<li><a href="Admin_Eliminar.jsp" class="Tam"><span class="iconic x"></span> Eliminar Producto</a></li>
                                                                <li><a href="Menu_Inicio.html" class="Tam"><span class="iconic arrow-left"></span> Salir</a></li>
							</ul>
							<div class="clearfix"></div>
						</nav>
					</div>
				</td>
			</tr>
			<tr>
				<td></td>
			</tr>
		</table>
		
	</header>
	<aside id="izq">
            <%! ArrayList <Producto> lista = new ArrayList();%>
                <%
                String consulta="select * from bd_comida.comida;";
                objConn.Consultar(consulta);
                int n=0;
                int i,j;
                if(objConn.rs!=null){
                    try{
                        objConn.rs.last();
                        n=objConn.rs.getRow();
                        objConn.rs.first();
                    }catch(Exception e){}
                    //String[][] datos=new String[n][4];
                    //datos=new String[n][4];
                    String id, nombre, precio, existencia;
                    for(i=0;i<n;i++){

                            try{
                                id=objConn.rs.getString(1);
                                //out.println(idUsuario+ "<br>");
                                nombre=objConn.rs.getString(2);
                                //out.println(nombre+ "<br>");
                                precio =objConn.rs.getString(3);
                                //out.println(cuenta+ "<br>");
                                existencia =objConn.rs.getString(4);
                                //out.println(password+ "<br>");
                                lista.add(new Producto(Integer.parseInt(id),nombre, Integer.parseInt(precio), Integer.parseInt(existencia)));
                                objConn.rs.next();
                            }catch(Exception e){ }


                    }
                    int id_C,precio_C,existencia_C;
                    String nombre_C;
                    for(i=0;i<lista.size();i++){
                        id_C=lista.get(i).getId();
                        nombre_C=lista.get(i).getNombre();
                        precio_C=lista.get(i).getPrecio();
                        existencia_C=lista.get(i).getExistencia();
                        if(existencia_C!=0){%>
                        <p>clave: <%=id_C%><br> Contiene: <%=nombre_C%><br> Precio: $<%=precio_C%><br> Existencia: <%=existencia_C%><br><br></p>
                <%      }
                    }
                 }%>
	</aside>
	<section>
            <%
             lista.clear();
            consulta="select * from bd_comida.comida;";
            objConn.Consultar(consulta);
            String id_C, nombre_C, precio_C, existencia_C;
            if(objConn.rs!=null){
                try{
                    objConn.rs.last();
                    n=objConn.rs.getRow();
                    objConn.rs.first();
                }catch(Exception e){}
                for(i=0;i<n;i++){
                    try{
                        id_C=objConn.rs.getString(1);
                        nombre_C=objConn.rs.getString(2);
                        precio_C =objConn.rs.getString(3);
                        existencia_C =objConn.rs.getString(4);
                        lista.add(new Producto(Integer.parseInt(id_C),nombre_C, Integer.parseInt(precio_C), Integer.parseInt(existencia_C)));
                        objConn.rs.next();
                    }catch(Exception e){ }
                }
            }
            objConn.closeRsStmt();%>
		<center><h2>Editar inventario</h2></center><br>
                <form action="ejecutaCambioProduc.jsp" method="post">
                    Comida: <select name="Comida">
                        <%
                           for(i=0;i<lista.size();i++){
                              out.println("<option value=\""+lista.get(i).getNombre()+"\">"+lista.get(i).getNombre()+"");
                           }

                        %>
                        </select><br>
                    Precio Nuevo: <input type="text" name="Precio" size=10 value=""><br>
                    Nueva Existencia:<input type="text" name="Existencia" size=10 value=""><br>
                    <input type="submit" value="enviar"><br>
                </form>
	</section>
        <%lista.clear(); %>
    </body>
</html>
