package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.Cuentas;
import java.util.ArrayList;

public final class checklog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ArrayList <Cuentas> lista = new ArrayList();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

        String consulta="select * from bd_comida.admin;";
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
            String idUsuario, nombre, cuenta, password;
            for(i=0;i<n;i++){
                
                    try{
                        idUsuario=objConn.rs.getString(1);
                        out.println(idUsuario+ "<br>");
                        nombre=objConn.rs.getString(2);
                        out.println(nombre+ "<br>");
                        cuenta =objConn.rs.getString(3);
                        out.println(cuenta+ "<br>");
                        password =objConn.rs.getString(4);
                        out.println(password+ "<br>");
                        lista.add(new Cuentas(Integer.parseInt(idUsuario),nombre, cuenta, password));
                        objConn.rs.next();
                    }catch(Exception e){ }
                
            }
         }//out.println("n="+n+" "+lista);
            //String usr[]={"q","alan","kike","spiderman"};
            //String pass[]={"q","6330","game","librojsp"};
            String usuario = "";
            String nombre ="";
            String clave = "";
            String user = "z";
            String password = "z";
            if (request.getParameter("usuario") != null) {
                usuario = request.getParameter("usuario");
            }
            if (request.getParameter("clave") != null) {
                clave = request.getParameter("clave");
            }
            for(i=0;i<lista.size();i++){
                if (usuario.equals(lista.get(i).getCuenta())){
                    if(clave.equals(lista.get(i).getPassword())){
                        user=lista.get(i).getCuenta();
                        password=lista.get(i).getPassword();
                        nombre=lista.get(i).getNombre();
                        i=lista.size();
                    }
                }
            }
            if (usuario.equals(user) && clave.equals(password)) {
                    HttpSession sesionOk = request.getSession();
                    sesionOk.setAttribute("usuario", usuario);
                    sesionOk.setAttribute("nombre",nombre);                                        //hacer modificaciones sobre la tabla con la que inicializaste
                    objConn.closeRsStmt();
                    out.println(user + password + nombre);
        
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("Admin_Pedidos.jsp");
        return;
      }
      out.write("\n");
      out.write("              \n");
      out.write("        ");
}else { 
                    objConn.closeRsStmt();
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("Menu_Secion.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("error", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Usuario y/o clave\n                        incorrectos.<br>Vuelve a intentarlo.", request.getCharacterEncoding()));
        return;
      }
      out.write('\n');
          }
            
      out.write("\n");
      out.write("        \n");
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
