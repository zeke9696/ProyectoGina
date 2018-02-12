package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fNuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
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
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Admin_Pedidios.jsp\" class=\"Tam\"><span class=\"iconic book-alt\"></span> Pedidos</a></li>\n");
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
      out.write("\t\t<center><h2>Nuevo Producto</h2></center><br>\n");
      out.write("                <form action=\"executeInsertProduc.jsp\" method=\"post\">\n");
      out.write("                    <pre>\n");
      out.write("                    Nombre: <input type=\"text\" name=\"nombre\" value=\"\" />\n");
      out.write("\n");
      out.write("                    Precio: <input type=\"text\" name=\"precio\" value=\"\" />\n");
      out.write("\n");
      out.write("                    Existencia:<input type=\"text\" name=\"existencia\" value=\"\" />\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Agregar\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </pre>\n");
      out.write("                </form>\n");
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
