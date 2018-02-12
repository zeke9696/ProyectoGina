<%--
    Document   : Menu_Ordenar
    Created on : 15/11/2017, 07:13:37 AM
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
        <meta charset="UTF-8">
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
								<li><a href="Menu_Inicio.html" class="Tam"><span class="iconic home"></span> Pagina Principal</a></li>
								<li><a href="Menu_Pasos.html" class="Tam"><span class="iconic info"></span> Como funciona</a></li>
								<li><a href="Menu_Ordenar.jsp" class="Tam"><span class="iconic calendar-alt"></span> Ordenar</a></li>
								<li><a href="Menu_Secion.jsp" class="Tam"><span class="iconic user"></span> Iniciar seción</a></li>
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
	</aside>
	<section>
		<p>
		<center><h2>Ordenar</h2></center><br>
		<h3>Comida:</h3><br>
                <form action="Ordenar.jsp" method="post">
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
                            <p>clave: <%=id_C%>,&ensp; Contiene: <%=nombre_C%>,&ensp; Precio: $<%=precio_C%>,&ensp; Existencia: <%=existencia_C%>&ensp;&ensp; Cuantos quieres: <input type="number" name="Comida<%=Integer.toHexString(i)%>" value="0" min="0" max="<%=existencia_C%>" step="1" required ><br></p>
                    <%      }
                        }
                     }%>
                    <h3>Nombre de comprador:</h3><br>
                    <input type="text" name="Comprador" required ><br><br>
                    <h3>Lugar de entrega:</h3><br>
                    Edificio:<input type="text" name="Edificio" required ><br>
                    Salón:<input type="text" name="Salon" required ><br><br>
                    <h3>Horario de entrega:</h3><br>
                    <input type="text" name="Horario" required ><br><br>
                    <h3>Cantidad a pagar:</h3><br>
                    <input type="text" name="Dinero"><br><br>
                    <input type="submit" value="Ordenar"> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
                    </p> 
                </form>
                <%lista.clear();%>
	</section>
    </body>
</html>
