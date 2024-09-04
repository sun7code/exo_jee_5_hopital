package org.example.exo_jee_5_hopital_phoenix.consultation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/consultation-details")
public class ConsultationDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String consultationId = request.getParameter("id");
        request.setAttribute("consultation", "Détails de la consultation");
        request.getRequestDispatcher("/WEB-INF/jsp/consultation-details.jsp").forward(request, response);
    }
}
