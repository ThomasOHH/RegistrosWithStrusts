 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.strutsmondragon1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrarUsuarioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener datos del formulario
        String nombre = request.getParameter("nombre");
        String apellidoPaterno = request.getParameter("apellidop");
        String apellidoMaterno = request.getParameter("apellidom");
        String fechaNacimiento = request.getParameter("fecha");
        String lugarResidencia = request.getParameter("residencia");
        String edad = request.getParameter("telefono");
        String telefono = request.getParameter("correo");
        String correo = request.getParameter("correo");

        // Redirigir a pantalla de éxito con datos registrados
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Registro Exitoso</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Apellido Paterno: " + apellidoPaterno + "</p>");
        out.println("<p>Apellido Materno: " + apellidoMaterno + "</p>");
        out.println("<p>Fecha de Nacimiento: " + fechaNacimiento + "</p>");
        out.println("<p>Lugar de Residencia: " + lugarResidencia + "</p>");
        out.println("<p>Edad: " + edad + "</p>");
        out.println("<p>Teléfono: " + telefono + "</p>");
        out.println("<p>Correo Electrónico: " + correo + "</p>");
        out.println("<a href='Registro.jsp'>Ok Volvemos</a>");
        out.println("</body></html>");    }
}
