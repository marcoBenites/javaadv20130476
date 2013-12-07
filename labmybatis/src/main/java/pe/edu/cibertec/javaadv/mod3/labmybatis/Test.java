/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod3.labmybatis;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.data.mapper.CiudadMapper;
import pe.edu.cibertec.model.Ciudad;

/**
 *
 * @author JAVA-ADV
 */
@WebServlet(name = "test", urlPatterns = {"/test"})
public class Test extends HttpServlet {

    @Inject
    private SqlSession sqlSession;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet test</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet test at " + request.getContextPath() + "</h1>");

            CiudadMapper ciudadMapper = sqlSession.getMapper(CiudadMapper.class);


            //Revisa si esta el reques parameter y solo si esta presente inserta
            if (request.getParameterMap().containsKey("accion")) {
                Ciudad ciudad = new Ciudad();
                switch (request.getParameter("accion")) {
                    case "c":
                        ciudad.setDescripcion(request.getParameter("descripcion"));
                        ciudadMapper.insertar(ciudad);
                        break;
                    case "r":
                        ciudad.setCodigo(Integer.valueOf(request.getParameter("codigo")));
                        ciudad = ciudadMapper.obtenerCuidad(ciudad.getCodigo());
                        if (ciudad != null) {
                            out.println(MessageFormat.format("Leído un registro: ({0}){1}<br />", ciudad.getCodigo(), ciudad.getDescripcion()));
                        }
                        break;
                    case "u":
                        ciudad.setCodigo(Integer.valueOf(request.getParameter("codigo")));
                        ciudad.setDescripcion(request.getParameter("descripcion"));
                        ciudadMapper.modificar(ciudad);
                        break;
                    case "d":
                        ciudad.setCodigo(Integer.valueOf(request.getParameter("codigo")));
                        ciudadMapper.eliminar(ciudad);
                        break;
                }
                sqlSession.commit();
            }

            out.println("<h1>datos de ciudades</h1>");
            //Ejecuta el query
            List<Ciudad> list = ciudadMapper.obtenerCiudadesRTModel();
            for (Ciudad c : list) {
                out.println(
                        MessageFormat.format(
                        "({0}){1}<br />",
                        c.getCodigo(),
                        c.getDescripcion()));
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
