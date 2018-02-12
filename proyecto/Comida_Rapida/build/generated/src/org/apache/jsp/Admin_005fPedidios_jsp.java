package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.Pedido;
import java.util.ArrayList;

public final class Admin_005fPedidios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ArrayList <Pedido> lista = new ArrayList();
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      mysql.MySqlConexion objConn = null;
      synchronized (_jspx_page_context) {
        objConn = (mysql.MySqlConexion) _jspx_page_context.getAttribute("objConn", PageContext.PAGE_SCOPE);
        if (objConn == null){
          objConn = new mysql.MySqlConexion();
          _jspx_page_context.setAttribute("objConn", objConn, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Comida Rapida Literalmente</title>\n");
      out.write("        <link href=\"Estilos.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<link href=\"iconic.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header> \n");
      out.write("\t\t<table FRAME=\"void\" RULES=\"rows\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<!--Logo-->\n");
      out.write("\t\t\t\t\t<img class=\"logo_pag\" src=\"./Img/logo.png\" width=\"120\" height=\"60\" align=\"left\">  \n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Admin_Pedidos.jsp\" class=\"Tam\"><span class=\"iconic book-alt\"></span> Pedidos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Admin_Editar.jsp\" class=\"Tam\"><span class=\"iconic pencil\"></span> Editar Producto</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Admin_Nuevo.jsp\" class=\"Tam\"><span class=\"iconic plus\"></span> Nuevo Producto</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Admin_Eliminar.jsp\" class=\"Tam\"><span class=\"iconic x\"></span> Eliminar Producto</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t\n");
      out.write("\t</header>\n");
      out.write("\t<aside id=\"izq\">\n");
      out.write("\t</aside>\n");
      out.write("\t<section>\n");
      out.write("\t\t<center><h2>Pedidos</h2></center><br>\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");

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
                    //String[][] datos=new String[n][4];
                    //datos=new String[n][4];
                    String id, nombre, pedido, precioTotal,Edificio,Salon,Hora,pago,estado;
                    for(i=0;i<n;i++){

                            try{
                                id=objConn.rs.getString(1);
                                //out.println(idUsuario+ "<br>");
                                nombre=objConn.rs.getString(2);
                                //out.println(nombre+ "<br>");
                                pedido =objConn.rs.getString(3);
                                //out.println(cuenta+ "<br>");
                                precioTotal =objConn.rs.getString(4);
                                //out.println(password+ "<br>");
                                Edificio =objConn.rs.getString(5);
                                Salon =objConn.rs.getString(6);
                                Hora =objConn.rs.getString(7);
                                pago =objConn.rs.getString(8);
                                estado =objConn.rs.getString(9);
                                lista.add(new Pedido(Integer.parseInt(id), nombre, pedido, Integer.parseInt(precioTotal),Edificio,Salon,Hora,Integer.parseInt(pago),Integer.parseInt(estado)));
                                objConn.rs.next();
                            }catch(Exception e){ }


                    }
                    int id_p,precioTotal_p,pago_p,estado_p;
                    String nombre_p,pedido_p,edificio_p,salon_p,hora_p;
                    for(i=0;i<lista.size();i++){
                        id_p=lista.get(i).getId();
                        nombre_p=lista.get(i).getNombre();
                        pedido_p=lista.get(i).getPedido();
                        precioTotal_p=lista.get(i).getPrecioTotal();
                        edificio_p=lista.get(i).getEdificio();
                        salon_p=lista.get(i).getSalon();
                        hora_p=lista.get(i).getHora();
                        pago_p=lista.get(i).getPago();
                        estado_p=lista.get(i).getEstado();
                        if(estado_p!=0){
      out.write("\n");
      out.write("                            <p>clave: ");
      out.print(id_p);
      out.write(", Cliente: ");
      out.print(nombre_p);
      out.write(", Pedido: ");
      out.print(pedido_p);
      out.write(", Costo total: $");
      out.print(precioTotal_p);
      out.write(", Entrega en Edificio: ");
      out.print(edificio_p);
      out.write("  Salon: ");
      out.print(salon_p);
      out.write(", Hora de entrega: ");
      out.print(hora_p);
      out.write(", Pagara con: ");
      out.print(pago_p);
      out.write("</p>\n");
      out.write("                ");
      }
                    }
                 }
                
                 lista.clear();
      out.write("\n");
      out.write("\t</section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
