package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import dao.DBconnection;
import javax.servlet.http.HttpSession;

public final class WelcomeE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/welcomepage.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"first\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <img src=\"images/images.jpeg\" width=\"100%\" height=\"100%\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        SUPREME OPTIQUE\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <button style=\"float: right;\"><a href=\"logout\" >Logout</a></button><br/>\n");
      out.write("        <div class=\"second\">\n");
      out.write("            <div class=\"navv\">\n");
      out.write("                <nav>\n");
      out.write("            <table >\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <td><a href=\"WelcomeE.jsp\">Home</a></td>\n");
      out.write("                <td><a href=\"LeaveLog.jsp\">Leave Log</a></td>\n");
      out.write("                <td><a href=\"NewRequest.jsp\">New Request</a></td>\n");
      out.write("                <td><a href=\"status.jsp\">Pending Requests</a></td>\n");
      out.write("                </tr></table></nav></div>\n");
      out.write("             <br/><br/>\n");
      out.write("            ");

                HttpSession ses=request.getSession();
                String str=(String)ses.getAttribute("ID");
                DBconnection obj = new DBconnection();
                Connection con = obj.getConnection();
                try{
                    
                if(ses!=null){
                String query="SELECT * FROM EMPLOYEE WHERE E_ID=?" ;
                PreparedStatement ps=con.prepareStatement(query);
                ps.setInt(1,Integer.parseInt(str));
                ResultSet rs=ps.executeQuery();
            
      out.write("\n");
      out.write("            <div>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       \n");
      out.write("                        <table class=\"profile\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <h3> PROFILE</h3>\n");
      out.write("                        <br/>\n");
      out.write("                        <strong>Name:</strong>");
 if(rs.next())
                                out.println(rs.getString(4));
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <strong>ID:</strong>");
out.println(rs.getInt(1));
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <strong>Email-ID:</strong>");
 out.println(rs.getString(2));
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <strong>Department:</strong>");
 int x=rs.getInt(5);
                                          String q="SELECT D_NAME FROM DEPARTMENT WHERE D_ID=?";
                                            PreparedStatement p=con.prepareStatement(q);
                                            p.setInt(1, x);
                                            ResultSet r=p.executeQuery();
                                            if(r.next())
                                            out.println(r.getString(1));
                        
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <strong>Manager's Name:</strong>");
  int y=rs.getInt(5);
                                    String quer="SELECT NAME FROM MANAGER WHERE D_ID=?";
                                    PreparedStatement pp=con.prepareStatement(quer);
                                    pp.setInt(1,y); 
                                    ResultSet rr=pp.executeQuery();
                                    if(rr.next())
                                    out.println(rr.getString(1));
                                    
                                    
      out.write("\n");
      out.write("                          <br/><br/>\n");
      out.write("                          <strong>Address:</strong>");
 out.println(rs.getString(6));
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <strong>Date of Birth:</strong>");
out.println(rs.getString(7));
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <strong>Sick Leaves Left:</strong>");
 out.println(rs.getInt(8));
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <strong>Casual Leaves Left:</strong>");
 out.println(rs.getInt(9));
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <h2>LEAVE POLICIES</h2>\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p><strong>1.Sick Leaves</strong></p>\n");
      out.write("                                        <p>(i)An employee is eligible for twelve days of sick leave in a year. </p>\n");
      out.write("                                        <p>(ii)Need to be specifically accompanied with a medical certificate</p>\n");
      out.write("                                        <p>(iii)Sick leave may not be carried forward.</p>\n");
      out.write("                                        <p><strong>2.Casual Leave</strong></p>\n");
      out.write("                                        <p>(i)An employee is eligible for eight days of casual leave in a year</p>\n");
      out.write("                                        <p>(ii)Is usually provided to take care of urgent and unseen matters</p>\n");
      out.write("                                        <p>(iii)Casual leave may be carried forward</p>\n");
      out.write("                                            \n");
      out.write("                                        \n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                            </table>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        ");
 con.close();}}

            catch(Exception e){
                
               response.sendRedirect("index.html");
            }  
                             
                        
      out.write("\n");
      out.write("            </div></div>\n");
      out.write("        <div class=\"third\">\n");
      out.write("           Supreme Optique&copy;2017 All Rights Reserved \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
