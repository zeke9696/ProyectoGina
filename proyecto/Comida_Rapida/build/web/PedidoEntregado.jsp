<%-- 
    Document   : PedidoEntregado
    Created on : 16/11/2017, 04:35:52 PM
    Author     : Alfem
--%>

<jsp:useBean id="objConn" class="mysql.MySqlConexion"/>
<%@page import="clases.Pedido"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! ArrayList <Pedido> lista = new ArrayList();%>
            <%
            String consulta="select * from bd_comida.pedidos;";
            objConn.Consultar(consulta);
            int n=0;
            int i,j;
            if(objConn.rs!=null){
                try{
                    objConn.rs.last();
                    n=objConn.rs.getRow();
                    objConn.rs.first();
                }catch(Exception e){}
                String id, nombre, pedido, precioTotal,Edificio,Salon,Hora,pago,estado;
                for(i=0;i<n;i++){ 
                    try{
                        id=objConn.rs.getString(1);
                        nombre=objConn.rs.getString(2);
                        pedido =objConn.rs.getString(3);
                        precioTotal =objConn.rs.getString(4);
                        Edificio =objConn.rs.getString(5);
                        Salon =objConn.rs.getString(6);
                        Hora =objConn.rs.getString(7);
                        pago =objConn.rs.getString(8);
                        estado =objConn.rs.getString(9);
                        lista.add(new Pedido(Integer.parseInt(id), nombre, pedido, Integer.parseInt(precioTotal),Edificio,Salon,Hora,Integer.parseInt(pago),Integer.parseInt(estado)));
                        objConn.rs.next();
                    }catch(Exception e){ }
                }
            }    
         String Clave;
         Clave = (request.getParameter("Clave")).trim();
         String modifica = "update bd_comida.pedidos set estado='0' where id_orden='"+Clave+"';";
         
         objConn.Actualizar(modifica);
         objConn.closeRsStmt();
         lista.clear();
         %>
          
         <jsp:forward page="Admin_Pedidios.jsp"/>
         
         
    </body>
</html>
