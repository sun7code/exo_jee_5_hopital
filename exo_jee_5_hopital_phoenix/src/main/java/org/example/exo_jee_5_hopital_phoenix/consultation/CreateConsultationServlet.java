package org.example.exo_jee_5_hopital_phoenix.consultation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/create-consultation")
public class CreateConsultationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/create-consultation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String patientId = request.getParameter("patientId");
        String dateConsultation = request.getParameter("dateConsultation");
        String nomMedecin = request.getParameter("nomMedecin");
        String prescription = request.getParameter("prescription");
        response.sendRedirect("patient-details?id=" + patientId);
    }
}
